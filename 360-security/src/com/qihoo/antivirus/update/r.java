// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.qihoo.antivirus.update:
//            l, x, af, v, 
//            d

public class r extends l
    implements x.a
{

    private final String c;
    private final long d;
    private final String e;
    private final v f;

    public r(Context context, String s, String s1, v v1, long l1, String s2)
    {
        super(context, s);
        c = s1;
        d = l1;
        e = s2;
        f = v1;
    }

    protected int a(HttpClient httpclient, String s)
    {
        FileOutputStream fileoutputstream1;
        File file = new File(c);
        if (file.exists())
        {
            file.delete();
        }
        fileoutputstream1 = new FileOutputStream(file, true);
        FileOutputStream fileoutputstream = fileoutputstream1;
        int j = x.a(httpclient, s, fileoutputstream1, 0L, this, 0L, d);
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        fileoutputstream = fileoutputstream1;
        if (TextUtils.isEmpty(e))
        {
            break MISSING_BLOCK_LABEL_135;
        }
        fileoutputstream = fileoutputstream1;
        httpclient = af.a(c);
        fileoutputstream = fileoutputstream1;
        if (TextUtils.isEmpty(httpclient))
        {
            break MISSING_BLOCK_LABEL_107;
        }
        fileoutputstream = fileoutputstream1;
        if (httpclient.equals(e))
        {
            break MISSING_BLOCK_LABEL_135;
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
            break MISSING_BLOCK_LABEL_132;
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
        break MISSING_BLOCK_LABEL_183;
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
        if (f != null)
        {
            f.a(l1, l2);
        }
    }

    public void a(HttpResponse httpresponse)
    {
        if (f != null)
        {
            f.a(httpresponse);
        }
    }

    public boolean a(HttpClient httpclient)
    {
        String s;
        boolean flag1;
        flag1 = false;
        s = a();
        a = 0;
_L10:
        int i = a(httpclient, s);
        if (i < 0) goto _L2; else goto _L1
_L1:
        boolean flag;
        flag = flag1;
        if (i >= 0)
        {
            flag = true;
        }
_L4:
        return flag;
_L2:
        flag = flag1;
        if (i == -4) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (i == -99) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (i == -98) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (i == -97) goto _L4; else goto _L7
_L7:
        a = a + 1;
        if (!af.b(b()) || a >= 2) goto _L1; else goto _L8
_L8:
        long l1 = a;
        f.a.a(a, s);
        try
        {
            Thread.sleep(10000L * l1);
        }
        catch (InterruptedException interruptedexception) { }
        if (true) goto _L10; else goto _L9
_L9:
    }

    public int d()
    {
        return 2;
    }
}
