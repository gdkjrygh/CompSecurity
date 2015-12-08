// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.picksinit;


public class ErrorInfo
{

    public static final int ERROR_CODE_AD_DATA_IS_NULL = 401;
    public static final int ERROR_CODE_NO_FILL = 400;
    public static final int ERROR_CODE_NO_NETWORK = 300;
    public static final int ERROR_CODE_PARAMS = 500;
    private int code;
    private String info;
    private int posid;

    public ErrorInfo(int i, String s, int j)
    {
        code = i;
        info = s;
        posid = j;
    }

    public String toString()
    {
        return (new StringBuilder("ErrorInfo{code=")).append(code).append(", info='").append(info).append('\'').append(", posid=").append(posid).append('}').toString();
    }
}
