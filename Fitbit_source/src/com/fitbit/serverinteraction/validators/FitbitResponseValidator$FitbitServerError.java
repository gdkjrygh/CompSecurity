// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.validators;


// Referenced classes of package com.fitbit.serverinteraction.validators:
//            FitbitResponseValidator

public static final class  extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i h;
    public static final i i;
    private static final i j[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/serverinteraction/validators/FitbitResponseValidator$FitbitServerError, s);
    }

    public static [] values()
    {
        return ([])j.clone();
    }

    static 
    {
        a = new <init>("APP_BACKOFF", 0);
        b = new <init>("SYNCLAIR_BACKOFF", 1);
        c = new <init>("MOBILETRACK_BACKOFF", 2);
        d = new <init>("RATE_LIMIT", 3);
        e = new <init>("INVALID_TIME_STAMP", 4);
        f = new <init>("OATH_ACCESS_TOKEN", 5);
        g = new <init>("VALIDATION", 6);
        h = new <init>("SERVER_RESPONSE", 7);
        i = new <init>("NOT_LINKED_TRACKER", 8);
        j = (new j[] {
            a, b, c, d, e, f, g, h, i
        });
    }

    private (String s, int k)
    {
        super(s, k);
    }
}
