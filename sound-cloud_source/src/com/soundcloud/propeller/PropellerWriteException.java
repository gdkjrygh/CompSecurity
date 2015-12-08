// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller;

import android.content.ContentValues;

public class PropellerWriteException extends RuntimeException
{

    public PropellerWriteException(ContentValues contentvalues, Throwable throwable)
    {
        super((new StringBuilder("Database write failed; values = ")).append(contentvalues).toString(), throwable);
    }

    public PropellerWriteException(String s, ContentValues contentvalues, Throwable throwable)
    {
        super((new StringBuilder()).append(s).append("; values = ").append(contentvalues).toString(), throwable);
    }

    public PropellerWriteException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
