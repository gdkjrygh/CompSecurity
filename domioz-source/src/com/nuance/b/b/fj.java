// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nuance.b.b:
//            fh, fr, gl

final class fj
{

    private final fh a;
    private final SecretKey b;
    private final JSONObject c;
    private boolean d;

    public fj(fh fh1, byte abyte0[])
    {
        Object obj;
        byte abyte1[];
        try
        {
            abyte0 = new DESKeySpec(abyte0);
            b = SecretKeyFactory.getInstance("DES").generateSecret(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (fh fh1)
        {
            fr.e((new StringBuilder("Exception occurred while initializing system setting encryption key -- ")).append(fh1.toString()).toString());
            gl.a(fh1);
            if (fh1 instanceof RuntimeException)
            {
                throw (RuntimeException)fh1;
            } else
            {
                throw new IllegalArgumentException("Unable to initialize secret key");
            }
        }
        a = fh1;
        abyte0 = new JSONObject();
        fh1 = fh1.b();
        if (fh1 == null) goto _L2; else goto _L1
_L1:
        obj = Cipher.getInstance(b.getAlgorithm());
        ((Cipher) (obj)).init(2, b);
        abyte1 = ((Cipher) (obj)).doFinal(Base64.decode(fh1, 3));
        fh1 = Charset.forName("UTF-8");
        abyte1 = ByteBuffer.wrap(abyte1);
        fh1 = new JSONObject(fh1.newDecoder().decode(abyte1).toString());
_L4:
        c = fh1;
        d = false;
        return;
        fh1;
        fr.e((new StringBuilder("Exception occurred while processing system setting data -- ")).append(fh1.toString()).toString());
        gl.a(fh1);
        if ((fh1 instanceof IllegalBlockSizeException) || (fh1 instanceof BadPaddingException) || (fh1 instanceof CharacterCodingException) || (fh1 instanceof JSONException))
        {
            fr.b("Detected corrupt data in system setting store");
        }
        if (fh1 instanceof RuntimeException)
        {
            throw (RuntimeException)fh1;
        }
_L2:
        fh1 = abyte0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String a(String s)
    {
        return c.optString(s, null);
    }

    public final boolean a()
    {
        return a.a();
    }

    public final boolean a(String s, String s1)
    {
        String s2 = c.optString(s, null);
        if (s2 == null && s1 == null)
        {
            return true;
        }
        if (s2 != null && s2.equals(s1))
        {
            break MISSING_BLOCK_LABEL_78;
        }
        c.put(s, s1);
        d = true;
        return true;
        JSONException jsonexception;
        jsonexception;
        fr.a((new StringBuilder("Unable to put value in secure system setting store ")).append(s).append("=").append(s1).toString());
        return false;
    }

    public final boolean b()
    {
        boolean flag = true;
        if (d) goto _L2; else goto _L1
_L1:
        return flag;
_L2:
        boolean flag1;
        try
        {
            String s = c.toString();
            Cipher cipher = Cipher.getInstance(b.getAlgorithm());
            cipher.init(1, b);
            s = Base64.encodeToString(cipher.doFinal(s.getBytes("UTF-8")), 3);
            flag1 = a.a(s);
        }
        catch (Exception exception)
        {
            fr.e("Exception occurred while committing secure system setting store");
            gl.a(exception);
            if (exception instanceof RuntimeException)
            {
                throw (RuntimeException)exception;
            } else
            {
                fr.a("Unable to commit secure system setting store");
                return false;
            }
        }
        flag = flag1;
        if (!flag1) goto _L1; else goto _L3
_L3:
        d = false;
        return flag1;
    }
}
