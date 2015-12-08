// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;


// Referenced classes of package com.skype.android.push:
//            PushRegistrationException, PushServiceType, PushConfiguration

public interface PushRegistration
{

    public abstract String getRegistrationToken();

    public abstract PushServiceType getServiceType();

    public abstract boolean isRegistered();

    public abstract boolean isSupported();

    public abstract void register(PushConfiguration pushconfiguration)
        throws PushRegistrationException;

    public abstract void unregister();
}
