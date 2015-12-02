// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.hls;

import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSourceInputStream;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.util.Assertions;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

final class Aes128DataSource
    implements DataSource
{

    private final DataSource a;
    private final byte b[];
    private final byte c[];
    private CipherInputStream d;

    public Aes128DataSource(DataSource datasource, byte abyte0[], byte abyte1[])
    {
        a = datasource;
        b = abyte0;
        c = abyte1;
    }

    public final int a(byte abyte0[], int i, int j)
    {
        boolean flag;
        if (d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        j = d.read(abyte0, i, j);
        i = j;
        if (j < 0)
        {
            i = -1;
        }
        return i;
    }

    public final long a(DataSpec dataspec)
    {
        Cipher cipher;
        SecretKeySpec secretkeyspec;
        IvParameterSpec ivparameterspec;
        try
        {
            cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        }
        // Misplaced declaration of an exception variable
        catch (DataSpec dataspec)
        {
            throw new RuntimeException(dataspec);
        }
        // Misplaced declaration of an exception variable
        catch (DataSpec dataspec)
        {
            throw new RuntimeException(dataspec);
        }
        secretkeyspec = new SecretKeySpec(b, "AES");
        ivparameterspec = new IvParameterSpec(c);
        try
        {
            cipher.init(2, secretkeyspec, ivparameterspec);
        }
        // Misplaced declaration of an exception variable
        catch (DataSpec dataspec)
        {
            throw new RuntimeException(dataspec);
        }
        // Misplaced declaration of an exception variable
        catch (DataSpec dataspec)
        {
            throw new RuntimeException(dataspec);
        }
        d = new CipherInputStream(new DataSourceInputStream(a, dataspec), cipher);
        return -1L;
    }

    public final void a()
    {
        d = null;
        a.a();
    }
}
