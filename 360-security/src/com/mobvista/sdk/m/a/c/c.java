// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.c;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mobvista.sdk.m.a.b.a.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.http.conn.ConnectTimeoutException;

// Referenced classes of package com.mobvista.sdk.m.a.c:
//            a

final class c extends com.mobvista.sdk.m.a.e.c
{

    final com.mobvista.sdk.m.a.c.a a;

    c(com.mobvista.sdk.m.a.c.a a1)
    {
        a = a1;
        super();
    }

    public final void a()
    {
        Object obj;
        Object obj1;
        Object obj3;
        Object obj4;
        Object obj5;
        FileOutputStream fileoutputstream;
        long l;
        l = 0L;
        obj5 = null;
        fileoutputstream = null;
        obj1 = null;
        obj3 = obj1;
        obj4 = obj5;
        obj = fileoutputstream;
        if (TextUtils.isEmpty(com.mobvista.sdk.m.a.c.a.c(a)))
        {
            return;
        }
        obj3 = obj1;
        obj4 = obj5;
        obj = fileoutputstream;
        Object obj6 = new URL(com.mobvista.sdk.m.a.c.a.c(a));
        obj3 = obj1;
        obj4 = obj5;
        obj = fileoutputstream;
        com.mobvista.sdk.m.a.b.a.a.a("loader", (new StringBuilder("REQUEST URL: ")).append(com.mobvista.sdk.m.a.c.a.c(a)).toString());
        obj3 = obj1;
        obj4 = obj5;
        obj = fileoutputstream;
        File file = new File(com.mobvista.sdk.m.a.c.a.d(a));
        obj3 = obj1;
        obj4 = obj5;
        obj = fileoutputstream;
        if (file.exists())
        {
            break MISSING_BLOCK_LABEL_152;
        }
        obj3 = obj1;
        obj4 = obj5;
        obj = fileoutputstream;
        file.mkdirs();
        obj3 = obj1;
        obj4 = obj5;
        obj = fileoutputstream;
        file = new File((new StringBuilder()).append(com.mobvista.sdk.m.a.c.a.d(a)).append(com.mobvista.sdk.m.a.c.a.e(a)).toString());
        obj3 = obj1;
        obj4 = obj5;
        obj = fileoutputstream;
        long l1 = file.length();
        obj3 = obj1;
        obj4 = obj5;
        obj = fileoutputstream;
        com.mobvista.sdk.m.a.b.a.a.a("loader", (new StringBuilder("Start download........ local File: ")).append(file.getAbsolutePath()).append("   ").append(l1).toString());
        obj3 = obj1;
        obj4 = obj5;
        obj = fileoutputstream;
        obj1 = (HttpURLConnection)((URL) (obj6)).openConnection();
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        ((HttpURLConnection) (obj1)).setConnectTimeout(20000);
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        ((HttpURLConnection) (obj1)).connect();
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        if (((HttpURLConnection) (obj1)).getResponseCode() < 400)
        {
            break MISSING_BLOCK_LABEL_393;
        }
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        com.mobvista.sdk.m.a.c.a.f(a).obtainMessage(112).sendToTarget();
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        com.mobvista.sdk.m.a.b.a.a.c("loader", (new StringBuilder("[Status Code: ")).append(((HttpURLConnection) (obj1)).getResponseCode()).append("] in download: ").append(com.mobvista.sdk.m.a.c.a.c(a)).toString());
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        long l3 = Long.parseLong(((HttpURLConnection) (obj1)).getHeaderField("Content-Length"));
        if (l3 != l1) goto _L2; else goto _L1
_L1:
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        com.mobvista.sdk.m.a.c.a.f(a).obtainMessage(100).sendToTarget();
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
            return;
        }
          goto _L3
_L2:
        obj = obj1;
        if (l3 <= l1)
        {
            break MISSING_BLOCK_LABEL_568;
        }
        obj = obj1;
        if (l1 == 0L)
        {
            break MISSING_BLOCK_LABEL_568;
        }
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        ((HttpURLConnection) (obj1)).disconnect();
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj = (HttpURLConnection)((URL) (obj6)).openConnection();
        obj3 = obj;
        obj4 = obj;
        obj5 = obj;
        ((HttpURLConnection) (obj)).setConnectTimeout(20000);
        obj3 = obj;
        obj4 = obj;
        obj5 = obj;
        ((HttpURLConnection) (obj)).setRequestProperty("RANGE", (new StringBuilder("bytes=")).append(l1).append("-").append(l3).toString());
        obj3 = obj;
        obj4 = obj;
        obj5 = obj;
        ((HttpURLConnection) (obj)).connect();
        obj1 = obj;
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        int i = ((HttpURLConnection) (obj1)).getResponseCode();
        if (i == 200 || i == 206) goto _L5; else goto _L4
_L4:
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        com.mobvista.sdk.m.a.c.a.f(a).obtainMessage(112).sendToTarget();
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        com.mobvista.sdk.m.a.b.a.a.c("loader", (new StringBuilder("Error: [")).append(i).append("]  in download: ").append(com.mobvista.sdk.m.a.c.a.c(a)).toString());
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
            return;
        }
          goto _L3
