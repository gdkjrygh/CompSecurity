// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.settings.model;


public class SecuritySettings
{

    private String captchaPublicKey;

    public SecuritySettings()
    {
        captchaPublicKey = null;
    }

    public String getCaptchaPublicKey()
    {
        return captchaPublicKey;
    }

    public void setCaptchaPublicKey(String s)
    {
        captchaPublicKey = s;
    }
}
