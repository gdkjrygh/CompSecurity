// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.address;

import android.content.DialogInterface;

// Referenced classes of package ly.kite.address:
//            AddressSearchActivity, AddressSearchRequest

class this._cls0
    implements android.content.Listener
{

    final AddressSearchActivity this$0;

    public void onCancel(DialogInterface dialoginterface)
    {
        if (AddressSearchActivity.access$200(AddressSearchActivity.this) != null)
        {
            AddressSearchActivity.access$200(AddressSearchActivity.this).cancelSearch();
            AddressSearchActivity.access$202(AddressSearchActivity.this, null);
        }
    }

    Listener()
    {
        this$0 = AddressSearchActivity.this;
        super();
    }
}
