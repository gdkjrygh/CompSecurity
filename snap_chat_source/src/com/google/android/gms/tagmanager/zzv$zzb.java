// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzv

static class zzayw
{

    final byte zzayw[];
    final String zzqd;

    public String toString()
    {
        return (new StringBuilder("KeyAndSerialized: key = ")).append(zzqd).append(" serialized hash = ").append(Arrays.hashCode(zzayw)).toString();
    }

    (String s, byte abyte0[])
    {
        zzqd = s;
        zzayw = abyte0;
    }
}
