// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.address;

import android.app.ProgressDialog;
import android.content.Intent;
import java.util.List;

// Referenced classes of package ly.kite.address:
//            AddressSearchRequestListener, AddressSearchActivity, AddressEditActivity, AddressSearchRequest, 
//            Address

class val.dialog
    implements AddressSearchRequestListener
{

    final AddressSearchActivity this$0;
    final ProgressDialog val$dialog;

    public void onError(AddressSearchRequest addresssearchrequest, Exception exception)
    {
        val$dialog.dismiss();
        AddressSearchActivity.this.onError(addresssearchrequest, exception);
    }

    public void onMultipleChoices(AddressSearchRequest addresssearchrequest, List list)
    {
        val$dialog.dismiss();
        AddressSearchActivity.this.onMultipleChoices(addresssearchrequest, list);
    }

    public void onUniqueAddress(AddressSearchRequest addresssearchrequest, Address address)
    {
        val$dialog.dismiss();
        addresssearchrequest = new Intent(AddressSearchActivity.this, ly/kite/address/AddressEditActivity);
        addresssearchrequest.putExtra("ly.kite.EXTRA_ADDRESS", address);
        startActivityForResult(addresssearchrequest, 0);
    }

    ener()
    {
        this$0 = final_addresssearchactivity;
        val$dialog = ProgressDialog.this;
        super();
    }
}
