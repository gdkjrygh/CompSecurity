// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.address;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package ly.kite.address:
//            AddressEditActivity, Address, Country

class val.countries
    implements android.widget.ctedListener
{

    final AddressEditActivity this$0;
    final Country val$countries[];

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (l >= 0L && l < (long)val$countries.length)
        {
            adapterview = val$countries[(int)l];
            AddressEditActivity.access$000(AddressEditActivity.this).setCountry(adapterview);
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    tedListener()
    {
        this$0 = final_addresseditactivity;
        val$countries = _5B_Lly.kite.address.Country_3B_.this;
        super();
    }
}
