// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//            v

private static class afp
{

    final String JI;
    final byte afp[];

    public String toString()
    {
        return (new StringBuilder()).append("KeyAndSerialized: key = ").append(JI).append(" serialized hash = ").append(Arrays.hashCode(afp)).toString();
    }

    (String s, byte abyte0[])
    {
        JI = s;
        afp = abyte0;
    }
}
