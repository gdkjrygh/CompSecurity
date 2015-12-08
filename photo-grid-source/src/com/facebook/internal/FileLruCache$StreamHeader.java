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

final class 
{

    private static final int HEADER_VERSION = 0;

    static JSONObject readHeader(InputStream inputstream)
    {
        int l = 0;
        if (inputstream.read() != 0)
        {
            return null;
        }
        int j = 0;
        int i = 0;
        for (; j < 3; j++)
        {
            int i1 = inputstream.read();
            if (i1 == -1)
            {
                Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, "readHeader: stream.read returned -1 while reading header size");
                return null;
            }
            i = (i << 8) + (i1 & 0xff);
        }

        byte abyte0[] = new byte[i];
        for (int k = l; k < i; k += l)
        {
            l = inputstream.read(abyte0, k, i - k);
            if (l <= 0)
            {
                Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, (new StringBuilder("readHeader: stream.read stopped at ")).append(Integer.valueOf(k)).append(" when expected ").append(i).toString());
                return null;
            }
        }

        inputstream = new JSONTokener(new String(abyte0));
        inputstream = ((InputStream) (inputstream.nextValue()));
        if (inputstream instanceof JSONObject)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, (new StringBuilder("readHeader: expected JSONObject, got ")).append(inputstream.getClass().getCanonicalName()).toString());
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
