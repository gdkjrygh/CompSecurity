// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.log4j.config;


public final class PropertySetterException extends Exception
{

    protected Throwable rootCause;

    public PropertySetterException(String s)
    {
        super(s);
    }

    public PropertySetterException(Throwable throwable)
    {
        rootCause = throwable;
    }

    public final String getMessage()
    {
        String s1 = super.getMessage();
        String s = s1;
        if (s1 == null)
        {
            s = s1;
            if (rootCause != null)
            {
                s = rootCause.getMessage();
            }
        }
        return s;
    }
}
