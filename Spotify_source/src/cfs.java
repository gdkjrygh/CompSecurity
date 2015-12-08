// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class cfs extends cfk
{

    private final blh a;

    public cfs(blh blh1)
    {
        a = blh1;
    }

    public final String a()
    {
        return a.d;
    }

    public final void a(byb byb)
    {
        bye.a(byb);
    }

    public final List b()
    {
        Object obj = a.e;
        if (obj != null)
        {
            ArrayList arraylist = new ArrayList();
            bex bex1;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(new bhb(bex1.a(), bex1.b(), bex1.c())))
            {
                bex1 = (bex)((Iterator) (obj)).next();
            }

            return arraylist;
        } else
        {
            return null;
        }
    }

    public final void b(byb byb)
    {
        a.a((View)bye.a(byb));
    }

    public final String c()
    {
        return a.f;
    }

    public final cbs d()
    {
        bex bex1 = a.g;
        if (bex1 != null)
        {
            return new bhb(bex1.a(), bex1.b(), bex1.c());
        } else
        {
            return null;
        }
    }

    public final String e()
    {
        return a.h;
    }

    public final double f()
    {
        return a.i;
    }

    public final String g()
    {
        return a.j;
    }

    public final String h()
    {
        return a.k;
    }

    public final void i()
    {
    }

    public final boolean j()
    {
        return ((blg) (a)).a;
    }

    public final boolean k()
    {
        return ((blg) (a)).b;
    }

    public final Bundle l()
    {
        return ((blg) (a)).c;
    }
}
