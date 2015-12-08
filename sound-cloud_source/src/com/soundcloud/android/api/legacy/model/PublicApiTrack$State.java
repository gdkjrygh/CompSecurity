// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;


// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            PublicApiTrack

public static final class name extends Enum
{

    private static final PROCESSING $VALUES[];
    public static final PROCESSING FAILED;
    public static final PROCESSING FINISHED;
    public static final PROCESSING PROCESSING;
    public static final PROCESSING READY;
    public static final PROCESSING UNDEFINED;
    private final String name;

    public static name fromString(String s)
    {
        name aname[] = values();
        int j = aname.length;
        for (int i = 0; i < j; i++)
        {
            name name1 = aname[i];
            if (name1.name.equalsIgnoreCase(s))
            {
                return name1;
            }
        }

        return UNDEFINED;
    }

    public static UNDEFINED valueOf(String s)
    {
        return (UNDEFINED)Enum.valueOf(com/soundcloud/android/api/legacy/model/PublicApiTrack$State, s);
    }

    public static UNDEFINED[] values()
    {
        return (UNDEFINED[])$VALUES.clone();
    }

    public final boolean isFailed()
    {
        return FAILED == this;
    }

    public final boolean isFinished()
    {
        return FINISHED == this;
    }

    public final boolean isProcessing()
    {
        return PROCESSING == this;
    }

    public final boolean isStreamable()
    {
        return FINISHED == this || UNDEFINED == this;
    }

    public final String value()
    {
        return name;
    }

    static 
    {
        UNDEFINED = new <init>("UNDEFINED", 0, "");
        FINISHED = new <init>("FINISHED", 1, "finished");
        FAILED = new <init>("FAILED", 2, "failed");
        READY = new <init>("READY", 3, "ready");
        PROCESSING = new <init>("PROCESSING", 4, "processing");
        $VALUES = (new .VALUES[] {
            UNDEFINED, FINISHED, FAILED, READY, PROCESSING
        });
    }


    private (String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }
}
