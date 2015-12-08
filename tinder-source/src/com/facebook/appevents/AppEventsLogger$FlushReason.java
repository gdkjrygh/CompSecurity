// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//            AppEventsLogger

private static final class  extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f g[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/appevents/AppEventsLogger$FlushReason, s);
    }

    public static [] values()
    {
        return ([])g.clone();
    }

    static 
    {
        a = new <init>("EXPLICIT", 0);
        b = new <init>("TIMER", 1);
        c = new <init>("SESSION_CHANGE", 2);
        d = new <init>("PERSISTED_EVENTS", 3);
        e = new <init>("EVENT_THRESHOLD", 4);
        f = new <init>("EAGER_FLUSHING_EVENT", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
