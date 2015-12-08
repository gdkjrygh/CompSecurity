// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.util.Date;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKKeyStore

private class certChain
{

    String alias;
    Certificate certChain[];
    Date date;
    Object obj;
    final JDKKeyStore this$0;
    int type;

    String getAlias()
    {
        return alias;
    }

    Certificate[] getCertificateChain()
    {
        return certChain;
    }

    Date getDate()
    {
        return date;
    }

    Object getObject()
    {
        return obj;
    }

    Object getObject(char ac[])
        throws NoSuchAlgorithmException, UnrecoverableKeyException
    {
        if ((ac == null || ac.length == 0) && (obj instanceof Key))
        {
            return obj;
        }
        if (type != 4)
        {
            break MISSING_BLOCK_LABEL_405;
        }
        Object obj1 = new DataInputStream(new ByteArrayInputStream((byte[])(byte[])obj));
        Exception exception;
        byte abyte1[];
        ByteArrayOutputStream bytearrayoutputstream;
        DataOutputStream dataoutputstream;
        int j;
        try
        {
            byte abyte0[] = new byte[((DataInputStream) (obj1)).readInt()];
            ((DataInputStream) (obj1)).readFully(abyte0);
            int i = ((DataInputStream) (obj1)).readInt();
            obj1 = new CipherInputStream(((java.io.InputStream) (obj1)), makePBECipher("PBEWithSHAAnd3-KeyTripleDES-CBC", 2, ac, abyte0, i));
        }
        // Misplaced declaration of an exception variable
        catch (char ac[])
        {
            throw new UnrecoverableKeyException("no match");
        }
        obj1 = JDKKeyStore.access$100(JDKKeyStore.this, new DataInputStream(((java.io.InputStream) (obj1))));
        return obj1;
        exception;
        exception = new DataInputStream(new ByteArrayInputStream((byte[])(byte[])obj));
        abyte1 = new byte[exception.readInt()];
        exception.readFully(abyte1);
        j = exception.readInt();
        exception = new CipherInputStream(exception, makePBECipher("BrokenPBEWithSHAAnd3-KeyTripleDES-CBC", 2, ac, abyte1, j));
        exception = JDKKeyStore.access$100(JDKKeyStore.this, new DataInputStream(exception));
_L1:
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_384;
        }
        bytearrayoutputstream = new ByteArrayOutputStream();
        dataoutputstream = new DataOutputStream(bytearrayoutputstream);
        dataoutputstream.writeInt(abyte1.length);
        dataoutputstream.write(abyte1);
        dataoutputstream.writeInt(j);
        ac = new DataOutputStream(new CipherOutputStream(dataoutputstream, makePBECipher("PBEWithSHAAnd3-KeyTripleDES-CBC", 1, ac, abyte1, j)));
        JDKKeyStore.access$000(JDKKeyStore.this, exception, ac);
        ac.close();
        obj = bytearrayoutputstream.toByteArray();
        return exception;
        exception;
        exception = new DataInputStream(new ByteArrayInputStream((byte[])(byte[])obj));
        abyte1 = new byte[exception.readInt()];
        exception.readFully(abyte1);
        j = exception.readInt();
        exception = new CipherInputStream(exception, makePBECipher("OldPBEWithSHAAnd3-KeyTripleDES-CBC", 2, ac, abyte1, j));
        exception = JDKKeyStore.access$100(JDKKeyStore.this, new DataInputStream(exception));
          goto _L1
        throw new UnrecoverableKeyException("no match");
        throw new RuntimeException("forget something!");
    }

    int getType()
    {
        return type;
    }

    (String s, Key key, char ac[], Certificate acertificate[])
        throws Exception
    {
        this$0 = JDKKeyStore.this;
        super();
        date = new Date();
        type = 4;
        alias = s;
        certChain = acertificate;
        acertificate = new byte[20];
        random.setSeed(System.currentTimeMillis());
        random.nextBytes(acertificate);
        int i = (random.nextInt() & 0x3ff) + 1024;
        s = new ByteArrayOutputStream();
        DataOutputStream dataoutputstream = new DataOutputStream(s);
        dataoutputstream.writeInt(acertificate.length);
        dataoutputstream.write(acertificate);
        dataoutputstream.writeInt(i);
        ac = new DataOutputStream(new CipherOutputStream(dataoutputstream, makePBECipher("PBEWithSHAAnd3-KeyTripleDES-CBC", 1, ac, acertificate, i)));
        JDKKeyStore.access$000(JDKKeyStore.this, key, ac);
        ac.close();
        obj = s.toByteArray();
    }

    obj(String s, Certificate certificate)
    {
        this$0 = JDKKeyStore.this;
        super();
        date = new Date();
        type = 1;
        alias = s;
        obj = certificate;
        certChain = null;
    }

    certChain(String s, Date date1, int i, Object obj1)
    {
        this$0 = JDKKeyStore.this;
        super();
        date = new Date();
        alias = s;
        date = date1;
        type = i;
        obj = obj1;
    }

    obj(String s, Date date1, int i, Object obj1, Certificate acertificate[])
    {
        this$0 = JDKKeyStore.this;
        super();
        date = new Date();
        alias = s;
        date = date1;
        type = i;
        obj = obj1;
        certChain = acertificate;
    }

    certChain(String s, byte abyte0[], Certificate acertificate[])
    {
        this$0 = JDKKeyStore.this;
        super();
        date = new Date();
        type = 3;
        alias = s;
        obj = abyte0;
        certChain = acertificate;
    }
}
