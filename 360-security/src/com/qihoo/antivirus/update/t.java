// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.qihoo.antivirus.update:
//            l, d, x, af, 
//            c, UpdateService

public class t extends l
    implements x.a
{

    private final c c;
    private long d;
    private final String e;
    private String f;
    private long g;

    public t(d d1, String s, String s1, c c1, String s2, long l1)
    {
        super(d1.e(), s);
        d = 0L;
        e = s1;
        f = s2;
        g = l1;
        try
        {
            d1 = new File(s1);
            if (d1.exists())
            {
                d1.delete();
            }
        }
        // Misplaced declaration of an exception variable
        catch (d d1) { }
        c = c1;
    }

    protected int a(HttpClient httpclient, String s)
    {
        FileOutputStream fileoutputstream1;
        File file = new File(e);
        d = file.length();
        fileoutputstream1 = new FileOutputStream(file, true);
        FileOutputStream fileoutputstream = fileoutputstream1;
        int j = x.a(httpclient, s, fileoutputstream1, d, this, 0L, g);
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        fileoutputstream = fileoutputstream1;
        if (TextUtils.isEmpty(f))
        {
            break MISSING_BLOCK_LABEL_134;
        }
        fileoutputstream = fileoutputstream1;
        httpclient = af.a(e);
        fileoutputstream = fileoutputstream1;
        if (TextUtils.isEmpty(httpclient))
        {
            break MISSING_BLOCK_LABEL_106;
        }
        fileoutputstream = fileoutputstream1;
        if (httpclient.equals(f))
        {
            break MISSING_BLOCK_LABEL_134;
        }
        fileoutputstream = fileoutputstream1;
        a(-9, "invalidate data");
        int i;
        if (fileoutputstream1 != null)
        {
            try
            {
                fileoutputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient) { }
        }
        i = -9;
        return i;
        i = j;
        if (fileoutputstream1 != null)
        {
            try
            {
                fileoutputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient)
            {
                return j;
            }
            return j;
        } else
        {
            break MISSING_BLOCK_LABEL_131;
        }
        httpclient;
        fileoutputstream1 = null;
_L6:
        fileoutputstream = fileoutputstream1;
        a(-51, httpclient.getMessage());
        if (fileoutputstream1 != null)
        {
            try
            {
                fileoutputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient) { }
        }
        return -99;
        httpclient;
        fileoutputstream1 = null;
_L4:
        fileoutputstream = fileoutputstream1;
        a(-99, httpclient.getMessage());
        if (fileoutputstream1 != null)
        {
            try
            {
                fileoutputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient) { }
        }
        break MISSING_BLOCK_LABEL_182;
        httpclient;
        fileoutputstream = null;
_L2:
        if (fileoutputstream != null)
        {
            try
            {
                fileoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw httpclient;
        httpclient;
        if (true) goto _L2; else goto _L1
_L1:
        httpclient;
        if (true) goto _L4; else goto _L3
_L3:
        httpclient;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(int i, String s)
    {
        if (a < 2)
        {
            int j = i;
            if (i < 0)
            {
                j = -i;
            }
            b[a] = j;
        }
    }

    public void a(long l1, long l2)
        throws InterruptedException
    {
        if (c != null)
        {
            if (l2 < 0L)
            {
                l2 = g;
            } else
            {
                l2 = d + l2;
            }
            c.a(d + l1, l2);
        }
    }

    public void a(HttpResponse httpresponse)
    {
    }

    public boolean a(HttpClient httpclient)
    {
        String s;
        boolean flag1;
        flag1 = true;
        s = a();
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        a = 0;
_L9:
        int i = a(httpclient, s);
          goto _L3
_L6:
        flag = flag1;
        if (i < 0)
        {
            return false;
        }
          goto _L4
_L3:
        if (i >= 0 || i == -4 || i == -99 || i == -98 || i == -97) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (UpdateService.f) goto _L4; else goto _L7
_L7:
        a = a + 1;
        if (!af.b(b()) || a >= 2) goto _L6; else goto _L8
_L8:
        long l1 = a;
        c.a.b(a, s);
        try
        {
            Thread.sleep(10000L * l1);
        }
        catch (InterruptedException interruptedexception) { }
          goto _L9
    }

    public int d()
    {
        return 3;
    }
}
