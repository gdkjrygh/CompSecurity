// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crypto;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.crypto:
//            CipherWrapper

public final class  extends b
    implements Provider
{

    public final CipherWrapper get()
    {
        return new CipherWrapper();
    }

    public final volatile Object get()
    {
        return get();
    }

    public ()
    {
        super("com.soundcloud.android.crypto.CipherWrapper", "members/com.soundcloud.android.crypto.CipherWrapper", false, com/soundcloud/android/crypto/CipherWrapper);
    }
}
