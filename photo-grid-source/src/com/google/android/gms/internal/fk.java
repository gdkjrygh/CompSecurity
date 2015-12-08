// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            fz, fl, ry

public final class fk
    implements fz
{

    private final fl a;

    public fk(fl fl1)
    {
        a = fl1;
    }

    public final void zza(ry ry, Map map)
    {
        ry = (String)map.get("name");
        if (ry == null)
        {
            zzb.zzaH("App event with no name parameter.");
            return;
        } else
        {
            a.onAppEvent(ry, (String)map.get("info"));
            return;
        }
    }
}
