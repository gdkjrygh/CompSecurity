// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            fr, gs, gv

static final class uo
    implements uo
{

    final String uo;

    public void a(gv gv1)
    {
        String s = String.format("javascript:%s(%s);", new Object[] {
            "AFMA_buildAdURL", uo
        });
        gs.V((new StringBuilder()).append("About to execute: ").append(s).toString());
        gv1.loadUrl(s);
    }

    (String s)
    {
        uo = s;
        super();
    }
}
