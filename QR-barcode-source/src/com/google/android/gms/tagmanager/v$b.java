// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//            v

private static class aoZ
{

    final String JO;
    final byte aoZ[];

    public String toString()
    {
        return (new StringBuilder()).append("KeyAndSerialized: key = ").append(JO).append(" serialized hash = ").append(Arrays.hashCode(aoZ)).toString();
    }

    (String s, byte abyte0[])
    {
        JO = s;
        aoZ = abyte0;
    }
}
