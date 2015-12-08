// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.event;


// Referenced classes of package com.auditude.ads.event:
//            SMILEvent

public static final class  extends Enum
{

    private static final PAR_END ENUM$VALUES[];
    public static final PAR_END PAR_BEGIN;
    public static final PAR_END PAR_END;
    public static final PAR_END SEQUENCE_BEGIN;
    public static final PAR_END SEQUENCE_END;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/auditude/ads/event/SMILEvent$SMILEventType, s);
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
        SEQUENCE_BEGIN = new <init>("SEQUENCE_BEGIN", 0);
        SEQUENCE_END = new <init>("SEQUENCE_END", 1);
        PAR_BEGIN = new <init>("PAR_BEGIN", 2);
        PAR_END = new <init>("PAR_END", 3);
        ENUM$VALUES = (new ENUM.VALUES[] {
            SEQUENCE_BEGIN, SEQUENCE_END, PAR_BEGIN, PAR_END
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
