// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            dx, eu, ex

static final class qz
    implements qz
{

    final String qz;

    public void a(ex ex1)
    {
        String s = String.format("javascript:%s(%s);", new Object[] {
            "AFMA_buildAdURL", qz
        });
        eu.C((new StringBuilder()).append("About to execute: ").append(s).toString());
        ex1.loadUrl(s);
    }

    (String s)
    {
        qz = s;
        super();
    }
}
