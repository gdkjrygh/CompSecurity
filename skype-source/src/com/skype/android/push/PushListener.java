// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.content.Intent;

// Referenced classes of package com.skype.android.push:
//            PushRegistration, RegistrationReason, PushMessage

public interface PushListener
{

    public abstract void onBeforeRegister(PushRegistration pushregistration, RegistrationReason registrationreason);

    public abstract void onPushMessage(PushRegistration pushregistration, PushMessage pushmessage);

    public abstract void onPushMessagesDeleted(PushRegistration pushregistration, Intent intent);

    public abstract void onRegistered(PushRegistration pushregistration);

    public abstract void onRegistrationError(PushRegistration pushregistration, Exception exception);

    public abstract void onRegistrationExpired(PushRegistration pushregistration);

    public abstract void onUnregistered(PushRegistration pushregistration);
}
