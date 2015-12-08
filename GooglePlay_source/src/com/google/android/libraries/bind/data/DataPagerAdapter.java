// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.bind.bidi.BidiAwarePagerAdapter;
import com.google.android.libraries.bind.bidi.BidiPagingHelper;
import com.google.android.libraries.bind.util.Util;
import com.google.android.libraries.bind.view.ViewHeap;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.libraries.bind.data:
//            ViewProvider, DataList, Snapshot, DataObserver, 
//            Data, DataChange

public abstract class DataPagerAdapter extends PagerAdapter
    implements BidiAwarePagerAdapter
{
    protected final class ViewPagerHelper
    {

        final DataPagerAdapter this$0;
        View view;
        ViewProvider viewProvider;

        public final void destroyItem(ViewGroup viewgroup)
        {
            viewgroup.removeView(view);
        }

        public final Object instantiateItem(ViewGroup viewgroup, int i)
        {
            if (i > 0)
            {
                return null;
            } else
            {
                view = viewProvider.getView$70191498(viewgroup);
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
                viewgroup.addView(view);
                return this;
            }
        }

        public final boolean isViewFromObject(View view1)
        {
            return view == view1;
        }

        ViewPagerHelper(ViewProvider viewprovider)
        {
            this$0 = DataPagerAdapter.this;
            super();
            viewProvider = viewprovider;
        }
    }


    private final ViewPagerHelper errorPagerHelper;
    private boolean isRtl;
    public DataList list;
    private final ViewPagerHelper loadingPagerHelper;
    public final DataObserver observer = new DataObserver() {

        final DataPagerAdapter this$0;

        public final void onDataChanged(DataChange datachange)
        {
            if (datachange.affectsPrimaryKey)
            {
                notifyDataSetChanged();
            }
        }

            
            {
                this$0 = DataPagerAdapter.this;
                super();
            }
    };
    protected final ViewHeap viewHeap;
    private final Map viewMap = new HashMap();

    public DataPagerAdapter(ViewHeap viewheap)
    {
        loadingPagerHelper = new ViewPagerHelper(ViewProvider.DEFAULT_LOADING_VIEW_PROVIDER);
        errorPagerHelper = new ViewPagerHelper(ViewProvider.DEFAULT_ERROR_VIEW_PROVIDER);
        viewHeap = viewheap;
    }

    private boolean isInvalidPosition(int i)
    {
        return i < 0 || list == null || i >= list.getCount();
    }

    public final void destroyItem$30510aeb(ViewGroup viewgroup, Object obj)
    {
        if (obj == loadingPagerHelper)
        {
            loadingPagerHelper.destroyItem(viewgroup);
            return;
        }
        if (obj == errorPagerHelper)
        {
            errorPagerHelper.destroyItem(viewgroup);
            return;
        } else
        {
            obj = (View)viewMap.remove(obj);
            viewgroup.removeView(((View) (obj)));
            onDestroyedView(((View) (obj)));
            return;
        }
    }

    public final int getCount()
    {
        int i;
        if (list == null)
        {
            i = 0;
        } else
        {
            i = list.getCount();
        }
        return Math.max(1, i);
    }

    public final int getItemPosition(Object obj)
    {
        return BidiPagingHelper.getVisualPosition(this, getLogicalItemPosition(obj));
    }

    public final int getLogicalItemPosition(Object obj)
    {
        int i = 0;
        if (list != null) goto _L2; else goto _L1
_L1:
        i = -2;
_L4:
        return i;
_L2:
        if (obj != loadingPagerHelper)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!list.isEmpty() || list.snapshot.hasException())
        {
            return -2;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (obj != errorPagerHelper)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!list.isEmpty() || !list.snapshot.hasException())
        {
            return -2;
        }
        if (true) goto _L4; else goto _L5
_L5:
        int j = list.findPositionForId(obj);
        i = j;
        if (j == -1)
        {
            return -2;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final CharSequence getPageTitle(int i)
    {
        return super.getPageTitle(i);
    }

    public abstract View getView(ViewGroup viewgroup, int i, Data data);

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        if (isInvalidPosition(i))
        {
            if (list == null)
            {
                return null;
            }
            if (list.snapshot.hasException())
            {
                return errorPagerHelper.instantiateItem(viewgroup, i);
            } else
            {
                return loadingPagerHelper.instantiateItem(viewgroup, i);
            }
        } else
        {
            i = BidiPagingHelper.getLogicalPosition(this, i);
            View view = getView(viewgroup, i, list.getData(i));
            viewgroup.addView(view);
            viewgroup = ((ViewGroup) (list.getItemId(i)));
            view.setTag(0x7f0d0019, viewgroup);
            viewMap.put(viewgroup, view);
            return viewgroup;
        }
    }

    public final boolean isRtl()
    {
        return isRtl;
    }

    public final boolean isViewFromObject(View view, Object obj)
    {
        if (obj == loadingPagerHelper)
        {
            return loadingPagerHelper.isViewFromObject(view);
        }
        if (obj == errorPagerHelper)
        {
            return errorPagerHelper.isViewFromObject(view);
        } else
        {
            return Util.objectsEqual(view.getTag(0x7f0d0019), obj);
        }
    }

    public void onDestroyedView(View view)
    {
    }

    public final void setRtl(boolean flag)
    {
        if (isRtl != flag)
        {
            isRtl = flag;
            notifyDataSetChanged();
        }
    }

    public final View tryGetViewAt(int i)
    {
        if (isInvalidPosition(i))
        {
            if (list == null)
            {
                return null;
            }
            if (list.snapshot.hasException())
            {
                return errorPagerHelper.view;
            } else
            {
                return loadingPagerHelper.view;
            }
        } else
        {
            Object obj = list.getItemId(i);
            return (View)viewMap.get(obj);
        }
    }
}
