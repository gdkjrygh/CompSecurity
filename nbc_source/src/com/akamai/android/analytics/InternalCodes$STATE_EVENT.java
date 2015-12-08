// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


// Referenced classes of package com.akamai.android.analytics:
//            InternalCodes

public static final class  extends Enum
{

    public static final ERROR DEBUG;
    private static final ERROR ENUM$VALUES[];
    public static final ERROR ERROR;
    public static final ERROR FIRSTPLAY;
    public static final ERROR INIT;
    public static final ERROR INTERNALERROR;
    public static final ERROR STOP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/akamai/android/analytics/InternalCodes$STATE_EVENT, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        DEBUG = new <init>("DEBUG", 0);
        INTERNALERROR = new <init>("INTERNALERROR", 1);
        INIT = new <init>("INIT", 2);
        FIRSTPLAY = new <init>("FIRSTPLAY", 3);
        STOP = new <init>("STOP", 4);
        ERROR = new <init>("ERROR", 5);
        ENUM$VALUES = (new ENUM.VALUES[] {
            DEBUG, INTERNALERROR, INIT, FIRSTPLAY, STOP, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
