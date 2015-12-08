// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ai, ah, i, cn, 
//            cq, h, cl, co

static final class 
    implements ai
{

    public void a(cq cq1, Map map)
    {
        String s;
        s = (String)map.get("u");
        if (s == null)
        {
            cn.q("URL missing from click GMSG.");
            return;
        }
        map = Uri.parse(s);
        Object obj = cq1.ax();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        if (!((h) (obj)).a(map))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        obj = ((h) (obj)).a(map, cq1.getContext());
        map = ((Map) (obj));
_L2:
        map = map.toString();
        (new cl(cq1.getContext(), cq1.ay().hP, map)).start();
        return;
        i j;
        j;
        cn.q((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    ()
    {
    }
}
