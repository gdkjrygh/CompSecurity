// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2;


// Referenced classes of package com.htc.lib2:
//            Hms

public static class mErrorMessage extends Exception
{

    private static final long serialVersionUID = 0xc785cd71efbff073L;
    private String mErrorMessage;

    public String getErrorMessage()
    {
        return mErrorMessage;
    }

    public ()
    {
        mErrorMessage = "";
    }

    public mErrorMessage(String s)
    {
        super(s);
        mErrorMessage = "";
        if (s != null)
        {
            mErrorMessage = s;
        }
    }
}
