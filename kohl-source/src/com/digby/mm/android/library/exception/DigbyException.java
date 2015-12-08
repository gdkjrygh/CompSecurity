// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.exception;


public class DigbyException extends Exception
{

    public transient DigbyException(String s, Object aobj[])
    {
        super(String.format(s, aobj));
    }

    public transient DigbyException(Throwable throwable, String s, Object aobj[])
    {
        super(String.format(s, aobj), throwable);
    }
}
