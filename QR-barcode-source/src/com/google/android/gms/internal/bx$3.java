// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            by, bx, l, gs, 
//            gv, k, gq, gt

static final class 
    implements by
{

    public void a(gv gv1, Map map)
    {
        String s;
        s = (String)map.get("u");
        if (s == null)
        {
            gs.W("URL missing from click GMSG.");
            return;
        }
        map = Uri.parse(s);
        Object obj = gv1.dw();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        if (!((k) (obj)).b(map))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        obj = ((k) (obj)).a(map, gv1.getContext());
        map = ((Map) (obj));
_L2:
        map = map.toString();
        (new gq(gv1.getContext(), gv1.dx().wD, map)).start();
        return;
        l l1;
        l1;
        gs.W((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    ()
    {
    }
}
