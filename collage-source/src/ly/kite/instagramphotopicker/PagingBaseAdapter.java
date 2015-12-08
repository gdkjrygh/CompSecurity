// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.instagramphotopicker;

import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;

public abstract class PagingBaseAdapter extends BaseAdapter
{

    protected List items;

    public PagingBaseAdapter()
    {
        items = new ArrayList();
    }

    public PagingBaseAdapter(List list)
    {
        items = list;
    }

    public void addMoreItems(List list)
    {
        items.addAll(list);
        notifyDataSetChanged();
    }

    public List getItems()
    {
        return items;
    }

    public void removeAllItems()
    {
        items.clear();
        notifyDataSetChanged();
    }
}
