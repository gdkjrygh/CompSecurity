// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.cm.kinfoc:
//            c, i, b, d, 
//            ag, k

public final class j
    implements c
{

    private ThreadPoolExecutor a;

    public j()
    {
        a = new ThreadPoolExecutor(1, 5, 60000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    public static boolean b(i l, String s, d d1)
    {
        boolean flag;
        flag = true;
        boolean flag1 = false;
        Object obj = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj)), 60000);
        Object obj1 = new DefaultHttpClient(((org.apache.http.params.HttpParams) (obj)));
        Object obj2 = new HttpPost(s);
        Object obj4 = null;
        Object obj3 = null;
        obj = obj3;
        String s1 = obj4;
        BufferedReader bufferedreader;
        String s2;
        int i1;
        int j1;
        try
        {
            ((HttpPost) (obj2)).setEntity(new ByteArrayEntity(l.a()));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            flag = flag1;
            s = ((String) (obj));
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            flag = flag1;
            s = s1;
            continue; /* Loop/switch isn't completed */
        }
        obj = obj3;
        s1 = obj4;
        bufferedreader = new BufferedReader(new InputStreamReader(((HttpClient) (obj1)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj2))).getEntity().getContent()));
        obj1 = "";
        i1 = 0;
_L2:
        obj = obj3;
        s1 = obj4;
        s2 = bufferedreader.readLine();
        obj2 = obj1;
        if (s2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj3;
        s1 = obj4;
        obj1 = (new StringBuilder()).append(((String) (obj1))).append(s2).toString();
        obj = obj3;
        s1 = obj4;
        obj2 = (new StringBuilder()).append(((String) (obj1))).append("\r\n").toString();
        j1 = i1 + 1;
        obj1 = obj2;
        i1 = j1;
        if (j1 <= 4) goto _L2; else goto _L1
_L1:
        obj = obj3;
        s1 = obj4;
        (new StringBuilder()).append(((String) (obj2))).append(", at ").append(s);
        obj = obj3;
        s1 = obj4;
        s = com.cm.kinfoc.b.a(((String) (obj2)));
        if (s == null) goto _L4; else goto _L3
_L3:
        obj = s;
        s1 = s;
        i1 = ((b) (s)).b;
        if (i1 == 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (!i1) goto _L4; else goto _L5
_L5:
label0:
        {
            if (d1 != null)
            {
                if (!flag)
                {
                    break label0;
                }
                d1.a(((b) (s)).a, l);
            }
            return flag;
        }
        d1.a(l);
        return flag;
_L4:
        flag = false;
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final void a(i l, String s, d d1)
    {
        if (l.g() < 0 || l.g() >= 2)
        {
            throw new RuntimeException("server priority is out of range");
        }
        boolean flag = ag.a;
        l = new k(this, l, s, d1, (byte)0);
        if (a == null)
        {
            l.start();
            return;
        } else
        {
            a.submit(l);
            return;
        }
    }
}
