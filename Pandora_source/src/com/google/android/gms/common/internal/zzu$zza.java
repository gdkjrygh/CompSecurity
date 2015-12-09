// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzu, zzv

public static final class <init>
{

    private final Object zzCG;
    private final List zzTZ;

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder(100)).append(zzCG.getClass().getSimpleName()).append('{');
        int j = zzTZ.size();
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append((String)zzTZ.get(i));
            if (i < j - 1)
            {
                stringbuilder.append(", ");
            }
        }

        return stringbuilder.append('}').toString();
    }

    public zzTZ zzg(String s, Object obj)
    {
        zzTZ.add((new StringBuilder()).append((String)zzv.zzr(s)).append("=").append(String.valueOf(obj)).toString());
        return this;
    }

    private (Object obj)
    {
        zzCG = zzv.zzr(obj);
        zzTZ = new ArrayList();
    }

    zzTZ(Object obj, zzTZ zztz)
    {
        this(obj);
    }
}
