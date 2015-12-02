// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice.richmedia;


public final class  extends Enum
{

    public static final a a;
    private static final a b[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/baidu/android/pushservice/richmedia/n$a, s);
    }

    public static [] values()
    {
        return ([])b.clone();
    }

    static 
    {
        a = new <init>("REQ_TYPE_GET_ZIP", 0);
        b = (new b[] {
            a
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