_L5:
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        obj5 = ((HttpURLConnection) (obj1)).getInputStream();
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        fileoutputstream = new FileOutputStream(file, true);
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        byte abyte0[] = new byte[2048];
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        l1 = System.currentTimeMillis();
_L9:
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        i = ((InputStream) (obj5)).read(abyte0);
        if (i == -1) goto _L7; else goto _L6
_L6:
        long l2;
        l2 = l + (long)i;
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        fileoutputstream.write(abyte0, 0, i);
        l = l2;
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        if (System.currentTimeMillis() - l1 <= 2000L) goto _L9; else goto _L8
_L8:
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        i = (int)((100L * l2) / l3);
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        l1 = System.currentTimeMillis();
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        obj6 = com.mobvista.sdk.m.a.c.a.f(a).obtainMessage(101);
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        obj6.arg1 = i;
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        ((Message) (obj6)).sendToTarget();
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        com.mobvista.sdk.m.a.b.a.a.a((new StringBuilder("downloading........ ")).append(i).append("%").toString());
        l = l2;
          goto _L9
        obj1;
_L14:
        obj = obj3;
        com.mobvista.sdk.m.a.c.a.f(a).obtainMessage(110).sendToTarget();
        obj = obj3;
        ((ConnectTimeoutException) (obj1)).printStackTrace();
        if (obj3 != null)
        {
            ((HttpURLConnection) (obj3)).disconnect();
            return;
        }
        break; /* Loop/switch isn't completed */
_L7:
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        ((InputStream) (obj5)).close();
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        fileoutputstream.flush();
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        fileoutputstream.close();
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        obj5 = com.mobvista.sdk.m.a.c.a.f(a).obtainMessage(101);
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        obj5.arg1 = 100;
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        ((Message) (obj5)).sendToTarget();
        obj3 = obj1;
        obj4 = obj1;
        obj = obj1;
        com.mobvista.sdk.m.a.c.a.f(a).obtainMessage(100).sendToTarget();
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
            return;
        }
        break; /* Loop/switch isn't completed */
        Object obj2;
        obj2;
_L13:
        obj = obj4;
        com.mobvista.sdk.m.a.c.a.f(a).obtainMessage(111).sendToTarget();
        obj = obj4;
        ((Exception) (obj2)).printStackTrace();
        if (obj4 != null)
        {
            ((HttpURLConnection) (obj4)).disconnect();
            return;
        }
        break; /* Loop/switch isn't completed */
        obj2;
        obj3 = obj;
        obj = obj2;
_L11:
        if (obj3 != null)
        {
            ((HttpURLConnection) (obj3)).disconnect();
        }
        throw obj;
        obj;
        if (true) goto _L11; else goto _L10
_L10:
        obj2;
        if (true) goto _L13; else goto _L12
_L12:
        obj2;
        obj3 = obj5;
        if (true) goto _L14; else goto _L3
_L3:
    }
}
