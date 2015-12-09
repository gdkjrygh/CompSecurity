// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.jcp.pojo.Profile;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.jcp.util:
//            ae

public final class bk
{

    private static final String a = com/jcp/util/bk.getName();

    private bk()
    {
    }

    public static Profile a(Context context)
    {
        Object obj = null;
        Context context1 = context.getApplicationContext();
        byte abyte0[] = c(context1);
        context = obj;
        if (abyte0 != null)
        {
            context = a(abyte0, context1);
        }
        return context;
    }

    private static Profile a(byte abyte0[], Context context)
    {
        Object obj = null;
        context = context.getSharedPreferences("jcpPrefsFile", 0);
        String s = context.getString("jcpUsername", null);
        String s1 = context.getString("jcpPassword", null);
        context = obj;
        if (s != null)
        {
            context = obj;
            if (s1 != null)
            {
                abyte0 = b(abyte0, s1);
                context = obj;
                if (abyte0 != null)
                {
                    context = new Profile(s, abyte0);
                }
            }
        }
        return context;
    }

    private static String a(byte abyte0[], String s)
    {
        Object obj = null;
        s = a(abyte0, s.getBytes(), 1);
        abyte0 = obj;
        if (s != null)
        {
            abyte0 = Base64.encodeToString(s, 0);
        }
        return abyte0;
    }

    public static boolean a(Profile profile, Context context)
    {
        boolean flag = false;
        context = context.getApplicationContext();
        byte abyte0[] = b(context);
        if (abyte0 != null)
        {
            flag = a(abyte0, profile, context);
        }
        return flag;
    }

    private static boolean a(byte abyte0[], Profile profile, Context context)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (profile.getUsername() != null)
        {
            flag = flag1;
            if (profile.getPassword() != null)
            {
                abyte0 = a(abyte0, profile.getPassword());
                flag = flag1;
                if (abyte0 != null)
                {
                    context = context.getSharedPreferences("jcpPrefsFile", 0).edit();
                    context.putString("jcpUsername", profile.getUsername());
                    context.putString("jcpPassword", abyte0);
                    context.apply();
                    flag = true;
                }
            }
        }
        return flag;
    }

    private static byte[] a()
    {
        SecureRandom securerandom = new SecureRandom();
        byte abyte0[];
        try
        {
            KeyGenerator keygenerator = KeyGenerator.getInstance("AES");
            keygenerator.init(128, securerandom);
            abyte0 = keygenerator.generateKey().getEncoded();
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            return null;
        }
        return abyte0;
    }

    private static byte[] a(byte abyte0[], byte abyte1[], int i)
    {
        try
        {
            abyte0 = new SecretKeySpec(abyte0, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(i, abyte0);
            abyte0 = cipher.doFinal(abyte1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            ae.a(a, (new StringBuilder()).append("IllegalArgumentException check if input is null or is empty : ").append(abyte0).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            ae.a(a, (new StringBuilder()).append("IllegalBlockSizeException the size of theresulting bytes is not a multiple of the cipher block size. : ").append(abyte0).toString());
            abyte0.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            ae.a(a, (new StringBuilder()).append("InvalidKeyException : input provided is not valid to initialize the cipher : ").append(abyte0).toString());
            abyte0.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            ae.a(a, (new StringBuilder()).append("BadPaddingException : check if input padding doesn't match the padding scheme : ").append(abyte0).toString());
            abyte0.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            ae.a(a, (new StringBuilder()).append("NoSuchAlgorithmException : no transformation available from the provider : ").append(abyte0).toString());
            abyte0.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            ae.a(a, (new StringBuilder()).append("NoSuchPaddingException : no padding scheme is available from the provider : ").append(abyte0).toString());
            abyte0.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            ae.a(a, (new StringBuilder()).append("IllegalStateException since cipher instance is not initialized for encryption : ").append(abyte0).toString());
            abyte0.printStackTrace();
            return null;
        }
        return abyte0;
    }

    private static String b(byte abyte0[], String s)
    {
        Object obj = null;
        s = a(abyte0, Base64.decode(s, 0), 2);
        abyte0 = obj;
        if (s != null)
        {
            abyte0 = new String(s);
        }
        return abyte0;
    }

    private static byte[] b(Context context)
    {
        byte abyte1[] = c(context);
        byte abyte0[] = abyte1;
        if (abyte1 == null)
        {
            abyte0 = d(context);
        }
        return abyte0;
    }

    private static byte[] c(Context context)
    {
        Object obj2 = null;
        context = context.openFileInput("jcpAESKey");
        Object obj = context;
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        obj = context;
        byte byte0 = (byte)context.read();
_L2:
        if (byte0 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = context;
        bytearrayoutputstream.write(byte0);
        obj = context;
        byte0 = (byte)context.read();
        if (true) goto _L2; else goto _L1
_L1:
        obj = context;
        byte abyte0[] = bytearrayoutputstream.toByteArray();
        obj = abyte0;
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                ae.a(a, "Error closing aes file", context);
                return abyte0;
            }
            obj = abyte0;
        }
_L4:
        return ((byte []) (obj));
        Object obj1;
        obj1;
        context = null;
_L9:
        obj = context;
        ae.a(a, (new StringBuilder()).append("FileNotFoundException : error while opening desired file : ").append(obj1).toString());
        obj = obj2;
        if (context == null) goto _L4; else goto _L3
_L3:
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ae.a(a, "Error closing aes file", context);
            return null;
        }
        return null;
        obj1;
        context = null;
_L8:
        obj = context;
        ae.a(a, (new StringBuilder()).append("IOException : error while reading from desired file : ").append(obj1).toString());
        obj = obj2;
        if (context == null) goto _L4; else goto _L5
_L5:
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ae.a(a, "Error closing aes file", context);
            return null;
        }
        return null;
        context;
        obj = null;
_L7:
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                ae.a(a, "Error closing aes file", ioexception);
            }
        }
        throw context;
        context;
        if (true) goto _L7; else goto _L6
_L6:
        obj1;
          goto _L8
        obj1;
          goto _L9
    }

    private static byte[] d(Context context)
    {
        Object obj;
        byte abyte0[];
        obj = null;
        abyte0 = a();
        context = context.openFileOutput("jcpAESKey", 0);
        context.write(abyte0);
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                ae.a(a, "Error closing aes file", context);
                return abyte0;
            }
        }
        return abyte0;
        context;
        context = null;
_L6:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                ae.a(a, "Error closing aes file", context);
                return null;
            }
        }
        return null;
        context;
        context = null;
_L4:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                ae.a(a, "Error closing aes file", context);
                return null;
            }
        }
        return null;
        context;
_L2:
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ae.a(a, "Error closing aes file", ((Exception) (obj)));
            }
        }
        throw context;
        Exception exception;
        exception;
        obj = context;
        context = exception;
        if (true) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
    }

}
