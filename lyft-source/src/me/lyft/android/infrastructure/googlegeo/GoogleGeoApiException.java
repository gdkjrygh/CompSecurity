// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googlegeo;


public class GoogleGeoApiException extends RuntimeException
{

    public GoogleGeoApiException(String s)
    {
        this(s, "");
    }

    public GoogleGeoApiException(String s, String s1)
    {
        super(createMessage(s, s1));
    }

    private static String createMessage(String s, String s1)
    {
        return String.format("Google API request completed with error status : %s. Additional message : %s.", new Object[] {
            s, s1
        });
    }
}
