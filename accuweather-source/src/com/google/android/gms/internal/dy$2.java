// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            dy, ev, ey

static final class qw
    implements qw
{

    final String qw;

    public void a(ey ey1)
    {
        String s = String.format("javascript:%s(%s);", new Object[] {
            "AFMA_buildAdURL", qw
        });
        ev.C((new StringBuilder()).append("About to execute: ").append(s).toString());
        ey1.loadUrl(s);
    }

    (String s)
    {
        qw = s;
        super();
    }
}
