// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.util.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

class x
    implements Runnable
{

    private static final String f = com/threatmetrix/TrustDefenderMobile/x.getName();
    private String a;
    private String b;
    private String c;
    private String d;
    private int e;

    public x(String s, String s1, String s2, String s3, int i)
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = 10000;
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = i;
    }

    public void run()
    {
        int i = 0;
        Socket socket = new Socket(a, 8080);
        Object obj = socket;
        socket.setSoTimeout(e);
        obj = socket;
        BufferedWriter bufferedwriter = new BufferedWriter(new PrintWriter(socket.getOutputStream()));
        obj = socket;
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        obj = socket;
        bufferedwriter.write((new StringBuilder("<handle sig=FF44EE55 session_id=")).append(c).append(" org_id=").append(b).append(" w=").append(d).append(" />").toString());
        obj = socket;
        bufferedwriter.flush();
        obj = socket;
        if (bufferedreader.read() == -1)
        {
            break MISSING_BLOCK_LABEL_179;
        }
_L2:
        if (i >= 15)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = socket;
        bufferedwriter.write(new char[] {
            '\0'
        });
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj = socket;
        bufferedreader.read();
        obj = f;
        socket.close();
_L4:
        return;
        Object obj1;
        obj1;
        socket = null;
_L9:
        obj = socket;
        Log.w("Failed to connect to the fp server", ((Throwable) (obj1)));
        obj = f;
        if (socket == null) goto _L4; else goto _L3
_L3:
        try
        {
            socket.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        obj1;
        socket = null;
_L8:
        obj = socket;
        Log.w("Failed to read/write to the fp server", ((Throwable) (obj1)));
        obj = f;
        if (socket == null) goto _L4; else goto _L5
_L5:
        try
        {
            socket.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        Exception exception;
        exception;
        obj = null;
_L7:
        String s = f;
        IOException ioexception;
        if (obj != null)
        {
            try
            {
                ((Socket) (obj)).close();
            }
            catch (IOException ioexception1) { }
        }
        throw exception;
        ioexception;
        return;
        exception;
        if (true) goto _L7; else goto _L6
_L6:
        s;
          goto _L8
        s;
          goto _L9
    }

}
