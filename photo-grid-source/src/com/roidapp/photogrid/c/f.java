// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.c;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package com.roidapp.photogrid.c:
//            d, a, g

final class f
    implements Runnable
{

    final d a;
    private String b;

    public f(d d1, String s)
    {
        a = d1;
        super();
        b = s;
        d.d();
        d.e();
    }

    public final void run()
    {
        Object obj;
        Object obj3;
        Object obj4;
        Object obj11;
        Object obj12;
        obj3 = null;
        obj4 = null;
        obj12 = null;
        obj11 = null;
        obj = b;
        File file;
        int k;
        String s = ((String) (obj)).substring(((String) (obj)).lastIndexOf('/'));
        k = PreferenceManager.getDefaultSharedPreferences(d.d(a)).getInt("size", 10086);
        file = new File((new StringBuilder()).append(d.e(a)).append(s).toString());
        if (!file.getParentFile().exists())
        {
            file.getParentFile().mkdirs();
        }
        if (!d.f(a)) goto _L2; else goto _L1
_L1:
        byte abyte0[] = new byte[20480];
_L7:
        URL url;
        url = new URL(((String) (obj)));
        obj = (HttpURLConnection)url.openConnection();
        Object obj1;
        ((HttpURLConnection) (obj)).setRequestMethod("GET");
        ((HttpURLConnection) (obj)).setConnectTimeout(20000);
        ((HttpURLConnection) (obj)).setReadTimeout(10000);
        obj1 = new FileOutputStream(file);
        obj3 = ((HttpURLConnection) (obj)).getInputStream();
        Object obj2;
        int i;
        obj2 = obj1;
        i = 0;
        obj1 = obj;
        obj = obj3;
_L12:
        int j = ((InputStream) (obj)).read(abyte0);
        obj3 = obj2;
        obj4 = obj;
        obj11 = obj1;
        if (j == -1) goto _L4; else goto _L3
_L3:
        if (!d.f()) goto _L6; else goto _L5
_L5:
        d.a(a, 7, null);
        obj11 = obj1;
        obj4 = obj;
        obj3 = obj2;
_L4:
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        ((InputStream) (obj4)).close();
        ((FileOutputStream) (obj3)).close();
        if (obj11 == null)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        ((HttpURLConnection) (obj11)).disconnect();
_L11:
        return;
_L2:
        abyte0 = new byte[2048];
          goto _L7
_L6:
        if (!d.g())
        {
            break MISSING_BLOCK_LABEL_340;
        }
        this;
        JVM INSTR monitorenter ;
        d.a(a, 0);
        file.delete();
        obj3 = new FileOutputStream(file);
        obj2 = (HttpURLConnection)url.openConnection();
        obj1 = ((HttpURLConnection) (obj2)).getInputStream();
        obj = obj1;
        d.e();
        obj = obj1;
        this;
        JVM INSTR monitorexit ;
        obj = obj1;
        j = 0;
        i = 0;
        obj1 = obj2;
        obj2 = obj3;
        obj11 = obj2;
        obj12 = obj;
        obj4 = obj1;
        ((FileOutputStream) (obj2)).write(abyte0, 0, j);
        i = j + i;
        if (i != k) goto _L9; else goto _L8
_L8:
        obj11 = obj2;
        obj12 = obj;
        obj4 = obj1;
        d.a(a, 3, com.roidapp.photogrid.c.a.a(file));
        obj11 = obj2;
        obj12 = obj;
        obj4 = obj1;
        d.a(a, 4, null);
        obj3 = obj2;
        obj4 = obj;
        obj11 = obj1;
          goto _L4
        obj3;
_L20:
        this;
        JVM INSTR monitorexit ;
        throw obj3;
        obj3;
_L19:
        obj11 = obj2;
        obj12 = obj;
        obj4 = obj1;
        g.b("DownloadMainLite", ((MalformedURLException) (obj3)).toString());
        obj11 = obj2;
        obj12 = obj;
        obj4 = obj1;
        d.a(a, 5, ((MalformedURLException) (obj3)).toString());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_482;
        }
        ((InputStream) (obj)).close();
        if (obj2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((FileOutputStream) (obj2)).close();
        if (obj1 == null) goto _L11; else goto _L10
_L10:
        try
        {
            ((HttpURLConnection) (obj1)).disconnect();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            g.b("DownloadMainLite", ((IOException) (obj)).toString());
        }
        d.a(a, 5, ((IOException) (obj)).toString());
        return;
_L9:
        obj11 = obj2;
        obj12 = obj;
        obj4 = obj1;
        d.a(a, (int)(((float)i * 100F) / (float)k));
        obj11 = obj2;
        obj12 = obj;
        obj4 = obj1;
        d.a(a, 2, null);
          goto _L12
        obj;
        g.b("DownloadMainLite", ((IOException) (obj)).toString());
        d.a(a, 5, ((IOException) (obj)).toString());
        return;
        obj2;
        obj = null;
        obj1 = null;
_L18:
        obj12 = obj3;
        obj11 = obj;
        obj4 = obj1;
        g.b("DownloadMainLite", ((IOException) (obj2)).toString());
        obj12 = obj3;
        obj11 = obj;
        obj4 = obj1;
        d.a(a, 5, ((IOException) (obj2)).toString());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_648;
        }
        ((InputStream) (obj)).close();
        if (obj3 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((FileOutputStream) (obj3)).close();
        if (obj1 == null) goto _L11; else goto _L13
_L13:
        try
        {
            ((HttpURLConnection) (obj1)).disconnect();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            g.b("DownloadMainLite", ((IOException) (obj)).toString());
        }
        d.a(a, 5, ((IOException) (obj)).toString());
        return;
        obj2;
        obj = null;
        obj1 = null;
        obj3 = obj4;
_L17:
        obj12 = obj3;
        obj11 = obj;
        obj4 = obj1;
        g.b("DownloadMainLite", ((Exception) (obj2)).toString());
        obj12 = obj3;
        obj11 = obj;
        obj4 = obj1;
        d.a(a, 5, ((Exception) (obj2)).toString());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_748;
        }
        ((InputStream) (obj)).close();
        if (obj3 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((FileOutputStream) (obj3)).close();
        if (obj1 == null) goto _L11; else goto _L14
_L14:
        try
        {
            ((HttpURLConnection) (obj1)).disconnect();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            g.b("DownloadMainLite", ((IOException) (obj)).toString());
        }
        d.a(a, 5, ((IOException) (obj)).toString());
        return;
        obj2;
        obj = null;
        obj1 = null;
        obj3 = obj12;
_L16:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_807;
        }
        ((InputStream) (obj)).close();
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_817;
        }
        ((FileOutputStream) (obj3)).close();
        if (obj1 != null)
        {
            try
            {
                ((HttpURLConnection) (obj1)).disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                g.b("DownloadMainLite", ((IOException) (obj)).toString());
                d.a(a, 5, ((IOException) (obj)).toString());
            }
        }
        throw obj2;
        obj2;
        obj4 = null;
        obj1 = obj;
        obj3 = obj12;
        obj = obj4;
        continue; /* Loop/switch isn't completed */
        obj2;
        obj4 = obj;
        obj = null;
        obj3 = obj1;
        obj1 = obj4;
        continue; /* Loop/switch isn't completed */
        obj4;
        obj3 = obj2;
        obj2 = obj4;
        continue; /* Loop/switch isn't completed */
        obj4;
        obj3 = obj2;
        obj2 = obj4;
        continue; /* Loop/switch isn't completed */
        obj2;
        obj = obj12;
        obj3 = obj11;
        obj1 = obj4;
        continue; /* Loop/switch isn't completed */
        obj2;
        obj3 = obj12;
        obj = obj11;
        obj1 = obj4;
        if (true) goto _L16; else goto _L15
