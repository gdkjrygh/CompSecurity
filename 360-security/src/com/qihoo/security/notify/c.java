// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.notify;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.widget.RemoteViews;
import com.qihoo.security.locale.d;
import com.qihoo.security.service.SecurityService;
import com.qihoo.security.service.a;
import com.qihoo.security.support.b;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.i;
import com.qihoo360.mobilesafe.b.p;
import com.qihoo360.mobilesafe.b.q;
import com.qihoo360.mobilesafe.b.r;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.qihoo.security.notify:
//            b, NotificationActivity

public class c extends com.qihoo.security.notify.b
{
    public static interface a
    {
    }


    private a h;
    private int i;
    private com.qihoo.security.service.a j;
    private Bitmap k;
    private Canvas l;
    private final Paint m = new Paint(4);
    private Paint n;
    private boolean o;
    private com.qihoo.security.widget.a p;
    private boolean q;
    private long r;
    private boolean s;
    private final int t;
    private final int u;
    private final int v;
    private int w;
    private final com.qihoo.security.service.b.a x = new com.qihoo.security.service.b.a() {

        final c a;

        public void a(int i1)
            throws RemoteException
        {
            com.qihoo.security.notify.c.a(a, i1);
            a.c();
        }

            
            {
                a = c.this;
                super();
            }
    };

    public c(Context context, com.qihoo.security.service.a a1, a a2)
    {
        super(context);
        h = null;
        i = 0;
        j = null;
        k = null;
        l = null;
        n = null;
        o = false;
        q = true;
        r = 0L;
        s = false;
        w = 0;
        j = a1;
        h = a2;
        m.setFilterBitmap(true);
        m.setAntiAlias(true);
        n = new Paint();
        n.setAntiAlias(true);
        n.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        try
        {
            i = j.c();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            i = Utils.getMemoryUsedPercent();
        }
        if (f)
        {
            e();
        }
        context = b.getResources();
        t = context.getDimensionPixelOffset(0x7f090064);
        u = context.getDimensionPixelOffset(0x7f090062);
        w = context.getDimensionPixelOffset(0x7f090065);
        v = context.getDimensionPixelOffset(0x7f090063);
    }

    static int a(c c1, int i1)
    {
        c1.i = i1;
        return i1;
    }

    static com.qihoo.security.widget.a a(c c1, com.qihoo.security.widget.a a1)
    {
        c1.p = a1;
        return a1;
    }

    private void a(RemoteViews remoteviews)
    {
        if (k == null)
        {
            k = Bitmap.createBitmap(t * 2, t * 2, android.graphics.Bitmap.Config.ARGB_8888);
            l = new Canvas(k);
        }
        int i1 = k.getWidth() / 2;
        int k1 = k.getHeight() / 2;
        l.drawRect(0.0F, 0.0F, l.getWidth(), l.getHeight(), n);
        int l1 = u - v / 2;
        RectF rectf = new RectF(i1 - l1, k1 - l1, i1 + l1, l1 + k1);
        k1 = com.qihoo360.mobilesafe.b.r.a(i);
        m.setColor(k1);
        m.setStyle(android.graphics.Paint.Style.STROKE);
        m.setStrokeWidth(v);
        l.drawArc(rectf, -85, (float)i * 3.6F, false, m);
        float f1 = (float)(100 - i) * 3.6F;
        if (f1 > (float)20)
        {
            Paint paint = m;
            int j1;
            if (com.qihoo.utils.notice.c.b())
            {
                j1 = 0xff37474f;
            } else
            {
                j1 = 0xffbfc4c6;
            }
            paint.setColor(j1);
            l.drawArc(rectf, ((float)i * 3.6F - 90F) + (float)15, f1 - (float)20, false, m);
        }
        remoteviews.setImageViewBitmap(0x7f0b019c, k);
        remoteviews.setTextViewText(0x7f0b019d, String.valueOf(i));
        remoteviews.setTextColor(0x7f0b019d, k1);
        remoteviews.setTextColor(0x7f0b019e, k1);
        remoteviews.setTextViewText(0x7f0b019f, c.a(0x7f0c017a, new Object[] {
            Integer.valueOf(i)
        }));
        remoteviews.setOnClickPendingIntent(0x7f0b019b, b(0));
    }

    static void a(c c1)
    {
        c1.h();
    }

    static boolean a(c c1, boolean flag)
    {
        c1.o = flag;
        return flag;
    }

    private PendingIntent b(int i1)
    {
        Intent intent = new Intent(b, com/qihoo/security/notify/NotificationActivity);
        intent.addFlags(0x10000000);
        intent.setAction("com.qihoo.security.action.function.NOTIFICATION");
        intent.putExtra("com.qihoo.security.index.function.notification", i1);
        return PendingIntent.getActivity(b, i1, intent, 0x10000000);
    }

