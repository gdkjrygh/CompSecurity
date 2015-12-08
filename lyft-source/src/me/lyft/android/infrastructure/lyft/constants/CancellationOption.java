// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.constants;


public class CancellationOption
{

    public static final CancellationOption DEFAULT_CANCEL_OPTION = new CancellationOption("canceled", "canceled", "Cancel the ride");
    private static final String DEFAULT_CANCEL_OPTION_STRING = "Cancel the ride";
    String id;
    String status;
    String string;

    public CancellationOption(String s, String s1, String s2)
    {
        id = s;
        status = s1;
        string = s2;
    }

    public String getId()
    {
        return id;
    }

    public String getStatus()
    {
        return status;
    }

    public String getString()
    {
        return string;
    }

}
