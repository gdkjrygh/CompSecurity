// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.a;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.roidapp.videolib.core.VideoEncodeService;
import com.roidapp.videolib.core.a.a;
import com.roidapp.videolib.core.a.c;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.videolib.a:
//            c, d

final class b
    implements c
{

    private a a;
    private com.roidapp.videolib.core.a.b b;
    private WeakReference c;
    private boolean d;
    private boolean e;
    private Messenger f;
    private Messenger g;
    private Handler h;
    private ServiceConnection i;

    public b(Context context)
    {
        h = new com.roidapp.videolib.a.c(this);
        i = new d(this);
        c = new WeakReference(context);
    }

    static Messenger a(b b1, Messenger messenger)
    {
        b1.g = messenger;
        return messenger;
    }

    static com.roidapp.videolib.core.a.b a(b b1)
    {
        return b1.b;
    }

    private void a(int j, Exception exception)
    {
        if (b != null)
        {
            b.a(j, 0, exception.getClass().getName(), exception.getMessage(), null);
        }
    }

    private void a(Message message)
    {
        if (g == null || message == null)
        {
            return;
        }
        message.replyTo = f;
        try
        {
            g.send(message);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            message.printStackTrace();
        }
    }

    static void a(b b1, Message message)
    {
        b1.a(message);
    }

    static Handler b(b b1)
    {
        return b1.h;
    }

    static Messenger b(b b1, Messenger messenger)
    {
        b1.f = messenger;
        return messenger;
    }

    static boolean c(b b1)
    {
        b1.d = false;
        return false;
    }

    static void d(b b1)
    {
        Context context;
        if (b1.c != null)
        {
            context = (Context)b1.c.get();
        } else
        {
            context = null;
        }
        if (context != null && b1.i != null)
        {
            try
            {
                context.unbindService(b1.i);
            }
            catch (Exception exception) { }
            b1.c = null;
        }
        b1.i = null;
    }

    static WeakReference e(b b1)
    {
        return b1.c;
    }

    static boolean f(b b1)
    {
        return b1.d;
    }

    static boolean g(b b1)
    {
        return b1.e;
    }

    static a h(b b1)
    {
        return b1.a;
    }

    public final void a()
    {
        d = true;
        h.sendEmptyMessageDelayed(0xabcde, 10000L);
        a(Message.obtain(null, 43521));
    }

    public final void a(boolean flag, a a1, com.roidapp.videolib.core.a.b b1)
    {
        a = a1;
        b = b1;
        e = flag;
        if (a1 != null)
        {
            if (c != null)
            {
                a1 = (Context)c.get();
            } else
            {
                a1 = null;
            }
            if (a1 == null)
            {
                a(60929, ((Exception) (new NullPointerException("context is null."))));
                return;
            }
            b1 = new Intent(a1, com/roidapp/videolib/core/VideoEncodeService);
            try
            {
                a1.bindService(b1, i, 1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                a(60932, ((Exception) (a1)));
            }
            return;
        } else
        {
            a(60929, ((Exception) (new NullPointerException("videoEncodeInfo is null."))));
            return;
        }
    }

    public final void b()
    {
        Context context;
        if (c != null)
        {
            context = (Context)c.get();
        } else
        {
            context = null;
        }
        if (context != null)
        {
            if (i != null)
            {
                try
                {
                    context.unbindService(i);
                }
                catch (Exception exception1) { }
            }
            try
            {
                context.stopService(new Intent(context, com/roidapp/videolib/core/VideoEncodeService));
            }
            catch (Exception exception) { }
            c = null;
        }
        i = null;
    }
}
