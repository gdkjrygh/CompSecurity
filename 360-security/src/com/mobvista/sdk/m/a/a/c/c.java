// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.a.c;

import android.os.Handler;
import android.os.Message;
import com.mobvista.sdk.m.a.b.a.a;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.http.conn.ConnectTimeoutException;

// Referenced classes of package com.mobvista.sdk.m.a.a.c:
//            a

final class c extends com.mobvista.sdk.m.a.e.c
{

    final int a;
    final com.mobvista.sdk.m.a.a.c.a b;

    c(com.mobvista.sdk.m.a.a.c.a a1, int i)
    {
        b = a1;
        a = i;
        super();
    }

    public final void a()
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        obj2 = null;
        obj1 = null;
        obj3 = null;
        obj = obj1;
        Object obj4 = b.b.obtainMessage(101);
        obj = obj1;
        obj4.arg1 = a;
        obj = obj1;
        ((Message) (obj4)).sendToTarget();
        obj = obj1;
        obj4 = b.a();
        obj = obj1;
        com.mobvista.sdk.m.a.b.a.a.a(1, "fw.data.http.loader", (new StringBuilder("REQUEST URL: ")).append(((String) (obj4))).toString());
        obj = obj1;
        obj1 = (HttpURLConnection)(new URL(((String) (obj4)))).openConnection();
        obj = b;
        obj = b;
        if (!b.a) goto _L2; else goto _L1
_L1:
        obj = b.b.obtainMessage(114);
        obj.arg1 = a;
        ((Message) (obj)).sendToTarget();
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
        }
_L4:
        return;
_L2:
        int i;
        ((HttpURLConnection) (obj1)).setConnectTimeout(20000);
        ((HttpURLConnection) (obj1)).connect();
        i = ((HttpURLConnection) (obj1)).getResponseCode();
        obj = b;
        if (i == 200)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        obj = b.b.obtainMessage(111);
        obj.arg1 = a;
        obj.obj = (new StringBuilder("http respond status code is ")).append(i).toString();
        ((Message) (obj)).sendToTarget();
        com.mobvista.sdk.m.a.b.a.a.d("fw.data.http.loader", (new StringBuilder("http respond status code is ")).append(i).append(" ! url=").append(((String) (obj4))).toString());
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        ((HttpURLConnection) (obj1)).disconnect();
        return;
        if (!b.a)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        obj = b.b.obtainMessage(114);
        obj.arg1 = a;
        ((Message) (obj)).sendToTarget();
        if (obj1 == null) goto _L4; else goto _L5
_L5:
        ((HttpURLConnection) (obj1)).disconnect();
        return;
        obj = ((HttpURLConnection) (obj1)).getInputStream();
        obj2 = new ByteArrayOutputStream();
        obj3 = new byte[1024];
_L8:
        i = ((InputStream) (obj)).read(((byte []) (obj3)));
        if (i == -1) goto _L7; else goto _L6
_L6:
        ((ByteArrayOutputStream) (obj2)).write(((byte []) (obj3)), 0, i);
          goto _L8
        obj2;
_L15:
        obj = obj1;
        ((ConnectTimeoutException) (obj2)).printStackTrace();
        obj = obj1;
        obj3 = b.b.obtainMessage(110);
        obj = obj1;
        obj3.arg1 = a;
        obj = obj1;
        ((Message) (obj3)).sendToTarget();
        obj = obj1;
        com.mobvista.sdk.m.a.b.a.a.d("fw.data.http.loader", (new StringBuilder("http connect time out ! ")).append(((ConnectTimeoutException) (obj2)).toString()).toString());
        if (obj1 == null) goto _L4; else goto _L9
_L9:
        ((HttpURLConnection) (obj1)).disconnect();
        return;
_L7:
        obj = b.a(((HttpURLConnection) (obj1)).getHeaderFields(), ((ByteArrayOutputStream) (obj2)).toByteArray());
        obj2 = b.b.obtainMessage(100);
        obj2.obj = obj;
        obj2.arg1 = a;
        ((Message) (obj2)).sendToTarget();
        if (obj1 == null) goto _L4; else goto _L10
_L10:
        ((HttpURLConnection) (obj1)).disconnect();
        return;
        obj;
        obj1 = obj2;
        obj2 = obj;
_L14:
        obj = obj1;
        ((Exception) (obj2)).printStackTrace();
        obj = obj1;
        obj3 = b.b.obtainMessage(111);
        obj = obj1;
        obj3.arg1 = a;
        obj = obj1;
        obj3.obj = ((Exception) (obj2)).getLocalizedMessage();
        obj = obj1;
        ((Message) (obj3)).sendToTarget();
        obj = obj1;
        com.mobvista.sdk.m.a.b.a.a.d("fw.data.http.loader", (new StringBuilder("http error ! ")).append(((Exception) (obj2)).toString()).toString());
        if (obj1 == null) goto _L4; else goto _L11
_L11:
        ((HttpURLConnection) (obj1)).disconnect();
        return;
        obj2;
        obj1 = obj;
        obj = obj2;
_L13:
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
        }
        throw obj;
        obj;
        if (true) goto _L13; else goto _L12
_L12:
        obj2;
          goto _L14
        obj2;
        obj1 = obj3;
          goto _L15
    }
}
