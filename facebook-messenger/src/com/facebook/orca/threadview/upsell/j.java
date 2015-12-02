// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview.upsell;

import android.view.View;

// Referenced classes of package com.facebook.orca.threadview.upsell:
//            UpsellContactView, k

class j
    implements android.view.View.OnClickListener
{

    final UpsellContactView a;

    j(UpsellContactView upsellcontactview)
    {
        a = upsellcontactview;
        super();
    }

    public void onClick(View view)
    {
        if (UpsellContactView.a(a) != null)
        {
            UpsellContactView.a(a).a();
        }
    }
}
