// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

public final class hgd
    implements omb, ops, opv
{

    final hgc a;
    noz b;
    noz c;
    int d;
    public boolean e;
    boolean f;
    hgk g;
    private Context h;
    private int i;
    private mtj j;
    private boolean k;
    private String l;
    private String m;

    public hgd(am am, opd opd1, hgc hgc)
    {
        p.a(am);
        p.a(opd1);
        opd1.a(this);
        a = hgc;
    }

    void a()
    {
        Object obj = new hgg();
        obj.b = h;
        obj.a = i;
        obj.c = l;
        obj.d = m;
        obj.e = g;
        boolean flag;
        if (!k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj.f = flag;
        obj.g = k;
        obj = ((hgg) (obj)).a();
        e = true;
        j.a(((mtf) (obj)));
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        i = ((mmr)olm1.a(mmr)).d();
        j = ((mtj)olm1.a(mtj)).a("ReadMediaCollectionById", new hge(this));
        h = context;
        b = noz.a(context, 3, "ReadMediaCollectionById", new String[0]);
        c = noz.a(context, "ReadMediaCollectionById", new String[0]);
        if (bundle != null)
        {
            k = bundle.getBoolean("is_shared_media");
            d = bundle.getInt("number_of_fetches");
            l = bundle.getString("media_key");
            m = bundle.getString("auth_key");
            e = bundle.getBoolean("is_task_running");
            f = bundle.getBoolean("is_task_finished");
        }
    }

    public final void a(String s, String s1, boolean flag)
    {
        boolean flag1;
        if (!TextUtils.isEmpty(s))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.a(flag1);
        if (e || f)
        {
            if (b.a())
            {
                noy.a("isRunning", Boolean.valueOf(e));
                noy.a("isFinished", Boolean.valueOf(f));
            }
            return;
        } else
        {
            k = flag;
            l = s;
            m = s1;
            g = null;
            d = 0;
            a();
            return;
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("is_shared_media", k);
        bundle.putInt("number_of_fetches", d);
        bundle.putString("media_key", l);
        bundle.putString("auth_key", m);
        bundle.putBoolean("is_task_running", e);
        bundle.putBoolean("is_task_finished", f);
    }
}
