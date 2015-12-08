// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.landing.exceptions;


// Referenced classes of package me.lyft.android.application.landing.exceptions:
//            InvalidPhoneExeception

public class InvalidPhoneFormatException extends InvalidPhoneExeception
{

    public InvalidPhoneFormatException()
    {
        super("Invalid phone format", null);
    }

    public String getReason()
    {
        return "client_invalid_phone_format";
    }
}
