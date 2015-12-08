// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.nielsen.app.sdk:
//            a, c, h, AppRequestManager

public class andler.getQueue
    implements Runnable
{

    long a;
    long b;
    h c;
    final AppRequestManager d;
    private BlockingQueue e;
    private HttpClient f;
    private int g;
    private int h;
    private int i;
    private List j;
    private String k;
    private String l;
    private String m;
    private int n;

    private void a(String s)
    {
        if (e != null)
        {
            long l1 = com.nielsen.app.sdk.h.g();
            andler.getQueue getqueue = new e(d, 1, n, l, l1, 0L, 0L, null, null);
            e.put(getqueue);
        }
        f = new init>(d, g, h, i);
        n;
        JVM INSTR tableswitch 1 4: default 108
    //                   1 118
    //                   2 259
    //                   3 165
    //                   4 353;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new Exception("Invalid HTTP request type received");
_L2:
        HttpGet httpget = new HttpGet(m);
        if (s != null && !s.isEmpty())
        {
            httpget.setHeader("User-Agent", s);
        }
        s = f.execute(httpget);
_L7:
        a(((HttpResponse) (s)));
        return;
_L4:
        HttpPost httppost = new HttpPost(m);
        if (s != null && !s.isEmpty())
        {
            httppost.setHeader("User-Agent", s);
        }
        if (j != null && j.size() > 0)
        {
            httppost.setEntity(new init>(d, l, n, e, j));
        }
        s = f.execute(httppost);
        continue; /* Loop/switch isn't completed */
_L3:
        HttpPut httpput = new HttpPut(m);
        if (s != null && !s.isEmpty())
        {
            httpput.setHeader("User-Agent", s);
        }
        if (j != null && j.size() > 0)
        {
            httpput.setEntity(new init>(d, l, n, e, j));
        }
        s = f.execute(httpput);
        continue; /* Loop/switch isn't completed */
_L5:
        HttpDelete httpdelete = new HttpDelete(m);
        if (s != null && !s.isEmpty())
        {
            httpdelete.setHeader("User-Agent", s);
        }
        s = f.execute(httpdelete);
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void a(String s, int i1, String s1, List list)
    {
        m = s1;
        j = list;
        n = i1;
        k = s;
        if (e != null)
        {
            long l1 = com.nielsen.app.sdk.h.g();
            s = new e(d, 0, i1, l, l1, 0L, 0L, "", null);
            e.put(s);
        }
        AppRequestManager.a().a(this);
    }

    private void a(HttpResponse httpresponse)
    {
        if (httpresponse == null)
        {
            throw new Exception("There was no response oject on the Nielsen server response");
        }
        Object obj = httpresponse.getStatusLine();
        Object obj1 = ((StatusLine) (obj)).getProtocolVersion();
        String s = ((ProtocolVersion) (obj1)).getProtocol();
        int i1 = ((ProtocolVersion) (obj1)).getMajor();
        int j1 = ((ProtocolVersion) (obj1)).getMinor();
        obj1 = ((StatusLine) (obj)).getReasonPhrase();
        int k1 = ((StatusLine) (obj)).getStatusCode();
        if (k1 != 200 && k1 != 201)
        {
            throw new Exception((new StringBuilder("Request failed. Reason(")).append(((String) (obj1))).append(") Code(").append(String.valueOf(k1)).append(") Protocol(").append(s).append(") Version(").append(String.valueOf(i1)).append(".").append(String.valueOf(j1)).append(")").toString());
        }
        obj = (new StringBuilder("Request executed. Reason(")).append(((String) (obj1))).append(") Code(").append(String.valueOf(k1)).append(") Protocol(").append(s).append(") Version(").append(String.valueOf(i1)).append(".").append(String.valueOf(j1)).append(")").toString();
        if (e != null)
        {
            long l1 = com.nielsen.app.sdk.h.g();
            obj = new e(d, 3, n, l, l1, 0L, 0L, ((String) (obj)), null);
            e.put(obj);
        }
        httpresponse = httpresponse.getEntity();
        if (httpresponse == null)
        {
            throw new Exception("There was no data on the Nielsen server response");
        }
        byte abyte0[] = EntityUtils.toByteArray(httpresponse);
        long l2 = abyte0.length;
        if (l2 < 0L)
        {
            httpresponse.consumeContent();
            throw new Exception(String.format("Client received an invalid response. Check if it has permition for the connection used. Content received length = %d", new Object[] {
                Long.valueOf(l2)
            }));
        }
        if (l2 > 0L)
        {
            httpresponse = new String(abyte0);
        } else
        {
            httpresponse = "";
        }
        if (httpresponse.contains("<br>"))
        {
            httpresponse.replaceAll("<br>", System.getProperty("line.separator"));
        }
        if (e != null)
        {
            long l3 = com.nielsen.app.sdk.h.g();
            httpresponse = new e(d, 4, n, l, l3, 0L, 0L, httpresponse, null);
            e.put(httpresponse);
        }
        n = 0;
    }

    public void delete(String s, String s1)
    {
        a(s, 4, s1, null);
    }

    public void get(String s, String s1)
    {
        a(s, 1, s1, null);
    }

    public void post(String s, String s1)
    {
        post(s, s1, null);
    }

    public void post(String s, String s1, List list)
    {
        a(s, 3, s1, list);
    }

    public void put(String s, String s1, List list)
    {
        a(s, 2, s1, list);
    }

    public void run()
    {
        a(k);
        if (f != null)
        {
            ClientConnectionManager clientconnectionmanager = f.getConnectionManager();
            if (clientconnectionmanager != null)
            {
                clientconnectionmanager.shutdown();
            }
        }
        AppRequestManager.a(AppRequestManager.a(), this);
        return;
        Object obj;
        obj;
        BlockingQueue blockingqueue = e;
        if (blockingqueue == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        long l1 = com.nielsen.app.sdk.h.g();
        a a1 = new e(d, 2, n, l, l1, 0L, 0L, "", ((Exception) (obj)));
        e.put(a1);
_L2:
        if (f != null)
        {
            ClientConnectionManager clientconnectionmanager1 = f.getConnectionManager();
            if (clientconnectionmanager1 != null)
            {
                clientconnectionmanager1.shutdown();
            }
        }
        AppRequestManager.a(AppRequestManager.a(), this);
        return;
        clientconnectionmanager1;
        com.nielsen.app.sdk.c.a(clientconnectionmanager1, true, 9, 'E', "Thread (%s) interrupted", new Object[] {
            l
        });
        if (true) goto _L2; else goto _L1
_L1:
        clientconnectionmanager1;
        if (f != null)
        {
            ClientConnectionManager clientconnectionmanager3 = f.getConnectionManager();
            if (clientconnectionmanager3 != null)
            {
                clientconnectionmanager3.shutdown();
            }
        }
        AppRequestManager.a(AppRequestManager.a(), this);
        throw clientconnectionmanager1;
        clientconnectionmanager1;
        com.nielsen.app.sdk.c.a(clientconnectionmanager1, true, 9, 'E', "Thread (%s) out of memory", new Object[] {
            l
        });
        if (f != null)
        {
            ClientConnectionManager clientconnectionmanager2 = f.getConnectionManager();
            if (clientconnectionmanager2 != null)
            {
                clientconnectionmanager2.shutdown();
            }
        }
        AppRequestManager.a(AppRequestManager.a(), this);
        return;
    }

    public void runSynchronously(String s)
    {
        a(s);
    }

    public andler(AppRequestManager apprequestmanager, String s, andler andler, int i1, int j1, int k1)
    {
        d = apprequestmanager;
        super();
        e = null;
        f = null;
        g = 0;
        h = 0;
        i = 0;
        j = null;
        k = "";
        l = "";
        m = "";
        n = 0;
        a = 0L;
        b = 0L;
        c = null;
        try
        {
            g = i1;
            h = j1;
            l = s;
            i = k1;
            c = com.nielsen.app.sdk.a.m();
            e = andler.getQueue();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AppRequestManager apprequestmanager)
        {
            com.nielsen.app.sdk.c.a(apprequestmanager, true, 9, 'E', "Failed to instantiate the meter request object", new Object[0]);
        }
    }
}
