// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cd, cc, gu, gr, 
//            dp

static final class 
    implements cd
{

    public void a(gu gu1, Map map)
    {
        gu1 = gu1.dC();
        if (gu1 == null)
        {
            gr.W("A GMSG tried to close something that wasn't an overlay.");
            return;
        } else
        {
            gu1.close();
            return;
        }
    }

    ()
    {
    }
}
