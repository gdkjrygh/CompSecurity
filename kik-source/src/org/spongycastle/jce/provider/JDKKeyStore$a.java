// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.security.Key;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.util.Date;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;

// Referenced classes of package org.spongycastle.jce.provider:
//            JDKKeyStore

private final class d
{

    int a;
    String b;
    Object c;
    Certificate d[];
    Date e;
    final JDKKeyStore f;

    final Object a(char ac[])
    {
        Object obj;
        byte abyte1[];
        int i;
        if ((ac == null || ac.length == 0) && (c instanceof Key))
        {
            return c;
        }
        if (a != 4)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        obj = new DataInputStream(new ByteArrayInputStream((byte[])c));
        Exception exception;
        ByteArrayOutputStream bytearrayoutputstream;
        DataOutputStream dataoutputstream;
        try
        {
            byte abyte0[] = new byte[((DataInputStream) (obj)).readInt()];
            ((DataInputStream) (obj)).readFully(abyte0);
            obj = new CipherInputStream(((java.io.InputStream) (obj)), JDKKeyStore.a("PBEWithSHAAnd3-KeyTripleDES-CBC", 2, ac, abyte0, ((DataInputStream) (obj)).readInt()));
        }
        // Misplaced declaration of an exception variable
        catch (char ac[])
        {
            throw new UnrecoverableKeyException("no match");
        }
        obj = JDKKeyStore.a(new DataInputStream(((java.io.InputStream) (obj))));
        return obj;
        exception;
        exception = new DataInputStream(new ByteArrayInputStream((byte[])c));
        abyte1 = new byte[exception.readInt()];
        exception.readFully(abyte1);
        i = exception.readInt();
        exception = new CipherInputStream(exception, JDKKeyStore.a("BrokenPBEWithSHAAnd3-KeyTripleDES-CBC", 2, ac, abyte1, i));
        exception = JDKKeyStore.a(new DataInputStream(exception));
_L1:
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_348;
        }
        bytearrayoutputstream = new ByteArrayOutputStream();
        dataoutputstream = new DataOutputStream(bytearrayoutputstream);
        dataoutputstream.writeInt(abyte1.length);
        dataoutputstream.write(abyte1);
        dataoutputstream.writeInt(i);
        ac = new DataOutputStream(new CipherOutputStream(dataoutputstream, JDKKeyStore.a("PBEWithSHAAnd3-KeyTripleDES-CBC", 1, ac, abyte1, i)));
        JDKKeyStore.a(exception, ac);
        ac.close();
        c = bytearrayoutputstream.toByteArray();
        return exception;
        Exception exception1;
        exception1;
        exception1 = new DataInputStream(new ByteArrayInputStream((byte[])c));
        abyte1 = new byte[exception1.readInt()];
        exception1.readFully(abyte1);
        i = exception1.readInt();
        exception1 = JDKKeyStore.a(new DataInputStream(new CipherInputStream(exception1, JDKKeyStore.a("OldPBEWithSHAAnd3-KeyTripleDES-CBC", 2, ac, abyte1, i))));
          goto _L1
        throw new UnrecoverableKeyException("no match");
        throw new RuntimeException("forget something!");
    }

    (JDKKeyStore jdkkeystore, String s, Key key, char ac[], Certificate acertificate[])
    {
        f = jdkkeystore;
        super();
        e = new Date();
        a = 4;
        b = s;
        d = acertificate;
        s = new byte[20];
        jdkkeystore.b.setSeed(System.currentTimeMillis());
        jdkkeystore.b.nextBytes(s);
        int i = (jdkkeystore.b.nextInt() & 0x3ff) + 1024;
        jdkkeystore = new ByteArrayOutputStream();
        acertificate = new DataOutputStream(jdkkeystore);
        acertificate.writeInt(20);
        acertificate.write(s);
        acertificate.writeInt(i);
        s = new DataOutputStream(new CipherOutputStream(acertificate, JDKKeyStore.a("PBEWithSHAAnd3-KeyTripleDES-CBC", 1, ac, s, i)));
        JDKKeyStore.a(key, s);
        s.close();
        c = jdkkeystore.toByteArray();
    }

    c(JDKKeyStore jdkkeystore, String s, Certificate certificate)
    {
        f = jdkkeystore;
        super();
        e = new Date();
        a = 1;
        b = s;
        c = certificate;
        d = null;
    }

    d(JDKKeyStore jdkkeystore, String s, Date date, int i, Object obj, Certificate acertificate[])
    {
        f = jdkkeystore;
        super();
        e = new Date();
        b = s;
        e = date;
        a = i;
        c = obj;
        d = acertificate;
    }

    d(JDKKeyStore jdkkeystore, String s, Date date, Object obj)
    {
        f = jdkkeystore;
        super();
        e = new Date();
        b = s;
        e = date;
        a = 1;
        c = obj;
    }

    c(JDKKeyStore jdkkeystore, String s, byte abyte0[], Certificate acertificate[])
    {
        f = jdkkeystore;
        super();
        e = new Date();
        a = 3;
        b = s;
        c = abyte0;
        d = acertificate;
    }
}
