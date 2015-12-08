// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crypto;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.crypto:
//            Obfuscator

public final class  extends b
    implements Provider
{

    public final Obfuscator get()
    {
        return new Obfuscator();
    }

    public final volatile Object get()
    {
        return get();
    }

    public ()
    {
        super("com.soundcloud.android.crypto.Obfuscator", "members/com.soundcloud.android.crypto.Obfuscator", false, com/soundcloud/android/crypto/Obfuscator);
    }
}
