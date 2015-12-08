// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;


public class DRMError
{

    long major;
    long minor;
    String serverErrorString;
    String serverErrorUrl;

    protected DRMError(long l, long l1, String s)
    {
        major = l;
        minor = l1;
        if (s != null)
        {
            serverErrorString = s;
            return;
        } else
        {
            serverErrorString = new String("");
            return;
        }
    }

    public long getMajorError()
    {
        return major;
    }

    public long getMinorError()
    {
        return minor;
    }

    public String getServerErrorString()
    {
        return serverErrorString;
    }
}
