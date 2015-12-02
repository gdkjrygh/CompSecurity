// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.wireless.security.sdk.indiekit;

import com.taobao.wireless.security.sdk.IComponent;
import com.taobao.wireless.security.sdk.SecurityGuardParamContext;

public interface IIndieKitComponent
    extends IComponent
{

    public abstract String getSafeCookie(String s, String s1);

    public abstract String indieKitRequest(SecurityGuardParamContext securityguardparamcontext);

    public abstract int reportSusText(String s, String s1);

    public abstract int validateFileSignature(String s, String s1, String s2);
}
