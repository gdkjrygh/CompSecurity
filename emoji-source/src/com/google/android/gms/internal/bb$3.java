// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bc, bb, l, eu, 
//            ex, k, es, ev

static final class 
    implements bc
{

    public void b(ex ex1, Map map)
    {
        String s;
        s = (String)map.get("u");
        if (s == null)
        {
            eu.D("URL missing from click GMSG.");
            return;
        }
        map = Uri.parse(s);
        Object obj = ex1.cc();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        if (!((k) (obj)).b(map))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        obj = ((k) (obj)).a(map, ex1.getContext());
        map = ((Map) (obj));
_L2:
        map = map.toString();
        (new es(ex1.getContext(), ex1.cd().sw, map)).start();
        return;
        l l1;
        l1;
        eu.D((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    ()
    {
    }
}
