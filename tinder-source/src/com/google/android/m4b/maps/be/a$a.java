// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.be;

import android.os.Process;
import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bx.o;

// Referenced classes of package com.google.android.m4b.maps.be:
//            a

static final class start extends Thread
{

    private final int a;
    private final a b;

    public final void run()
    {
        try
        {
            Process.setThreadPriority(o.c() + 1);
        }
        catch (SecurityException securityexception)
        {
            if (ab.a("DiskProtoBufCache", 6))
            {
                Log.e("DiskProtoBufCache", "Could not set thread priority", securityexception);
            }
        }
        do
        {
            try
            {
                sleep(a);
            }
            catch (InterruptedException interruptedexception)
            {
                return;
            }
        } while (!com.google.android.m4b.maps.be.a.a(b));
    }

    (String s, int i, a a1)
    {
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "CacheCommitter:".concat(s);
        } else
        {
            s = new String("CacheCommitter:");
        }
        super(s);
        a = i;
        b = a1;
        start();
    }
}
