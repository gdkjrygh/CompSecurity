// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;

import android.net.LocalSocket;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.DataInputStream;
import java.io.OutputStream;

// Referenced classes of package com.qihoo360.mobilesafe.support.a:
//            c, a

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
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        synchronized (b)
        {
            b.d = false;
            b.notify();
        }
        if (!c || d == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        d.a(1, false, null);
        return;
        exception2;
        obj;
        JVM INSTR monitorexit ;
        throw exception2;
        Object obj1;
        if (!((LocalSocket) (obj)).isConnected())
        {
            break MISSING_BLOCK_LABEL_193;
        }
        ((LocalSocket) (obj)).getOutputStream().write(e);
        obj1 = (new DataInputStream(((LocalSocket) (obj)).getInputStream())).readLine();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            b.a = Integer.parseInt(((String) (obj1)));
        }
        if (a.e)
        {
            Log.d("RootClient", (new StringBuilder("execv value is ")).append(((String) (obj1))).toString());
        }
        if (c && d != null)
        {
            d.a(1, b.a(), null);
        }
        Object obj2;
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
        return;
        exception3;
        obj;
        JVM INSTR monitorexit ;
        throw exception3;
        obj2;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_288;
        }
        obj2 = d;
        if (obj2 != null)
        {
            try
            {
                d.a(1, false, null);
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
        if (true)
        {
            break MISSING_BLOCK_LABEL_229;
        } else
        {
            try
            {
                ((LocalSocket) (obj)).close();
            }
            catch (Exception exception) { }
            throw obj2;
        }
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
