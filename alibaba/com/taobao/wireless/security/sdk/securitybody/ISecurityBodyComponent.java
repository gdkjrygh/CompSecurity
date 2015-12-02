// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.wireless.security.sdk.securitybody;

import com.taobao.wireless.security.sdk.IComponent;

public interface ISecurityBodyComponent
    extends IComponent
{

    public abstract String getSecurityBodyData(String s);

    public abstract String getSecurityBodyData(String s, String s1);

    public abstract boolean initSecurityBody(String s);

    public abstract boolean putUserActionRecord(String s, String s1, float f, float f1);

    public abstract boolean putUserTrackRecord(String s);

    public abstract void setSecurityBodyServer(int i);
}
