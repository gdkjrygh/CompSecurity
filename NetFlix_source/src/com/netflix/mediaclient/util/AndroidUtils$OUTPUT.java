// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;


// Referenced classes of package com.netflix.mediaclient.util:
//            AndroidUtils

static final class  extends Enum
{

    private static final BOTH $VALUES[];
    public static final BOTH BOTH;
    public static final BOTH STDERR;
    public static final BOTH STDOUT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/util/AndroidUtils$OUTPUT, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        STDOUT = new <init>("STDOUT", 0);
        STDERR = new <init>("STDERR", 1);
        BOTH = new <init>("BOTH", 2);
        $VALUES = (new .VALUES[] {
            STDOUT, STDERR, BOTH
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
