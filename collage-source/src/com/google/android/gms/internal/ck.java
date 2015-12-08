// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ch, cl, hs

public class ck
    implements ch
{

    private final cl a;

    public ck(cl cl1)
    {
        a = cl1;
    }

    public void zza(hs hs, Map map)
    {
        boolean flag = "1".equals(map.get("transparentBackground"));
        a.zzd(flag);
    }
}
