// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

// Referenced classes of package com.mopub.nativeads:
//            MoPubNativeAdPositioning, MoPubStreamAdPlacer, ba, k, 
//            l, m, MoPubNativeAdLoadedListener, n, 
//            o, p, RequestParameters, MoPubAdRenderer

public class MoPubAdAdapter extends BaseAdapter
{

    private final WeakHashMap a;
    private final Adapter b;
    private final MoPubStreamAdPlacer c;
    private final ba d;
    private MoPubNativeAdLoadedListener e;

    public MoPubAdAdapter(Context context, Adapter adapter)
    {
        this(context, adapter, MoPubNativeAdPositioning.serverPositioning());
    }

    public MoPubAdAdapter(Context context, Adapter adapter, MoPubNativeAdPositioning.MoPubClientPositioning mopubclientpositioning)
    {
        this(new MoPubStreamAdPlacer(context, mopubclientpositioning), adapter, new ba(context));
    }

    public MoPubAdAdapter(Context context, Adapter adapter, MoPubNativeAdPositioning.MoPubServerPositioning mopubserverpositioning)
    {
        this(new MoPubStreamAdPlacer(context, mopubserverpositioning), adapter, new ba(context));
    }

    private MoPubAdAdapter(MoPubStreamAdPlacer mopubstreamadplacer, Adapter adapter, ba ba1)
    {
        b = adapter;
        c = mopubstreamadplacer;
        a = new WeakHashMap();
        d = ba1;
        d.a(new k(this));
        b.registerDataSetObserver(new l(this));
        c.setAdLoadedListener(new m(this));
        c.setItemCount(b.getCount());
    }

    static Adapter a(MoPubAdAdapter mopubadadapter)
    {
        return mopubadadapter.b;
    }

