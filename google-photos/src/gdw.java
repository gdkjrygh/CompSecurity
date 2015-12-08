// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class gdw
    implements gdt, mmt, omb, opp, opr, opv
{

    gdn a;
    Set b;
    gcp c;
    long d;
    noz e;
    private int f;
    private eto g;
    private boolean h;
    private mmr i;
    private gdz j;

    public gdw(ar ar, opd opd1)
    {
        f = -1;
        b = new HashSet();
        c = gcp.a;
        e = noz.a(ar, 3, "SyncLifecycleMixin", new String[0]);
        j = new gdz(this, ar, opd1);
        opd1.a(this);
    }

    static gdn a(gdw gdw1)
    {
        return gdw1.a;
    }

    static eto b(gdw gdw1)
    {
        return gdw1.g;
    }

    private void c()
    {
        if (i.e())
        {
            f = i.d();
            j.a(f);
        }
    }

    public final void a(int k, gcp gcp1)
    {
        if (e.a())
        {
            a("onSyncStarted", noy.a("sync account", Integer.valueOf(k)));
        }
        if (k == f)
        {
            h = true;
            c = gcp1;
            Iterator iterator = b.iterator();
            while (iterator.hasNext()) 
            {
                ((geb)iterator.next()).a(gcp1);
            }
        }
    }

    public final void a(int k, gcp gcp1, long l)
    {
        if (e.a())
        {
            a("onSyncStopped", noy.a("sync account", Integer.valueOf(k)));
        }
        if (k == f)
        {
            h = false;
            c = gcp1;
            d = l;
            Iterator iterator = b.iterator();
            while (iterator.hasNext()) 
            {
                ((geb)iterator.next()).b(gcp1, l);
            }
        }
    }

    public final void a(int k, Long long1, long l)
    {
        if (e.a())
        {
            int i1;
            if (long1 != null && long1.longValue() > 0L)
            {
                i1 = (int)((double)l / (double)long1.longValue()) * 100;
            } else
            {
                i1 = 0;
            }
            a("onSyncProgress", noy.a("progress", Integer.valueOf(i1)));
        }
        if (k == f)
        {
            Iterator iterator = b.iterator();
            while (iterator.hasNext()) 
            {
                ((geb)iterator.next()).a(long1, l);
            }
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        i = (mmr)olm1.a(mmr);
        i.a(this);
        a = (gdn)olm1.a(gdn);
        g = (eto)olm1.a(eto);
    }

    public final void a(geb geb1)
    {
        if (!gcp.a.equals(c))
        {
            geb1.a(c, d);
            if (h)
            {
                geb1.a(c);
            }
        }
        b.add(geb1);
        if (e.a())
        {
            a("added observer", noy.a("observer", geb1));
        }
    }

    void a(String s, noy noy1)
    {
        noy.a("current account", Integer.valueOf(f));
        noy.a("library state", c);
        noy.a("sync running", Boolean.valueOf(h));
        noy.a("total observers", Integer.valueOf(b.size()));
    }

    public final void a(boolean flag, mms mms1, mms mms2, int k, int l)
    {
        if (flag)
        {
            if (mms1 == mms.c)
            {
                if (e.a())
                {
                    a("invalid account", noy.a(k));
                }
                f = -1;
                c = gcp.a;
                b.clear();
            }
            if (mms2 == mms.c)
            {
                if (e.a())
                {
                    a("valid account", noy.a(l));
                }
                c();
                return;
            }
        }
    }

    public final void al_()
    {
        c();
        if (e.a())
        {
            a("refreshing state", noy.a("event", "onAttachBinder"));
        }
    }

    public final void am_()
    {
        if (e.a())
        {
            a("pausing", noy.a("event", "onStop"));
        }
        gdn gdn1 = a;
        b.u();
        gdn1.a.remove(this);
        b.clear();
    }

    public final void b(geb geb1)
    {
        b.remove(geb1);
        if (e.a())
        {
            a("removed observer", noy.a("observer", geb1));
        }
    }
}
