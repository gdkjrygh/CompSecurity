// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.activity.upsell.telco.PassIMSIToCheckoutFlow;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public final class fsu
{

    public static Uri a(Uri uri, Flags flags)
    {
        boolean flag = false;
        Object obj;
        flags = flags.a(fys.aN);
        obj = PassIMSIToCheckoutFlow.b;
        if (flags == obj)
        {
            flag = true;
        }
_L7:
        if (flag) goto _L2; else goto _L1
_L1:
        return uri;
_L2:
        obj = (gnw)dmz.a(gnw);
        flags = null;
        obj = ((gnw) (obj)).c.getSubscriberId();
        flags = ((Flags) (obj));
_L5:
        if (flags == null) goto _L1; else goto _L3
_L3:
        obj = ((ghh)dmz.a(ghh)).a();
        if (!((Optional) (obj)).b()) goto _L1; else goto _L4
_L4:
        flags = a((PublicKey)((Optional) (obj)).c(), ((String) (flags)));
        flags = uri.buildUpon().appendQueryParameter("user_device", flags).build();
        return flags;
        SecurityException securityexception;
        securityexception;
        Assertion.a("READ_PHONE_STATE is not granted. Should not happen.", securityexception);
          goto _L5
        flags;
        return uri;
        flags;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static String a(PublicKey publickey, String s)
    {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, publickey);
        publickey = Base64.encodeToString(cipher.doFinal(s.getBytes()), 2);
        return publickey;
        publickey;
_L2:
        throw new GeneralSecurityException("Could not encrypt IMSI", publickey);
        publickey;
        continue; /* Loop/switch isn't completed */
        publickey;
        continue; /* Loop/switch isn't completed */
        publickey;
        continue; /* Loop/switch isn't completed */
        publickey;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
