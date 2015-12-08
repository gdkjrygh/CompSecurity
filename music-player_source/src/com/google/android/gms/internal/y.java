// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ah, la, ek, em, 
//            kz, ef, db

final class y
    implements ah
{

    y()
    {
    }

    public final void a(em em1, Map map)
    {
        String s;
        s = (String)map.get("u");
        if (s == null)
        {
            ek.d("URL missing from click GMSG.");
            return;
        }
        map = Uri.parse(s);
        Object obj = em1.f();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        if (!((kz) (obj)).a(map))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        obj = ((kz) (obj)).a(map, em1.getContext());
        map = ((Map) (obj));
_L2:
        map = map.toString();
        (new ef(em1.getContext(), em1.g().c, map)).e();
        return;
        la la1;
        la1;
        ek.d((new StringBuilder("Unable to append parameter to URL: ")).append(s).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }
}
