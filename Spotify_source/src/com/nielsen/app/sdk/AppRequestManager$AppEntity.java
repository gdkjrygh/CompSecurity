// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

// Referenced classes of package com.nielsen.app.sdk:
//            h, c, AppRequestManager

class c
    implements HttpEntity
{

    final AppRequestManager a;
    private int b[];
    private String c[];
    private String d;
    private BlockingQueue e;
    private int f;

    static String[] a(c c1)
    {
        return c1.c;
    }

    static int[] b(c c1)
    {
        return c1.b;
    }

    static BlockingQueue c(b b1)
    {
        return b1.e;
    }

    static int d(e e1)
    {
        return e1.f;
    }

    static String e(f f1)
    {
        return f1.d;
    }

    public void consumeContent()
    {
    }

    public InputStream getContent()
    {
        return null;
    }

    public Header getContentEncoding()
    {
        return null;
    }

    public long getContentLength()
    {
        return 0L;
    }

    public Header getContentType()
    {
        return null;
    }

    public boolean isChunked()
    {
        return false;
    }

    public boolean isRepeatable()
    {
        return false;
    }

    public boolean isStreaming()
    {
        return false;
    }

    public void writeTo(OutputStream outputstream)
    {
    }

    public (AppRequestManager apprequestmanager, String s, int i, BlockingQueue blockingqueue, List list)
    {
        a = apprequestmanager;
        super();
        b = null;
        c = null;
        d = "";
        e = null;
        f = 0;
        int j;
        f = i;
        d = s;
        e = blockingqueue;
        j = list.size();
        b = new int[j];
        c = new String[j];
        i = 0;
_L7:
        if (i >= j) goto _L2; else goto _L1
_L1:
        int k;
        blockingqueue = (c)list.get(i);
        k = blockingqueue.c();
        s = blockingqueue.c();
        blockingqueue = blockingqueue.c();
        k;
        JVM INSTR tableswitch 1 2: default 273
    //                   1 225
    //                   2 225;
           goto _L3 _L4 _L4
_L3:
        if (e != null)
        {
            long l = h.g();
            s = (new StringBuilder("Ignoring part <name, value> = <")).append(blockingqueue).append(", ").append(s).append("> on a HTTP POST multipart request").toString();
            s = new e(apprequestmanager, 3, f, d, l, 0L, 0L, s, null);
            e.put(s);
        }
          goto _L5
_L4:
        s = new File(s);
        b[i] = (int)s.length();
        c[i] = s.getName();
          goto _L5
        apprequestmanager;
        com.nielsen.app.sdk.c.a(apprequestmanager, true, 'E', "Failed to instantiate the App SDK entity object", new Object[0]);
_L2:
        return;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
