// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.net.TrafficStats;
import android.os.Process;
import com.android.volley.toolbox.h;
import com.qihoo.security.SecurityApplication;
import com.qihoo.utils.a.a;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//            h, Request, k, VolleyError, 
//            l, a, n, g, 
//            i

public class d extends com.android.volley.h
{

    private final Context f = SecurityApplication.a();

    public d(BlockingQueue blockingqueue, g g1, com.android.volley.a a1, l l1)
    {
        super(blockingqueue, g1, a1, l1);
    }

    private k a(Request request)
    {
        request = request.d();
        String s;
        if (request.startsWith("Package://"))
        {
            s = request.substring("Package://".length());
            request = com.qihoo.utils.a.a.a().a(s);
        } else
        if (request.startsWith("ApkPath://"))
        {
            s = request.substring("ApkPath://".length());
            request = com.qihoo.utils.a.a.a().b(s);
        } else
        {
            s = "";
            request = null;
        }
        if (request != null)
        {
            request = ((BitmapDrawable)request).getBitmap();
            if (request != null)
            {
                return com.android.volley.k.a(request, null);
            }
        }
        return com.android.volley.k.a(new VolleyError(new android.content.pm.PackageManager.NameNotFoundException(s)));
    }

    private void a(Request request, VolleyError volleyerror)
    {
        volleyerror = request.a(volleyerror);
        d.a(request, volleyerror);
    }

    public void run()
    {
        Process.setThreadPriority(10);
_L1:
        Request request = (Request)a.take();
        Object obj;
        request.a("network-queue-take");
        if (!request.h())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        request.b("network-discard-cancelled");
          goto _L1
        obj;
        if (!e) goto _L1; else goto _L2
_L2:
        return;
        int j = android.os.Build.VERSION.SDK_INT;
        if (j < 14)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        Object obj1;
        boolean flag;
        try
        {
            android/net/TrafficStats.getDeclaredMethod("setThreadStatsTag", new Class[] {
                Integer.TYPE
            }).invoke(null, new Object[] {
                Integer.valueOf(request.c())
            });
        }
        catch (Exception exception) { }
        obj1 = request.d();
        if (!(request instanceof h) || !((String) (obj1)).startsWith("Package://") && !((String) (obj1)).startsWith("ApkPath://")) goto _L4; else goto _L3
_L3:
        request.a("network-http-complete");
        obj1 = a(request);
        request.a("network-parse-complete");
        flag = true;
_L5:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        if (request.r() && ((k) (obj1)).b != null)
        {
            c.a(request.e(), ((k) (obj1)).b);
            request.a("network-cache-written");
        }
        request.v();
        d.a(request, ((k) (obj1)));
          goto _L1
_L4:
        try
        {
label0:
            {
                obj1 = b.a(request);
                request.a("network-http-complete");
                if (!((i) (obj1)).d || !request.w())
                {
                    break label0;
                }
                request.b("not-modified");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a(request, ((VolleyError) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            com.android.volley.n.a(((Throwable) (obj1)), "Unhandled exception %s", new Object[] {
                ((Exception) (obj1)).toString()
            });
            d.a(request, new VolleyError(((Throwable) (obj1))));
        }
          goto _L1
        obj1 = request.a(((i) (obj1)));
        request.a("network-parse-complete");
        flag = false;
          goto _L5
    }
}
