// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;

import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.util.Log;
import java.io.IOException;

// Referenced classes of package com.qihoo360.mobilesafe.support.a:
//            c

class b
    implements Runnable
{

    final c a;
    private final String b;

    public void run()
    {
        LocalSocket localsocket;
        if (a.c == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        if (a.e)
        {
            Log.e("RootClient", "Force close listener socket.");
        }
        localsocket = new LocalSocket();
        localsocket.connect(new LocalSocketAddress(b));
        localsocket.close();
_L2:
        return;
        IOException ioexception;
        ioexception;
        if (!a.e) goto _L2; else goto _L1
_L1:
        Log.e("RootClient", ioexception.getMessage(), ioexception);
        return;
        if (a.e)
        {
            Log.d("RootClient", "Watchdog exit.");
            return;
        }
          goto _L2
    }

    (c c1, String s)
    {
        a = c1;
        b = s;
        super();
    }
}
