// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


final class  extends Enum
{

    public static final f a;
    public static final f b;
    private static f c;
    private static f d;
    private static f e;
    private static f f;
    private static final f g[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/AppEventsLogger$FlushReason, s);
    }

    public static [] values()
    {
        return ([])g.clone();
    }

    static 
    {
        c = new <init>("EXPLICIT", 0);
        a = new <init>("TIMER", 1);
        d = new <init>("SESSION_CHANGE", 2);
        e = new <init>("PERSISTED_EVENTS", 3);
        b = new <init>("EVENT_THRESHOLD", 4);
        f = new <init>("EAGER_FLUSHING_EVENT", 5);
        g = (new g[] {
            c, a, d, e, b, f
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
