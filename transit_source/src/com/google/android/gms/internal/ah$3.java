// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ai, ah, cq, cn, 
//            bf

static final class 
    implements ai
{

    public void a(cq cq1, Map map)
    {
        cq1 = cq1.au();
        if (cq1 == null)
        {
            cn.q("A GMSG tried to close something that wasn't an overlay.");
            return;
        } else
        {
            cq1.close();
            return;
        }
    }

    ()
    {
    }
}