    static com.qihoo.security.widget.a b(c c1)
    {
        return c1.p;
    }

    static boolean b(c c1, boolean flag)
    {
        c1.q = flag;
        return flag;
    }

    private PendingIntent c(int i1)
    {
        Intent intent = new Intent(b, com/qihoo/security/service/SecurityService);
        intent.setAction("com.qihoo.security.action.function.notification");
        intent.putExtra("com.qihoo.security.index.function.notification", i1);
        return PendingIntent.getService(b, i1, intent, 0x10000000);
    }

    private void e()
    {
        try
        {
            j.a(x);
            s = true;
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private void f()
    {
        b();
        if (o && p != null)
        {
            o = false;
            p.b();
            p = null;
        }
    }

    private void g()
    {
        try
        {
            Object obj = Class.forName("android.os.ServiceManager");
            Object obj1 = (IBinder)((Class) (obj)).getMethod("getService", new Class[] {
                java/lang/String
            }).invoke(obj, new Object[] {
                "statusbar"
            });
            obj = Class.forName(((IBinder) (obj1)).getInterfaceDescriptor());
            obj1 = ((Class) (obj)).getClasses()[0].getMethod("asInterface", new Class[] {
                android/os/IBinder
            }).invoke(null, new Object[] {
                obj1
            });
            obj = ((Class) (obj)).getMethod("toggleRecentApps", new Class[0]);
            ((Method) (obj)).setAccessible(true);
            ((Method) (obj)).invoke(obj1, new Object[0]);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private void h()
    {
        if ("NX501".equals(Build.MODEL))
        {
            try
            {
                Intent intent = new Intent();
                intent.setClassName("com.android.timemanager", "com.android.timemanager.TimeManager");
                intent.setFlags(0x10000000);
                b.startActivity(intent);
                return;
            }
            catch (Exception exception) { }
        }
        List list = Utils.openConfigFile(b, "scpkg.list");
        if (list != null && !list.isEmpty())
        {
            int j1 = list.size();
            for (int i1 = 0; i1 < j1;)
            {
                Object obj = Utils.DES_decrypt((String)list.get(i1), "com.qihoo.security");
                int l1 = ((String) (obj)).indexOf("|");
                Object obj1;
                int k1;
                if (l1 != -1)
                {
                    obj1 = ((String) (obj)).substring(0, l1);
                    obj = ((String) (obj)).substring(l1 + 1);
                } else
                {
                    obj = null;
                    obj1 = null;
                }
                if (obj1 == null || obj == null)
                {
                    continue;
                }
                try
                {
                    Intent intent1 = new Intent();
                    intent1.setClassName(((String) (obj1)), ((String) (obj)));
                    intent1.setFlags(0x10000000);
                    b.startActivity(intent1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    i1++;
                }
            }

        }
        obj = Utils.openConfigFile(b, "scact.list");
        if (obj != null && !((List) (obj)).isEmpty())
        {
            k1 = ((List) (obj)).size();
            for (i1 = 0; i1 < k1;)
            {
                obj1 = Utils.DES_decrypt((String)((List) (obj)).get(i1), "com.qihoo.security");
                try
                {
                    obj1 = new Intent(((String) (obj1)));
                    ((Intent) (obj1)).setFlags(0x10000000);
                    b.startActivity(((Intent) (obj1)));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    i1++;
                }
            }

        }
        g.sendEmptyMessage(0);
    }

    public void a(int i1)
    {
        i1;
        JVM INSTR tableswitch 0 3: default 32
    //                   0 191
    //                   1 37
    //                   2 223
    //                   3 75;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        c();
_L7:
        return;
_L3:
        com.qihoo.security.support.b.c(20003);
        com.qihoo.security.support.b.a(20003);
        com.qihoo360.mobilesafe.b.p.a().execute(new Runnable() {

            final c a;

            public void run()
            {
                com.qihoo.security.notify.c.a(a);
            }

            
            {
                a = c.this;
                super();
            }
        });
        com.qihoo360.mobilesafe.b.r.b(b);
        continue; /* Loop/switch isn't completed */
_L5:
        long l1 = System.currentTimeMillis();
        if (Math.abs(r - l1) < 500L) goto _L7; else goto _L6
_L6:
        r = l1;
        if (!q) goto _L7; else goto _L8
_L8:
        com.qihoo.security.support.b.c(20005);
        com.qihoo.security.support.b.a(20005);
        if (p == null)
        {
            p = new com.qihoo.security.widget.a(b, new com.qihoo.security.widget.a.a() {

                final c a;

                public void a()
                {
                    if (com.qihoo.security.notify.c.b(a) != null)
                    {
                        com.qihoo.security.notify.c.b(a).b();
                        com.qihoo.security.notify.c.a(a, null);
                        com.qihoo.security.notify.c.a(a, false);
                        a.c();
                    }
                }

                public void a(boolean flag)
                {
                }

                public void b()
                {
                    com.qihoo360.mobilesafe.b.r.b(a.b);
                    com.qihoo360.mobilesafe.b.q.a().a(0x7f0c0179);
                    if (com.qihoo.security.notify.c.b(a) != null)
                    {
                        com.qihoo.security.notify.c.b(a).b();
                        com.qihoo.security.notify.c.a(a, null);
                        com.qihoo.security.notify.c.a(a, false);
                    }
                }

                public void b(boolean flag)
                {
                    com.qihoo.security.notify.c.b(a, flag);
                }

            
            {
                a = c.this;
                super();
            }
            });
        }
        if (o)
        {
            o = false;
            p.b();
            p = null;
        } else
        {
            o = true;
            p.a();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        com.qihoo.security.support.b.c(20002);
        com.qihoo.security.support.b.a(20002);
        g.sendEmptyMessageDelayed(1, 0L);
        com.qihoo360.mobilesafe.b.r.b(b);
        continue; /* Loop/switch isn't completed */
_L4:
        com.qihoo.security.support.b.c(20004);
        com.qihoo.security.support.b.a(20004);
        com.qihoo360.mobilesafe.b.r.b(b);
        g();
        if (true) goto _L1; else goto _L9
_L9:
    }

    public void a(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            com.qihoo360.mobilesafe.b.q.a().a(0x7f0c0178);
            return;

        case 1: // '\001'
            message = new com.qihoo.security.opti.a.b(b);
            break;
        }
        message.a(new com.qihoo.security.opti.a.b.a() {

            final c a;

            public void a()
            {
                com.qihoo360.mobilesafe.b.q.a().a(0x7f0c007e);
            }

            public void a(int i1, int j1)
            {
                com.qihoo.security.support.b.b(20030, i1);
                j1 = (int)(((long)j1 * 100L) / Utils.getMemoryTotalKb());
                String s1 = a.c.a(0x7f0c007d, new Object[] {
                    Integer.valueOf(i1), Integer.valueOf(j1)
                });
                com.qihoo360.mobilesafe.b.q.a().a(s1);
            }

            
            {
                a = c.this;
                super();
            }
        });
        message.b();
    }

    public void a(boolean flag)
    {
        super.a(flag);
        if (flag && !s)
        {
            e();
            if (!com.qihoo360.mobilesafe.b.i.a())
            {
                c();
            }
        }
    }

    public void c()
    {
        if (com.qihoo360.mobilesafe.b.i.a())
        {
            f();
        } else
        {
            if (com.qihoo.utils.notice.c.a(b))
            {
                b();
                return;
            }
            if (f)
            {
                a();
                RemoteViews remoteviews;
                if (com.qihoo.utils.notice.c.b())
                {
                    remoteviews = new RemoteViews(b.getPackageName(), 0x7f03007e);
                } else
                {
                    remoteviews = new RemoteViews(b.getPackageName(), 0x7f03007d);
                }
                remoteviews.setOnClickPendingIntent(0x7f0b01a0, b(1));
                remoteviews.setTextViewText(0x7f0b01a1, c.a(0x7f0c017b));
                remoteviews.setViewVisibility(0x7f0b01a0, 0);
                if (o)
                {
                    if (com.qihoo.utils.notice.c.b())
                    {
                        remoteviews.setImageViewResource(0x7f0b01a5, 0x7f0200d7);
                    } else
                    {
                        remoteviews.setImageViewResource(0x7f0b01a5, 0x7f0200d6);
                    }
                } else
                if (com.qihoo.utils.notice.c.b())
                {
                    remoteviews.setImageViewResource(0x7f0b01a5, 0x7f0200d5);
                } else
                {
                    remoteviews.setImageViewResource(0x7f0b01a5, 0x7f0200d4);
                }
                remoteviews.setTextViewText(0x7f0b01a6, c.a(0x7f0c005c));
                remoteviews.setOnClickPendingIntent(0x7f0b01a4, c(3));
                if (Utils.isMeizu())
                {
                    remoteviews.setViewVisibility(0x7f0b01a2, 8);
                } else
                {
                    remoteviews.setOnClickPendingIntent(0x7f0b01a2, b(2));
                    remoteviews.setTextViewText(0x7f0b01a3, c.a(0x7f0c017c));
                }
                a(remoteviews);
                e.contentView = remoteviews;
                a(277, e);
                return;
            }
        }
    }

    protected void d()
    {
        if (k != null && !k.isRecycled())
        {
            k.recycle();
        }
        k = null;
        if (!s)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        s = false;
        j.b(x);
        return;
        Exception exception;
        exception;
    }
}
