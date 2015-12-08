// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            dc, dw, dz

static final class pG
    implements pG
{

    final String pG;

    public void a(dz dz1)
    {
        String s = String.format("javascript:%s(%s);", new Object[] {
            "AFMA_buildAdURL", pG
        });
        dw.y((new StringBuilder()).append("About to execute: ").append(s).toString());
        dz1.loadUrl(s);
    }

    (String s)
    {
        pG = s;
        super();
    }
}
