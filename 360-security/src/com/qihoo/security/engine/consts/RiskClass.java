// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.consts;


public final class RiskClass
{

    public static final int RC_ANQUAN = 0;
    public static final int RC_CAUTION = 100;
    public static final int RC_CUANGAI = 500;
    public static final int RC_GANRAN = 400;
    public static final int RC_GAOWEI = 700;
    public static final int RC_GUANGGAO = 101;
    public static final int RC_MUMA = 800;
    public static final int RC_QIDONG = 200;
    public static final int RC_UNKNOWN = 1;
    public static final int RC_USEBYMUMA = 300;
    public static final int RC_WEIXIAN = 600;

    public RiskClass()
    {
    }

    public static final boolean isBlack(int i)
    {
        return i >= 300;
    }
}
