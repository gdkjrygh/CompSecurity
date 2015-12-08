// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.view;

import android.location.Address;
import android.view.View;
import android.widget.EditText;
import com.aetn.history.android.historyhere.model.LocationManager;

// Referenced classes of package com.aetn.history.android.historyhere.view:
//            SuggestActivity

class this._cls0
    implements android.view.er
{

    final SuggestActivity this$0;

    public void onClick(View view)
    {
        view = LocationManager.getInstance(SuggestActivity.access$000(SuggestActivity.this)).getUsersAddress();
        SuggestActivity.access$102(SuggestActivity.this, LocationManager.getInstance(SuggestActivity.access$000(SuggestActivity.this)).getUsersLocation());
        if (view != null)
        {
            SuggestActivity.access$200(SuggestActivity.this).setText(view.getAddressLine(0));
            SuggestActivity.access$300(SuggestActivity.this).setText(view.getLocality());
            SuggestActivity.access$400(SuggestActivity.this).setText(view.getAdminArea());
            SuggestActivity.access$500(SuggestActivity.this).setText(view.getPostalCode());
        }
    }

    A()
    {
        this$0 = SuggestActivity.this;
        super();
    }
}
