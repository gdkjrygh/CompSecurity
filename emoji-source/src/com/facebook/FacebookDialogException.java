// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            FacebookException

public class FacebookDialogException extends FacebookException
{

    static final long serialVersionUID = 1L;
    private int errorCode;
    private String failingUrl;

    public FacebookDialogException(String s, int i, String s1)
    {
        super(s);
        errorCode = i;
        failingUrl = s1;
    }

    public int getErrorCode()
    {
        return errorCode;
    }

    public String getFailingUrl()
    {
        return failingUrl;
    }
}
