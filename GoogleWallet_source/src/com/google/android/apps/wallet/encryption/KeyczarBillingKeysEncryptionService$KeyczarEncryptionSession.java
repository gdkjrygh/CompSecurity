// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.encryption;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import org.keyczar.SignedSessionEncrypter;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.util.Base64Coder;

// Referenced classes of package com.google.android.apps.wallet.encryption:
//            KeyczarBillingKeysEncryptionService

static final class sessionMaterial
    implements sessionMaterial
{

    private final SignedSessionEncrypter sessionEncrypter;
    private final String sessionMaterial;

    private String encrypt(String s)
    {
        Preconditions.checkNotNull(s);
        try
        {
            s = Base64Coder.encodeWebSafe(sessionEncrypter.encrypt(s.getBytes(Charsets.UTF_8)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw Throwables.propagate(s);
        }
        return s;
    }

    private String getSessionMaterial()
    {
        return sessionMaterial;
    }

    public final volatile Object encrypt(Object obj)
    {
        return encrypt((String)obj);
    }

    public final volatile Object getSessionMaterial()
    {
        return getSessionMaterial();
    }

    (SignedSessionEncrypter signedsessionencrypter)
        throws KeyczarException
    {
        sessionEncrypter = signedsessionencrypter;
        sessionMaterial = signedsessionencrypter.newSession();
    }
}
