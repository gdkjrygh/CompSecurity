// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzw, zzx

public static final class <init>
{

    private final List zzQr;
    private final Object zzzF;

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder(100)).append(zzzF.getClass().getSimpleName()).append('{');
        int j = zzQr.size();
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append((String)zzQr.get(i));
            if (i < j - 1)
            {
                stringbuilder.append(", ");
            }
        }

        return stringbuilder.append('}').toString();
    }

    public final zzQr zza(String s, Object obj)
    {
        zzQr.add((new StringBuilder()).append((String)zzx.zzl(s)).append("=").append(String.valueOf(obj)).toString());
        return this;
    }

    private (Object obj)
    {
        zzzF = zzx.zzl(obj);
        zzQr = new ArrayList();
    }

    zzQr(Object obj, zzQr zzqr)
    {
        this(obj);
    }
}
