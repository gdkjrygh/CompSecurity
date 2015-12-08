// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.address;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package ly.kite.address:
//            AddressSearchActivity, Address

private static class <init> extends BaseAdapter
{

    private List addresses;

    public int getCount()
    {
        if (addresses == null)
        {
            return 0;
        } else
        {
            return addresses.size();
        }
    }

    public Object getItem(int i)
    {
        return addresses.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = ((LayoutInflater)viewgroup.getContext().getSystemService("layout_inflater")).inflate(ly.kite.Adapter, null);
        }
        view = (Address)getItem(i);
        ((TextView)view1.findViewById(0x1020014)).setText(view.toString());
        return view1;
    }

    public void setAddresses(List list)
    {
        addresses = list;
        notifyDataSetInvalidated();
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
