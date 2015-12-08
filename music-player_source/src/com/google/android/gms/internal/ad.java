// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ah, ek, ef, em, 
//            db

final class ad
    implements ah
{

    ad()
    {
    }

    public final void a(em em1, Map map)
    {
        map = (String)map.get("u");
        if (map == null)
        {
            ek.d("URL missing from httpTrack GMSG.");
            return;
        } else
        {
            (new ef(em1.getContext(), em1.g().c, map)).e();
            return;
        }
    }
}
