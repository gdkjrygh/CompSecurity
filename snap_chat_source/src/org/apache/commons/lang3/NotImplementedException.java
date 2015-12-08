// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;


public class NotImplementedException extends UnsupportedOperationException
{

    private final String code;

    public NotImplementedException(String s)
    {
        this(s, null);
    }

    public NotImplementedException(String s, String s1)
    {
        super(s);
        code = s1;
    }
}
