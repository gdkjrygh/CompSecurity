// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.akita.net.io;


public class ConnectResult
{

    public int code;
    public String ip;
    public String result;

    public ConnectResult(String s, String s1, int i)
    {
        result = s;
        ip = s1;
        code = i;
    }
}
