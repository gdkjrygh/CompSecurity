// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bg, hw, fj, fl, 
//            hj, fh, zzhy

final class ba
    implements bg
{

    ba()
    {
    }

    public final void a(fl fl1, Map map)
    {
        String s;
        s = (String)map.get("u");
        if (s == null)
        {
            fj.e("URL missing from click GMSG.");
            return;
        }
        map = Uri.parse(s);
        Object obj = fl1.i();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        if (!((hj) (obj)).a(map))
        {
            break MISSING_BLOCK_LABEL_64;
        }
        fl1.getContext();
        obj = ((hj) (obj)).b(map);
        map = ((Map) (obj));
_L2:
        map = map.toString();
        (new fh(fl1.getContext(), fl1.j().b, map)).a();
        return;
        hw hw1;
        hw1;
        fj.e((new StringBuilder("Unable to append parameter to URL: ")).append(s).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }
}
