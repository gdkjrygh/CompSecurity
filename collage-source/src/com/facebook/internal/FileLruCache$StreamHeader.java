// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.LoggingBehavior;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.facebook.internal:
//            FileLruCache, Logger

private static final class 
{

    private static final int HEADER_VERSION = 0;

    static JSONObject readHeader(InputStream inputstream)
        throws IOException
    {
        boolean flag = false;
        if (inputstream.read() != 0)
        {
            return null;
        }
        int i = 0;
        int k = 0;
        for (; i < 3; i++)
        {
            int i1 = inputstream.read();
            if (i1 == -1)
            {
                Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, "readHeader: stream.read returned -1 while reading header size");
                return null;
            }
            k = (k << 8) + (i1 & 0xff);
        }

        byte abyte0[] = new byte[k];
        int l;
        for (int j = ((flag) ? 1 : 0); j < abyte0.length; j += l)
        {
            l = inputstream.read(abyte0, j, abyte0.length - j);
            if (l < 1)
            {
                Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, (new StringBuilder()).append("readHeader: stream.read stopped at ").append(Integer.valueOf(j)).append(" when expected ").append(abyte0.length).toString());
                return null;
            }
        }

        inputstream = new JSONTokener(new String(abyte0));
        inputstream = ((InputStream) (inputstream.nextValue()));
        if (inputstream instanceof JSONObject)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, (new StringBuilder()).append("readHeader: expected JSONObject, got ").append(inputstream.getClass().getCanonicalName()).toString());
        return null;
        try
        {
            inputstream = (JSONObject)inputstream;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new IOException(inputstream.getMessage());
        }
        return inputstream;
    }

    static void writeHeader(OutputStream outputstream, JSONObject jsonobject)
        throws IOException
    {
        jsonobject = jsonobject.toString().getBytes();
        outputstream.write(0);
        outputstream.write(jsonobject.length >> 16 & 0xff);
        outputstream.write(jsonobject.length >> 8 & 0xff);
        outputstream.write(jsonobject.length >> 0 & 0xff);
        outputstream.write(jsonobject);
    }

    private ()
    {
    }
}
