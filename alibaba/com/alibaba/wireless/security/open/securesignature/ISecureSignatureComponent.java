// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.wireless.security.open.securesignature;

import com.alibaba.wireless.security.open.IComponent;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;

public interface ISecureSignatureComponent
    extends IComponent
{

    public abstract String signRequest(SecurityGuardParamContext securityguardparamcontext, String s)
        throws SecException;
}
