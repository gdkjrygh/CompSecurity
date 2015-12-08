// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.gcm;

import com.soundcloud.android.crypto.CipherWrapper;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.gcm:
//            GcmDecryptor

public final class  extends b
    implements Provider
{

    private b cipherWrapper;

    public final void attach(l l1)
    {
        cipherWrapper = l1.a("com.soundcloud.android.crypto.CipherWrapper", com/soundcloud/android/gcm/GcmDecryptor, getClass().getClassLoader());
    }

    public final GcmDecryptor get()
    {
        return new GcmDecryptor((CipherWrapper)cipherWrapper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(cipherWrapper);
    }

    public ()
    {
        super("com.soundcloud.android.gcm.GcmDecryptor", "members/com.soundcloud.android.gcm.GcmDecryptor", false, com/soundcloud/android/gcm/GcmDecryptor);
    }
}
