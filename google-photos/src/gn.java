// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.List;

final class gn extends ge
{

    private gk a;

    gn(gk gk1)
    {
        a = gk1;
        super();
    }

    public final void a()
    {
        gk.a(a).a(8, null);
    }

    public final void a(Bundle bundle)
    {
        gk.a(a).a(7, bundle);
    }

    public final void a(fw fw)
    {
        gk.a(a).a(3, fw);
    }

    public final void a(hz hz1)
    {
        gs gs1 = null;
        if (hz1 != null)
        {
            gs1 = new gs(hz1.a, hz1.b, hz1.c, hz1.d, hz1.e);
        }
        gk.a(a).a(4, gs1);
    }

    public final void a(ib ib)
    {
        gk.a(a).a(2, ib);
    }

    public final void a(CharSequence charsequence)
    {
        gk.a(a).a(6, charsequence);
    }

    public final void a(String s, Bundle bundle)
    {
        gk.a(a).a(1, s);
    }

    public final void a(List list)
    {
        gk.a(a).a(5, list);
    }
}
