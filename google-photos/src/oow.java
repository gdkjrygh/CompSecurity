// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import java.util.List;

public final class oow extends opd
{

    private opi b;
    private opi c;
    private opi d;
    private opi e;
    private opi f;

    public oow()
    {
    }

    static void a(oow oow1, opv opv1, boolean flag)
    {
        a(opv1, flag);
    }

    private static void a(opv opv1, boolean flag)
    {
        if (opv1 instanceof oou)
        {
            ((oou)opv1).a(flag);
        }
    }

    public final void a()
    {
        b(d);
        for (int i = 0; i < a.size(); i++)
        {
            opv opv1 = (opv)a.get(i);
            if (opv1 instanceof oos)
            {
                ((oos)opv1).a();
            }
        }

    }

    public final void a(Activity activity)
    {
        b = a(((opi) (new oox(this, activity))));
    }

    public final void a(Bundle bundle)
    {
        c = a(((opi) (new ooy(this, bundle))));
    }

    public final void a(View view, Bundle bundle)
    {
        d = a(((opi) (new opb(this, bundle, view))));
    }

    public final void a(boolean flag)
    {
        if (f != null)
        {
            b(f);
        }
        if (!flag)
        {
            f = a(((opi) (new ooz(this, flag))));
        } else
        {
            int i = 0;
            while (i < a.size()) 
            {
                a((opv)a.get(i), flag);
                i++;
            }
        }
    }

    public final void b(Bundle bundle)
    {
        e = a(new opa(this, bundle));
    }

    public final void c()
    {
        super.c();
        b(c);
        b(e);
    }

    public final void d()
    {
        b(b);
    }
}
