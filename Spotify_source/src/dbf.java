// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

final class dbf extends dbd
{

    private final Context a;
    private Cipher b;
    private Cipher c;

    public dbf(Context context)
    {
        b = null;
        c = null;
        a = context;
    }

    private Cipher a(int i, byte abyte0[], byte abyte1[])
    {
        if (i == 2)
        {
            if (b == null)
            {
                b = a(abyte1, abyte0, 2);
            }
            return b;
        }
        if (c == null)
        {
            c = a(abyte1, abyte0, 1);
        }
        return c;
    }

    private Cipher a(byte abyte0[], byte abyte1[], int i)
    {
        String s = android.provider.Settings.Secure.getString(a.getContentResolver(), "android_id");
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        String s1 = a.getPackageName();
        int j = a.getApplicationInfo().uid;
        Object obj = SecretKeyFactory.getInstance("PBEWITHSHAAND256BITAES-CBC-BC");
        char ac[] = (new StringBuilder()).append(s).append(String.valueOf(j)).append(s1).toString().toCharArray();
        abyte0 = new PBEKeySpec(ac, abyte0, 16, 256);
        Arrays.fill(ac, '\0');
        obj = new SecretKeySpec(((SecretKeyFactory) (obj)).generateSecret(abyte0).getEncoded(), "AES");
        abyte0 = Cipher.getInstance("AES/CBC/PKCS5Padding");
        abyte0.init(i, ((java.security.Key) (obj)), new IvParameterSpec(abyte1));
_L4:
        return abyte0;
        abyte0;
        return null;
        abyte0;
        return null;
        abyte0;
        return null;
        abyte0;
        return null;
        abyte0;
        return null;
_L2:
        abyte0 = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String a(String s)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        byte abyte0[] = new byte[16];
        (new SecureRandom()).nextBytes(abyte0);
        byte abyte1[] = new byte[20];
        (new SecureRandom()).nextBytes(abyte1);
        Cipher cipher;
        byte abyte2[];
        try
        {
            s = s.getBytes("UTF-8");
            cipher = a(1, abyte0, abyte1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        if (cipher == null) goto _L1; else goto _L3
_L3:
        s = cipher.doFinal(s);
        abyte2 = new byte[s.length + 36];
        System.arraycopy(abyte0, 0, abyte2, 0, 16);
        System.arraycopy(abyte1, 0, abyte2, 16, 20);
        System.arraycopy(s, 0, abyte2, 36, s.length);
        s = Base64.encodeToString(abyte2, 2);
        return s;
    }

    public final void a()
    {
        b = null;
        c = null;
    }

    public final String b(String s)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        byte abyte0[];
        byte abyte1[];
        byte abyte2[];
        int i;
        abyte0 = Base64.decode(s, 2);
        abyte1 = new byte[16];
        abyte2 = new byte[20];
        i = abyte0.length - 36;
        if (i <= 0) goto _L1; else goto _L3
_L3:
        s = new byte[i];
        System.arraycopy(abyte0, 0, abyte1, 0, 16);
        System.arraycopy(abyte0, 16, abyte2, 0, 20);
        System.arraycopy(abyte0, 36, s, 0, i);
        Cipher cipher;
        try
        {
            cipher = a(2, abyte1, abyte2);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        if (cipher == null) goto _L5; else goto _L4
_L4:
        s = new String(cipher.doFinal(s), "UTF-8");
_L7:
        return s;
_L5:
        s = null;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
