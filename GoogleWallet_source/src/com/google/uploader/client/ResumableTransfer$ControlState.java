// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;


// Referenced classes of package com.google.uploader.client:
//            ResumableTransfer

static final class  extends Enum
{

    private static final CANCELED $VALUES[];
    public static final CANCELED CANCELED;
    public static final CANCELED IN_PROGRESS;
    public static final CANCELED PAUSED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/uploader/client/ResumableTransfer$ControlState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        IN_PROGRESS = new <init>("IN_PROGRESS", 0);
        PAUSED = new <init>("PAUSED", 1);
        CANCELED = new <init>("CANCELED", 2);
        $VALUES = (new .VALUES[] {
            IN_PROGRESS, PAUSED, CANCELED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
