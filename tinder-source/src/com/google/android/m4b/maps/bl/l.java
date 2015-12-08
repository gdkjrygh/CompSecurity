// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bl;


public abstract class l
{

    public final int a;

    public l(int i)
    {
        a = i;
    }

    public abstract float a();

    public abstract float b();

    public abstract float c();

    public String toString()
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        stringbuilder.append("ScaleEvent{eventType=");
        a;
        JVM INSTR tableswitch 0 3: default 48
    //                   0 60
    //                   1 70
    //                   2 80
    //                   3 90;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        stringbuilder.append('}');
        return stringbuilder.toString();
_L2:
        stringbuilder.append("EVENT_TYPE_ON_SCALING");
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuilder.append("EVENT_TYPE_ON_SCALE_BEGIN");
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append("EVENT_TYPE_ON_SCALE_END");
        continue; /* Loop/switch isn't completed */
_L5:
        stringbuilder.append("EVENT_TYPE_ON_TWO_FINGER_TAP");
        if (true) goto _L1; else goto _L6
_L6:
    }
}
