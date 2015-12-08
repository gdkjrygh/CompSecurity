// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.errorstatus;


// Referenced classes of package com.jcp.errorstatus:
//            ErrorMessageEntityContainer

public class ErrorMessageArrayEntityContainer
{

    private ErrorMessageEntityContainer exceptionMessage[];

    public ErrorMessageArrayEntityContainer()
    {
    }

    public ErrorMessageEntityContainer[] getExceptionMessage()
    {
        return exceptionMessage;
    }

    public void setExceptionMessage(ErrorMessageEntityContainer aerrormessageentitycontainer[])
    {
        exceptionMessage = aerrormessageentitycontainer;
    }
}
