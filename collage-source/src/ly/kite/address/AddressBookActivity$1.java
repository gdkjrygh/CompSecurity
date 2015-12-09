// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.address;

import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package ly.kite.address:
//            AddressBookActivity, Address

class this._cls0
    implements android.widget.ClickListener
{

    final AddressBookActivity this$0;

    public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        Object obj = (Address)AddressBookActivity.access$000(AddressBookActivity.this).getItem((int)l);
        adapterview = new android.app.nit>(AddressBookActivity.this);
        view = adapterview.tTitle(((Address) (obj)).toString());
    /* block-local class not found */
    class _cls1 {}

        obj = new _cls1(((Address) (obj)));
        view.tItems(new String[] {
            "Edit Address", "Delete Address"
        }, ((android.content.kListener) (obj)));
        adapterview.eate().show();
        return true;
    }

    _cls1()
    {
        this$0 = AddressBookActivity.this;
        super();
    }
}
