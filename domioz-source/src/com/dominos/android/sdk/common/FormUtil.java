// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;


public class FormUtil
{

    public FormUtil()
    {
    }

    public String parseTenDigitPhoneNumber(String s)
    {
        return s.replaceAll("^(\\+?1?)", "").replaceAll("(\\s|\\-)", "");
    }
}
