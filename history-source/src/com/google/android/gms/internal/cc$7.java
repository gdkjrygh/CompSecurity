// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cd, cc, gr, gp, 
//            gu, gs

static final class 
    implements cd
{

    public void a(gu gu1, Map map)
    {
        map = (String)map.get("u");
        if (map == null)
        {
            gr.W("URL missing from httpTrack GMSG.");
            return;
        } else
        {
            (new gp(gu1.getContext(), gu1.dG().wS, map)).start();
            return;
        }
    }

    ()
    {
    }
}
