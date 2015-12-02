// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.wireless.security.sdk;

import java.util.HashMap;
import java.util.Map;

public class SecurityGuardParamContext
{

    public String appKey;
    public Map paramMap;
    public int requestType;
    public String reserved1;
    public String reserved2;

    public SecurityGuardParamContext()
    {
        paramMap = new HashMap();
    }
}
