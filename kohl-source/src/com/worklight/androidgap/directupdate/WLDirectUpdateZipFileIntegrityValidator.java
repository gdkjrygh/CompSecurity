// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.directupdate;

import android.util.Base64;
import com.worklight.common.Logger;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;

// Referenced classes of package com.worklight.androidgap.directupdate:
//            WLDirectUpdateDownloader

public class WLDirectUpdateZipFileIntegrityValidator
{

    private static final int PADDING_LENGTH = 512;
    private static final byte PADDING_VALUE = 32;
    private static final Logger logger = Logger.getInstance(com/worklight/androidgap/directupdate/WLDirectUpdateDownloader.getName());
    PublicKey publicKey;
    Signature signer;

    public WLDirectUpdateZipFileIntegrityValidator(Signature signature, PublicKey publickey)
    {
        publicKey = publickey;
        signer = signature;
    }

    private byte[] getZipFileSignature(File file)
        throws IOException
    {
        byte abyte0[] = new byte[512];
        RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
        randomaccessfile.seek(file.length() - 512L);
        randomaccessfile.read(abyte0);
        randomaccessfile.close();
        int i = 0;
        do
        {
            int j = i + 1;
            if (abyte0[i] != 32)
            {
                i = j;
            } else
            {
                return Base64.decode(Arrays.copyOfRange(abyte0, 0, j - 1), 0);
            }
        } while (true);
    }

    private void resetZipFileComment(File file)
        throws IOException
    {
        RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
        randomaccessfile.seek(file.length() - 512L);
        file = new byte[512];
        for (int i = 0; i < 512; i++)
        {
            file[i] = 32;
        }

        randomaccessfile.write(file);
        randomaccessfile.close();
    }

    public boolean verify(File file)
    {
        Object obj;
        BufferedInputStream bufferedinputstream;
        byte abyte0[];
        obj = getZipFileSignature(file);
        resetZipFileComment(file);
        signer.initVerify(publicKey);
        bufferedinputstream = new BufferedInputStream(new FileInputStream(file));
        abyte0 = new byte[4096];
_L1:
        int i = bufferedinputstream.read(abyte0);
label0:
        {
            if (i == -1)
            {
                break label0;
            }
            boolean flag;
            try
            {
                signer.update(abyte0, 0, i);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                logger.debug((new StringBuilder()).append("Cannot read ").append(file.getName()).toString(), ((Throwable) (obj)));
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                logger.debug("Invalid direct update authenticity public Key", file);
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                logger.debug("Invalid signature of the direct update zip file, original signature may have been replaced or invalid key was used", file);
                return false;
            }
        }
          goto _L1
        bufferedinputstream.close();
        flag = signer.verify(((byte []) (obj)));
        return flag;
    }

}
