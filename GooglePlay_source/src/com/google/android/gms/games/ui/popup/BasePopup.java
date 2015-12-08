// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.popup;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.images.ImageBroker;
import com.google.android.gms.common.images.internal.ImageUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VersionUtils;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesIntents;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.ui.popup.manager.ContextManager;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class BasePopup
    implements android.view.View.OnClickListener, android.view.animation.Animation.AnimationListener
{
    protected static final class PopupHandler extends Handler
    {

        public final void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                throw new IllegalArgumentException("Unknown message code");

            case 0: // '\0'
                BasePopup.access$100((BasePopup)message.obj);
                return;

            case 1: // '\001'
                ((BasePopup)message.obj).removeCurtain();
                return;

            case 2: // '\002'
                ((BasePopup)message.obj).hidePopup();
                break;
            }
        }

        private PopupHandler(Looper looper)
        {
            super(looper);
        }

        PopupHandler(Looper looper, byte byte0)
        {
            this(looper);
        }
    }


    private static final Rect RECT_CONTAINER = new Rect();
    private static final Rect RECT_OUT = new Rect();
    protected static final PopupHandler sHandler = new PopupHandler(Looper.getMainLooper(), (byte)0);
    protected static final ArrayList sPopupQueue = new ArrayList();
    protected final long mDisplayTime;
    protected final GamesClientContext mGamesContext;
    protected Animation mHidePopupAnimation;
    protected final ImageBroker mImageBroker;
    private boolean mIsDisplayed;
    protected final FrameLayout mPopupContainer;
    protected View mPopupContentView;
    protected View mPopupCurtainView;
    private final com.google.android.gms.games.internal.PopupManager.PopupLocationInfo mPopupLocationInfo;
    protected View mPopupView;
    protected final Animation mRemoveCurtainAnimation;
    protected final Animation mRevealImageUnderCurtainAnimation;
    protected final Animation mRevealTextUnderCurtainAnimation;
    protected Animation mShowPopupAnimation;
    protected boolean mUseCurtain;
    private boolean mUseFakedPopupLocation;

    protected BasePopup(GamesClientContext gamesclientcontext, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, long l, boolean flag)
    {
        BasePopup(gamesclientcontext, popuplocationinfo, l, flag, false);
    }

    protected BasePopup(GamesClientContext gamesclientcontext, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, long l, boolean flag, boolean flag1)
    {
        mIsDisplayed = false;
        mGamesContext = gamesclientcontext;
        gamesclientcontext = gamesclientcontext.mContext;
        mImageBroker = ImageBroker.acquireBroker$3d64b9a2(gamesclientcontext);
        mPopupContainer = new FrameLayout(gamesclientcontext);
        mPopupLocationInfo = popuplocationinfo;
        mDisplayTime = l;
        mUseCurtain = flag;
        mUseFakedPopupLocation = flag1;
        mShowPopupAnimation = AnimationUtils.loadAnimation(gamesclientcontext, 0x7f05001f);
        mShowPopupAnimation.setAnimationListener(this);
        mShowPopupAnimation.setFillAfter(true);
        mRemoveCurtainAnimation = AnimationUtils.loadAnimation(gamesclientcontext, 0x7f050014);
        mRemoveCurtainAnimation.setAnimationListener(this);
        mRevealTextUnderCurtainAnimation = AnimationUtils.loadAnimation(gamesclientcontext, 0x7f05001e);
        mRevealTextUnderCurtainAnimation.setAnimationListener(this);
        mRevealImageUnderCurtainAnimation = new AlphaAnimation(0.0F, 1.0F);
        mRevealImageUnderCurtainAnimation.setDuration(mRevealTextUnderCurtainAnimation.getDuration());
        mRevealImageUnderCurtainAnimation.setInterpolator(mRevealTextUnderCurtainAnimation.getInterpolator());
        mHidePopupAnimation = AnimationUtils.loadAnimation(gamesclientcontext, 0x7f050015);
        mHidePopupAnimation.setAnimationListener(this);
    }

    private void cleanup()
    {
        synchronized (sPopupQueue)
        {
            removeWindow_locked();
            if (!sPopupQueue.isEmpty())
            {
                sPopupQueue.remove(0);
                if (!sPopupQueue.isEmpty())
                {
                    ((BasePopup)sPopupQueue.get(0)).displayView_locked();
                }
            }
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected static Intent createProxyIntent(Context context, String s, String s1, String s2)
    {
        s = new Intent(s);
        s.setPackage("com.google.android.play.games");
        s.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", s1);
        s.putExtra("com.google.android.gms.games.EXTRA_DISABLE_SETTINGS", true);
        s.addFlags(0x4000000);
        return GamesIntents.prepForClient(s, ClientLibraryUtils.getClientVersion(context, s1), s2);
    }

    private void displayView_locked()
    {
        WindowManager windowmanager = (WindowManager)ContextManager.getContext(mGamesContext.mContext, mPopupLocationInfo.displayId).getSystemService("window");
        android.view.WindowManager.LayoutParams layoutparams = new LayoutParams();
        layoutparams.flags = 8;
        layoutparams.format = -3;
        mPopupContainer.measure(0, 0);
        int k = mPopupContainer.getMeasuredWidth();
        int l = mPopupContainer.getMeasuredHeight();
        layoutparams.width = k;
        layoutparams.height = l;
        int j = mPopupLocationInfo.gravity;
        int i = j;
        if (j == 0)
        {
            i = 49;
        }
        if (!mUseFakedPopupLocation && PlatformVersion.checkVersion(12))
        {
            layoutparams.type = 1000;
            layoutparams.token = mPopupLocationInfo.windowToken;
            layoutparams.gravity = 51;
            RECT_CONTAINER.left = mPopupLocationInfo.left;
            RECT_CONTAINER.top = mPopupLocationInfo.top;
            RECT_CONTAINER.bottom = mPopupLocationInfo.bottom;
            RECT_CONTAINER.right = mPopupLocationInfo.right;
            if (PlatformVersion.checkVersion(17))
            {
                Configuration configuration = mPopupContainer.getContext().getResources().getConfiguration();
                Gravity.apply(i, k, l, RECT_CONTAINER, RECT_OUT, configuration.getLayoutDirection());
            } else
            {
                Gravity.apply(i, k, l, RECT_CONTAINER, RECT_OUT);
            }
            layoutparams.x = RECT_OUT.left;
            layoutparams.y = RECT_OUT.top;
        } else
        {
            layoutparams.type = 2005;
            layoutparams.token = new Binder();
            layoutparams.gravity = i;
        }
        try
        {
            windowmanager.addView(mPopupContainer, layoutparams);
        }
        catch (android.view.WindowManager.BadTokenException badtokenexception)
        {
            GamesLog.e("BasePopup", "Cannot show the popup as the given window token is not valid. Either the given view is not attached to a window or you tried to connect the GoogleApiClient in the same lifecycle step as the creation of the GoogleApiClient. See GoogleApiClient.Builder.create() and  GoogleApiClient.connect() for more information.");
            cleanup();
            return;
        }
        mIsDisplayed = true;
        mPopupView.startAnimation(mShowPopupAnimation);
    }

    private void logPopupEvent(int i)
    {
        String s = mGamesContext.getExternalGameId();
        String s1 = mGamesContext.mClientContext.mCallingPackageName;
        String s2 = mGamesContext.mClientContext.getResolvedAccountName();
        GamesPlayLogger.logInGameAction(mGamesContext.mContext, s1, s, s2, i);
    }

    public static void removePopups()
    {
        if (!PlatformVersion.checkVersion(12)) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = sPopupQueue;
        arraylist;
        JVM INSTR monitorenter ;
        BasePopup basepopup;
        for (Iterator iterator = sPopupQueue.iterator(); iterator.hasNext(); sHandler.removeMessages(2, basepopup))
        {
            basepopup = (BasePopup)iterator.next();
            basepopup.removeWindow_locked();
        }

        break MISSING_BLOCK_LABEL_60;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        sPopupQueue.clear();
        arraylist;
        JVM INSTR monitorexit ;
_L2:
    }

    private void removeWindow_locked()
    {
        try
        {
            if (mIsDisplayed)
            {
                ((WindowManager)ContextManager.getContext(mGamesContext.mContext, mPopupLocationInfo.displayId).getSystemService("window")).removeView(mPopupContainer);
                mIsDisplayed = false;
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            GamesLog.w("BasePopup", "Popup is not attached to a window, so not attempting to remove it.");
        }
    }

    private void sendTalkbackMessage()
    {
        UiUtils.sendAccessibilityEventWithText(mGamesContext.mContext, getTalkbackMessage(), mPopupView);
    }

    protected abstract void bindViewData();

    protected abstract int getClickedEvent();

    protected final Context getContext()
    {
        return mGamesContext.mContext;
    }

    protected abstract int getDisplayedEvent();

    protected final Bitmap getImageBitmap(Uri uri)
    {
        Bitmap bitmap;
        Bitmap bitmap1;
        Object obj;
        obj = null;
        bitmap1 = null;
        bitmap = bitmap1;
        if (uri == null) goto _L2; else goto _L1
_L1:
        AssetFileDescriptor assetfiledescriptor;
        assetfiledescriptor = mImageBroker.loadImageFile(mGamesContext.mContext, uri);
        bitmap = bitmap1;
        if (assetfiledescriptor == null) goto _L2; else goto _L3
_L3:
        bitmap = obj;
        bitmap1 = BitmapFactory.decodeStream(assetfiledescriptor.createInputStream());
        bitmap = bitmap1;
        bitmap1 = ImageUtils.frameBitmapInCircle(bitmap1);
        bitmap = bitmap1;
_L4:
        IOException ioexception;
        try
        {
            assetfiledescriptor.close();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return bitmap;
        }
_L2:
        return bitmap;
        ioexception;
        GamesLog.e("BasePopup", (new StringBuilder("Unable to parse image content for icon URI ")).append(uri).toString());
          goto _L4
    }

    protected final Drawable getImageDefaultDrawable(int i)
    {
        if (i != 0)
        {
            Context context = mGamesContext.mContext;
            return ImageUtils.frameDrawableInCircle(context.getResources(), context.getResources().getDrawable(i));
        } else
        {
            return null;
        }
    }

    protected abstract String getTalkbackMessage();

    protected void handleClick()
    {
    }

    protected final void hideCurrentPopupImmediate()
    {
        sHandler.removeMessages(2, this);
        sHandler.sendMessage(sHandler.obtainMessage(2, this));
    }

    protected void hidePopup()
    {
        mPopupView.startAnimation(mHidePopupAnimation);
    }

    protected final void loadView()
    {
        Context context = mGamesContext.mContext;
        if (VersionUtils.getVersionCode() < 0x7a1200)
        {
            android.content.res.Resources.Theme theme = context.getResources().newTheme();
            theme.setTo(context.getTheme());
            context.setTheme(0);
            context.getTheme().setTo(theme);
        }
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f04008a, mPopupContainer, true);
        mPopupView = mPopupContainer.findViewById(0x7f0d01b9);
        mPopupCurtainView = mPopupContainer.findViewById(0x7f0d01bb);
        mPopupContentView = mPopupContainer.findViewById(0x7f0d013f);
        mPopupContentView.setOnClickListener(this);
        if (PlatformVersion.checkVersion(21))
        {
            ((TextView)mPopupContainer.findViewById(0x7f0d0141)).setElegantTextHeight(false);
            ((TextView)mPopupContainer.findViewById(0x7f0d0142)).setElegantTextHeight(false);
        }
        UiUtils.setSmallMetagameAvatarSizes((MetagameAvatarView)mPopupContentView.findViewById(0x7f0d01ba));
        logPopupEvent(getDisplayedEvent());
        bindViewData();
    }

    public void onAnimationEnd(Animation animation)
    {
        if (!mUseCurtain) goto _L2; else goto _L1
_L1:
        if (animation != mShowPopupAnimation) goto _L4; else goto _L3
_L3:
        sHandler.sendMessageDelayed(sHandler.obtainMessage(1, this), 1500L);
_L6:
        return;
_L4:
        if (animation == mRemoveCurtainAnimation)
        {
            sHandler.sendMessageDelayed(sHandler.obtainMessage(2, this), mDisplayTime);
            sendTalkbackMessage();
            mPopupCurtainView.setVisibility(4);
            return;
        }
        if (animation == mHidePopupAnimation)
        {
            sHandler.post(new Runnable() {

                final BasePopup this$0;

                public final void run()
                {
                    cleanup();
                }

            
            {
                this$0 = BasePopup.this;
                super();
            }
            });
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (animation == mShowPopupAnimation)
        {
            sHandler.sendMessageDelayed(sHandler.obtainMessage(2, this), mDisplayTime);
            sendTalkbackMessage();
            return;
        }
        if (animation == mHidePopupAnimation)
        {
            sHandler.post(new Runnable() {

                final BasePopup this$0;

                public final void run()
                {
                    cleanup();
                }

            
            {
                this$0 = BasePopup.this;
                super();
            }
            });
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    public void onClick(View view)
    {
        logPopupEvent(getClickedEvent());
        if (((Boolean)G.enableClickableToasts.get()).booleanValue())
        {
            handleClick();
        }
    }

    protected void removeCurtain()
    {
        mPopupCurtainView.startAnimation(mRemoveCurtainAnimation);
    }

    protected final boolean shouldDisplay()
    {
        return mPopupView != null;
    }



/*
    static void access$100(BasePopup basepopup)
    {
        if (basepopup.mPopupLocationInfo.windowToken != null)
        {
            (new PopupSetupTask((byte)0)).execute(new BasePopup[] {
                basepopup
            });
        }
        return;
    }

*/


/*
    static void access$200(BasePopup basepopup)
    {
        ArrayList arraylist = sPopupQueue;
        arraylist;
        JVM INSTR monitorenter ;
        boolean flag;
        if (basepopup.mPopupView == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        flag = sPopupQueue.isEmpty();
        sPopupQueue.add(basepopup);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        basepopup.displayView_locked();
        arraylist;
        JVM INSTR monitorexit ;
        return;
        basepopup;
        arraylist;
        JVM INSTR monitorexit ;
        throw basepopup;
    }

*/

}
