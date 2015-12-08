// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.audio;

import android.app.Application;
import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.AudioManager;
import com.pandora.android.PandoraService;
import com.pandora.android.activity.MediaButtonBroadcastReceiver;
import com.pandora.android.provider.b;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.d;
import p.cm.t;
import p.cw.c;
import p.dd.ag;
import p.dd.ap;
import p.dd.bf;
import p.dd.bh;
import p.dd.e;
import p.df.a;

// Referenced classes of package com.pandora.android.audio:
//            c, e, d, g

public class RemoteControlClientManager
    implements com.pandora.android.audio.c
{
    public class ScreenReceiver extends BroadcastReceiver
    {

        final RemoteControlClientManager a;

        public void onReceive(Context context, Intent intent)
        {
            if (intent.getAction().equals("android.intent.action.SCREEN_ON"))
            {
                a.j();
            } else
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF"))
            {
                a.k();
                return;
            }
        }

        public ScreenReceiver()
        {
            a = RemoteControlClientManager.this;
            super();
        }
    }

    private class a extends t
    {

        final RemoteControlClientManager a;

        protected void a(Bitmap bitmap)
        {
        }

        protected void b(Bitmap bitmap)
        {
            if (bitmap == null)
            {
                return;
            } else
            {
                a.c.a(false).a(100, bitmap).a();
                return;
            }
        }

        protected void onCancelled(Object obj)
        {
            a((Bitmap)obj);
        }

        protected void onPostExecute(Object obj)
        {
            b((Bitmap)obj);
        }

        private a()
        {
            a = RemoteControlClientManager.this;
            super();
        }

    }


    protected static volatile com.pandora.android.audio.c a = null;
    protected static AudioManager b;
    protected com.pandora.android.audio.d c;
    private String d;
    private boolean e;
    private boolean f;
    private aa g;
    private BroadcastReceiver h;
    private a i;

    protected RemoteControlClientManager(PandoraService pandoraservice, ComponentName componentname)
    {
        f = false;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentname);
        c = com.pandora.android.audio.e.a(PendingIntent.getBroadcast(pandoraservice, 0, intent, 0));
        m();
        o();
        if (c.a())
        {
            pandoraservice = b.a;
            pandoraservice.b().b(this);
            pandoraservice.e().c(this);
            h = new ScreenReceiver();
            componentname = new IntentFilter();
            componentname.addAction("android.intent.action.SCREEN_ON");
            componentname.addAction("android.intent.action.SCREEN_OFF");
            pandoraservice.h().registerReceiver(h, componentname);
        }
    }

    public static void a(PandoraService pandoraservice, ComponentName componentname)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return;
        }
        if (a != null)
        {
            throw new UnsupportedOperationException("RemoteControlClientManager.init() can only be called once");
        } else
        {
            b = (AudioManager)pandoraservice.getSystemService("audio");
            a = new RemoteControlClientManager(pandoraservice, componentname);
            return;
        }
    }

    private void a(aa aa1, boolean flag)
    {
        c.a(3);
        boolean flag1 = aa1.M();
        Object obj;
        if (MediaButtonBroadcastReceiver.a())
        {
            h();
        } else
        if (flag1 || !flag)
        {
            o();
        } else
        {
            n();
        }
        if (flag1)
        {
            obj = ((d)aa1).c();
        } else
        {
            obj = aa1.w();
        }
        if (d != null && d.equals(obj))
        {
            return;
        }
        d = ((String) (obj));
        obj = c.a(true);
        if (flag1)
        {
            ((d.a) (obj)).a(7, b.a.h().getString(0x7f08007d)).a(1, "").a(13, "").a(2, "");
        } else
        {
            ((d.a) (obj)).a(1, aa1.u()).a(2, aa1.t()).a(13, aa1.t()).a(7, aa1.s()).a(9, aa1.G());
        }
        ((d.a) (obj)).a();
        e = false;
        l();
    }

    public static boolean c()
    {
        return a != null;
    }

    public static com.pandora.android.audio.c d()
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return null;
        }
        if (a == null)
        {
            throw new UnsupportedOperationException("RemoteControlClientManager.init() must be called first");
        } else
        {
            return a;
        }
    }

    public static void e()
    {
        if (a != null)
        {
            a.b();
        }
        b = null;
        a = null;
    }

    private void m()
    {
        if (!i())
        {
            f();
            f = true;
        }
    }

    private void n()
    {
        com.pandora.android.audio.d d1 = c;
        char c1;
        if (p())
        {
            c1 = '\200';
        } else
        {
            c1 = '\234';
        }
        d1.b(c1);
    }

    private void o()
    {
        com.pandora.android.audio.d d1 = c;
        int i1;
        if (p())
        {
            i1 = 0;
        } else
        {
            i1 = 28;
        }
        d1.b(i1);
    }

    private boolean p()
    {
        return android.os.Build.VERSION.SDK_INT == 15;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        c.b(0);
        c.a(true).a();
        d = null;
        g();
        f = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean a(Context context)
    {
        return ((KeyguardManager)context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    public void b()
    {
        if (h != null)
        {
            b.a.h().unregisterReceiver(h);
        }
        if (i != null)
        {
            i.cancel(true);
        }
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    protected void f()
    {
        com.pandora.android.audio.g.a(b, c);
    }

    protected void g()
    {
        com.pandora.android.audio.g.b(b, c);
    }

    public void h()
    {
        c.b(0);
    }

    public boolean i()
    {
        return f;
    }

    public void j()
    {
    }

    public void k()
    {
        if (!b.isMusicActive())
        {
            p.df.a.d("RemoteControlClientManager", "Not fetching image for Lockscreen controllers, audio manager says we don't have active music.");
            return;
        } else
        {
            l();
            return;
        }
    }

    public void l()
    {
        if (!a(b.a.h()))
        {
            p.df.a.d("RemoteControlClientManager", "Not fetching image for Lockscreen controllers, keyguard says we are not in Lockscreen.");
            return;
        }
        if (g == null)
        {
            p.df.a.d("RemoteControlClientManager", "Not fetching image for Lockscreen controllers, we don't have track data.");
            return;
        }
        if (e)
        {
            p.df.a.d("RemoteControlClientManager", "Not fetching image for Lockscreen controllers, already displaying current track image.");
            return;
        }
        p.df.a.a("RemoteControlClientManager", "Fetching image for Lockscreen controllers.");
        if (i != null && i.getStatus() != android.os.AsyncTask.Status.FINISHED)
        {
            i.cancel(true);
        }
        i = new a();
        i.execute(new String[] {
            g.v(), "RemoteControlClientManager"
        });
        e = true;
    }

    public void onAutomotiveAccessory(e e1)
    {
        if (e1.a == p.dd.e.a.a && MediaButtonBroadcastReceiver.a())
        {
            h();
        }
    }

    public void onPlayerStateChange(ag ag1)
    {
        static class _cls1
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[p.cw.b.a.values().length];
                try
                {
                    b[p.cw.b.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    b[p.cw.b.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[p.cw.b.a.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[p.cw.b.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[p.cw.b.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                a = new int[p.dd.bh.a.values().length];
                try
                {
                    a[p.dd.bh.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[p.dd.bh.a.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.dd.bh.a.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.dd.bh.a.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.dd.bh.a.d.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.android.audio._cls1.b[ag1.a.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("onPlayerStateChange: unknown state ").append(ag1.a).toString());

        case 4: // '\004'
        case 5: // '\005'
            a();
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return;
        }
    }

    public void onSkipTrack(ap ap1)
    {
        if (p.cw.d.b(ap1.c))
        {
            c.a(6);
        }
    }

    public void onTrackBuffering(bf bf1)
    {
        com.pandora.android.audio.d d1 = c;
        byte byte0;
        if (bf1.a)
        {
            byte0 = 3;
        } else
        {
            byte0 = 8;
        }
        d1.a(byte0);
    }

    public void onTrackState(bh bh1)
    {
        switch (com.pandora.android.audio._cls1.a[bh1.a.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("onTrackState: unknown event type ").append(bh1.a).toString());

        case 1: // '\001'
            g = bh1.b;
            // fall through

        case 2: // '\002'
        case 3: // '\003'
            return;

        case 4: // '\004'
            a(bh1.b, bh1.a());
            return;

        case 5: // '\005'
            c.a(2);
            break;
        }
    }

}
