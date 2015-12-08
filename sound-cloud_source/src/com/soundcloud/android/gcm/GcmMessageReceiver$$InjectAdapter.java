// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.gcm;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.gcm:
//            GcmMessageReceiver, GcmMessageHandler

public final class  extends b
    implements a, Provider
{

    private b gcmMessageHandler;

    public final void attach(l l1)
    {
        gcmMessageHandler = l1.a("com.soundcloud.android.gcm.GcmMessageHandler", com/soundcloud/android/gcm/GcmMessageReceiver, getClass().getClassLoader());
    }

    public final GcmMessageReceiver get()
    {
        GcmMessageReceiver gcmmessagereceiver = new GcmMessageReceiver();
        injectMembers(gcmmessagereceiver);
        return gcmmessagereceiver;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(gcmMessageHandler);
    }

    public final void injectMembers(GcmMessageReceiver gcmmessagereceiver)
    {
        gcmmessagereceiver.gcmMessageHandler = (GcmMessageHandler)gcmMessageHandler.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((GcmMessageReceiver)obj);
    }

    public ()
    {
        super("com.soundcloud.android.gcm.GcmMessageReceiver", "members/com.soundcloud.android.gcm.GcmMessageReceiver", false, com/soundcloud/android/gcm/GcmMessageReceiver);
    }
}
