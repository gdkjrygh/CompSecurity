// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.model;


// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar.model:
//            CmObject, CmRawObject

public interface CmProxyLogin
    extends CmObject
{

    public abstract String getCaptcha();

    public abstract long getExpiresIn();

    public abstract CmRawObject getExtra();

    public abstract String getSid();

    public abstract String getSsoToken();

    public abstract int getType();
}
