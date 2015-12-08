// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ai, ah, cn, cl, 
//            cq, co

static final class 
    implements ai
{

    public void a(cq cq1, Map map)
    {
        map = (String)map.get("u");
        if (map == null)
        {
            cn.q("URL missing from httpTrack GMSG.");
            return;
        } else
        {
            (new cl(cq1.getContext(), cq1.ay().hP, map)).start();
            return;
        }
    }

    ()
    {
    }
}
