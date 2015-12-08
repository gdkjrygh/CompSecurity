// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import com.soundcloud.java.strings.Charsets;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.json.JSONException;
import org.json.JSONObject;

public final class Http
{

    private Http()
    {
    }

    public static JSONObject getJSON(HttpResponse httpresponse)
        throws IOException
    {
        String s = getString(httpresponse);
        if (s == null || s.length() == 0)
        {
            throw new IOException("JSON response is empty");
        }
        try
        {
            httpresponse = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            StringBuilder stringbuilder = (new StringBuilder("could not parse JSON document: ")).append(httpresponse.getMessage()).append(" ");
            httpresponse = s;
            if (s.length() > 80)
            {
                httpresponse = (new StringBuilder()).append(s.substring(0, 79)).append("...").toString();
            }
            throw new IOException(stringbuilder.append(httpresponse).toString());
        }
        return httpresponse;
    }

    public static String getString(HttpResponse httpresponse)
        throws IOException
    {
        byte abyte0[] = null;
        InputStream inputstream = httpresponse.getEntity().getContent();
        if (inputstream == null)
        {
            return null;
        }
        int i;
        try
        {
            httpresponse = httpresponse.getFirstHeader("Content-Length");
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            httpresponse = abyte0;
        }
        if (httpresponse == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        i = Integer.parseInt(httpresponse.getValue());
_L1:
        httpresponse = new StringBuilder(i);
        abyte0 = new byte[8192];
        do
        {
            i = inputstream.read(abyte0);
            if (i != -1)
            {
                httpresponse.append(new String(abyte0, 0, i, Charsets.UTF_8));
            } else
            {
                return httpresponse.toString();
            }
        } while (true);
        httpresponse;
        i = 8192;
          goto _L1
    }
}