_L15:
        obj2;
        obj11 = null;
        obj1 = obj;
        obj3 = obj4;
        obj = obj11;
          goto _L17
        obj2;
        Object obj5 = obj;
        obj = null;
        obj3 = obj1;
        obj1 = obj5;
          goto _L17
        Object obj6;
        obj6;
        obj3 = obj2;
        obj2 = obj6;
          goto _L17
        obj6;
        obj3 = obj2;
        obj2 = obj6;
          goto _L17
        obj6;
        obj3 = obj2;
        obj2 = obj6;
          goto _L17
        obj2;
        Object obj7 = null;
        obj1 = obj;
        obj = obj7;
          goto _L18
        obj2;
        Object obj8 = obj;
        obj = null;
        obj3 = obj1;
        obj1 = obj8;
          goto _L18
        obj8;
        obj3 = obj2;
        obj2 = obj8;
          goto _L18
        obj8;
        obj3 = obj2;
        obj2 = obj8;
          goto _L18
        obj8;
        obj3 = obj2;
        obj2 = obj8;
          goto _L18
        obj3;
        obj2 = null;
        obj1 = null;
        obj = obj11;
          goto _L19
        obj3;
        obj1 = obj;
        obj2 = null;
        obj = obj11;
          goto _L19
        obj3;
        Object obj9 = obj;
        obj2 = obj1;
        obj = obj11;
        obj1 = obj9;
          goto _L19
        obj3;
          goto _L19
        obj3;
          goto _L19
        obj9;
        obj2 = obj3;
        obj3 = obj9;
          goto _L20
        Exception exception;
        exception;
        obj1 = obj3;
        Object obj10 = obj2;
        obj3 = exception;
        obj2 = obj1;
        obj1 = obj10;
          goto _L20
        obj3;
          goto _L20
    }
}
