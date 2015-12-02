// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ut.mini.core.sign;


public interface IUTRequestAuthentication
{

    public abstract String getAppkey();

    public abstract String getSign(String s);
}
