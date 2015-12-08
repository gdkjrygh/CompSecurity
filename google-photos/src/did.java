// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class did
    implements ooa, oob, opl, ops, opt, opu, opv
{

    public String a;
    public List b;
    private Bundle c;
    private boolean d;
    private final rz e;
    private aav f;

    public did(Activity activity, opd opd1)
    {
        d = true;
        b = new ArrayList();
        e = (rz)activity;
        opd1.a(this);
    }

    static aav a(did did1, aav aav1)
    {
        did1.f = null;
        return null;
    }

    static boolean a(did did1)
    {
        return did1.d;
    }

    static aav b(did did1)
    {
        return did1.f;
    }

    private void g()
    {
        if (f != null)
        {
            d = false;
            f.c();
            d = true;
            f = null;
        }
    }

    public final void V_()
    {
        g();
    }

    public final void X_()
    {
        if (a != null && c != null)
        {
            a(a, c);
        }
    }

    public final void a()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((dic)iterator.next()).d()) { }
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            a = bundle.getString("com.google.android.apps.photos.actionbar.mode.Mode");
            c = bundle.getBundle("com.google.android.apps.photos.actionbar.mode.FactoryArgs");
        }
    }

    public final void a(String s, Bundle bundle)
    {
        dia dia1 = (dia)((dib)olm.a(e, dib)).a(s);
        a = s;
        c = bundle;
        s = new die(this, dia1.a(e, bundle));
        d = false;
        f = e.a(s);
        d = true;
    }

    public final void c()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((dic)iterator.next()).a()) { }
    }

    public final boolean d()
    {
        return a != null;
    }

    public final void e()
    {
        if (f != null)
        {
            f.d();
        }
    }

    public final void e(Bundle bundle)
    {
        if (a != null && c != null)
        {
            bundle.putString("com.google.android.apps.photos.actionbar.mode.Mode", a);
            bundle.putBundle("com.google.android.apps.photos.actionbar.mode.FactoryArgs", c);
        }
    }

    public final void f()
    {
        g();
        a = null;
        c = null;
    }
}
