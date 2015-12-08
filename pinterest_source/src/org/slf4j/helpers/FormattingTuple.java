// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.slf4j.helpers;


public class FormattingTuple
{

    public static FormattingTuple NULL = new FormattingTuple(null);
    private Object argArray[];
    private String message;
    private Throwable throwable;

    public FormattingTuple(String s)
    {
        this(s, null, null);
    }

    public FormattingTuple(String s, Object aobj[], Throwable throwable1)
    {
        message = s;
        throwable = throwable1;
        if (throwable1 == null)
        {
            argArray = aobj;
            return;
        } else
        {
            argArray = trimmedCopy(aobj);
            return;
        }
    }

    static Object[] trimmedCopy(Object aobj[])
    {
        if (aobj == null || aobj.length == 0)
        {
            throw new IllegalStateException("non-sensical empty or null argument array");
        } else
        {
            int i = aobj.length - 1;
            Object aobj1[] = new Object[i];
            System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, i);
            return aobj1;
        }
    }

    public Object[] getArgArray()
    {
        return argArray;
    }

    public String getMessage()
    {
        return message;
    }

    public Throwable getThrowable()
    {
        return throwable;
    }

}
