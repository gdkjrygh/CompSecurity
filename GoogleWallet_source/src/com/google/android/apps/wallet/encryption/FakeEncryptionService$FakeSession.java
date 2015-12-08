// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.encryption;

import android.util.Base64;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.encryption:
//            FakeEncryptionService

static final class <init>
    implements n
{

    private static String decodableString(String s)
    {
        return Base64.encodeToString(s.getBytes(Charsets.UTF_8), 1);
    }

    private String encrypt(String s)
    {
        Preconditions.checkNotNull(s);
        String s1 = String.valueOf("encrypted-");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        return decodableString(s);
    }

    private String getSessionMaterial()
    {
        return decodableString("encrypted-");
    }

    public final volatile Object encrypt(Object obj)
    {
        return encrypt((String)obj);
    }

    public final volatile Object getSessionMaterial()
    {
        return getSessionMaterial();
    }

    private n()
    {
    }

    n(n n)
    {
        this();
    }
}
