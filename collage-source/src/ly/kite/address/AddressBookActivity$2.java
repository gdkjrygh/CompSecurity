// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.address;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package ly.kite.address:
//            AddressBookActivity, Address

class this._cls0
    implements android.widget.kListener
{

    final AddressBookActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (Address)AddressBookActivity.access$000(AddressBookActivity.this).getItem((int)l);
        view = new Intent();
        view.putExtra("ly.kite.EXTRA_ADDRESS", adapterview);
        setResult(-1, view);
        finish();
    }

    dressBookListAdaptor()
    {
        this$0 = AddressBookActivity.this;
        super();
    }
}
