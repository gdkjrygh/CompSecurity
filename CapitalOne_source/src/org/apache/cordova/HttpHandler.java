// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class HttpHandler
{

    public HttpHandler()
    {
    }

    private HttpEntity getHttpEntity(String s)
    {
        try
        {
            s = (new DefaultHttpClient()).execute(new HttpGet(s)).getEntity();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    private void writeToDisk(HttpEntity httpentity, String s)
        throws IllegalStateException, IOException
    {
        s = (new StringBuilder()).append("/sdcard/").append(s).toString();
        httpentity = httpentity.getContent();
        byte abyte0[] = new byte[1024];
        s = new FileOutputStream(s);
        do
        {
            int i = httpentity.read(abyte0);
            if (i <= 0)
            {
                s.flush();
                s.close();
                return;
            }
            s.write(abyte0, 0, i);
        } while (true);
    }

    protected Boolean get(String s, String s1)
    {
        s = getHttpEntity(s);
        try
        {
            writeToDisk(s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return Boolean.valueOf(false);
        }
        try
        {
            s.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(true);
    }
}
