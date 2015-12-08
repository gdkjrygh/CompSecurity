// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crypto;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.crypto:
//            Encryptor, CipherWrapper

public final class  extends b
    implements Provider
{

    private b cipher;

    public final void attach(l l1)
    {
        cipher = l1.a("com.soundcloud.android.crypto.CipherWrapper", com/soundcloud/android/crypto/Encryptor, getClass().getClassLoader());
    }

    public final Encryptor get()
    {
        return new Encryptor((CipherWrapper)cipher.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(cipher);
    }

    public ()
    {
        super("com.soundcloud.android.crypto.Encryptor", "members/com.soundcloud.android.crypto.Encryptor", false, com/soundcloud/android/crypto/Encryptor);
    }
}
