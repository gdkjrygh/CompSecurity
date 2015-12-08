// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

public final class az extends b
{

    public az()
    {
        unknownFieldData = null;
        cachedSize = -1;
    }

    public final g mergeFrom(a a1)
    {
_L3:
        int i = a1.a();
        i;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 33;
           goto _L1 _L2
_L1:
        if (super.storeUnknownField(a1, i)) goto _L3; else goto _L2
_L2:
        return this;
    }
}
