// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

public class hgq
    implements omb, oou, opv
{

    public noz a;
    public noz b;
    public hgz c;
    public noy d;
    public boolean e;
    public boolean f;
    public boolean g;
    private final Runnable h;
    private final Handler i;
    private final List j;

    hgq(am am1, opd opd1)
    {
        h = new hgr(this);
        i = new Handler(Looper.getMainLooper());
        j = new ArrayList();
        f = am1.U;
        opd1.a(this);
    }

    hgq(opd opd1)
    {
        h = new hgr(this);
        i = new Handler(Looper.getMainLooper());
        j = new ArrayList();
        f = true;
        opd1.a(this);
    }

    static noz a(hgq hgq1)
    {
        return hgq1.a;
    }

    static List b(hgq hgq1)
    {
        return hgq1.j;
    }

    static noy c(hgq hgq1)
    {
        return hgq1.d;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = noz.a(context, 3, "AdapterNotifier", new String[0]);
        b = noz.a(context, 2, "AdapterNotifier", new String[0]);
        c = (hgz)olm1.b(hgz);
        d = noy.a("label", olm1.a("com.google.android.apps.photos.recycleradapter.LABEL_KEY", "unknown"));
    }

    public final void a(String s)
    {
        if (!a())
        {
            if (b.a())
            {
                noy noy1 = d;
                noy.a("reason", s);
                noy.a("isVisible", Boolean.valueOf(f));
                noy.a("isInitialized", Boolean.valueOf(g));
            }
            return;
        } else
        {
            j.add(s);
            i.removeCallbacks(h);
            i.post(h);
            ((aen) (c)).a.b();
            return;
        }
    }

    public final void a(boolean flag)
    {
        boolean flag1;
        if (flag != f)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        f = flag;
        if (flag1 && e && flag)
        {
            a("Changing visibility");
        }
    }

    public boolean a()
    {
        boolean flag = false;
        if (c == null)
        {
            return false;
        }
        if (!f && g)
        {
            e = true;
            return false;
        }
        e = false;
        boolean flag1 = g;
        if (c.a() > 0)
        {
            flag = true;
        }
        g = flag | flag1;
        return true;
    }
}
