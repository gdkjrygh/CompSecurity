// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// Referenced classes of package com.netflix.mediaclient.util:
//            AndroidUtils

private static class start extends Thread
{

    StringBuffer output;
    private final boolean sink;
    private final InputStream stream;

    public String getOutput()
    {
        return output.toString();
    }

    public void run()
    {
        if (sink)
        {
            while (stream.read() != -1) ;
            return;
        }
        BufferedReader bufferedreader;
        output = new StringBuffer();
        bufferedreader = new BufferedReader(new InputStreamReader(stream));
_L1:
        String s = bufferedreader.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        output.append(s);
          goto _L1
        IOException ioexception;
        ioexception;
    }

    (InputStream inputstream, boolean flag)
    {
        sink = flag;
        stream = inputstream;
        start();
    }
}
