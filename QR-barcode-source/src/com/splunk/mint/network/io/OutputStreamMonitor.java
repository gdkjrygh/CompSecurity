// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint.network.io;

import com.splunk.mint.network.Counter;
import com.splunk.mint.network.MonitorRegistry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class OutputStreamMonitor extends OutputStream
{

    private static final String ALPHANUMERICPATTERN = "^[a-zA-Z0-9]*$";
    private static final int MAX_POSSIBLE_HEADER_LENGTH = 50;
    public static final String OUT_POSTFIX = "-bytes-out";
    private StringBuffer body;
    private List chars;
    private final Counter counter;
    private final OutputStream original;

    public OutputStreamMonitor(String s, MonitorRegistry monitorregistry, OutputStream outputstream)
    {
        original = outputstream;
        counter = new Counter((new StringBuilder()).append(s).append("-bytes-out").toString());
        monitorregistry.add(counter);
        chars = new ArrayList();
        body = new StringBuffer();
    }

    private void updateBody()
    {
        byte abyte0[] = new byte[chars.size()];
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte0[i] = ((Byte)chars.get(i)).byteValue();
        }

        chars.clear();
        body.append(new String(abyte0));
    }

    public void close()
        throws IOException
    {
        original.close();
    }

    public HashMap getHeaders()
    {
        HashMap hashmap = new HashMap(1);
        if (body == null || body.toString() == null || body.toString().length() <= 50) goto _L2; else goto _L1
_L1:
        BufferedReader bufferedreader;
        String s;
        String s1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        int i;
        try
        {
            bufferedreader = new BufferedReader(new StringReader(body.toString()));
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            return hashmap;
        }
        flag2 = false;
        flag = false;
        s = bufferedreader.readLine();
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag2;
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        flag1 = flag2;
        if (!s.contains(":"))
        {
            break MISSING_BLOCK_LABEL_192;
        }
        flag1 = flag2;
        if (s.length() >= 50)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        i = s.indexOf(":");
        flag1 = flag2;
        if (i <= -1)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        s1 = s.substring(0, i).trim();
        flag1 = flag2;
        if (!s1.equals("Host"))
        {
            break MISSING_BLOCK_LABEL_192;
        }
        hashmap.put(s1, Arrays.asList(new String[] {
            s.substring(i + 1, s.length()).trim()
        }));
        flag1 = true;
        i = ((flag) ? 1 : 0);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        if (s.contains("POST"))
        {
            break MISSING_BLOCK_LABEL_223;
        }
        i = ((flag) ? 1 : 0);
        if (!s.contains("GET"))
        {
            break MISSING_BLOCK_LABEL_254;
        }
        hashmap.put("splk-host2", Arrays.asList(new String[] {
            s.split(" ")[1].trim()
        }));
        i = 1;
        flag2 = flag1;
        flag = i;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        flag2 = flag1;
        flag = i;
        if (!i) goto _L3; else goto _L2
_L3:
        break MISSING_BLOCK_LABEL_69;
_L2:
        return hashmap;
    }

    public void write(int i)
        throws IOException
    {
        counter.inc();
        original.write(i);
        chars.add(Byte.valueOf((byte)i));
        updateBody();
    }

    public void write(byte abyte0[])
        throws IOException
    {
        counter.inc(abyte0.length);
        original.write(abyte0);
        for (int i = 0; i < abyte0.length; i++)
        {
            chars.add(Byte.valueOf(abyte0[i]));
        }

        updateBody();
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        counter.inc(j);
        original.write(abyte0, i, j);
        for (; i < j; i++)
        {
            chars.add(Byte.valueOf(abyte0[i]));
        }

        updateBody();
    }
}
