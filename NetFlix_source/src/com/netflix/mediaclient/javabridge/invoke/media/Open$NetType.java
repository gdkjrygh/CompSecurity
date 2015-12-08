// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.media;


// Referenced classes of package com.netflix.mediaclient.javabridge.invoke.media:
//            Open

public static final class  extends Enum
{

    private static final wired $VALUES[];
    public static final wired mobile;
    public static final wired wifi;
    public static final wired wired;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/javabridge/invoke/media/Open$NetType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        wifi = new <init>("wifi", 0);
        mobile = new <init>("mobile", 1);
        wired = new <init>("wired", 2);
        $VALUES = (new .VALUES[] {
            wifi, mobile, wired
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
