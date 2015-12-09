// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.osp;


// Referenced classes of package com.netflix.mediaclient.android.osp:
//            AsyncTaskCompat

public static final class  extends Enum
{

    private static final FINISHED $VALUES[];
    public static final FINISHED FINISHED;
    public static final FINISHED PENDING;
    public static final FINISHED RUNNING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/android/osp/AsyncTaskCompat$Status, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PENDING = new <init>("PENDING", 0);
        RUNNING = new <init>("RUNNING", 1);
        FINISHED = new <init>("FINISHED", 2);
        $VALUES = (new .VALUES[] {
            PENDING, RUNNING, FINISHED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
