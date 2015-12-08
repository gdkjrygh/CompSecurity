// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.util.Log;
import com.d.a.a;
import com.kik.g.p;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kik.android.util.bx;
import org.a.a.a.c;

// Referenced classes of package com.kik.cache:
//            t

public class s
{

    private static final String a = com/kik/cache/s.getSimpleName();
    private a b;
    private kik.android.s c;
    private String d;

    public s(File file, String s1)
    {
        d = s1;
        try
        {
            b = com.d.a.a.a(file);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            Log.e(a, "Error creating file cache");
        }
    }

    static kik.android.s a(s s1)
    {
        return s1.c;
    }

    public final p a(String s1, String s2, byte abyte0[], kik.a.e.s s3, com.kik.android.a a1, int i)
    {
        File file = c(s1);
        if (file != null)
        {
            return com.kik.g.s.a(file);
        }
        file = new File(b(s1));
        if (c == null)
        {
            c = new kik.android.s(a1);
        }
        if (s2 == null)
        {
            return com.kik.g.s.a(new Throwable("null url"));
        }
        abyte0 = c.a(s2, d, file, abyte0, i);
        if (s3 != null)
        {
            c.a(s3, s2);
        }
        abyte0.a(new t(this, s1, s2));
        return abyte0;
    }

    public final boolean a(String s1)
    {
        if (b == null)
        {
            return false;
        }
        try
        {
            b.c(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return false;
        }
        return true;
    }

    public final boolean a(String s1, File file)
    {
        Object obj;
        Object obj1;
        if (b == null)
        {
            return false;
        }
        obj = null;
        obj1 = null;
        file = new FileInputStream(file);
        boolean flag = a(s1, ((InputStream) (file)));
        org.a.a.a.c.a(file);
        return flag;
        obj;
        file = null;
_L6:
        s1 = file;
        file = ((File) (obj));
_L4:
        obj = s1;
        Log.e(a, "Error editing cache entry");
        obj = s1;
        bx.a(file);
        org.a.a.a.c.a(s1);
        return false;
        s1;
_L2:
        org.a.a.a.c.a(((InputStream) (obj)));
        throw s1;
        s1;
        obj = file;
        if (true) goto _L2; else goto _L1
_L1:
        file;
        s1 = obj1;
        continue; /* Loop/switch isn't completed */
        IOException ioexception;
        ioexception;
        s1 = file;
        file = ioexception;
        if (true) goto _L4; else goto _L3
_L3:
        ioexception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean a(String s1, InputStream inputstream)
    {
        Object obj;
        Object obj1;
        Object obj4;
        Object obj5;
        obj4 = null;
        obj1 = null;
        obj = null;
        obj5 = null;
        if (b == null)
        {
            return false;
        }
        s1 = b.b(s1);
        if (s1 == null)
        {
            if (s1 != null)
            {
                s1.d();
            }
            org.a.a.a.c.a(null);
            org.a.a.a.c.a(null);
            return false;
        }
        byte abyte0[];
        abyte0 = new byte[51200];
        inputstream = new BufferedInputStream(inputstream);
        Object obj2;
        String s2;
        s2 = s1;
        obj4 = obj;
        obj2 = inputstream;
        obj = new BufferedOutputStream(s1.a(), 51200);
_L3:
        int i = inputstream.read(abyte0);
        if (i == -1) goto _L2; else goto _L1
_L1:
        ((BufferedOutputStream) (obj)).write(abyte0, 0, i);
          goto _L3
        obj2;
        obj1 = obj;
        obj = obj2;
_L4:
        s2 = s1;
        obj4 = obj1;
        obj2 = inputstream;
        Log.e(a, "Error editing cache entry");
        s2 = s1;
        obj4 = obj1;
        obj2 = inputstream;
        bx.a(((Throwable) (obj)));
        if (s1 != null)
        {
            s1.d();
        }
        org.a.a.a.c.a(inputstream);
        org.a.a.a.c.a(((java.io.OutputStream) (obj1)));
        return false;
_L2:
        ((BufferedOutputStream) (obj)).flush();
        s1.b();
        if (s1 != null)
        {
            s1.d();
        }
        org.a.a.a.c.a(inputstream);
        org.a.a.a.c.a(((java.io.OutputStream) (obj)));
        return true;
        obj;
        s1 = null;
        inputstream = null;
_L5:
        if (s1 != null)
        {
            s1.d();
        }
        org.a.a.a.c.a(inputstream);
        org.a.a.a.c.a(((java.io.OutputStream) (obj4)));
        throw obj;
        obj;
        inputstream = null;
        s1 = null;
_L6:
        obj2 = s1;
        s1 = inputstream;
        inputstream = ((InputStream) (obj2));
          goto _L4
        obj;
        inputstream = null;
          goto _L5
        obj;
        s1 = s2;
        inputstream = ((InputStream) (obj2));
          goto _L5
        obj1;
        obj4 = obj;
        obj = obj1;
          goto _L5
        obj;
        s1 = null;
        inputstream = null;
        obj1 = obj5;
          goto _L4
        obj;
        inputstream = null;
        obj1 = obj5;
          goto _L4
        obj;
        obj1 = obj5;
          goto _L4
        obj;
        Object obj3 = null;
        inputstream = s1;
        s1 = obj3;
          goto _L6
        obj;
        InputStream inputstream1 = inputstream;
        inputstream = s1;
        s1 = inputstream1;
          goto _L6
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        obj1 = obj;
        InputStream inputstream2 = inputstream;
        obj = outofmemoryerror;
        inputstream = s1;
        s1 = inputstream2;
          goto _L6
    }

    protected String b(String s1)
    {
        return (new StringBuilder()).append(b.a()).append("/").append(s1).toString();
    }

    public final File c(String s1)
    {
        if (b == null)
        {
            return null;
        }
        InputStream inputstream;
        BufferedInputStream bufferedinputstream;
        com.d.a.a.c c1;
        BufferedInputStream bufferedinputstream1;
        BufferedOutputStream bufferedoutputstream1;
        com.d.a.a.c c2;
        byte abyte0[];
        int i;
        boolean flag;
        try
        {
            c1 = b.a(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            c1 = null;
            bufferedoutputstream = null;
            bufferedinputstream = null;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            c1 = null;
            bufferedoutputstream = null;
            bufferedinputstream = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            c1 = null;
            bufferedoutputstream = null;
            bufferedinputstream = null;
        }
_L5:
        if (c1 == null)
        {
            if (c1 != null)
            {
                c1.close();
            }
            org.a.a.a.c.a(null);
            org.a.a.a.c.a(null);
            return null;
        }
        try
        {
            s1 = new File(b(s1));
            flag = s1.exists();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            bufferedoutputstream = null;
            bufferedinputstream = null;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            bufferedoutputstream = null;
            bufferedinputstream = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            bufferedoutputstream = null;
            bufferedinputstream = null;
            continue; /* Loop/switch isn't completed */
        }
        if (flag)
        {
            if (c1 != null)
            {
                c1.close();
            }
            org.a.a.a.c.a(null);
            org.a.a.a.c.a(null);
            return s1;
        }
        inputstream = c1.a();
        if (inputstream == null) goto _L2; else goto _L1
_L1:
        bufferedinputstream = new BufferedInputStream(inputstream, 51200);
        BufferedOutputStream bufferedoutputstream;
        try
        {
            bufferedoutputstream = new BufferedOutputStream(new FileOutputStream(s1));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            bufferedoutputstream = null;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            bufferedoutputstream = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            bufferedoutputstream = null;
            continue; /* Loop/switch isn't completed */
        }
        c2 = c1;
        bufferedoutputstream1 = bufferedoutputstream;
        bufferedinputstream1 = bufferedinputstream;
        abyte0 = new byte[51200];
_L4:
        c2 = c1;
        bufferedoutputstream1 = bufferedoutputstream;
        bufferedinputstream1 = bufferedinputstream;
        i = bufferedinputstream.read(abyte0);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        c2 = c1;
        bufferedoutputstream1 = bufferedoutputstream;
        bufferedinputstream1 = bufferedinputstream;
        bufferedoutputstream.write(abyte0, 0, i);
        if (true) goto _L4; else goto _L3
        s1;
_L8:
        c2 = c1;
        bufferedoutputstream1 = bufferedoutputstream;
        bufferedinputstream1 = bufferedinputstream;
        bx.a(s1);
        if (c1 != null)
        {
            c1.close();
        }
        org.a.a.a.c.a(bufferedinputstream);
        org.a.a.a.c.a(bufferedoutputstream);
        return null;
_L3:
        c2 = c1;
        bufferedoutputstream1 = bufferedoutputstream;
        bufferedinputstream1 = bufferedinputstream;
        bufferedoutputstream.flush();
        if (c1 != null)
        {
            c1.close();
        }
        org.a.a.a.c.a(bufferedinputstream);
        org.a.a.a.c.a(bufferedoutputstream);
        return s1;
_L2:
        if (c1 != null)
        {
            c1.close();
        }
        org.a.a.a.c.a(null);
        org.a.a.a.c.a(null);
        return null;
_L6:
        if (c1 != null)
        {
            c1.close();
        }
        org.a.a.a.c.a(bufferedinputstream);
        org.a.a.a.c.a(bufferedoutputstream);
        throw s1;
        s1;
        c1 = c2;
        bufferedoutputstream = bufferedoutputstream1;
        bufferedinputstream = bufferedinputstream1;
        if (true) goto _L6; else goto _L5
        s1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final InputStream d(String s1)
    {
        if (b == null)
        {
            return null;
        }
        s1 = b.a(s1);
        if (s1 == null)
        {
            return null;
        }
        s1 = s1.a();
        return s1;
        s1;
_L2:
        bx.a(s1);
        return null;
        s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final boolean e(String s1)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        s1 = b.a(s1);
        if (s1 != null)
        {
            flag = true;
        }
        flag1 = flag;
        if (s1 != null)
        {
            s1.close();
            flag1 = flag;
        }
_L2:
        return flag1;
        s1;
        bx.a(s1);
        if (true) goto _L2; else goto _L1
_L1:
        throw new NullPointerException();
        s1;
        if (false)
        {
            throw new NullPointerException();
        } else
        {
            throw s1;
        }
    }

}
