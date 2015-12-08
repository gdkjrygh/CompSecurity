// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.view.View;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            d, WebSearchActivity

class a
    implements android.view.nClickListener
{

    final String a;
    final a b;

    public void onClick(View view)
    {
        ((WebSearchActivity)b.b.getActivity()).a(a);
    }

    rchActivity(rchActivity rchactivity, String s)
    {
        b = rchactivity;
        a = s;
        super();
    }
}
