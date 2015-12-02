// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;

import android.net.LocalSocket;
import android.os.RemoteException;
import android.util.Log;
import java.io.DataInputStream;
import java.io.OutputStream;

// Referenced classes of package com.qihoo360.mobilesafe.support.a:
//            c, a, h

class e
    implements Runnable
{

    final c a;
    private final d b;
    private final boolean c;
    private final a d;
    private final byte e[];

    public void run()
    {
        if (a.f)
        {
            Log.d("RootClient", (new StringBuilder("Connecting ")).append(a.d).toString());
        }
        obj = com.qihoo360.mobilesafe.support.a.c.b(a);
        if (obj != null) goto _L2; else goto _L1
_L1:
        synchronized (b)
        {
            b.d = false;
            b.notify();
        }
        if (!c || d == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        d.a(2, false, null);
_L3:
        return;
        exception2;
        obj;
        JVM INSTR monitorexit ;
        throw exception2;
_L2:
        if (((LocalSocket) (obj)).isConnected())
        {
            ((LocalSocket) (obj)).getOutputStream().write(e);
            DataInputStream datainputstream = new DataInputStream(((LocalSocket) (obj)).getInputStream());
            b.c = h.a(datainputstream);
            datainputstream.close();
        }
        if (c && d != null)
        {
            d.a(2, true, b.c);
        }
        Object obj1;
        a a1;
        try
        {
            ((LocalSocket) (obj)).close();
        }
        catch (Exception exception1) { }
        synchronized (b)
        {
            b.d = false;
            b.notify();
        }
        if (a.f)
        {
            Log.i("RootClient", "Exec thread finished.");
            return;
        }
          goto _L3
        obj1;
        if (a.f)
        {
            Log.e("RootClient", ((Exception) (obj1)).getMessage(), ((Throwable) (obj1)));
        }
        if (!c)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        a1 = d;
        if (a1 != null)
        {
            try
            {
                d.a(2, false, null);
            }
            catch (RemoteException remoteexception1) { }
            finally { }
        }
        try
        {
            ((LocalSocket) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (false)
        {
            try
            {
                ((LocalSocket) (obj)).close();
            }
            catch (Exception exception) { }
            throw a1;
        } else
        {
            break MISSING_BLOCK_LABEL_187;
        }
        exception3;
        obj;
        JVM INSTR monitorexit ;
        throw exception3;
        RemoteException remoteexception;
        remoteexception;
    }

    (c c1,  , boolean flag, a a1, byte abyte0[])
    {
        a = c1;
        b = ;
        c = flag;
        d = a1;
        e = abyte0;
        super();
    }
}
