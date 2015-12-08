// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;


// Referenced classes of package org.chromium.base:
//            PerfTraceEvent

private static final class mTypeStr extends Enum
{

    private static final INSTANT $VALUES[];
    public static final INSTANT FINISH;
    public static final INSTANT INSTANT;
    public static final INSTANT START;
    private final String mTypeStr;

    public static mTypeStr valueOf(String s)
    {
        return (mTypeStr)Enum.valueOf(org/chromium/base/PerfTraceEvent$EventType, s);
    }

    public static mTypeStr[] values()
    {
        return (mTypeStr[])$VALUES.clone();
    }

    public String toString()
    {
        return mTypeStr;
    }

    static 
    {
        START = new <init>("START", 0, "S");
        FINISH = new <init>("FINISH", 1, "F");
        INSTANT = new <init>("INSTANT", 2, "I");
        $VALUES = (new .VALUES[] {
            START, FINISH, INSTANT
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        mTypeStr = s1;
    }
}
