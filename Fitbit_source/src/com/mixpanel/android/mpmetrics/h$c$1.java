// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.util.Log;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            h, g

class a
    implements a
{

    final String a;
    final a b;

    public void a(h h1)
    {
        if (g.b)
        {
            Log.v("MixpanelAPI.API", (new StringBuilder()).append("Using existing pushId ").append(a).toString());
        }
        h1.e().a(a);
    }

    ( , String s)
    {
        b = ;
        a = s;
        super();
    }
}
