// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.internal;

import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar.internal:
//            FileLruCache, Logger

final class k
{

    static JSONObject a(InputStream inputstream)
    {
        int i1 = 0;
        if (inputstream.read() != 0)
        {
            return null;
        }
        int j = 0;
        int i = 0;
        for (; j < 3; j++)
        {
            int j1 = inputstream.read();
            if (j1 == -1)
            {
                Logger.log(FileLruCache.TAG, "readHeader: stream.read returned -1 while reading header size");
                return null;
            }
            i = (i << 8) + (j1 & 0xff);
        }

        byte abyte0[] = new byte[i];
        for (int l = i1; l < i; l += i1)
        {
            i1 = inputstream.read(abyte0, l, i - l);
            if (i1 <= 0)
            {
                Logger.log(FileLruCache.TAG, (new StringBuilder("readHeader: stream.read stopped at ")).append(Integer.valueOf(l)).append(" when expected ").append(i).toString());
                return null;
            }
        }

        inputstream = new JSONTokener(new String(abyte0));
        inputstream = ((InputStream) (inputstream.nextValue()));
        if (inputstream instanceof JSONObject)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        Logger.log(FileLruCache.TAG, (new StringBuilder("readHeader: expected JSONObject, got ")).append(inputstream.getClass().getCanonicalName()).toString());
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
}
