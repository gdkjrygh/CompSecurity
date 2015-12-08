// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;


public class DAOException extends RuntimeException
{

    public DAOException()
    {
    }

    public DAOException(NumberFormatException numberformatexception)
    {
        super(numberformatexception);
    }

    public DAOException(String s)
    {
        super(s);
    }
}
