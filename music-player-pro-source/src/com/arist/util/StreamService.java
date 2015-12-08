// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.util;

import android.os.Handler;
import android.os.Message;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamService
{

    public StreamService()
    {
    }

    public void readData(InputStream inputstream, OutputStream outputstream, Handler handler)
    {
        if (inputstream == null || outputstream == null)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        BufferedInputStream bufferedinputstream;
        BufferedOutputStream bufferedoutputstream;
        bufferedinputstream = new BufferedInputStream(inputstream);
        bufferedoutputstream = new BufferedOutputStream(outputstream);
        int i = 0;
        byte abyte0[] = new byte[1024];
_L2:
        int j = bufferedinputstream.read(abyte0);
        if (j == -1)
        {
            Message message;
            try
            {
                bufferedoutputstream.close();
                outputstream.close();
                bufferedinputstream.close();
                inputstream.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                inputstream.printStackTrace();
            }
            break MISSING_BLOCK_LABEL_152;
        }
        bufferedoutputstream.write(abyte0, 0, j);
        bufferedoutputstream.flush();
        j = i + 1;
        i = j;
        if (j % 200 != 0) goto _L2; else goto _L1
_L1:
        i = j;
        if (handler == null) goto _L2; else goto _L3
_L3:
        message = Message.obtain();
        message.what = 6;
        message.arg1 = j;
        handler.sendMessage(message);
        i = j;
          goto _L2
    }

    public void save(InputStream inputstream, String s, Handler handler)
    {
        if (inputstream == null || s == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        s = new File(s);
        if (!s.getParentFile().exists())
        {
            s.getParentFile().mkdirs();
        }
        readData(inputstream, new FileOutputStream(s), handler);
        return;
        inputstream;
        inputstream.printStackTrace();
        return;
    }
}
