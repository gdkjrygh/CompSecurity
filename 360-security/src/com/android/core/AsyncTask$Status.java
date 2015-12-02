// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.core;


// Referenced classes of package com.android.core:
//            AsyncTask

public static final class  extends Enum
{

    public static final FINISHED FINISHED;
    public static final FINISHED PENDING;
    public static final FINISHED RUNNING;
    private static final FINISHED a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/android/core/AsyncTask$Status, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        PENDING = new <init>("PENDING", 0);
        RUNNING = new <init>("RUNNING", 1);
        FINISHED = new <init>("FINISHED", 2);
        a = (new a[] {
            PENDING, RUNNING, FINISHED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
