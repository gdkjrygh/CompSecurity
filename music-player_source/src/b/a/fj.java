// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.http.Header;

// Referenced classes of package b.a:
//            fg

public final class fj
{

    public static final String a = System.getProperty("line.separator");

    public static String a(InputStream inputstream)
    {
        inputstream = new InputStreamReader(inputstream);
        char ac[] = new char[1024];
        StringWriter stringwriter = new StringWriter();
        do
        {
            int i = inputstream.read(ac);
            if (-1 == i)
            {
                return stringwriter.toString();
            }
            stringwriter.write(ac, 0, i);
        } while (true);
    }

    public static String a(String s)
    {
        int i;
        i = 0;
        if (s == null)
        {
            return null;
        }
        byte abyte0[];
        Object obj;
        abyte0 = s.getBytes();
        obj = MessageDigest.getInstance("MD5");
        ((MessageDigest) (obj)).reset();
        ((MessageDigest) (obj)).update(abyte0);
        abyte0 = ((MessageDigest) (obj)).digest();
        obj = new StringBuffer();
_L1:
        if (i >= abyte0.length)
        {
            return ((StringBuffer) (obj)).toString();
        }
        ((StringBuffer) (obj)).append(String.format("%02X", new Object[] {
            Byte.valueOf(abyte0[i])
        }));
        i++;
          goto _L1
        Exception exception;
        exception;
        return s.replaceAll("[^[a-z][A-Z][0-9][.][_]]", "");
    }

    public static void a(File file, byte abyte0[])
    {
        file = new FileOutputStream(file);
        file.write(abyte0);
        file.flush();
        a(((OutputStream) (file)));
        return;
        abyte0;
        a(((OutputStream) (file)));
        throw abyte0;
    }

    private static void a(OutputStream outputstream)
    {
        if (outputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        outputstream.close();
        return;
        outputstream;
    }

    public static boolean a(Header header, String s)
    {
        if (header != null && header.getValue() != null)
        {
            header = header.getValue().split(";");
            int j = header.length;
            int i = 0;
            while (i < j) 
            {
                if (s.equalsIgnoreCase(header[i]))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static String b(String s)
    {
        Object obj;
        int i;
        try
        {
            obj = MessageDigest.getInstance("MD5");
            ((MessageDigest) (obj)).update(s.getBytes());
            s = ((MessageDigest) (obj)).digest();
            obj = new StringBuffer();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            fg.a("helper", "getMD5 error", s);
            return "";
        }
        i = 0;
        if (i >= s.length)
        {
            return ((StringBuffer) (obj)).toString();
        }
        ((StringBuffer) (obj)).append(Integer.toHexString(s[i] & 0xff));
        i++;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_29;
        }
    }

    public static byte[] b(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = new byte[1024];
        do
        {
            int i = inputstream.read(abyte0);
            if (-1 == i)
            {
                return bytearrayoutputstream.toByteArray();
            }
            bytearrayoutputstream.write(abyte0, 0, i);
        } while (true);
    }

    public static void c(InputStream inputstream)
    {
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        inputstream.close();
        return;
        inputstream;
    }

}
