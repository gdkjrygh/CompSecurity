// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.address;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

// Referenced classes of package ly.kite.address:
//            AddressSearchActivity, Address, AddressEditActivity

class val.addressSearchResults
    implements android.widget.istener
{

    final AddressSearchActivity this$0;
    final ListView val$addressSearchResults;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (Address)val$addressSearchResults.getAdapter().getItem((int)l);
        if (adapterview.isSearchRequiredForFullDetails())
        {
            AddressSearchActivity.access$100(AddressSearchActivity.this, adapterview);
            return;
        } else
        {
            view = new Intent(AddressSearchActivity.this, ly/kite/address/AddressEditActivity);
            view.putExtra("ly.kite.EXTRA_ADDRESS", adapterview);
            startActivityForResult(view, 0);
            return;
        }
    }

    stener()
    {
        this$0 = final_addresssearchactivity;
        val$addressSearchResults = ListView.this;
        super();
    }
}
