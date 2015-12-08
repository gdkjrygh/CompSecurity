// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

public abstract class abk
{

    public int a;
    RecyclerView b;
    abd c;
    boolean d;
    boolean e;
    View f;
    private final abl g = new abl();

    public abk()
    {
        a = -1;
    }

    static void a(abk abk1, int i, int j)
    {
label0:
        {
            boolean flag = false;
            RecyclerView recyclerview = abk1.b;
            if (!abk1.e || abk1.a == -1 || recyclerview == null)
            {
                abk1.b();
            }
            abk1.d = false;
            if (abk1.f != null)
            {
                if (RecyclerView.d(abk1.f) == abk1.a)
                {
                    View view = abk1.f;
                    abm abm2 = recyclerview.q;
                    abk1.a(view, abk1.g);
                    abl.a(abk1.g, recyclerview);
                    abk1.b();
                } else
                {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    abk1.f = null;
                }
            }
            if (abk1.e)
            {
                abm abm1 = recyclerview.q;
                abk1.a(i, j, abk1.g);
                i = ((flag) ? 1 : 0);
                if (abk1.g.a >= 0)
                {
                    i = 1;
                }
                abl.a(abk1.g, recyclerview);
                if (i != 0)
                {
                    if (!abk1.e)
                    {
                        break label0;
                    }
                    abk1.d = true;
                    RecyclerView.u(recyclerview).a();
                }
            }
            return;
        }
        abk1.b();
    }

    protected abstract void a();

    protected abstract void a(int i, int j, abl abl1);

    protected abstract void a(View view, abl abl1);

    protected final void b()
    {
        if (!e)
        {
            return;
        } else
        {
            a();
            b.q.a = -1;
            f = null;
            a = -1;
            d = false;
            e = false;
            abd.a(c, this);
            c = null;
            b = null;
            return;
        }
    }

    public final void b(int i)
    {
        a = i;
    }
}
