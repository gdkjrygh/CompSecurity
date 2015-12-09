// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.cast.CastDevice;
import com.spotify.mobile.android.connect.PlayServicesAvailabilityActivity;
import com.spotify.mobile.android.connect.model.DiscoveredDevice;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class dlq
    implements dlp
{

    final dlw a;
    public final dls b;
    public final Set c = new HashSet();
    final Context d;
    public final Set e = new HashSet();
    dlm f;
    public boolean g;
    private final dlv h = new dlv() {

        private dlq a;

        public final void a(float f1)
        {
            if (a.f != null)
            {
                a.f.a(f1);
            }
        }

        public final void a(int i)
        {
            a.c();
        }

        public final void a(DiscoveredDevice discovereddevice)
        {
            if (a.f != null)
            {
                a.f.a(discovereddevice);
            }
            if (discovereddevice != null)
            {
                dlw dlw1 = a.a;
                dlw1.a(discovereddevice.getDeviceId());
                dlw1.g();
            }
        }

        public final void a(DiscoveredDevice discovereddevice, boolean flag)
        {
            Object obj = a.a.a(discovereddevice.getDeviceId());
            if (obj != null)
            {
                discovereddevice = dlw.d(((xd) (obj)));
            }
            obj = a;
            Object obj1 = new bot();
            obj1 = (new bos(((dlq) (obj)).d.getString(0x7f080643))).a(((dlq) (obj)).d.getString(0x7f080644)).a().a(((bot) (obj1))).b();
            obj = ((dlq) (obj)).b;
            if (((dls) (obj)).a() && ((dls) (obj)).f != null)
            {
                ((dls) (obj)).f.a(((dls) (obj)).d, ((bor) (obj1))).a(new dls._cls4());
            } else
            {
                Logger.c("No API or no active media session", new Object[0]);
            }
            if (a.f != null)
            {
                a.f.a(discovereddevice, flag);
            }
        }

        public final void a(String s1, String s2)
        {
            if (a.f != null)
            {
                a.f.a(s1, s2);
            }
        }

        public final void b(DiscoveredDevice discovereddevice)
        {
            if (a.f != null)
            {
                a.f.b(discovereddevice);
            }
            a.c();
        }

            
            {
                a = dlq.this;
                super();
            }
    };

    public dlq(Context context, String s)
    {
        d = context;
        a = new dlw(context, s, this);
        b = new dls(context, s, h);
    }

    static DiscoveredDevice b(CastDevice castdevice)
    {
        boolean flag = true;
        if (castdevice == null)
        {
            return null;
        }
        if (!castdevice.a(4) || castdevice.a(1))
        {
            flag = false;
        }
        return DiscoveredDevice.createWithDefaults(castdevice.a(), castdevice.b(), "Google", castdevice.c(), flag);
    }

    public final void a()
    {
        dlw dlw1 = a;
        if (dlw1.a != null)
        {
            dlw1.b.a(dlw1.a, dlw1, 4);
            dlw1.h();
        }
    }

    public final void a(CastDevice castdevice)
    {
        if (castdevice == null)
        {
            castdevice = b;
            if (((dls) (castdevice)).e != null)
            {
                try
                {
                    boh.b.b(((dls) (castdevice)).d, gej.c);
                }
                catch (Exception exception)
                {
                    Logger.c("onMessageChannelDestroyFailed: %s", new Object[] {
                        exception
                    });
                }
                castdevice.e = null;
            }
            if (((dls) (castdevice)).f != null)
            {
                try
                {
                    boh.b.b(((dls) (castdevice)).d, ((dls) (castdevice)).f.a());
                }
                catch (Exception exception1)
                {
                    Logger.c("onMediaChannelDestroyFailed: %s", new Object[] {
                        exception1
                    });
                }
                castdevice.f = null;
            }
            if (castdevice.a())
            {
                ((dls) (castdevice)).d.c();
            }
            castdevice.d = null;
            ((dls) (castdevice)).c.a(((dls) (castdevice)).b);
            castdevice.b = null;
        } else
        {
            dls dls1 = b;
            dls1.g = g;
            dls1.b = b(castdevice);
            int i = bqi.a(dls1.a);
            boolean flag;
            if (i != 0)
            {
                Logger.c(bqi.b(i), new Object[0]);
                if (bqi.a(i))
                {
                    Intent intent = PlayServicesAvailabilityActivity.a(dls1.a);
                    intent.addFlags(0x10000000);
                    dls1.a.startActivity(intent);
                }
                flag = false;
            } else
            {
                flag = true;
            }
            if (!flag)
            {
                dls1.c.b(dls1.b);
                return;
            }
            if (dls1.d == null)
            {
                castdevice = bol.a(castdevice, new dlt(dls1, (byte)0));
                dls1.d = (new bqv(dls1.a)).a(boh.a, castdevice.a()).a(dls1).a(dls1).b();
                dls1.d.b();
                return;
            }
            if (!dls1.d.d() && !dls1.d.e())
            {
                dls1.d.b();
                return;
            }
        }
    }

    public final void a(DiscoveredDevice discovereddevice)
    {
        if (discovereddevice != null)
        {
            e.add(discovereddevice);
            for (Iterator iterator = c.iterator(); iterator.hasNext(); ((dlk)iterator.next()).b(discovereddevice)) { }
        }
    }

    public final void a(String s, dlm dlm1)
    {
        f = dlm1;
        if (!a.b(s))
        {
            dlm1.b(null);
        }
    }

    public final boolean a(String s)
    {
        dlw dlw1 = a;
        Iterator iterator = ws.a().iterator();
        CastDevice castdevice;
        xd xd1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_85;
            }
            xd1 = (xd)iterator.next();
            castdevice = CastDevice.a(xd1.e());
        } while (castdevice == null || !s.equals(castdevice.a()) || !dlw1.e(xd1));
        s = castdevice;
_L1:
        return s != null && !s.d();
        s = null;
          goto _L1
    }

    public final void b()
    {
        dlw dlw1 = a;
        dlw1.b.a(dlw1);
        for (Iterator iterator = e.iterator(); iterator.hasNext();)
        {
            DiscoveredDevice discovereddevice = (DiscoveredDevice)iterator.next();
            Iterator iterator1 = c.iterator();
            while (iterator1.hasNext()) 
            {
                ((dlk)iterator1.next()).a(discovereddevice);
            }
        }

        e.clear();
    }

    public final void b(DiscoveredDevice discovereddevice)
    {
        if (discovereddevice != null)
        {
            e.remove(discovereddevice);
            for (Iterator iterator = c.iterator(); iterator.hasNext(); ((dlk)iterator.next()).a(discovereddevice)) { }
        }
    }

    public final boolean b(String s)
    {
label0:
        {
            dls dls1 = b;
            if (dls1.b == null || !dls1.b.getDeviceId().equals(s))
            {
                break label0;
            }
            if (!dls1.a())
            {
                boolean flag;
                if (dls1.d != null && dls1.d.e())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }

    public final void c()
    {
        a.b(null);
    }

    public final void c(String s)
    {
        dls dls1 = b;
        if (dls1.a() && dls1.e != null)
        {
            try
            {
                boh.b.a(dls1.d, gej.c, s).a(new dls._cls5());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Logger.c("Exception while sending message", new Object[] {
                    s
                });
            }
            return;
        } else
        {
            Logger.c("No api or no channel", new Object[0]);
            return;
        }
    }
}
