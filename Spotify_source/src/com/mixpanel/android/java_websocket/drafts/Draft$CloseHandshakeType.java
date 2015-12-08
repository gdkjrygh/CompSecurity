// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.drafts;


public final class I extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType, s);
    }

    public static I[] values()
    {
        return (I[])d.clone();
    }

    static 
    {
        a = new <init>("NONE", 0);
        b = new <init>("ONEWAY", 1);
        c = new <init>("TWOWAY", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
