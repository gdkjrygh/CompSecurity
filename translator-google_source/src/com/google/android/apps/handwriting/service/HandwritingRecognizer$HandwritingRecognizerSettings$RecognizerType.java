// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;


public final class  extends Enum
{

    public static final CLOUD CLOUD;
    public static final CLOUD DONT_CARE;
    public static final CLOUD ON_DEVICE;
    private static final CLOUD a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/handwriting/service/HandwritingRecognizer$HandwritingRecognizerSettings$RecognizerType, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        DONT_CARE = new <init>("DONT_CARE", 0);
        ON_DEVICE = new <init>("ON_DEVICE", 1);
        CLOUD = new <init>("CLOUD", 2);
        a = (new a[] {
            DONT_CARE, ON_DEVICE, CLOUD
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