    static void a(MoPubAdAdapter mopubadadapter, List list)
    {
        list = list.iterator();
        int j = 0x7fffffff;
        int i = 0;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (View)list.next();
            obj = (Integer)mopubadadapter.a.get(obj);
            if (obj != null)
            {
                j = Math.min(((Integer) (obj)).intValue(), j);
                i = Math.max(((Integer) (obj)).intValue(), i);
            }
        } while (true);
        mopubadadapter.c.placeAdsInRange(j, i + 1);
    }

    static MoPubStreamAdPlacer b(MoPubAdAdapter mopubadadapter)
    {
        return mopubadadapter.c;
    }

    final void a(int i)
    {
        if (e != null)
        {
            e.onAdLoaded(i);
        }
        notifyDataSetChanged();
    }

    public boolean areAllItemsEnabled()
    {
        return (b instanceof ListAdapter) && ((ListAdapter)b).areAllItemsEnabled();
    }

    final void b(int i)
    {
        if (e != null)
        {
            e.onAdRemoved(i);
        }
        notifyDataSetChanged();
    }

    public void clearAds()
    {
        c.clearAds();
    }

    public void destroy()
    {
        c.destroy();
        d.b();
    }

    public int getAdjustedPosition(int i)
    {
        return c.getAdjustedPosition(i);
    }

    public int getCount()
    {
        return c.getAdjustedCount(b.getCount());
    }

    public Object getItem(int i)
    {
        Object obj = c.getAdData(i);
        if (obj != null)
        {
            return obj;
        } else
        {
            return b.getItem(c.getOriginalPosition(i));
        }
    }

    public long getItemId(int i)
    {
        Object obj = c.getAdData(i);
        if (obj != null)
        {
            return (long)(~System.identityHashCode(obj) + 1);
        } else
        {
            return b.getItemId(c.getOriginalPosition(i));
        }
    }

    public int getItemViewType(int i)
    {
        int j = c.getAdViewType(i);
        if (j != 0)
        {
            return (j + b.getViewTypeCount()) - 1;
        } else
        {
            return b.getItemViewType(c.getOriginalPosition(i));
        }
    }

    public int getOriginalPosition(int i)
    {
        return c.getOriginalPosition(i);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = c.getAdView(i, view, viewgroup);
        if (view1 != null)
        {
            view = view1;
        } else
        {
            view = b.getView(c.getOriginalPosition(i), view, viewgroup);
        }
        a.put(view, Integer.valueOf(i));
        d.a(view, 0);
        return view;
    }

    public int getViewTypeCount()
    {
        return b.getViewTypeCount() + c.getAdViewTypeCount();
    }

    public boolean hasStableIds()
    {
        return b.hasStableIds();
    }

    public void insertItem(int i)
    {
        c.insertItem(i);
    }

    public boolean isAd(int i)
    {
        return c.isAd(i);
    }

    public boolean isEmpty()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (b.isEmpty())
        {
            flag = flag1;
            if (c.getAdjustedCount(0) == 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public boolean isEnabled(int i)
    {
        return isAd(i) || (b instanceof ListAdapter) && ((ListAdapter)b).isEnabled(c.getOriginalPosition(i));
    }

    public void loadAds(String s)
    {
        c.loadAds(s);
    }

    public void loadAds(String s, RequestParameters requestparameters)
    {
        c.loadAds(s, requestparameters);
    }

    public void refreshAds(ListView listview, String s)
    {
        refreshAds(listview, s, null);
    }

    public void refreshAds(ListView listview, String s, RequestParameters requestparameters)
    {
        if (!com.mopub.common.Preconditions.NoThrow.checkNotNull(listview, "You called MoPubAdAdapter.refreshAds with a null ListView"))
        {
            return;
        }
        View view = listview.getChildAt(0);
        int i;
        int j;
        int j1;
        if (view == null)
        {
            i = 0;
        } else
        {
            i = view.getTop();
        }
        j1 = listview.getFirstVisiblePosition();
        for (j = Math.max(j1 - 1, 0); c.isAd(j) && j > 0; j--) { }
        int i1;
        for (i1 = listview.getLastVisiblePosition(); c.isAd(i1) && i1 < getCount() - 1; i1++) { }
        j = c.getOriginalPosition(j);
        i1 = c.getOriginalCount(i1 + 1);
        int k1 = c.getOriginalCount(getCount());
        c.removeAdsInRange(i1, k1);
        j = c.removeAdsInRange(0, j);
        if (j > 0)
        {
            listview.setSelectionFromTop(j1 - j, i);
        }
        loadAds(s, requestparameters);
    }

    public final void registerAdRenderer(MoPubAdRenderer mopubadrenderer)
    {
        if (!com.mopub.common.Preconditions.NoThrow.checkNotNull(mopubadrenderer, "Tried to set a null ad renderer on the placer."))
        {
            return;
        } else
        {
            c.registerAdRenderer(mopubadrenderer);
            return;
        }
    }

    public void removeItem(int i)
    {
        c.removeItem(i);
    }

    public final void setAdLoadedListener(MoPubNativeAdLoadedListener mopubnativeadloadedlistener)
    {
        e = mopubnativeadloadedlistener;
    }

    public void setOnClickListener(ListView listview, android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        if (!com.mopub.common.Preconditions.NoThrow.checkNotNull(listview, "You called MoPubAdAdapter.setOnClickListener with a null ListView"))
        {
            return;
        }
        if (onitemclicklistener == null)
        {
            listview.setOnItemClickListener(null);
            return;
        } else
        {
            listview.setOnItemClickListener(new n(this, onitemclicklistener));
            return;
        }
    }

    public void setOnItemLongClickListener(ListView listview, android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener)
    {
        if (!com.mopub.common.Preconditions.NoThrow.checkNotNull(listview, "You called MoPubAdAdapter.setOnItemLongClickListener with a null ListView"))
        {
            return;
        }
        if (onitemlongclicklistener == null)
        {
            listview.setOnItemLongClickListener(null);
            return;
        } else
        {
            listview.setOnItemLongClickListener(new o(this, onitemlongclicklistener));
            return;
        }
    }

    public void setOnItemSelectedListener(ListView listview, android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener)
    {
        if (!com.mopub.common.Preconditions.NoThrow.checkNotNull(listview, "You called MoPubAdAdapter.setOnItemSelectedListener with a null ListView"))
        {
            return;
        }
        if (onitemselectedlistener == null)
        {
            listview.setOnItemSelectedListener(null);
            return;
        } else
        {
            listview.setOnItemSelectedListener(new p(this, onitemselectedlistener));
            return;
        }
    }

    public void setSelection(ListView listview, int i)
    {
        if (!com.mopub.common.Preconditions.NoThrow.checkNotNull(listview, "You called MoPubAdAdapter.setSelection with a null ListView"))
        {
            return;
        } else
        {
            listview.setSelection(c.getAdjustedPosition(i));
            return;
        }
    }

    public void smoothScrollToPosition(ListView listview, int i)
    {
        if (!com.mopub.common.Preconditions.NoThrow.checkNotNull(listview, "You called MoPubAdAdapter.smoothScrollToPosition with a null ListView"))
        {
            return;
        } else
        {
            listview.smoothScrollToPosition(c.getAdjustedPosition(i));
            return;
        }
    }
}
