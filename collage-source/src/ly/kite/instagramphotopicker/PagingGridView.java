// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.instagramphotopicker;

import android.content.Context;
import android.util.AttributeSet;
import in.srain.cube.views.GridViewWithHeaderAndFooter;
import java.util.List;

// Referenced classes of package ly.kite.instagramphotopicker:
//            LoadingView, PagingBaseAdapter

public class PagingGridView extends GridViewWithHeaderAndFooter
{
    public static interface Pagingable
    {

        public abstract void onLoadMoreItems();
    }


    private boolean hasMoreItems;
    private boolean isLoading;
    private LoadingView loadinView;
    private Pagingable pagingableListener;

    public PagingGridView(Context context)
    {
        super(context);
        init();
    }

    public PagingGridView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public PagingGridView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        isLoading = false;
        loadinView = new LoadingView(getContext());
        addFooterView(loadinView);
        setOnScrollListener(new _cls1());
    }

    public boolean hasMoreItems()
    {
        return hasMoreItems;
    }

    public boolean isLoading()
    {
        return isLoading;
    }

    public void onFinishLoading(boolean flag, List list)
    {
        setHasMoreItems(flag);
        setIsLoading(false);
        if (list != null && list.size() > 0)
        {
            android.widget.ListAdapter listadapter = super.getOriginalAdapter();
            if (listadapter instanceof PagingBaseAdapter)
            {
                ((PagingBaseAdapter)listadapter).addMoreItems(list);
            }
        }
    }

    public void setHasMoreItems(boolean flag)
    {
        hasMoreItems = flag;
        if (!hasMoreItems)
        {
            removeFooterView(loadinView);
        }
    }

    public void setIsLoading(boolean flag)
    {
        isLoading = flag;
    }

    public void setPagingableListener(Pagingable pagingable)
    {
        pagingableListener = pagingable;
    }



/*
    static boolean access$002(PagingGridView paginggridview, boolean flag)
    {
        paginggridview.isLoading = flag;
        return flag;
    }

*/



    /* member class not found */
    class _cls1 {}

}
