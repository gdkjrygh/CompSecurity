// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.e;

import com.facebook.debug.log.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

// Referenced classes of package android_src.mms.e:
//            c

public class e
    implements Cloneable
{

    private int a;
    private byte b[];

    public e(int i, byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("EncodedStringValue: Text-string is null.");
        } else
        {
            a = i;
            b = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, b, 0, abyte0.length);
            return;
        }
    }

    public e(String s)
    {
        try
        {
            b = s.getBytes("utf-8");
            a = 106;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.facebook.debug.log.b.d("EncodedStringValue", "Default encoding must be supported.", s);
        }
    }

    public e(byte abyte0[])
    {
        this(106, abyte0);
    }

    public static e a(e e1)
    {
        if (e1 == null)
        {
            return null;
        } else
        {
            return new e(e1.a, e1.b);
        }
    }

    public static e[] a(String as[])
    {
        int j = as.length;
        e ae[];
        if (j > 0)
        {
            e ae1[] = new e[j];
            int i = 0;
            do
            {
                ae = ae1;
                if (i >= j)
                {
                    break;
                }
                ae1[i] = new e(as[i]);
                i++;
            } while (true);
        } else
        {
            ae = null;
        }
        return ae;
    }

    public int a()
    {
        return a;
    }

    public void a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("EncodedStringValue: Text-string is null.");
        } else
        {
            b = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, b, 0, abyte0.length);
            return;
        }
    }

    public void b(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("Text-string is null.");
        }
        if (b == null)
        {
            b = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, b, 0, abyte0.length);
            return;
        }
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            bytearrayoutputstream.write(b);
            bytearrayoutputstream.write(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            throw new NullPointerException("appendTextString: failed when write a new Text-string");
        }
        b = bytearrayoutputstream.toByteArray();
    }

    public byte[] b()
    {
        byte abyte0[] = new byte[b.length];
        System.arraycopy(b, 0, abyte0, 0, b.length);
        return abyte0;
    }

    public String c()
    {
        if (a == 0)
        {
            return new String(b);
        }
        String s;
        try
        {
            s = android_src.mms.e.c.a(a);
            s = new String(b, s);
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            String s1;
            try
            {
                s1 = new String(b, "iso-8859-1");
            }
            catch (UnsupportedEncodingException unsupportedencodingexception1)
            {
                return new String(b);
            }
            return s1;
        }
        return s;
    }

    public Object clone()
    {
        super.clone();
        int i = b.length;
        byte abyte0[] = new byte[i];
        System.arraycopy(b, 0, abyte0, 0, i);
        e e1;
        try
        {
            e1 = new e(a, abyte0);
        }
        catch (Exception exception)
        {
            com.facebook.debug.log.b.e("EncodedStringValue", (new StringBuilder()).append("failed to clone an EncodedStringValue: ").append(this).toString());
            exception.printStackTrace();
            throw new CloneNotSupportedException(exception.getMessage());
        }
        return e1;
    }
}
