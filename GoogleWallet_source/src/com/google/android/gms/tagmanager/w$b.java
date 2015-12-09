// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//            w

static final class aNy
{

    final String TN;
    final byte aNy[];

    public final String toString()
    {
        return (new StringBuilder("KeyAndSerialized: key = ")).append(TN).append(" serialized hash = ").append(Arrays.hashCode(aNy)).toString();
    }

    (String s, byte abyte0[])
    {
        TN = s;
        aNy = abyte0;
    }
}
