// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//            v

private static class arj
{

    final String KP;
    final byte arj[];

    public String toString()
    {
        return (new StringBuilder()).append("KeyAndSerialized: key = ").append(KP).append(" serialized hash = ").append(Arrays.hashCode(arj)).toString();
    }

    (String s, byte abyte0[])
    {
        KP = s;
        arj = abyte0;
    }
}
