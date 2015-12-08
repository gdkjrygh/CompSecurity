// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import java.util.Set;

// Referenced classes of package com.skype.android.push:
//            PushServiceType, PushMessageParser

public interface PushConfiguration
{

    public abstract Set getEnabledPushServiceTypes();

    public abstract PushMessageParser getMessageParser(PushServiceType pushservicetype);

    public abstract int getRegistrationTTLSeconds(PushServiceType pushservicetype);

    public abstract String getSenderToken(PushServiceType pushservicetype);
}
