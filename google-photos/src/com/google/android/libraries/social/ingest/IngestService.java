// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.ingest;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaScannerConnection;
import android.mtp.MtpDevice;
import android.mtp.MtpDeviceInfo;
import android.os.IBinder;
import android.os.SystemClock;
import b;
import cn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ncw;
import ncx;
import ndf;
import ndg;
import ndi;
import ndk;
import ndl;
import ndm;

// Referenced classes of package com.google.android.libraries.social.ingest:
//            IngestActivity

public final class IngestService extends Service
    implements ndf, ndk, ndm
{

    MtpDevice a;
    String b;
    public ndl c;
    cn d;
    private ndi e;
    private final IBinder f = new ncw(this);
    private ncx g;
    private IngestActivity h;
    private boolean i;
    private int j;
    private Collection k;
    private boolean l;
    private boolean m;
    private NotificationManager n;
    private long o;
    private boolean p;

    public IngestService()
    {
        i = false;
        j = 0;
        l = false;
        o = 0L;
        p = false;
    }

    private void c(MtpDevice mtpdevice)
    {
        do
        {
            if (a == mtpdevice)
            {
                return;
            }
            i = false;
            m = false;
            k = null;
            l = false;
            a = mtpdevice;
            c.a(a);
            if (a == null)
            {
                break MISSING_BLOCK_LABEL_121;
            }
            mtpdevice = a.getDeviceInfo();
            if (mtpdevice != null)
            {
                break;
            }
            mtpdevice = null;
        } while (true);
        b = mtpdevice.getModel();
        d.a(b);
        (new Thread(c.d())).start();
_L1:
        if (h != null)
        {
            h.f();
            return;
        } else
        {
            l = true;
            return;
        }
        b = null;
          goto _L1
    }

    public final void a(int i1, int j1, String s)
    {
        ncx ncx1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        ncx1 = g;
        Object obj = ncx1.d;
        obj;
        JVM INSTR monitorenter ;
        if (!ncx1.c)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        ncx1.b.scanFile(s, null);
_L2:
        p = false;
        if (h != null)
        {
            h.a(i1, j1, s);
        }
        d.a(j1, i1, false).b(getResources().getText(b.FS));
        n.notify(b.FD, d.a());
        return;
        ncx1.a.add(s);
        ncx1.b.connect();
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a(MtpDevice mtpdevice)
    {
        if (a == null)
        {
            c(mtpdevice);
        }
    }

    public final void a(IngestActivity ingestactivity)
    {
        if (h != ingestactivity) goto _L2; else goto _L1
_L1:
        return;
_L2:
        h = ingestactivity;
        if (h != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (p)
        {
            d.a(0, 0, false).b(getResources().getText(b.FV));
            n.notify(b.FE, d.a());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        n.cancel(b.FD);
        n.cancel(b.FE);
        if (i)
        {
            h.a(k, j);
            i = false;
            k = null;
        }
        if (l)
        {
            h.f();
            l = false;
        }
        ingestactivity = c;
        boolean flag;
        if (((ndl) (ingestactivity)).b != null && ((ndl) (ingestactivity)).d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            h.h();
        }
        if (m)
        {
            h.i();
            m = false;
        }
        if (a != null)
        {
            p = true;
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void a(Collection collection, int i1)
    {
        stopForeground(true);
        p = true;
        if (h != null)
        {
            h.a(collection, i1);
            return;
        } else
        {
            i = true;
            k = collection;
            j = i1;
            d.a(0, 0, false).b(getResources().getText(b.FR));
            n.notify(b.FD, d.a());
            return;
        }
    }

    public final void a(ndg ndg, int i1)
    {
        p = false;
        if (h != null)
        {
            h.a(ndg, i1);
        } else
        {
            long l1 = SystemClock.uptimeMillis();
            if (l1 > o + 180L)
            {
                o = l1;
                d.a(0, i1, true).b(getResources().getText(b.FU));
                n.notify(b.FE, d.a());
                return;
            }
        }
    }

    public final void b(MtpDevice mtpdevice)
    {
        if (mtpdevice == a)
        {
            n.cancel(b.FE);
            n.cancel(b.FD);
            c(null);
            p = false;
        }
    }

    public final void g()
    {
        if (h != null)
        {
            h.g();
        }
    }

    public final void h()
    {
        p = true;
        if (h != null)
        {
            h.h();
            return;
        } else
        {
            d.a(0, 0, false).b(getResources().getText(b.FV));
            n.notify(b.FE, d.a());
            return;
        }
    }

    public final void i()
    {
        if (h != null)
        {
            h.i();
            return;
        } else
        {
            m = true;
            return;
        }
    }

    public final IBinder onBind(Intent intent)
    {
        return f;
    }

    public final void onCreate()
    {
        super.onCreate();
        g = new ncx(this);
        n = (NotificationManager)getSystemService("notification");
        d = new cn(this);
        d.a(0x108007c).d = PendingIntent.getActivity(this, 0, new Intent(this, com/google/android/libraries/social/ingest/IngestActivity), 0);
        c = ndl.a();
        c.a(this);
        e = new ndi(getApplicationContext());
        List list = e.a();
        if (!list.isEmpty())
        {
            c((MtpDevice)list.get(0));
        }
        ndi ndi1 = e;
        synchronized (ndi1.c)
        {
            if (!ndi1.b.contains(this))
            {
                ndi1.b.add(this);
            }
        }
        return;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onDestroy()
    {
        ndi ndi1 = e;
        ndi1.a.unregisterReceiver(ndi1.f);
        c.b(this);
        super.onDestroy();
    }
}
