// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.notify;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.y;
import com.qihoo.security.locale.d;
import com.qihoo.utils.notice.c;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.lang.ref.WeakReference;

// Referenced classes of package com.qihoo.security.notify:
//            NotificationActivity

public abstract class b
{
    protected static final class a extends Handler
    {

        private final WeakReference a;

        public void handleMessage(Message message)
        {
            if (a != null && a.get() != null && message != null)
            {
                ((b)a.get()).a(message);
            }
        }

        public a(b b1)
        {
            a = new WeakReference(b1);
        }
    }


    protected static final String a = com/qihoo/security/notify/b.getSimpleName();
    protected final Context b;
    protected final d c = com.qihoo.security.locale.d.a();
    protected final y d;
    protected Notification e;
    protected boolean f;
    protected a g;

    public b(Context context)
    {
        f = true;
        b = context.getApplicationContext();
        d = y.a(b);
        f = SharedPref.b(b, "notification", true);
        g = new a(this);
    }

    protected void a()
    {
        Object obj = new android.support.v4.app.q.d(b);
        ((android.support.v4.app.q.d) (obj)).a(0x7f0200cf);
        ((android.support.v4.app.q.d) (obj)).a(c.a(0x7f0c0172));
        ((android.support.v4.app.q.d) (obj)).a(true);
        ((android.support.v4.app.q.d) (obj)).b(2);
        ((android.support.v4.app.q.d) (obj)).a("sort_key_00");
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            ((android.support.v4.app.q.d) (obj)).a(0x1036640L);
        } else
        if (android.os.Build.VERSION.SDK_INT > 14)
        {
            ((android.support.v4.app.q.d) (obj)).a(0x7fffffffffffffffL);
        } else
        {
            ((android.support.v4.app.q.d) (obj)).a(System.currentTimeMillis());
        }
        e = ((android.support.v4.app.q.d) (obj)).a();
        obj = new Intent(b, com/qihoo/security/notify/NotificationActivity);
        ((Intent) (obj)).addFlags(0x10000000);
        ((Intent) (obj)).setAction("com.qihoo.security.action.function.MAIN");
        e.contentIntent = PendingIntent.getActivity(b, 277, ((Intent) (obj)), 0x10000000);
        e.contentView = null;
    }

    public abstract void a(int i);

    protected void a(int i, Notification notification)
    {
        try
        {
            d.a(i, notification);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Notification notification)
        {
            return;
        }
    }

    protected abstract void a(Message message);

    public void a(boolean flag)
    {
        if (!com.qihoo.utils.notice.c.a(b)) goto _L2; else goto _L1
_L1:
        f = false;
_L6:
        if (!f)
        {
            break; /* Loop/switch isn't completed */
        }
        c();
_L4:
        return;
_L2:
        if (f == flag) goto _L4; else goto _L3
_L3:
        f = flag;
        if (true) goto _L6; else goto _L5
_L5:
        b();
        return;
    }

    public void b()
    {
        g.removeCallbacksAndMessages(null);
        d.a(277);
        if (!com.qihoo.utils.notice.c.a(b))
        {
            d();
        }
    }

    public abstract void c();

    protected abstract void d();

}
