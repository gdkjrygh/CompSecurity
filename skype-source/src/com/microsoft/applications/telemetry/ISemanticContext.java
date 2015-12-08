// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;


// Referenced classes of package com.microsoft.applications.telemetry:
//            PiiKind

public interface ISemanticContext
{

    public abstract void setAppId(String s);

    public abstract void setAppVersion(String s);

    public abstract void setDeviceId(String s);

    public abstract void setDeviceMake(String s);

    public abstract void setDeviceModel(String s);

    public abstract void setNetworkProvider(String s);

    public abstract void setUserANID(String s);

    public abstract void setUserAdvertisingId(String s);

    public abstract void setUserId(String s);

    public abstract void setUserId(String s, PiiKind piikind);

    public abstract void setUserLanguage(String s);

    public abstract void setUserMsaId(String s);

    public abstract void setUserTimeZone(String s);
}
