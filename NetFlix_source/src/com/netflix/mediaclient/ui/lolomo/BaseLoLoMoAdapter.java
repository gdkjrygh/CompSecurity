// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lolomo;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.servicemgr.BasicLoMo;
import com.netflix.mediaclient.servicemgr.LoMoType;
import com.netflix.mediaclient.servicemgr.LoMoUtils;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ManagerCallback;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.lomo.BillboardView;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.ThreadUtils;
import com.netflix.mediaclient.util.ViewUtils;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.lolomo:
//            LoLoMoFrag

public abstract class BaseLoLoMoAdapter extends BaseAdapter
    implements LoLoMoFrag.ILoLoMoAdapter
{
    private class LoMoCallbacks extends LoggingManagerCallback
    {

        private final int numItems;
        private final long requestId;
        final BaseLoLoMoAdapter this$0;

        private void handleResult(List list, int i)
        {
            hasMoreData = true;
            lomoRequestPending = false;
            if (requestId != lomoRequestId)
            {
                Log.v("BaseLoLoMoAdapter", "Ignoring stale onLoMosFetched callback");
                return;
            }
            isLoading = false;
            onDataLoaded(i);
            if (i != 0)
            {
                Log.w("BaseLoLoMoAdapter", "Invalid status code");
                hasMoreData = false;
                notifyDataSetChanged();
                return;
            }
            if (list == null || list.size() <= 0)
            {
                Log.v("BaseLoLoMoAdapter", "No loMos in response");
                hasMoreData = false;
                notifyDataSetChanged();
                return;
            }
            if (list.size() < numItems)
            {
                hasMoreData = false;
            }
            if (Log.isLoggable("BaseLoLoMoAdapter", 2))
            {
                Log.v("BaseLoLoMoAdapter", (new StringBuilder()).append("Got ").append(list.size()).append(" items, expected ").append(numItems).append(", hasMoreData: ").append(hasMoreData).toString());
            }
            updateLoMoData(list);
        }

        public void onGenresFetched(List list, int i)
        {
            super.onGenresFetched(list, i);
            handleResult(list, i);
        }

        public void onLoMosFetched(List list, int i)
        {
            super.onLoMosFetched(list, i);
            handleResult(list, i);
        }

        public LoMoCallbacks(long l, int i)
        {
            this$0 = BaseLoLoMoAdapter.this;
            super("BaseLoLoMoAdapter");
            requestId = l;
            numItems = i;
        }
    }

    public static interface LoMoRowContent
    {

        public abstract void invalidateRequestId();

        public abstract void refresh(BasicLoMo basiclomo, int i);
    }

    static class RowHolder
    {

        public final View contentGroup;
        public final ColorStateList defaultTitleColors;
        public final LoMoRowContent rowContent;
        public final View shelf;
        public final TextView title;

        public void invalidateRequestId()
        {
            if (rowContent == null)
            {
                return;
            } else
            {
                rowContent.invalidateRequestId();
                return;
            }
        }

        RowHolder(View view, TextView textview, LoMoRowContent lomorowcontent, View view1)
        {
            contentGroup = view;
            title = textview;
            rowContent = lomorowcontent;
            shelf = view1;
            defaultTitleColors = textview.getTextColors();
        }
    }


    public static final int NUM_LOMOS_TO_FETCH_PER_BATCH = 20;
    private static final String TAG = "BaseLoLoMoAdapter";
    protected final NetflixActivity activity;
    protected final LoLoMoFrag frag;
    private boolean hasMoreData;
    private boolean isLoading;
    private int loMoStartIndex;
    private final String lolomoId;
    private long lomoRequestId;
    private boolean lomoRequestPending;
    private final List lomos = new ArrayList(40);
    protected com.netflix.mediaclient.android.app.LoadingStatus.LoadingStatusCallback mLoadingStatusCallback;
    protected ServiceManager manager;
    protected final ViewRecycler viewRecycler;

    public BaseLoLoMoAdapter(LoLoMoFrag lolomofrag, String s)
    {
        isLoading = true;
        lomoRequestPending = true;
        frag = lolomofrag;
        activity = (NetflixActivity)lolomofrag.getActivity();
        viewRecycler = lolomofrag.getViewRecycler();
        lolomoId = s;
    }

    private RowHolder createViewsAndHolder(View view)
    {
        Log.v("BaseLoLoMoAdapter", "creating views and holder");
        LinearLayout linearlayout = (LinearLayout)view.findViewById(0x7f0700fa);
        linearlayout.setFocusable(false);
        TextView textview = (TextView)view.findViewById(0x7f0700fc);
        Object obj = activity.getResources();
        Resources resources;
        int i;
        if (activity.isForKids())
        {
            i = 0x7f090032;
        } else
        {
            i = 0x7f09003a;
        }
        textview.setTextColor(((Resources) (obj)).getColor(i));
        obj = createRowContent(linearlayout, textview);
        if (activity.isForKids())
        {
            view.findViewById(0x7f0700fd).setVisibility(8);
            textview = (TextView)view.findViewById(0x7f0700fe);
            textview.setVisibility(0);
        } else
        {
            textview = (TextView)view.findViewById(0x7f0700fd);
        }
        resources = activity.getResources();
        ((android.widget.RelativeLayout.LayoutParams)textview.getLayoutParams()).leftMargin = LoMoUtils.getLomoFragOffsetLeftPx(activity) + resources.getDimensionPixelOffset(0x7f0a0051);
        return new RowHolder(linearlayout, textview, ((LoMoRowContent) (obj)), view.findViewById(0x7f0700f9));
    }

    private void fetchMoreData()
    {
        isLoading = true;
        lomoRequestId = System.nanoTime();
        int i = (loMoStartIndex + 20) - 1;
        if (Log.isLoggable("BaseLoLoMoAdapter", 2))
        {
            Log.v("BaseLoLoMoAdapter", (new StringBuilder()).append("fetching more data, starting at index: ").append(loMoStartIndex).toString());
            Log.v("BaseLoLoMoAdapter", (new StringBuilder()).append("fetching from: ").append(loMoStartIndex).append(" to: ").append(i).append(", id: ").append(lolomoId).toString());
        }
        if (manager == null)
        {
            Log.w("BaseLoLoMoAdapter", "Manager is null - can't refresh data");
            return;
        } else
        {
            makeFetchRequest(lolomoId, loMoStartIndex, i, new LoMoCallbacks(lomoRequestId, i - loMoStartIndex));
            return;
        }
    }

    private void hideLoadingAndErrorViews()
    {
        frag.hideLoadingAndErrorViews();
    }

    private boolean isRowAfterBillboardOrCwRow(int i, LoMoType lomotype)
    {
        if (i == 1)
        {
            if ((lomotype = getItem(0).getType()) == LoMoType.BILLBOARD || lomotype == LoMoType.CONTINUE_WATCHING)
            {
                return true;
            }
        }
        return false;
    }

    private void showErrorView()
    {
        frag.showErrorView();
    }

    public boolean areAllItemsEnabled()
    {
        return false;
    }

    protected boolean areRequestsPending()
    {
        return lomoRequestPending;
    }

    protected View createDummyView()
    {
        View view = new View(activity);
        view.setVisibility(8);
        return view;
    }

    protected abstract LoMoRowContent createRowContent(LinearLayout linearlayout, View view);

    public void destroy()
    {
    }

    protected Activity getActivity()
    {
        return activity;
    }

    public int getCount()
    {
        return lomos.size();
    }

    protected String getGenreId()
    {
        return lolomoId;
    }

    public long getHeaderId(int i)
    {
        return -1L;
    }

    public View getHeaderView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = createDummyView();
        }
        return viewgroup;
    }

    public BasicLoMo getItem(int i)
    {
        return (BasicLoMo)lomos.get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    protected ServiceManager getServiceManager()
    {
        return manager;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (activity.destroyed())
        {
            Log.d("BaseLoLoMoAdapter", "activity is destroyed - can't getView");
            return createDummyView();
        }
        viewgroup = view;
        if (view == null)
        {
            viewgroup = activity.getLayoutInflater().inflate(0x7f030049, null);
            viewgroup.setTag(createViewsAndHolder(viewgroup));
        }
        updateRowViews((RowHolder)viewgroup.getTag(), i);
        if (hasMoreData && i == getCount() - 1)
        {
            fetchMoreData();
        }
        return viewgroup;
    }

    protected void initLoadingState()
    {
        ThreadUtils.assertOnMain();
        lomos.clear();
        lomoRequestId = 0xffffffff80000000L;
        lomoRequestPending = true;
        hasMoreData = false;
        loMoStartIndex = 0;
        notifyDataSetChanged();
    }

    public boolean isEnabled(int i)
    {
        return false;
    }

    protected abstract boolean isGenreList();

    public boolean isLoadingData()
    {
        return isLoading;
    }

    protected abstract void makeFetchRequest(String s, int i, int j, ManagerCallback managercallback);

    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        ThreadUtils.assertOnMain();
        if (getCount() > 0)
        {
            hideLoadingAndErrorViews();
        } else
        if (!areRequestsPending())
        {
            showErrorView();
            return;
        }
    }

    protected void onDataLoaded(int i)
    {
        if (mLoadingStatusCallback != null)
        {
            mLoadingStatusCallback.onDataLoaded(i);
        }
    }

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        manager = servicemanager;
        refreshData();
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
        manager = null;
    }

    public void onPause()
    {
    }

    public void onResume()
    {
    }

    public void refreshData()
    {
        Log.v("BaseLoLoMoAdapter", "Refreshing data");
        isLoading = true;
        initLoadingState();
        fetchMoreData();
    }

    public void setLoadingStatusCallback(com.netflix.mediaclient.android.app.LoadingStatus.LoadingStatusCallback loadingstatuscallback)
    {
        if (!isLoadingData() && loadingstatuscallback != null)
        {
            loadingstatuscallback.onDataLoaded(0);
            return;
        } else
        {
            mLoadingStatusCallback = loadingstatuscallback;
            return;
        }
    }

    protected void updateLoMoData(List list)
    {
        lomos.addAll(list);
        loMoStartIndex = loMoStartIndex + list.size();
        notifyDataSetChanged();
    }

    protected void updateRowViews(RowHolder rowholder, int i)
    {
        byte byte0 = 8;
        BasicLoMo basiclomo = getItem(i);
        if (basiclomo == null)
        {
            Log.w("BaseLoLoMoAdapter", (new StringBuilder()).append("Trying to show data for null lomo! Position: ").append(i).toString());
        } else
        {
            if (Log.isLoggable("BaseLoLoMoAdapter", 2))
            {
                Log.v("BaseLoLoMoAdapter", (new StringBuilder()).append("Updating LoMo row content: ").append(basiclomo.getTitle()).append(", type: ").append(basiclomo.getType()).append(", pos: ").append(i).toString());
            }
            TextView textview = rowholder.title;
            Object obj;
            int j;
            if (basiclomo.getType() == LoMoType.BILLBOARD)
            {
                obj = activity.getString(0x7f0c01b6);
            } else
            {
                obj = basiclomo.getTitle();
            }
            textview.setText(((CharSequence) (obj)));
            obj = rowholder.title;
            if (basiclomo.getType() != LoMoType.BILLBOARD || BillboardView.shouldShowArtworkOnly(activity))
            {
                j = 0;
            } else
            {
                j = 8;
            }
            ((TextView) (obj)).setVisibility(j);
            obj = rowholder.shelf;
            j = byte0;
            if (isRowAfterBillboardOrCwRow(i, basiclomo.getType()))
            {
                j = byte0;
                if (!activity.isForKids())
                {
                    j = 0;
                }
            }
            ((View) (obj)).setVisibility(j);
            rowholder.rowContent.refresh(basiclomo, i);
            if (activity.isForKids())
            {
                if (basiclomo.getType() == LoMoType.CONTINUE_WATCHING)
                {
                    rowholder.contentGroup.setBackgroundResource(0x7f0200e5);
                    rowholder.contentGroup.setPadding(0, 0, 0, AndroidUtils.dipToPixels(activity, 22));
                    rowholder.title.setTextColor(activity.getResources().getColor(0x7f090035));
                    return;
                }
                ViewUtils.setBackgroundDrawableCompat(rowholder.contentGroup, null);
                if (i == getCount() - 1)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                obj = rowholder.contentGroup;
                if (i != 0)
                {
                    i = AndroidUtils.dipToPixels(activity, 24);
                } else
                {
                    i = 0;
                }
                ((View) (obj)).setPadding(0, 0, 0, i);
                rowholder.title.setTextColor(rowholder.defaultTitleColors);
                return;
            }
        }
    }



/*
    static boolean access$002(BaseLoLoMoAdapter baselolomoadapter, boolean flag)
    {
        baselolomoadapter.hasMoreData = flag;
        return flag;
    }

*/


/*
    static boolean access$102(BaseLoLoMoAdapter baselolomoadapter, boolean flag)
    {
        baselolomoadapter.lomoRequestPending = flag;
        return flag;
    }

*/



/*
    static boolean access$302(BaseLoLoMoAdapter baselolomoadapter, boolean flag)
    {
        baselolomoadapter.isLoading = flag;
        return flag;
    }

*/
}
