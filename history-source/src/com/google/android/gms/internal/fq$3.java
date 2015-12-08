// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            fq, gr, gu

static final class uC
    implements uC
{

    final String uC;

    public void a(gu gu1)
    {
        String s = String.format("javascript:%s(%s);", new Object[] {
            "AFMA_buildAdURL", uC
        });
        gr.V((new StringBuilder()).append("About to execute: ").append(s).toString());
        gu1.loadUrl(s);
    }

    (String s)
    {
        uC = s;
        super();
    }
}
