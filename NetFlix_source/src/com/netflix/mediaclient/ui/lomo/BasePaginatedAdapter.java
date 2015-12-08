// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.servicemgr.BasicLoMo;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.LoMoUtils;
import com.netflix.mediaclient.servicemgr.PresentationTracking;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.UiLocation;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.util.DataUtil;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.util.MathUtils;
import com.netflix.mediaclient.util.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class BasePaginatedAdapter
{
    static class Memento
    {

        final String currTitle;
        final List data;
        final int listViewPos;

        public String toString()
        {
            return (new StringBuilder()).append("title: ").append(currTitle).append(", data size: ").append(data.size()).append(", listViewPos: ").append(listViewPos).toString();
        }

        protected Memento(List list, int i, String s)
        {
            data = list;
            listViewPos = i;
            currTitle = s;
        }
    }


    protected static final boolean DO_NOT_OVERLAP_PAGES = false;
    protected static final boolean OVERLAP_PAGES = true;
    private static final String TAG = "BasePaginatedAdapter";
    protected final NetflixActivity activity;
    private String currTitle;
    private List data;
    private int listViewPos;
    private final int numItemsPerPage;

    public BasePaginatedAdapter(Context context)
    {
        activity = (NetflixActivity)context;
        int i = DeviceUtils.getBasicScreenOrientation(context);
        int j = DeviceUtils.getScreenSizeCategory(context);
        numItemsPerPage = computeNumItemsPerPage(i, j);
        if (Log.isLoggable("BasePaginatedAdapter", 2))
        {
            Log.v("BasePaginatedAdapter", (new StringBuilder()).append(getClass().getSimpleName()).append(", num items: ").append(numItemsPerPage).append(", orientation: ").append(i).append(", screenSize: ").append(j).toString());
        }
    }

    private void appendOrUpdate(List list, List list1, int i)
    {
        int j = 0;
        while (j < list1.size()) 
        {
            Video video = (Video)list1.get(j);
            int k = i + j;
            if (k < list.size())
            {
                list.set(k, video);
            } else
            {
                list.add(video);
            }
            j++;
        }
    }

    private int computeNumPages()
    {
        return MathUtils.ceiling(data.size(), numItemsPerPage);
    }

    public static int computeViewPagerWidth(NetflixActivity netflixactivity, boolean flag)
    {
        if (flag)
        {
            return DeviceUtils.getScreenWidthInPixels(netflixactivity) - (LoMoUtils.getLomoFragOffsetLeftPx(netflixactivity) + LoMoUtils.getLomoFragOffsetRightPx(netflixactivity));
        } else
        {
            return DeviceUtils.getScreenWidthInPixels(netflixactivity);
        }
    }

    private String printLomo()
    {
        return (new StringBuilder()).append(currTitle).append(": ").toString();
    }

    public void appendData(List list, String s, int i, int j)
    {
        if (list != null)
        {
            int k = data.size();
            appendOrUpdate(data, list, i);
            if (Log.isLoggable("BasePaginatedAdapter", 2))
            {
                Log.v("BasePaginatedAdapter", (new StringBuilder()).append(printLomo()).append("appending data starting with item: ").append(DataUtil.getFirstItemSafely(list)).append(", prev size: ").append(k).append(", new size: ").append(data.size()).toString());
                if (data.size() == k)
                {
                    Log.w("BasePaginatedAdapter", (new StringBuilder()).append(printLomo()).append("***** append called but no items added\n").toString());
                }
            }
        }
        if (Log.isLoggable("BasePaginatedAdapter", 2))
        {
            Log.v("BasePaginatedAdapter", (new StringBuilder()).append(printLomo()).append("currTitle: ").append(currTitle).append("\ntitle: ").append(s).append(", start: ").append(i).append(", end: ").append(j).append(", listViewPos: ").append(listViewPos).toString());
        }
        if (StringUtils.isEmpty(currTitle))
        {
            if (Log.isLoggable("BasePaginatedAdapter", 2))
            {
                Log.v("BasePaginatedAdapter", (new StringBuilder()).append(printLomo()).append("new title: ").append(s).toString());
            }
            currTitle = s;
        }
        if (!StringUtils.safeEquals(s, currTitle))
        {
            if (Log.isLoggable("BasePaginatedAdapter", 6))
            {
                Log.e("BasePaginatedAdapter", (new StringBuilder()).append(printLomo()).append("***** title mismatch:").append(printLomo()).append("\n    curr: ").append(currTitle).append(printLomo()).append("\n    new: ").append(s).toString());
            }
            currTitle = s;
        }
    }

    public void clearData()
    {
        if (Log.isLoggable("BasePaginatedAdapter", 2))
        {
            Log.v("BasePaginatedAdapter", (new StringBuilder()).append(printLomo()).append("Clearing data...").toString());
        }
        data = new ArrayList();
        currTitle = "";
        listViewPos = -1;
    }

    protected abstract int computeNumItemsPerPage(int i, int j);

    protected abstract int computeNumVideosToFetchPerBatch(Context context);

    protected Activity getActivity()
    {
        return activity;
    }

    public int getCount()
    {
        return computeNumPages();
    }

    public List getDataForPage(int i)
    {
        if (i >= computeNumPages())
        {
            return null;
        }
        i = Math.min(numItemsPerPage * i, data.size());
        int j = Math.min(numItemsPerPage + i, data.size());
        if (Log.isLoggable("BasePaginatedAdapter", 2))
        {
            Log.v("BasePaginatedAdapter", (new StringBuilder()).append(printLomo()).append(String.format("Getting [%d, %d], data set size: %d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(data.size())
            })).toString());
        }
        return data.subList(i, j);
    }

    protected int getListViewPos()
    {
        return listViewPos;
    }

    public int getRowHeightInPx()
    {
        int i = DeviceUtils.getBasicScreenOrientation(activity);
        int j = DeviceUtils.getScreenSizeCategory(activity);
        i = (int)((float)(computeViewPagerWidth(activity, true) / computeNumItemsPerPage(i, j)) * 1.43F + 0.5F);
        Log.v("BasePaginatedAdapter", (new StringBuilder()).append("Computed view height: ").append(i).toString());
        return i;
    }

    public View getView(ViewRecycler viewrecycler, BasicLoMo basiclomo, int i)
    {
        Log.v("BasePaginatedAdapter", (new StringBuilder()).append(printLomo()).append(" Getting page for position: ").append(i).toString());
        return getView(viewrecycler, getDataForPage(i), numItemsPerPage, i, basiclomo);
    }

    protected abstract View getView(ViewRecycler viewrecycler, List list, int i, int j, BasicLoMo basiclomo);

    public boolean isLastItem(int i)
    {
        return i == computeNumPages() - 1;
    }

    public void restoreFromMemento(Memento memento)
    {
        data = memento.data;
        listViewPos = memento.listViewPos;
        currTitle = memento.currTitle;
        if (Log.isLoggable("BasePaginatedAdapter", 2))
        {
            Log.v("BasePaginatedAdapter", (new StringBuilder()).append(printLomo()).append("restored from memento: ").append(memento).toString());
        }
    }

    public Memento saveToMemento()
    {
        Memento memento = new Memento(data, listViewPos, currTitle);
        if (Log.isLoggable("BasePaginatedAdapter", 2))
        {
            Log.v("BasePaginatedAdapter", (new StringBuilder()).append(printLomo()).append("saving memento: ").append(memento).toString());
        }
        return memento;
    }

    public void setListViewPos(int i)
    {
        listViewPos = i;
    }

    public void trackPresentation(ServiceManager servicemanager, BasicLoMo basiclomo, int i, Boolean boolean1)
    {
        Object obj = getDataForPage(i);
        if (obj == null || ((List) (obj)).size() == 0)
        {
            Log.d("nf_presentation", "No videos input videos found in page data");
            return;
        }
        ArrayList arraylist = new ArrayList(((List) (obj)).size());
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Video video = (Video)((Iterator) (obj)).next();
            if (VideoType.isPresentationTrackingType(video.getType()))
            {
                arraylist.add(video.getId());
            }
        } while (true);
        if (arraylist.size() == 0)
        {
            Log.d("nf_presentation", (new StringBuilder()).append("No videos found for presentation tracking - row: ").append(basiclomo.getTitle()).toString());
            return;
        }
        i = i * numItemsPerPage + LoMoUtils.getClientInjectedVideoCount(basiclomo, servicemanager.isCurrentProfileFacebookConnected(), i);
        if (boolean1.booleanValue())
        {
            boolean1 = UiLocation.GENRE_LOLOMO;
        } else
        {
            boolean1 = UiLocation.HOME_LOLOMO;
        }
        if (Log.isLoggable("BasePaginatedAdapter", 2))
        {
            Log.v("nf_presentation", String.format("%s, %s, offset %d %s", new Object[] {
                basiclomo.getTitle(), boolean1, Integer.valueOf(i), arraylist
            }));
        }
        servicemanager.getClientLogging().getPresentationTracking().reportPresentation(basiclomo, arraylist, i, boolean1);
    }
}
