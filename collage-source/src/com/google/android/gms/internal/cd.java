// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ch, ce, hs

public final class cd
    implements ch
{

    private final ce a;

    public cd(ce ce1)
    {
        a = ce1;
    }

    public void zza(hs hs, Map map)
    {
        hs = (String)map.get("name");
        if (hs == null)
        {
            zzb.zzaE("App event with no name parameter.");
            return;
        } else
        {
            a.onAppEvent(hs, (String)map.get("info"));
            return;
        }
    }
}
