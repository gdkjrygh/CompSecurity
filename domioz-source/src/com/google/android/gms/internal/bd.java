// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bg, fj, fh, fl, 
//            zzhy

final class bd
    implements bg
{

    bd()
    {
    }

    public final void a(fl fl1, Map map)
    {
        map = (String)map.get("u");
        if (map == null)
        {
            fj.e("URL missing from httpTrack GMSG.");
            return;
        } else
        {
            (new fh(fl1.getContext(), fl1.j().b, map)).a();
            return;
        }
    }
}
