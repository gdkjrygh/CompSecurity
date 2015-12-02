// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.wireless.security.sdk.dynamicdataencrypt;

import com.taobao.wireless.security.sdk.IComponent;

public interface IDynamicDataEncryptComponent
    extends IComponent
{

    public abstract String dynamicDecrypt(String s);

    public abstract String dynamicEncrypt(String s);
}
