// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.crypt;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.fitbit.FitBitApplication;
import java.security.Key;
import java.security.MessageDigest;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.util.a.a;

// Referenced classes of package com.fitbit.util.crypt:
//            a

public class SecureDataCoder
{
    public static class InvalidDataException extends Exception
    {

        private static final long serialVersionUID = 1L;

        public InvalidDataException()
        {
        }

        public InvalidDataException(Exception exception)
        {
            initCause(exception);
        }
    }


    private static final String a = "SecureDataCoder";
    private static final String b = new String(new byte[] {
        65, 69, 83
    });
    private static final String c = new String(new byte[] {
        77, 68, 53
    });
    private static final String d = new String(new byte[] {
        85, 78, 73, 81, 85, 69, 95, 75, 69, 89, 
        95, 80, 82, 69, 70, 69, 82, 69, 78, 67, 
        69
    });
    private MessageDigest e;
    private Cipher f;
    private Key g;

    public SecureDataCoder()
    {
    }

    public static String a(SecureDataCoder securedatacoder, String s)
    {
        if (s != null && s.length() != 0 && securedatacoder != null)
        {
            if ((securedatacoder = securedatacoder.a(s.getBytes())) != null && securedatacoder.length != 0)
            {
                return new String(org.spongycastle.util.a.a.a(securedatacoder));
            }
        }
        return null;
    }

    private String b(Context context)
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a());
        String s = sharedpreferences.getString(d, null);
        context = s;
        if (s == null)
        {
            context = UUID.randomUUID().toString();
            sharedpreferences.edit().putString(d, context).commit();
        }
        return context;
    }

    public static String b(SecureDataCoder securedatacoder, String s)
        throws InvalidDataException
    {
        if (s != null && s.length() != 0 && securedatacoder != null)
        {
            if ((s = org.spongycastle.util.a.a.b(s.getBytes())) != null && s.length != 0 && ((securedatacoder = securedatacoder.b(((byte []) (s)))) != null && securedatacoder.length != 0))
            {
                return new String(securedatacoder);
            }
        }
        return null;
    }

    private String c(Context context)
    {
        return (new StringBuilder()).append("").append(android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id")).toString();
    }

    private byte[] c(byte abyte0[])
    {
        if (abyte0 == null && e != null)
        {
            return null;
        } else
        {
            return e.digest(abyte0);
        }
    }

    public boolean a(Context context)
    {
        if (context == null)
        {
            com.fitbit.e.a.a("SecureDataCoder", "Request to init with null context", new Object[0]);
            return false;
        }
        try
        {
            e = MessageDigest.getInstance(c);
            f = Cipher.getInstance(b);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.fitbit.e.a.a("SecureDataCoder", "Unable to init cipher", context, new Object[0]);
            return false;
        }
        context = c((new StringBuilder()).append(b(context)).append(c(context)).toString().getBytes());
        if (context == null)
        {
            com.fitbit.e.a.a("SecureDataCoder", "Unable to init key. Hash is null", new Object[0]);
            return false;
        } else
        {
            g = new SecretKeySpec(context, b);
            com.fitbit.e.a.a("SecureDataCoder", "Key successfully initialized", new Object[0]);
            return true;
        }
    }

    public byte[] a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        if (g == null)
        {
            com.fitbit.e.a.a("SecureDataCoder", "Key not initialized", new Object[0]);
            return null;
        }
        abyte0 = new com.fitbit.util.crypt.a(abyte0);
        try
        {
            f.init(1, g);
            abyte0 = abyte0.b();
            abyte0 = f.doFinal(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            com.fitbit.e.a.a("SecureDataCoder", "Unable to code data", abyte0, new Object[0]);
            return null;
        }
        return abyte0;
    }

    public byte[] b(byte abyte0[])
        throws InvalidDataException
    {
        Object obj = null;
        if (abyte0 == null)
        {
            return null;
        }
        if (g == null)
        {
            com.fitbit.e.a.a("SecureDataCoder", "Key not initialized", new Object[0]);
            return null;
        }
        try
        {
            f.init(2, g);
            abyte0 = f.doFinal(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            com.fitbit.e.a.a("SecureDataCoder", "Request to decode invalid data", abyte0, new Object[0]);
            throw new InvalidDataException(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            com.fitbit.e.a.a("SecureDataCoder", "Unable to decode data", abyte0, new Object[0]);
            abyte0 = obj;
        }
        abyte0 = com.fitbit.util.crypt.a.a(abyte0);
        if (abyte0 == null)
        {
            com.fitbit.e.a.a("SecureDataCoder", "Unable to decode data. Data is damaged", new Object[0]);
            throw new InvalidDataException();
        } else
        {
            return abyte0.a();
        }
    }

}
