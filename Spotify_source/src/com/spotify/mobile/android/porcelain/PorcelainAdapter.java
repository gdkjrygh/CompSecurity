// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain;

import aav;
import abo;
import android.view.ViewGroup;
import com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate;
import com.spotify.mobile.android.porcelain.json.collection.PorcelainJsonImmutableLinearCollection;
import ctz;
import dog;
import doh;
import doi;
import doj;
import dps;
import dqg;
import dqx;
import drf;
import drt;
import java.util.WeakHashMap;

public class PorcelainAdapter extends aav
{

    public final doj c;
    private final doh d;
    private dps e;

    private PorcelainAdapter(doh doh1)
    {
        d = (doh)ctz.a(doh1);
        d.a.a().a(new drt() {

            private PorcelainAdapter a;

            public final void a()
            {
                a.c();
            }

            
            {
                a = PorcelainAdapter.this;
                super();
            }
        });
        c = new doj((byte)0);
        a();
    }

    public PorcelainAdapter(doh doh1, byte byte0)
    {
        this(doh1);
    }

    public static dog e()
    {
        return new dog();
    }

    public final int a(int i)
    {
        return f(i).getType();
    }

    public final volatile abo a(ViewGroup viewgroup, int i)
    {
        return dqx.a(i, viewgroup, d);
    }

    public final void a(abo abo)
    {
        ((dqx)abo).v();
    }

    public final void a(abo abo, int i)
    {
        ((dqx)abo).b(f(i), c);
    }

    public final void a(dps dps1)
    {
        if (e != dps1)
        {
            int j = b();
            int i;
            if (dps1 != null)
            {
                i = dps1.getItemCount();
            } else
            {
                i = 0;
            }
            if (i == 0 || i < j || j != 0 && !f(0).equals(dps1.getItem(0)))
            {
                c.b.a.clear();
            }
            e = dps1;
        }
    }

    public final int b()
    {
        return d().getItemCount();
    }

    public final long b(int i)
    {
        return (long)f(i).hashCode();
    }

    public final dps d()
    {
        if (e != null)
        {
            return e;
        } else
        {
            return PorcelainJsonImmutableLinearCollection.EMPTY;
        }
    }

    public final drf f(int i)
    {
        return d().getItem(i);
    }
}
