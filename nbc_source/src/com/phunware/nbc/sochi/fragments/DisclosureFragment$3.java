// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            DisclosureFragment

class this._cls0 extends ClickableSpan
{

    final DisclosureFragment this$0;

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW");
        view.setData(Uri.parse("http://m.nbcsports.com/content/terms-and-conditions"));
        startActivity(view);
    }

    ()
    {
        this$0 = DisclosureFragment.this;
        super();
    }
}
