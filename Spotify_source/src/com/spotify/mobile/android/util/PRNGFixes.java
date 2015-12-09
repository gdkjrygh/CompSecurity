// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import android.os.Build;
import android.os.Process;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Security;

public final class PRNGFixes
{

    private static final byte a[] = e();

    private PRNGFixes()
    {
    }

    public static void a()
    {
        if (android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT <= 18) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT > 18)
        {
            break MISSING_BLOCK_LABEL_348;
        }
        Provider aprovider[] = Security.getProviders("SecureRandom.SHA1PRNG");
        if (aprovider == null || aprovider.length <= 0 || !com/spotify/mobile/android/util/PRNGFixes$LinuxPRNGSecureRandomProvider.equals(aprovider[0].getClass()))
        {
            Security.insertProviderAt(new LinuxPRNGSecureRandomProvider(), 1);
        }
        SecureRandom securerandom = new SecureRandom();
        if (!com/spotify/mobile/android/util/PRNGFixes$LinuxPRNGSecureRandomProvider.equals(securerandom.getProvider().getClass()))
        {
            throw new SecurityException((new StringBuilder("new SecureRandom() backed by wrong Provider: ")).append(securerandom.getProvider().getClass()).toString());
        }
        break MISSING_BLOCK_LABEL_285;
_L2:
        int i;
        try
        {
            Class.forName("org.apache.harmony.xnet.provider.jsse.NativeCrypto").getMethod("RAND_seed", new Class[] {
                [B
            }).invoke(null, new Object[] {
                c()
            });
            i = ((Integer)Class.forName("org.apache.harmony.xnet.provider.jsse.NativeCrypto").getMethod("RAND_load_file", new Class[] {
                java/lang/String, Long.TYPE
            }).invoke(null, new Object[] {
                "/dev/urandom", Integer.valueOf(1024)
            })).intValue();
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new SecurityException("Failed to seed OpenSSL PRNG", classnotfoundexception);
        }
        catch (NoClassDefFoundError noclassdeffounderror)
        {
            throw new SecurityException("Failed to seed OpenSSL PRNG", noclassdeffounderror);
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            throw new SecurityException("Failed to seed OpenSSL PRNG", unsatisfiedlinkerror);
        }
        catch (Exception exception)
        {
            throw new SecurityException("Failed to seed OpenSSL PRNG", exception);
        }
        if (i == 1024) goto _L1; else goto _L3
_L3:
        throw new IOException((new StringBuilder("Unexpected number of bytes read from Linux PRNG: ")).append(i).toString());
        SecureRandom securerandom1;
        try
        {
            securerandom1 = SecureRandom.getInstance("SHA1PRNG");
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new SecurityException("SHA1PRNG not available", nosuchalgorithmexception);
        }
        if (!com/spotify/mobile/android/util/PRNGFixes$LinuxPRNGSecureRandomProvider.equals(securerandom1.getProvider().getClass()))
        {
            throw new SecurityException((new StringBuilder("SecureRandom.getInstance(\"SHA1PRNG\") backed by wrong Provider: ")).append(securerandom1.getProvider().getClass()).toString());
        }
    }

    static byte[] b()
    {
        return c();
    }

    private static byte[] c()
    {
        byte abyte0[];
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);
            dataoutputstream.writeLong(System.currentTimeMillis());
            dataoutputstream.writeLong(System.nanoTime());
            dataoutputstream.writeInt(Process.myPid());
            dataoutputstream.writeInt(Process.myUid());
            dataoutputstream.write(a);
            dataoutputstream.close();
            abyte0 = bytearrayoutputstream.toByteArray();
        }
        catch (IOException ioexception)
        {
            throw new SecurityException("Failed to generate seed", ioexception);
        }
        return abyte0;
    }

    private static String d()
    {
        String s;
        try
        {
            s = (String)android/os/Build.getField("SERIAL").get(null);
        }
        catch (RuntimeException runtimeexception)
        {
            return null;
        }
        catch (Exception exception)
        {
            return null;
        }
        return s;
    }

    private static byte[] e()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s = Build.FINGERPRINT;
        if (s != null)
        {
            stringbuilder.append(s);
        }
        s = d();
        if (s != null)
        {
            stringbuilder.append(s);
        }
        byte abyte0[];
        try
        {
            abyte0 = stringbuilder.toString().getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new AssertionError();
        }
        return abyte0;
    }


    private class LinuxPRNGSecureRandomProvider extends Provider
    {

        private static final long serialVersionUID = 1L;

        public LinuxPRNGSecureRandomProvider()
        {
            super("LinuxPRNG", 1.0D, "A Linux-specific random number provider that uses /dev/urandom");
            put("SecureRandom.SHA1PRNG", com/spotify/mobile/android/util/PRNGFixes$LinuxPRNGSecureRandom.getName());
            put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
        }
    }

}
