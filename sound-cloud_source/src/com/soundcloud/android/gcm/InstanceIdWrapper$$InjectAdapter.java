// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.gcm;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.gcm:
//            InstanceIdWrapper

public final class A extends b
    implements Provider
{

    public final InstanceIdWrapper get()
    {
        return new InstanceIdWrapper();
    }

    public final volatile Object get()
    {
        return get();
    }

    public A()
    {
        super("com.soundcloud.android.gcm.InstanceIdWrapper", "members/com.soundcloud.android.gcm.InstanceIdWrapper", false, com/soundcloud/android/gcm/InstanceIdWrapper);
    }
}
