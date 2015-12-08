// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.immersion.hapticmediasdk.utils;

import android.content.Context;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;

public class FileManager
{

    public static final String HAPTIC_STORAGE_FILENAME = "dat.hapt";
    public static final String TAG = "FileManager";
    public static int b042704270427042704270427 = 75;
    public static int b042704270427042704270427 = 1;
    public static int b042704270427042704270427 = 2;
    public static int b042704270427042704270427;
    Context a;
    private int b;

    public FileManager(Context context)
    {
        do
        {
        } while (true);
    }

    public static int b042704270427042704270427()
    {
        return 0;
    }

    public static int b042704270427042704270427()
    {
        return 2;
    }

    public static int b042704270427042704270427()
    {
        return 28;
    }

    public void closeCloseable(Closeable closeable)
    {
        if (((b042704270427042704270427() + b042704270427042704270427) * b042704270427042704270427()) % b042704270427042704270427() != b042704270427042704270427)
        {
            b042704270427042704270427 = b042704270427042704270427();
            b042704270427042704270427 = b042704270427042704270427();
        }
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        closeable.close();
        return;
        closeable;
        try
        {
            closeable.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable)
        {
            throw closeable;
        }
        closeable;
        throw closeable;
    }

    public void deleteHapticStorage()
    {
        File afile[];
        File file;
        String s;
        StringBuilder stringbuilder;
        int i;
        int j;
        int k;
        boolean flag;
        try
        {
            afile = (new File(getInternalHapticPath())).listFiles();
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (afile == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        i = b042704270427042704270427();
        switch ((i * (b042704270427042704270427 + i)) % b042704270427042704270427)
        {
        default:
            b042704270427042704270427 = 63;
            break;

        case 0: // '\0'
            break;
        }
        j = afile.length;
        i = 0;
_L3:
        if (i >= j) goto _L2; else goto _L1
_L1:
        file = afile[i];
        s = file.getName();
        try
        {
            stringbuilder = new StringBuilder();
            k = b;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        flag = s.endsWith(stringbuilder.append(k).append("dat.hapt").toString());
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        file.delete();
        i++;
          goto _L3
_L2:
    }

    public File getHapticStorageFile(String s)
    {
        Object obj;
        try
        {
            obj = a.getFilesDir();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            obj = ((File) (obj)).getPath();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        s = (new StringBuilder()).append(getUniqueFileName(s));
        if (((b042704270427042704270427 + b042704270427042704270427) * b042704270427042704270427) % b042704270427042704270427 != b042704270427042704270427())
        {
            b042704270427042704270427 = b042704270427042704270427();
            b042704270427042704270427 = b042704270427042704270427();
        }
        s = new File(((String) (obj)), s.append("dat.hapt").toString());
        return s;
    }

    public String getInternalHapticPath()
    {
        File file = a.getFilesDir();
        int i = b042704270427042704270427();
        switch ((i * (b042704270427042704270427 + i)) % b042704270427042704270427)
        {
        default:
            b042704270427042704270427 = 65;
            // fall through

        case 0: // '\0'
            return file.getAbsolutePath();
        }
    }

    public String getUniqueFileName(String s)
    {
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.reset();
            messagedigest.update(s.getBytes(), 0, s.length());
            s = new BigInteger(1, messagedigest.digest());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                s.printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            return null;
        }
        if (((b042704270427042704270427 + b042704270427042704270427) * b042704270427042704270427) % b042704270427042704270427 != b042704270427042704270427)
        {
            b042704270427042704270427 = b042704270427042704270427();
            b042704270427042704270427 = 59;
        }
        s = String.format("%032x_%d", new Object[] {
            s, Integer.valueOf(b)
        });
        return s;
    }

    public BufferedOutputStream makeOutputStream(String s)
    {
        byte abyte0[];
        Object obj;
        obj = null;
        abyte0 = new byte[1024];
        FileInputStream fileinputstream;
        StringBuilder stringbuilder;
        fileinputstream = new FileInputStream(s);
        stringbuilder = new StringBuilder();
        int i = b042704270427042704270427;
        switch ((i * (b042704270427042704270427 + i)) % b042704270427042704270427)
        {
        default:
            b042704270427042704270427 = 73;
            b042704270427042704270427 = b042704270427042704270427();
            break;

        case 0: // '\0'
            break;
        }
        s = new String(stringbuilder.append(getUniqueFileName(s)).append("dat.hapt").toString());
        s = a.openFileOutput(s, 0);
        int j = fileinputstream.available();
_L1:
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        s.write(abyte0, 0, fileinputstream.read(abyte0));
        j = fileinputstream.available();
          goto _L1
        fileinputstream.close();
_L3:
        BufferedOutputStream bufferedoutputstream = obj;
        if (s != null)
        {
            bufferedoutputstream = new BufferedOutputStream(s);
        }
        return bufferedoutputstream;
        Exception exception;
        exception;
        s = null;
_L4:
        exception.printStackTrace();
        if (true) goto _L3; else goto _L2
_L2:
        exception;
          goto _L4
    }

    public BufferedOutputStream makeOutputStreamForStreaming(String s)
    {
        try
        {
            s = (new StringBuilder()).append(getUniqueFileName(s)).append("dat.hapt").toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        s = a.openFileOutput(s, 0);
        if (((b042704270427042704270427 + b042704270427042704270427) * b042704270427042704270427) % b042704270427042704270427 != b042704270427042704270427)
        {
            b042704270427042704270427 = 23;
            b042704270427042704270427 = b042704270427042704270427();
        }
        return new BufferedOutputStream(s);
        s;
        s.printStackTrace();
        return null;
        s;
        throw s;
    }
}
