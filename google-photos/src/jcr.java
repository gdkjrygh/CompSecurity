// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class jcr
    implements gge, mti, omb, opl, ops, opt, opu, opv
{

    final jcx a;
    public final gfy b;
    public Context c;
    public mtj d;
    public mmr e;
    mwx f;
    public ArrayList g;
    public boolean h;
    public long i;
    public noz j;
    public gfw k;
    ejn l;
    Uri m;
    ggd n;
    private mqw o;
    private ArrayList p;
    private mqv q;

    public jcr(opd opd1, jcx jcx1, gfy gfy1)
    {
        i = -1L;
        p = new ArrayList();
        q = new jcu(this);
        a = jcx1;
        b = gfy1;
        b.a(new jcs(this));
        opd1.a(this);
    }

    private void a(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(((mqr)list.next()).d)) { }
        list = new dmb(e.d(), p);
        ((dmb) (list)).c.addAll(arraylist);
        c();
        a.a(list);
    }

    private void f()
    {
        if (m != null)
        {
            ggd ggd1 = n;
            Uri uri = m;
            ggd1.a.remove(uri);
            m = null;
        }
    }

    private void g()
    {
        c();
        a.a();
    }

    public final void V_()
    {
        if (j.a())
        {
            noy.a("this", this);
        }
        d();
        f();
    }

    public final void X_()
    {
        if (j.a())
        {
            noy.a("this", this);
        }
        if (i != -1L)
        {
            mqm mqm1 = a(i);
            o.a(q, mqm1);
        } else
        if (m != null)
        {
            n.a(m, this);
            return;
        }
    }

    mqm a(long l1)
    {
        return mqm.a(e.d(), "instant", l1);
    }

    public final void a()
    {
        f.a(new jct(this));
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        j = noz.a(context, 3, "UploadMixin", new String[0]);
        if (j.a())
        {
            noy.a("this", this);
        }
        c = context;
        d = ((mtj)olm1.a(mtj)).a(this);
        e = (mmr)olm1.a(mmr);
        o = (mqw)olm1.a(mqw);
        f = (mwx)olm1.a(mwx);
        k = (gfw)olm1.a(gfw);
        l = (ejn)olm1.a(ejn);
        n = (ggd)olm1.a(ggd);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            i = bundle.getLong("upload_batch_id");
            h = bundle.getBoolean("is_running");
            g = bundle.getParcelableArrayList("media_list");
            p = bundle.getStringArrayList("media_keys");
            m = (Uri)bundle.getParcelable("aam_preview_uri");
        }
        if (j.a())
        {
            noy.a("this", this);
        }
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (j.a())
        {
            noy.a("tag", s);
            noy.a("result", mue1);
            noy.a("this", this);
        }
        if (h)
        {
            if ("StartUploadTask".equals(s))
            {
                if (mue1.c())
                {
                    g();
                    return;
                } else
                {
                    i = mue1.a().getLong("batch_id");
                    return;
                }
            }
            if ("GetUploadMediaStatusesTask".equals(s))
            {
                if (mue1.c())
                {
                    g();
                    return;
                } else
                {
                    a(((List) (mue1.a().getParcelableArrayList("statuses"))));
                    return;
                }
            }
            if ("UploadPreviewTask".equals(s))
            {
                if (mue1.c())
                {
                    g();
                    return;
                } else
                {
                    p.add(mue1.a().getString("mediakey"));
                    a(Collections.emptyList());
                    f();
                    return;
                }
            }
        }
    }

    public void c()
    {
        h = false;
        d();
        i = -1L;
        f();
    }

    void d()
    {
        if (i != -1L)
        {
            o.b(q, a(i));
        }
    }

    public void e()
    {
        Object obj = new ArrayList();
        for (Iterator iterator = g.iterator(); iterator.hasNext();)
        {
            hpk hpk1 = ((hpg)((ekp)iterator.next()).a(hpg)).b();
            if (hpk1.a())
            {
                p.add(hpk1.c);
            } else
            {
                ((List) (obj)).add(hpk1.a);
            }
        }

        if (((List) (obj)).isEmpty())
        {
            a(Collections.emptyList());
            return;
        }
        a.a(0, ((List) (obj)).size());
        if (j.a())
        {
            noy.a("this", this);
        }
        obj = new mqz(c, e.d(), "instant", ((java.util.Collection) (obj)));
        obj.a = q;
        d.a(((mtf) (obj)));
    }

    public final void e(Bundle bundle)
    {
        if (j.a())
        {
            noy.a("this", this);
        }
        bundle.putLong("upload_batch_id", i);
        bundle.putBoolean("is_running", h);
        bundle.putParcelableArrayList("media_list", g);
        bundle.putStringArrayList("media_keys", p);
        if (m != null)
        {
            bundle.putParcelable("aam_preview_uri", m);
        }
    }

    public final String toString()
    {
        boolean flag = h;
        long l1 = i;
        String s = String.valueOf(g);
        String s1 = String.valueOf(p);
        return (new StringBuilder(String.valueOf(s).length() + 100 + String.valueOf(s1).length())).append("UploadMixin {isRunning: ").append(flag).append(", currentUploadBatchId: ").append(l1).append(", mediaList: ").append(s).append(", mediaKeys: ").append(s1).append("}").toString();
    }
}
