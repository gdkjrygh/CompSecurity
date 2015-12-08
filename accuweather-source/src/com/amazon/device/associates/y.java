// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;

// Referenced classes of package com.amazon.device.associates:
//            p

class y
{

    y()
    {
    }

    public static Object a(String s)
    {
        if (!d(s))
        {
            return null;
        }
        try
        {
            s = ((String) (a(c(s))));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            p.a("FileUtils", "Loading Object failed. Ex=", new Object[] {
                s
            });
            return null;
        }
        return s;
    }

    private static Object a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        try
        {
            abyte0 = ((byte []) ((new ObjectInputStream(new ByteArrayInputStream(abyte0))).readObject()));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            p.a("FileUtils", "Converting byte array to object failed. Ex=", new Object[] {
                abyte0
            });
            return null;
        }
        return abyte0;
    }

    public static boolean a(Object obj, String s)
    {
        boolean flag = true;
        if (obj != null && s != null && !"".equals(s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if ((obj = a(obj)) == null) goto _L1; else goto _L3
_L3:
        if ("".equals(obj)) goto _L1; else goto _L4
_L4:
        s = new FileOutputStream(s);
        s.write(((byte []) (obj)));
        s.close();
_L6:
        return flag;
        obj;
        p.a("FileUtils", "Saving file failed. Ex=", new Object[] {
            obj
        });
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static byte[] a(Object obj)
    {
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
            objectoutputstream.writeObject(obj);
            objectoutputstream.close();
            obj = bytearrayoutputstream.toByteArray();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            p.a("FileUtils", "Converting object to byte array failed. Ex=", new Object[] {
                obj
            });
            return null;
        }
        return ((byte []) (obj));
    }

    public static void b(String s)
    {
        try
        {
            if (d(s))
            {
                (new File(s)).delete();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    private static byte[] c(String s)
        throws IOException
    {
        if (!d(s))
        {
            return null;
        }
        s = new RandomAccessFile(new File(s), "r");
        long l = s.length();
        int i;
        i = (int)l;
        if ((long)i == l)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        throw new IOException("File size >= 2 GB");
        Exception exception;
        exception;
        s.close();
        throw exception;
        byte abyte0[];
        abyte0 = new byte[i];
        s.readFully(abyte0);
        s.close();
        return abyte0;
    }

    private static boolean d(String s)
    {
        if (s == null || "".equals(s))
        {
            return false;
        } else
        {
            return (new File(s)).exists();
        }
    }
}
