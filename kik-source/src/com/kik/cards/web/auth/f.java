// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.auth;

import com.kik.g.as;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import kik.android.b.s;
import kik.android.util.DeviceUtils;
import kik.android.util.bx;
import org.spongycastle.jce.ECNamedCurveTable;
import org.spongycastle.jce.interfaces.ECPrivateKey;

// Referenced classes of package com.kik.cards.web.auth:
//            AuthPlugin

final class f
    implements as
{

    final String a;
    final AuthPlugin b;

    f(AuthPlugin authplugin, String s1)
    {
        b = authplugin;
        a = s1;
        super();
    }

    private byte[] a(byte abyte0[])
    {
        byte abyte1[];
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_11;
        }
        abyte1 = abyte0;
        if (abyte0.length != 0)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        abyte0 = ECNamedCurveTable.a("prime256v1");
        abyte1 = KeyPairGenerator.getInstance("EC", "SC");
        abyte1.initialize(abyte0, new SecureRandom());
        abyte1 = abyte1.generateKeyPair();
        abyte0 = (ECPrivateKey)abyte1.getPrivate();
        abyte1 = (ECPublicKey)abyte1.getPublic();
        abyte0 = abyte0.getEncoded();
        abyte1 = abyte1.getEncoded();
        AuthPlugin.a(b).a(abyte1, abyte0, a);
        return abyte1;
        abyte0;
_L2:
        if (DeviceUtils.c())
        {
            throw new RuntimeException(abyte0);
        } else
        {
            bx.a(abyte0);
            return null;
        }
        abyte0;
        continue; /* Loop/switch isn't completed */
        abyte0;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final volatile Object a(Object obj)
    {
        return a((byte[])obj);
    }
}
