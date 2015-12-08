// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.G;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.facebook.internal:
//            y, K

private static final class 
{

    static JSONObject a(InputStream inputstream)
        throws IOException
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
                K.a(G.d, y.a, "readHeader: stream.read returned -1 while reading header size");
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
                K.a(G.d, y.a, (new StringBuilder("readHeader: stream.read stopped at ")).append(Integer.valueOf(k)).append(" when expected ").append(i).toString());
                return null;
            }
        }

        inputstream = new JSONTokener(new String(abyte0));
        inputstream = ((InputStream) (inputstream.nextValue()));
        if (inputstream instanceof JSONObject)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        K.a(G.d, y.a, (new StringBuilder("readHeader: expected JSONObject, got ")).append(inputstream.getClass().getCanonicalName()).toString());
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
