// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cd, af, ad, gr, 
//            gu

class nd
    implements cd
{

    final af nd;

    public void a(gu gu, Map map)
    {
        if (!nd.a(map))
        {
            return;
        } else
        {
            gr.S((new StringBuilder()).append("Received request to untrack: ").append(af.b(nd).aH()).toString());
            nd.destroy();
            return;
        }
    }

    (af af1)
    {
        nd = af1;
        super();
    }
}
