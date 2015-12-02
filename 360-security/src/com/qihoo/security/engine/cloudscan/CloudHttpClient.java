// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.cloudscan;

import android.content.Context;
import com.qihoo.security.services.ScanEngineService;
import com.qihoo360.common.e.a;
import com.qihoo360.common.e.c;
import com.qihoo360.common.utils.FileUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.a.b;
import org.apache.http.entity.mime.a.e;
import org.apache.http.entity.mime.f;

// Referenced classes of package com.qihoo.security.engine.cloudscan:
//            ICloudHttpClient

public class CloudHttpClient
    implements ICloudHttpClient
{

    final Context a;
    HttpClient b;
    HttpPost c;

    public CloudHttpClient(Context context)
    {
        b = null;
        c = null;
        a = context;
    }

    public boolean Cancel()
    {
        if (c != null)
        {
            c.abort();
            c = null;
        }
        if (b != null)
        {
            b.getConnectionManager().shutdown();
        }
        return true;
    }

    public byte[] RequestCallback(String s, String s1, byte abyte0[], int i, int ai[])
    {
        b = com.qihoo360.common.e.a.a(com.qihoo360.common.e.c.a(a), i, i * 6);
        c = new HttpPost(s);
        if (s1 != null) goto _L2; else goto _L1
_L1:
        s = com.qihoo360.common.e.a.a(b, c, "application/octet-stream", abyte0, ai);
_L4:
        ScanEngineService.c.addAndGet(abyte0.length);
        if (s != null)
        {
            String as[];
            Object obj;
            try
            {
                s1 = new ByteArrayOutputStream(1024);
                FileUtil.copyStream(s, s1);
                s1 = s1.toByteArray();
                ScanEngineService.d.addAndGet(s1.length);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                try
                {
                    s.close();
                }
                // Misplaced declaration of an exception variable
                catch (String s) { }
                b.getConnectionManager().shutdown();
                b = null;
                c = null;
                return null;
            }
            finally { }
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            b.getConnectionManager().shutdown();
            b = null;
            c = null;
            return s1;
        } else
        {
            return null;
        }
_L2:
        s = new f(HttpMultipartMode.BROWSER_COMPATIBLE);
        s1 = s1.split("\n");
        s.a(s1[0], new b(abyte0, "application/octet-stream", null));
        i = 1;
        do
        {
            if (i >= s1.length)
            {
                s = com.qihoo360.common.e.a.a(b, c, s, ai);
                continue; /* Loop/switch isn't completed */
            }
            as = s1[i].split("=", 2);
            if (as.length != 2)
            {
                return null;
            }
            obj = new File(as[1]);
            if (((File) (obj)).isFile())
            {
                obj = new e(((File) (obj)), String.format("analysis_%03d.dat", new Object[] {
                    Integer.valueOf(i)
                }), "application/octet-stream", null);
                s.a(as[0], ((org.apache.http.entity.mime.a.c) (obj)));
            }
            i++;
        } while (true);
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        b.getConnectionManager().shutdown();
        b = null;
        c = null;
        throw s1;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
