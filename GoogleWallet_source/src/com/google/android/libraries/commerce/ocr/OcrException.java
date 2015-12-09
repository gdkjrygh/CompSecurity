// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr;

import com.google.common.base.Objects;

public final class OcrException extends Exception
{

    private final int type;

    public OcrException(int i)
    {
        this(i, null);
    }

    public OcrException(int i, Throwable throwable)
    {
        super((new StringBuilder(32)).append("OcrException of type=").append(i).toString(), throwable);
        type = i;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof OcrException)
        {
            if (this == obj)
            {
                return true;
            }
            obj = (OcrException)obj;
            if (type == ((OcrException) (obj)).type && Objects.equal(getCause(), ((OcrException) (obj)).getCause()) && Objects.equal(getMessage(), ((OcrException) (obj)).getMessage()))
            {
                return true;
            }
        }
        return false;
    }

    public final int getType()
    {
        return type;
    }

    public final int hashCode()
    {
        return Objects.hashCode(new Object[] {
            Integer.valueOf(type), super.getMessage(), getCause()
        });
    }
}
