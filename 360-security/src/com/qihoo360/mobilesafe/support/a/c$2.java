// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;

import android.net.LocalSocket;
import android.util.Log;
import java.io.DataInputStream;
import java.io.OutputStream;

// Referenced classes of package com.qihoo360.mobilesafe.support.a:
//            c

class c
    implements Runnable
{

    final c a;
    private final a b;
    private final byte c[];

    public void run()
    {
        obj = com.qihoo360.mobilesafe.support.a.c.b(a);
        if (obj == null)
        {
            synchronized (b)
            {
                b.d = false;
                b.notify();
            }
            return;
        }
        break MISSING_BLOCK_LABEL_42;
        exception2;
        obj;
        JVM INSTR monitorexit ;
        throw exception2;
        if (((LocalSocket) (obj)).isConnected())
        {
            ((LocalSocket) (obj)).getOutputStream().write(c);
            String s = (new DataInputStream(((LocalSocket) (obj)).getInputStream())).readLine();
            if (a.f)
            {
                Log.d("RootClient", (new StringBuilder("Response = ")).append(s).toString());
            }
            b.a = 0;
        }
        Object obj1;
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
        } else
        {
            return;
        }
        obj1;
        if (a.f)
        {
            Log.e("RootClient", ((Exception) (obj1)).getMessage(), ((Throwable) (obj1)));
        }
        try
        {
            ((LocalSocket) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        break MISSING_BLOCK_LABEL_119;
        obj1;
        try
        {
            ((LocalSocket) (obj)).close();
        }
        catch (Exception exception) { }
        throw obj1;
        exception3;
        obj;
        JVM INSTR monitorexit ;
        throw exception3;
    }

    (c c1,  , byte abyte0[])
    {
        a = c1;
        b = ;
        c = abyte0;
        super();
    }
}
