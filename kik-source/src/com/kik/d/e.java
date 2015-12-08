// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.d;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.c.b;
import org.c.c;

class e
    implements Runnable
{

    private final String a;
    private final File b;
    private final b c = org.c.c.a(com/kik/d/e);
    private volatile int d;
    private volatile int e;

    public e(String s, File file)
    {
        d = 0;
        e = 0;
        a = s;
        b = file;
    }

    private int a(File file)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        FileInputStream fileinputstream = new FileInputStream(file);
        HttpURLConnection httpurlconnection;
        int i;
        try
        {
            httpurlconnection = (HttpURLConnection)(new URL(a)).openConnection();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            file = fileinputstream;
            httpurlconnection = obj;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            httpurlconnection = obj1;
        }
        httpurlconnection.setRequestMethod("POST");
        httpurlconnection.setRequestProperty("Content-Type", "application/x-protobuf");
        httpurlconnection.setDoOutput(true);
        httpurlconnection.connect();
        org.a.a.a.c.a(fileinputstream, httpurlconnection.getOutputStream());
        i = httpurlconnection.getResponseCode();
        org.a.a.a.c.a(fileinputstream);
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
        if (i == 200)
        {
            if (!file.delete())
            {
                c.a("Failed to delete uploadedfile");
                return i;
            }
        } else
        if (i >= 400 && i < 500)
        {
            if (!file.delete())
            {
                c.a("Failed to delete uploaded file");
                return i;
            }
        } else
        {
            c.a((new StringBuilder("Upload failed with code: ")).append(i).toString());
            return i;
        }
          goto _L1
        file;
        file = null;
        httpurlconnection = obj;
_L4:
        org.a.a.a.c.a(file);
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
        c.a("Upload failed with code: -1");
        return -1;
        file;
        fileinputstream = null;
        httpurlconnection = obj1;
_L3:
        org.a.a.a.c.a(fileinputstream);
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
        c.a("Upload failed with code: -1");
        throw file;
        file;
        if (true) goto _L3; else goto _L2
_L2:
        file;
        file = fileinputstream;
        if (true) goto _L4; else goto _L1
_L1:
        return i;
    }

    public void run()
    {
        String as[] = b.list();
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String s = as[i];
            if (a(new File(b, s)) == 200)
            {
                d = d + 1;
            } else
            {
                e = e + 1;
            }
            i++;
        }
    }
}
