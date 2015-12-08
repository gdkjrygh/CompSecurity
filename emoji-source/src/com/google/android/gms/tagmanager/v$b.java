// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//            v

private static class afs
{

    final String JL;
    final byte afs[];

    public String toString()
    {
        return (new StringBuilder()).append("KeyAndSerialized: key = ").append(JL).append(" serialized hash = ").append(Arrays.hashCode(afs)).toString();
    }

    (String s, byte abyte0[])
    {
        JL = s;
        afs = abyte0;
    }
}
