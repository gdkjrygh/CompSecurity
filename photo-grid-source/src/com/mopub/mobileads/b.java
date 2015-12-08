// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;


final class b extends Enum
{

    public static final int FAILED$34b17a83;
    public static final int FINISHED$34b17a83;
    public static final int GOING_LEFT$34b17a83;
    public static final int GOING_RIGHT$34b17a83;
    public static final int UNSET$34b17a83;
    private static final int a[];

    public static int[] values$414ea003()
    {
        return (int[])a.clone();
    }

    static 
    {
        UNSET$34b17a83 = 1;
        GOING_RIGHT$34b17a83 = 2;
        GOING_LEFT$34b17a83 = 3;
        FINISHED$34b17a83 = 4;
        FAILED$34b17a83 = 5;
        a = (new int[] {
            UNSET$34b17a83, GOING_RIGHT$34b17a83, GOING_LEFT$34b17a83, FINISHED$34b17a83, FAILED$34b17a83
        });
    }
}
