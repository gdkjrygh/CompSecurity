// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.appwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.widget.RemoteViews;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.CategoryApi;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.base.Application;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.network.image.ImageCache;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.pinterest.appwidget:
//            PWidgetHelper, PWidgetProvider

class StackRemoteViewsFactory
    implements android.widget.RemoteViewsService.RemoteViewsFactory
{

    private static String HEADER_FOLLOWING = Resources.string(0x7f0702ee);
    private static String HEADER_POPULAR = Resources.string(0x7f070606);
    private static final float MAX_RATIO = 1.333333F;
    private static final int MAX_RETRY = 3;
    private static final int PAGE_SIZE = 40;
    private static final String TAG = "RemoteViewsFactory";
    private static int _retryCount = 0;
    public static boolean loading = false;
    private Runnable _retryRunnable;
    private Handler _threadHandler;
    public int mAppWidgetId;
    private final Context mContext;
    private PinFeed mFeed;
    private RemoteViews mLoadingRv;
    private final FeedApiResponseHandler onGridLoad = new _cls2();

    public StackRemoteViewsFactory(Context context, Intent intent)
    {
        _threadHandler = new Handler();
        _retryRunnable = new _cls1();
        mContext = context;
        updateWidgetId(intent);
    }

    private void addIntentForLoginSignup(RemoteViews remoteviews)
    {
        remoteviews.setOnClickFillInIntent(0x7f0f0177, PWidgetHelper.getLoginIntent(mContext));
        remoteviews.setOnClickFillInIntent(0x7f0f014b, PWidgetHelper.getSignupIntent(mContext));
    }

    private void drawCounts(RemoteViews remoteviews, Pin pin)
    {
        int i = pin.getLikeCountDisplay();
        int j = pin.getRepinCountDisplay();
        if (i == 0 && j == 0)
        {
            remoteviews.setViewVisibility(0x7f0f04fc, 8);
            return;
        }
        if (i != 0)
        {
            remoteviews.setTextViewText(0x7f0f04fd, String.valueOf(i));
        } else
        {
            remoteviews.setViewVisibility(0x7f0f04fd, 8);
        }
        if (j != 0)
        {
            remoteviews.setTextViewText(0x7f0f04fe, String.valueOf(j));
            return;
        } else
        {
            remoteviews.setViewVisibility(0x7f0f04fe, 8);
            return;
        }
    }

    private Rect getDesiredRegion(Pin pin)
    {
        int i;
        if (pin.getImageMediumHeight() == null)
        {
            i = 0;
        } else
        {
            i = pin.getImageMediumHeight().intValue();
        }
        if (i == 0 || i <= 1024)
        {
            return null;
        } else
        {
            i = (i - 1024) / 2;
            return new Rect(0, i, pin.getImageMediumWidth().intValue(), i + 1024);
        }
    }

    private RemoteViews getFooterRV()
    {
        RemoteViews remoteviews = new RemoteViews(mContext.getPackageName(), 0x7f030211);
        if (MyUser.hasAccessToken())
        {
            remoteviews.removeAllViews(0x7f0f04f2);
            remoteviews.addView(0x7f0f04f2, new RemoteViews(mContext.getPackageName(), 0x7f030210));
        } else
        {
            remoteviews.setTextViewText(0x7f0f0077, Resources.string(0x7f070334));
            remoteviews.setViewVisibility(0x7f0f01d1, 0);
        }
        remoteviews.setOnClickFillInIntent(0x7f0f04f2, ActivityHelper.getHomeIntent(mContext));
        addIntentForLoginSignup(remoteviews);
        return remoteviews;
    }

    private RemoteViews getHeaderRV()
    {
        RemoteViews remoteviews = new RemoteViews(mContext.getPackageName(), 0x7f030215);
        User user = MyUser.get();
        if (MyUser.hasAccessTokenAndUser() && user != null)
        {
            remoteviews.removeAllViews(0x7f0f0261);
            int i;
            if (user.getFollowingCount() != null)
            {
                i = user.getFollowingCount().intValue();
            } else
            {
                i = 0;
            }
            if (i > 0)
            {
                return new RemoteViews(mContext.getPackageName(), 0x7f030213);
            }
            remoteviews.addView(0x7f0f0261, new RemoteViews(mContext.getPackageName(), 0x7f030212));
            if (user.getFirstName() != null)
            {
                remoteviews.setTextViewText(0x7f0f0077, String.format(Resources.string(0x7f0705f5), new Object[] {
                    user.getFirstName()
                }));
            }
            remoteviews.setOnClickFillInIntent(0x7f0f04f4, PWidgetHelper.getSwitcherIntent(mContext));
            return remoteviews;
        } else
        {
            remoteviews.setOnClickFillInIntent(0x7f0f0177, PWidgetHelper.getLoginIntent(mContext));
            remoteviews.setOnClickFillInIntent(0x7f0f014b, PWidgetHelper.getSignupIntent(mContext));
            remoteviews.setOnClickFillInIntent(0x7f0f0500, PWidgetHelper.getWelcomeIntent(mContext));
            return remoteviews;
        }
    }

    private Bitmap getPinBitmap(Pin pin)
    {
        Rect rect = getDesiredRegion(pin);
        return ImageCache.getBitmapBlocking(pin.getImageMediumUrl(), false, rect);
    }

    private void loadingSuccess()
    {
        AppWidgetManager.getInstance(mContext).notifyAppWidgetViewDataChanged(mAppWidgetId, 0x7f0f018f);
    }

    private PinFeed makeFeed(PinterestJsonObject pinterestjsonobject)
    {
        return new PinFeed(pinterestjsonobject, null);
    }

    protected void clearRetry()
    {
        _threadHandler.removeCallbacks(_retryRunnable);
        _retryCount = 0;
        if (PWidgetProvider.isLoadingFailed())
        {
            PWidgetHelper.notifyWidgetStateChange(mContext, -1, 0);
        }
    }

    public int getCount()
    {
        if (loading || mFeed == null)
        {
            return 0;
        } else
        {
            return mFeed.getCount();
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public RemoteViews getLoadingView()
    {
        return mLoadingRv;
    }

    public RemoteViews getViewAt(int i)
    {
        if (i == 0)
        {
            return getHeaderRV();
        }
        if (i != 1 && i == getCount() - 1)
        {
            return getFooterRV();
        }
        if (loading || mFeed == null)
        {
            return getLoadingView();
        }
        RemoteViews remoteviews = new RemoteViews(mContext.getPackageName(), 0x7f03021a);
        Pin pin = (Pin)mFeed.get(i);
        if (pin == null)
        {
            return remoteviews;
        }
        Object obj = getPinBitmap(pin);
        if (obj != null)
        {
            remoteviews.setImageViewBitmap(0x7f0f04f9, ((Bitmap) (obj)));
        }
        Object obj1 = pin.getDescription();
        obj = obj1;
        if (obj1 != null)
        {
            obj = ((String) (obj1)).trim();
        }
        if (ModelHelper.isValid(obj))
        {
            remoteviews.setTextViewText(0x7f0f02f9, ((CharSequence) (obj)));
            remoteviews.setViewVisibility(0x7f0f02f9, 0);
        }
        drawCounts(remoteviews, pin);
        obj = PWidgetHelper.getSwitcherIntent(mContext);
        ((Intent) (obj)).putExtra("com.pinterest.EXTRA_PIN_ID", pin.getUid());
        remoteviews.setOnClickFillInIntent(0x7f0f04f8, ((Intent) (obj)));
        obj1 = pin.getUser();
        obj = pin.getBoard();
        if (obj1 == null || obj == null)
        {
            remoteviews.setViewVisibility(0x7f0f04fa, 8);
            return remoteviews;
        }
        Object obj2 = ImageCache.getBitmapBlocking(((User) (obj1)).getImageMediumUrl(), false);
        if (obj2 != null)
        {
            remoteviews.setImageViewBitmap(0x7f0f01d3, ((Bitmap) (obj2)));
        }
        remoteviews.setTextViewText(0x7f0f01e9, ((User) (obj1)).getFullName());
        remoteviews.setTextViewText(0x7f0f04fb, ((Board) (obj)).getName());
        obj2 = PWidgetHelper.getSwitcherIntent(mContext);
        ((Intent) (obj2)).putExtra("com.pinterest.EXTRA_USER_ID", ((User) (obj1)).getUid());
        ((Intent) (obj2)).putExtra("com.pinterest.EXTRA_PIN_ID", pin.getUid());
        remoteviews.setOnClickFillInIntent(0x7f0f01d3, ((Intent) (obj2)));
        obj1 = PWidgetHelper.getSwitcherIntent(mContext);
        ((Intent) (obj1)).putExtra("com.pinterest.EXTRA_BOARD_ID", ((Board) (obj)).getUid());
        ((Intent) (obj1)).putExtra("com.pinterest.EXTRA_PIN_ID", pin.getUid());
        remoteviews.setOnClickFillInIntent(0x7f0f04fa, ((Intent) (obj1)));
        return remoteviews;
    }

    public int getViewTypeCount()
    {
        return 3;
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public void loadData()
    {
        if (loading)
        {
            return;
        }
        PLog.info("PWidgetService loadData", new Object[0]);
        User user = MyUser.get();
        HashMap hashmap = new HashMap();
        hashmap.put("X-Pinterest-AppState", com.pinterest.base.ApplicationInfo.State.FOREGROUND.getApiHeader());
        if (MyUser.hasAccessToken() && user != null)
        {
            MyUserApi.a(new com.pinterest.api.remote.PinApi.PinFeedApiResponse(onGridLoad, true), hashmap, null);
            return;
        } else
        {
            CategoryApi.a("welcome", new com.pinterest.api.remote.PinApi.PinFeedApiResponse(onGridLoad, true), hashmap);
            return;
        }
    }

    public void onCreate()
    {
        PLog.info("StackRemoteViewsFactory.onCreate", new Object[0]);
        mLoadingRv = new RemoteViews(mContext.getPackageName(), 0x7f030216);
        mLoadingRv.setProgressBar(0x7f0f01d0, 0, 0, true);
        loadData();
    }

    public void onDataSetChanged()
    {
    }

    public void onDestroy()
    {
        Application.watch(this);
    }

    public void reset(PinFeed pinfeed)
    {
        mFeed = pinfeed;
    }

    public void reset(PinterestJsonObject pinterestjsonobject)
    {
        reset(makeFeed(pinterestjsonobject));
    }

    public void updateWidgetId(Intent intent)
    {
        mAppWidgetId = intent.getIntExtra("appWidgetId", 0);
        if (mAppWidgetId == 0)
        {
            mAppWidgetId = PWidgetHelper.getLastWidgetId();
        } else
        {
            PWidgetHelper.setLastWidgetId(mAppWidgetId);
        }
        PLog.info((new StringBuilder("updateWidgetId: ")).append(mAppWidgetId).toString(), new Object[0]);
    }







/*
    static int access$308()
    {
        int i = _retryCount;
        _retryCount = i + 1;
        return i;
    }

*/



    private class _cls1
        implements Runnable
    {

        final StackRemoteViewsFactory this$0;

        public void run()
        {
            loadData();
        }

        _cls1()
        {
            this$0 = StackRemoteViewsFactory.this;
            super();
        }
    }


    private class _cls2 extends FeedApiResponseHandler
    {

        final StackRemoteViewsFactory this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            PLog.info((new StringBuilder("FeedApiResponseHandler.onFailure, retry: ")).append(StackRemoteViewsFactory._retryCount).toString(), new Object[0]);
            if (StackRemoteViewsFactory._retryCount < 3)
            {
                int i = PLog.info;
                _threadHandler.postDelayed(_retryRunnable, 5000L);
                return;
            } else
            {
                PWidgetHelper.notifyWidgetStateChange(mContext, -1, 1);
                return;
            }
        }

        public void onFinish()
        {
            StackRemoteViewsFactory.loading = false;
        }

        public void onStart()
        {
            StackRemoteViewsFactory.loading = true;
        }

        public void onSuccess(PinterestJsonObject pinterestjsonobject)
        {
            reset(pinterestjsonobject);
            PLog.info((new StringBuilder("onGridLoad.onSuccess feed count: ")).append(mFeed.getCount()).toString(), new Object[0]);
            if (mFeed.getCount() == 0)
            {
                PWidgetHelper.notifyWidgetStateChange(mContext, -1, 1);
                return;
            } else
            {
                clearRetry();
                loadingSuccess();
                return;
            }
        }

        _cls2()
        {
            this$0 = StackRemoteViewsFactory.this;
            super();
        }
    }

}
