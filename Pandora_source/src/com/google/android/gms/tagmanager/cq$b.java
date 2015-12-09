// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cq

private static class b
{

    final String a;
    final byte b[];

    public String toString()
    {
        return (new StringBuilder()).append("KeyAndSerialized: key = ").append(a).append(" serialized hash = ").append(Arrays.hashCode(b)).toString();
    }

    (String s, byte abyte0[])
    {
        a = s;
        b = abyte0;
    }
}
