// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sony.snei.np.android.common.oauth.exception;


public class NpamInternalException extends RuntimeException
{

    private static final long serialVersionUID = 0xf282bd6126bb3518L;
    private final int a = 255;

    public NpamInternalException(Throwable throwable)
    {
        super(throwable);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(",");
        stringbuilder.append("primitive_code=").append(a);
        return stringbuilder.toString();
    }
}
