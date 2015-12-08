// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.f;
import com.amazonaws.services.s3.model.bi;
import com.amazonaws.services.s3.model.bv;
import com.amazonaws.services.s3.model.bw;
import com.amazonaws.util.g;
import com.amazonaws.util.k;
import com.amazonaws.util.n;
import com.amazonaws.util.q;
import com.amazonaws.util.u;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLProtocolException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ag
{

    public static final boolean a = true;
    public static final boolean b = false;
    protected static final k c = new k();
    private static final Log d = LogFactory.getLog(com/amazonaws/services/s3/internal/ag);

    public ag()
    {
    }

    public static bv a(File file, a a1, boolean flag)
    {
        boolean flag1 = false;
_L2:
    /* block-local class not found */
    class a {}

        bv bv1;
        bv1 = a1.a();
        if (bv1 == null)
        {
            return null;
        }
        a(bv1, file, a1.b(), flag);
        boolean flag2;
        bv1.b().c();
        flag2 = false;
_L3:
        if (!flag2)
        {
            return bv1;
        }
        if (true) goto _L2; else goto _L1
_L1:
        AmazonClientException amazonclientexception;
        amazonclientexception;
        if (!amazonclientexception.isRetryable())
        {
            throw amazonclientexception;
        }
        break MISSING_BLOCK_LABEL_68;
        file;
        bv1.b().c();
        throw file;
        if ((amazonclientexception.getCause() instanceof SocketException) || (amazonclientexception.getCause() instanceof SSLProtocolException))
        {
            throw amazonclientexception;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        throw amazonclientexception;
        d.info((new StringBuilder()).append("Retry the download of object ").append(bv1.d()).append(" (bucket ").append(bv1.c()).append(")").toString(), amazonclientexception);
        bv1.b().c();
        flag2 = true;
        flag1 = true;
          goto _L3
    }

    public static String a(Date date)
    {
        return k.a(date);
    }

    public static String a(List list)
    {
        String s = "";
        Iterator iterator = list.iterator();
        boolean flag = true;
        list = s;
        while (iterator.hasNext()) 
        {
            String s1 = (String)iterator.next();
            Object obj = list;
            if (!flag)
            {
                obj = (new StringBuilder()).append(list).append(", ").toString();
            }
            list = (new StringBuilder()).append(((String) (obj))).append(s1).toString();
            flag = false;
        }
        return list;
    }

    public static URL a(f f1)
    {
        return a(f1, false);
    }

    public static URL a(f f1, boolean flag)
    {
        boolean flag1 = true;
        Object obj = n.a(f1.c(), true);
        String s = ((String) (obj));
        if (flag)
        {
            s = ((String) (obj));
            if (((String) (obj)).startsWith("/"))
            {
                s = ((String) (obj)).substring(1);
            }
        }
        s = (new StringBuilder()).append("/").append(s).toString().replaceAll("(?<=/)/", "%2F");
        s = (new StringBuilder()).append(f1.f()).append(s).toString();
        obj = f1.d().keySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            String s1 = (String)((Iterator) (obj)).next();
            String s2;
            if (flag1)
            {
                s = (new StringBuilder()).append(s).append("?").toString();
                flag1 = false;
            } else
            {
                s = (new StringBuilder()).append(s).append("&").toString();
            }
            s2 = (String)f1.d().get(s1);
            s = (new StringBuilder()).append(s).append(s1).append("=").append(n.a(s2, false)).toString();
        }
        try
        {
            f1 = new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            throw new AmazonClientException((new StringBuilder()).append("Unable to convert request to well formed URL: ").append(f1.getMessage()).toString(), f1);
        }
        return f1;
    }

    public static Date a(String s)
    {
        return k.a(s);
    }

    public static void a(bv bv1, File file, boolean flag, boolean flag1)
    {
        Object obj2;
        obj2 = null;
        File file1 = file.getParentFile();
        if (file1 != null && !file1.exists())
        {
            file1.mkdirs();
        }
        Object obj1 = new BufferedOutputStream(new FileOutputStream(file, flag1));
        Object obj = obj1;
        byte abyte0[] = new byte[10240];
_L2:
        obj = obj1;
        int i = bv1.b().read(abyte0);
        if (i <= -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        ((OutputStream) (obj1)).write(abyte0, 0, i);
        if (true) goto _L2; else goto _L1
        obj;
        file = ((File) (obj1));
        obj1 = obj;
_L6:
        obj = file;
        bv1.b().c();
        obj = file;
        throw new AmazonClientException((new StringBuilder()).append("Unable to store object contents to disk: ").append(((IOException) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        file;
_L5:
        try
        {
            ((OutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            bv1.b().close();
        }
        // Misplaced declaration of an exception variable
        catch (bv bv1) { }
        throw file;
_L1:
        try
        {
            ((OutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            bv1.b().close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (c(bv1.a().p()))
        {
            break MISSING_BLOCK_LABEL_366;
        }
        obj = q.a(new FileInputStream(file));
        bv1 = g.a(bv1.a().p());
_L3:
        if (flag && obj != null && bv1 != null && !Arrays.equals(((byte []) (obj)), bv1))
        {
            throw new AmazonClientException((new StringBuilder()).append("Unable to verify integrity of data download.  Client calculated content hash didn't match hash calculated by Amazon S3.  The data stored in '").append(file.getAbsolutePath()).append("' may be corrupt.").toString());
        } else
        {
            return;
        }
        obj;
        bv1 = null;
_L4:
        d.warn((new StringBuilder()).append("Unable to calculate MD5 hash to validate download: ").append(((Exception) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        obj = bv1;
        bv1 = obj2;
          goto _L3
        obj1;
        bv1 = ((bv) (obj));
        obj = obj1;
          goto _L4
        file;
        obj = null;
          goto _L5
        obj1;
        file = null;
          goto _L6
        obj = null;
        bv1 = obj2;
          goto _L3
    }

    public static String b(Date date)
    {
        return k.b(date);
    }

    public static Date b(String s)
    {
        return k.b(s);
    }

    public static boolean c(String s)
    {
        return s.contains("-");
    }

    public static byte[] d(String s)
    {
        return s.getBytes(u.a);
    }

    public static String e(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            s1 = s.trim();
            s = s1;
            if (s1.startsWith("\""))
            {
                s = s1.substring(1);
            }
            s1 = s;
            if (s.endsWith("\""))
            {
                return s.substring(0, s.length() - 1);
            }
        }
        return s1;
    }

}
