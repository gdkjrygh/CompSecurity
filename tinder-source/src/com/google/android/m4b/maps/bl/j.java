// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bl;


public abstract class j
{

    private final int a;

    public j(int i)
    {
        a = i;
    }

    public abstract float a();

    public abstract void a(float f, float f1);

    public abstract float b();

    public abstract float c();

    public String toString()
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        stringbuilder.append("RotateEvent{eventType=");
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
        stringbuilder.append("EVENT_TYPE_ON_ROTATE");
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuilder.append("EVENT_TYPE_ON_ROTATE_BEGIN");
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append("EVENT_TYPE_ON_ROTATE_END");
        if (true) goto _L1; else goto _L5
_L5:
    }
}
