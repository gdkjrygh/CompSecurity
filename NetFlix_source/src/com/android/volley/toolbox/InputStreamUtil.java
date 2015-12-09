// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.VolleyLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamUtil
{

    private InputStreamUtil()
    {
    }

    public static String convertStreamToString(InputStream inputstream)
    {
        StringBuilder stringbuilder;
        BufferedReader bufferedreader;
        bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
        stringbuilder = new StringBuilder();
_L1:
        String s = bufferedreader.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        stringbuilder.append((new StringBuilder()).append(s).append("\n").toString());
          goto _L1
        IOException ioexception;
        ioexception;
        VolleyLog.e("Failed to read: ", new Object[] {
            ioexception
        });
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                VolleyLog.e(inputstream, "failed to close inputStream", new Object[0]);
            }
        }
        return stringbuilder.toString();
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                VolleyLog.e(inputstream, "failed to close inputStream", new Object[0]);
            }
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        Exception exception;
        exception;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                VolleyLog.e(inputstream, "failed to close inputStream", new Object[0]);
            }
        }
        throw exception;
    }
}
