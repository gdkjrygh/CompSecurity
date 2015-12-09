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
//            AddressBookActivity, Address

private static class mAddressList extends BaseAdapter
{

    private List mAddressList;

    public int getCount()
    {
        return mAddressList.size();
    }

    public Object getItem(int i)
    {
        return mAddressList.get(i);
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
            view1 = ((LayoutInflater)viewgroup.getContext().getSystemService("layout_inflater")).inflate(ly.kite.Adaptor, null);
        }
        view = (Address)getItem(i);
        ((TextView)view1.findViewById(0x1020014)).setText(view.getRecipientName());
        ((TextView)view1.findViewById(0x1020015)).setText(view.getDisplayAddressWithoutRecipient());
        return view1;
    }

    (Context context)
    {
        mAddressList = Address.getAddressBook(context);
    }
}
