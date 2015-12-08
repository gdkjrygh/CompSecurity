// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bl;


public abstract class p
{

    private final int a;

    public p(int i)
    {
        a = i;
    }

    public abstract float a();

    public String toString()
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        stringbuilder.append("TiltEvent{eventType=");
        a;
        JVM INSTR tableswitch 0 2: default 44
    //                   0 56
    //                   1 66
    //                   2 76;
           goto _L1 _L2 _L3 _L4
_L1:
        stringbuilder.append('}');
        return stringbuilder.toString();
_L2:
        stringbuilder.append("EVENT_TYPE_ON_TILTING");
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuilder.append("EVENT_TYPE_ON_TILT_BEGIN");
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append("EVENT_TYPE_ON_TILT_END");
        if (true) goto _L1; else goto _L5
_L5:
    }
}
