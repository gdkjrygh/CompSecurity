// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.Spinner;

public final class dam
{

    private static final bmy a = (bmy)ddz.a(bmy);
    private static final dap b[];
    private final android.widget.AdapterView.OnItemSelectedListener c = new dan(this);
    private final BaseAdapter d = new dao(this);
    private final Context e;
    private bmy f;
    private rv g;
    private int h;

    public dam(Context context, rv rv1, bmw bmw1)
    {
        f = a;
        e = (Context)b.a(context, "context", null);
        g = (rv)b.a(rv1, "actionbar", null);
        b.a(bmw1, "mode", null);
        for (int i = 0; i < b.length; i++)
        {
            if (b[i].a == bmw1)
            {
                h = i;
                return;
            }
        }

        throw new IllegalArgumentException("Requested mode not supported.");
    }

    static int a(dam dam1)
    {
        return dam1.h;
    }

    static int a(dam dam1, int i)
    {
        dam1.h = i;
        return i;
    }

    static bmy b(dam dam1)
    {
        return dam1.f;
    }

    static Context c(dam dam1)
    {
        return dam1.e;
    }

    static dap[] c()
    {
        return b;
    }

    public final void a()
    {
        g.a(c.M);
        Spinner spinner = (Spinner)g.a();
        spinner.setAdapter(d);
        spinner.setSelection(h);
        spinner.setOnItemSelectedListener(c);
        g.d(true);
    }

    public final void a(bmy bmy1)
    {
        bmy bmy2 = bmy1;
        if (bmy1 == null)
        {
            bmy2 = a;
        }
        f = bmy2;
    }

    public final void b()
    {
        g.d(false);
    }

    static 
    {
        b = (new dap[] {
            new dap(bmw.b, Integer.valueOf(c.bq)), new dap(bmw.a, Integer.valueOf(c.bp))
        });
    }
}
