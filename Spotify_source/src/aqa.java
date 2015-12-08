// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.facebook.LoggingBehavior;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

final class aqa
{

    static JSONObject a(InputStream inputstream)
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
                inputstream = LoggingBehavior.d;
                inputstream = apt.a;
                arb.a();
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
                inputstream = LoggingBehavior.d;
                inputstream = apt.a;
                (new StringBuilder("readHeader: stream.read stopped at ")).append(Integer.valueOf(k)).append(" when expected ").append(i);
                arb.a();
                return null;
            }
        }

        inputstream = new JSONTokener(new String(abyte0));
        inputstream = ((InputStream) (inputstream.nextValue()));
        if (inputstream instanceof JSONObject)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        Object obj = LoggingBehavior.d;
        obj = apt.a;
        (new StringBuilder("readHeader: expected JSONObject, got ")).append(inputstream.getClass().getCanonicalName());
        arb.a();
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
