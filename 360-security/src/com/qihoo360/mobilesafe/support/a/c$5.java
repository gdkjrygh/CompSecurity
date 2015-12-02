// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;

import android.content.Context;
import android.content.Intent;
import android.net.Credentials;
import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// Referenced classes of package com.qihoo360.mobilesafe.support.a:
//            c, h

class f
    implements Runnable
{

    final c a;
    private final Context b;
    private final String c;
    private final Handler d;
    private final Runnable e;
    private final a f;

    public void run()
    {
        Object obj3;
        String s = h.b(b);
        if (s == null || s != null && !a.a(s, c))
        {
            if (a.e)
            {
                Log.d("RootClient", "libsu has been modified or can't fetch su");
            }
            d.removeCallbacks(e);
            Object obj;
            Object obj1;
            Object obj2;
            Object obj4;
            Object obj5;
            Object obj6;
            f f2;
            Exception exception2;
            int i;
            try
            {
                a.c.close();
            }
            catch (Exception exception) { }
            a.c = null;
            synchronized (f)
            {
                f.d = false;
                f.notify();
            }
            return;
        }
        break MISSING_BLOCK_LABEL_108;
        exception1;
        f1;
        JVM INSTR monitorexit ;
        throw exception1;
        if (a.e)
        {
            Log.d("RootClient", "Listener thread started.");
        }
        try
        {
            obj = a.c.accept();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj6)
        {
            obj3 = null;
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj3 = null;
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        obj1 = ((LocalSocket) (obj)).getPeerCredentials();
        i = ((Credentials) (obj1)).getUid();
        if (a.e)
        {
            Log.d("RootClient", String.format("Connected by pid = %d, uid = %d, gid = %d", new Object[] {
                Integer.valueOf(((Credentials) (obj1)).getPid()), Integer.valueOf(i), Integer.valueOf(((Credentials) (obj1)).getGid())
            }));
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        obj3 = new BufferedReader(new InputStreamReader(((LocalSocket) (obj)).getInputStream()));
        obj5 = obj3;
        obj1 = obj3;
        obj4 = obj;
        a.d = ((BufferedReader) (obj3)).readLine();
        obj5 = obj3;
        obj1 = obj3;
        obj4 = obj;
        if (!a.e)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        obj5 = obj3;
        obj1 = obj3;
        obj4 = obj;
        Log.d("RootClient", (new StringBuilder("Server Name = ")).append(a.d).toString());
        obj5 = obj3;
        obj1 = obj3;
        obj4 = obj;
        if (TextUtils.isEmpty(a.d)) goto _L4; else goto _L3
_L3:
        obj5 = obj3;
        obj1 = obj3;
        obj4 = obj;
        b.sendBroadcast(new Intent("com.qihoo.action.ROOT_SERVICE_READY"));
_L9:
        obj5 = obj3;
        obj1 = obj3;
        obj4 = obj;
        f2 = f;
        obj5 = obj3;
        obj1 = obj3;
        obj4 = obj;
        f2;
        JVM INSTR monitorenter ;
        f.d = false;
        f.notify();
        f2;
        JVM INSTR monitorexit ;
        try
        {
            ((BufferedReader) (obj3)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2) { }
        try
        {
            ((LocalSocket) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            a.c.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        a.c = null;
        d.removeCallbacks(e);
        if (a.e)
        {
            Log.d("RootClient", "Listener thread finished.");
            return;
        } else
        {
            return;
        }
_L4:
        obj5 = obj3;
        obj1 = obj3;
        obj4 = obj;
        a.d = null;
        continue; /* Loop/switch isn't completed */
_L7:
        obj1 = obj3;
        obj4 = obj;
        if (!a.e)
        {
            break MISSING_BLOCK_LABEL_501;
        }
        obj1 = obj3;
        obj4 = obj;
        Log.e("RootClient", ((Exception) (obj6)).getMessage(), ((Throwable) (obj6)));
        try
        {
            ((BufferedReader) (obj3)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2) { }
        try
        {
            ((LocalSocket) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            a.c.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        a.c = null;
        break MISSING_BLOCK_LABEL_412;
        exception2;
        f2;
        JVM INSTR monitorexit ;
        obj6 = obj3;
        obj1 = obj3;
        obj4 = obj;
        try
        {
            throw exception2;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj3 = obj5;
            obj6 = obj1;
        }
        finally
        {
            obj = obj4;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj3 = obj1;
        obj2 = obj6;
_L6:
        try
        {
            ((BufferedReader) (obj3)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3) { }
        try
        {
            ((LocalSocket) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            a.c.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        a.c = null;
        throw obj2;
        obj2;
        obj3 = null;
        if (true) goto _L6; else goto _L5
_L5:
        break MISSING_BLOCK_LABEL_137;
        obj6;
        obj3 = null;
        if (true) goto _L7; else goto _L2
_L2:
        obj3 = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    (c c1, Context context, String s, Handler handler, Runnable runnable,  )
    {
        a = c1;
        b = context;
        c = s;
        d = handler;
        e = runnable;
        f = ;
        super();
    }
}
