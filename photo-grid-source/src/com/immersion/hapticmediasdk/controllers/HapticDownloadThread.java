// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.immersion.hapticmediasdk.controllers;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.immersion.hapticmediasdk.models.HttpUnsuccessfulException;
import com.immersion.hapticmediasdk.utils.FileManager;
import com.immersion.hapticmediasdk.utils.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

// Referenced classes of package com.immersion.hapticmediasdk.controllers:
//            ImmersionHttpClient

public class HapticDownloadThread extends Thread
{

    private static final String a = "HapticDownloadThread";
    private static final int b = 4096;
    public static int b041504150415041504150415 = 1;
    public static int b041504150415041504150415 = 39;
    public static int b041504150415041504150415 = 0;
    public static int b041504150415041504150415 = 2;
    private String c;
    private Handler d;
    private boolean e;
    private Thread f;
    private FileManager g;
    private volatile boolean h;
    private volatile boolean i;
    private volatile boolean j;

    public HapticDownloadThread(String s, Handler handler, boolean flag, FileManager filemanager)
    {
        super("HapticDownloadThread");
        h = false;
        i = false;
        j = false;
        c = s;
        d = handler;
        e = flag;
        g = filemanager;
        s = d.getLooper();
        if (((b041504150415041504150415 + b041504150415041504150415) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415)
        {
            b041504150415041504150415 = 70;
            b041504150415041504150415 = b041504150415041504150415();
        }
        f = s.getThread();
    }

    public static int b041504150415041504150415()
    {
        return 19;
    }

    public static int b042704270427042704270427()
    {
        return 1;
    }

    public static int b041504150415041504150415()
    {
        return 0;
    }

    public boolean isFirstPacketReady()
    {
        this;
        JVM INSTR monitorenter ;
        if (h) goto _L2; else goto _L1
_L1:
        boolean flag = i;
        if (flag) goto _L2; else goto _L3
_L3:
        flag = false;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = true;
        if (true) goto _L5; else goto _L4
_L4:
        Object obj;
        obj;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void run()
    {
        if (!e) goto _L2; else goto _L1
_L1:
        Object obj;
        int k;
        Process.setThreadPriority(10);
        obj = ImmersionHttpClient.getHttpClient();
        try
        {
            obj = ((ImmersionHttpClient) (obj)).executeGet(c, null, 60000);
            k = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Thread.currentThread().interrupt();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Message message = d.obtainMessage(8);
            Bundle bundle = new Bundle();
            bundle.putSerializable("haptic_download_exception", ((java.io.Serializable) (obj)));
            message.setData(bundle);
            if (f.isAlive() && !j)
            {
                Handler handler = d;
                if (((b041504150415041504150415 + b041504150415041504150415) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415)
                {
                    b041504150415041504150415 = b041504150415041504150415();
                    b041504150415041504150415 = b041504150415041504150415();
                }
                handler.sendMessage(message);
            }
            Log.e("HapticDownloadThread", ((Exception) (obj)).getMessage());
            return;
        }
        if (k != 200) goto _L4; else goto _L3
_L3:
        k = Integer.parseInt(((HttpResponse) (obj)).getFirstHeader("Content-Length").getValue());
        writeToFile(((HttpResponse) (obj)).getEntity().getContent(), k);
_L6:
        return;
_L2:
        try
        {
            obj = new FileInputStream(c);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            filenotfoundexception.printStackTrace();
            filenotfoundexception = null;
        }
        if (obj == null) goto _L6; else goto _L5
_L5:
        try
        {
            writeToFile(((InputStream) (obj)), ((InputStream) (obj)).available());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
        return;
_L11:
        ((StringBuilder) (obj)).append(" Internal Server Error");
_L7:
        throw new HttpUnsuccessfulException(k, ((StringBuilder) (obj)).toString());
_L12:
        ((StringBuilder) (obj)).append(" Bad Gateway");
          goto _L7
_L4:
        obj = new StringBuilder("HTTP STATUS CODE: ");
        ((StringBuilder) (obj)).append(k);
        k;
        JVM INSTR lookupswitch 6: default 386
    //                   400: 336
    //                   403: 346
    //                   404: 356
    //                   500: 119
    //                   502: 148
    //                   503: 366;
           goto _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L8:
        ((StringBuilder) (obj)).append(" Bad Request");
          goto _L7
_L9:
        ((StringBuilder) (obj)).append(" Forbidden");
          goto _L7
_L10:
        ((StringBuilder) (obj)).append(" Not Found");
          goto _L7
_L13:
        ((StringBuilder) (obj)).append(" Service Unavailable");
          goto _L7
    }

    public void terminate()
    {
        if (((b041504150415041504150415 + b041504150415041504150415) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415())
        {
            b041504150415041504150415 = 53;
            b041504150415041504150415 = b041504150415041504150415();
        }
        j = true;
    }

    public boolean writeToFile(InputStream inputstream, int k)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        int l = 0;
        Object obj2;
        Exception exception;
        Bundle bundle;
        FileNotFoundException filenotfoundexception;
        boolean flag;
        try
        {
            obj2 = new byte[4096];
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw inputstream;
        }
        if (inputstream == null || k <= 0) goto _L2; else goto _L1
_L1:
        obj = new BufferedInputStream(inputstream);
        if (!e) goto _L4; else goto _L3
_L3:
        inputstream = g.makeOutputStreamForStreaming(c);
_L9:
        if (inputstream != null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        if (h)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        obj1 = d.obtainMessage(8);
        obj2 = new Bundle();
        ((Bundle) (obj2)).putSerializable("haptic_download_exception", new FileNotFoundException("downloaded an empty file"));
        try
        {
            ((Message) (obj1)).setData(((Bundle) (obj2)));
            if (f.isAlive() && !j)
            {
                d.sendMessage(((Message) (obj1)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw inputstream;
        }
        Log.e("HapticDownloadThread", "downloaded an empty file");
        g.closeCloseable(((java.io.Closeable) (obj)));
        g.closeCloseable(inputstream);
        i = true;
        return false;
        if (e) goto _L6; else goto _L5
_L5:
        h = true;
        flag = j;
        if (!flag) goto _L8; else goto _L7
_L7:
        if (!h)
        {
            obj1 = d.obtainMessage(8);
            obj2 = new Bundle();
            ((Bundle) (obj2)).putSerializable("haptic_download_exception", new FileNotFoundException("downloaded an empty file"));
            ((Message) (obj1)).setData(((Bundle) (obj2)));
            if (f.isAlive() && !j)
            {
                d.sendMessage(((Message) (obj1)));
            }
            Log.e("HapticDownloadThread", "downloaded an empty file");
        }
        obj1 = g;
        ((FileManager) (obj1)).closeCloseable(((java.io.Closeable) (obj)));
        g.closeCloseable(inputstream);
        i = true;
        return true;
_L2:
        if (!h)
        {
            inputstream = d.obtainMessage(8);
            obj = new Bundle();
            ((Bundle) (obj)).putSerializable("haptic_download_exception", new FileNotFoundException("downloaded an empty file"));
            inputstream.setData(((Bundle) (obj)));
            if (f.isAlive() && !j)
            {
                d.sendMessage(inputstream);
            }
            Log.e("HapticDownloadThread", "downloaded an empty file");
        }
        g.closeCloseable(null);
        g.closeCloseable(null);
        i = true;
        return false;
_L14:
        if (h)
        {
            break MISSING_BLOCK_LABEL_483;
        }
        obj2 = d.obtainMessage(8);
        bundle = new Bundle();
        filenotfoundexception = new FileNotFoundException("downloaded an empty file");
        bundle.putSerializable("haptic_download_exception", filenotfoundexception);
        ((Message) (obj2)).setData(bundle);
        if (f.isAlive() && !j)
        {
            d.sendMessage(((Message) (obj2)));
        }
        Log.e("HapticDownloadThread", "downloaded an empty file");
        g.closeCloseable(((java.io.Closeable) (obj1)));
        g.closeCloseable(((java.io.Closeable) (obj)));
        i = true;
        throw inputstream;
_L4:
        inputstream = g.makeOutputStream(c);
          goto _L9
_L8:
        d.sendMessage(d.obtainMessage(3, k, 0));
_L11:
        Log.i("HapticDownloadThread", "file download completed");
        if (h)
        {
            break MISSING_BLOCK_LABEL_665;
        }
        obj1 = d.obtainMessage(8);
        obj2 = new Bundle();
        if (((b041504150415041504150415 + b041504150415041504150415) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415)
        {
            b041504150415041504150415 = 2;
            b041504150415041504150415 = 54;
        }
        ((Bundle) (obj2)).putSerializable("haptic_download_exception", new FileNotFoundException("downloaded an empty file"));
        ((Message) (obj1)).setData(((Bundle) (obj2)));
        if (f.isAlive() && !j)
        {
            d.sendMessage(((Message) (obj1)));
        }
        Log.e("HapticDownloadThread", "downloaded an empty file");
        g.closeCloseable(((java.io.Closeable) (obj)));
        if (((b041504150415041504150415 + b042704270427042704270427()) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415)
        {
            b041504150415041504150415 = 47;
            b041504150415041504150415 = 86;
        }
        g.closeCloseable(inputstream);
        i = true;
        return true;
_L6:
        if (isInterrupted() || j) goto _L11; else goto _L10
_L10:
        k = ((BufferedInputStream) (obj)).read(((byte []) (obj2)), 0, 4096);
        if (k < 0) goto _L11; else goto _L12
_L12:
        inputstream.write(((byte []) (obj2)), 0, k);
        k = l + k;
        l = k;
        if (!f.isAlive()) goto _L6; else goto _L13
_L13:
        if (!h)
        {
            h = true;
        }
        inputstream.flush();
        obj1 = d.obtainMessage(3, k, 0);
        d.sendMessage(((Message) (obj1)));
        l = k;
          goto _L6
        exception;
        obj1 = obj;
        obj = exception;
        exception = inputstream;
        inputstream = ((InputStream) (obj));
        obj = exception;
          goto _L14
        inputstream;
        Object obj3 = null;
        obj1 = obj;
        obj = obj3;
          goto _L14
        inputstream;
        obj = null;
          goto _L14
    }
}
