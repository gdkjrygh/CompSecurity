// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class gyl extends omp
    implements moy
{

    private mot a;
    private gxr b;
    private gpu c;
    private List d;

    public gyl()
    {
        a = new mot(this, af, this);
        d = new ArrayList();
    }

    static gpu a(gyl gyl1)
    {
        return gyl1.c;
    }

    static List a(gyl gyl1, List list)
    {
        gyl1.d = list;
        return list;
    }

    static mot b(gyl gyl1)
    {
        return gyl1.a;
    }

    public final void a(moz moz1)
    {
        if (b.a())
        {
            Iterator iterator = d.iterator();
            while (iterator.hasNext()) 
            {
                gpt gpt1 = (gpt)iterator.next();
                gpu gpu1 = c;
                boolean flag;
                if (gpu1.d == null || gpu1.d.b())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag && gpu1.c.contains(gpt1))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    moz1.a(gpt1.a);
                }
            }
        }
    }

    public final void a(rv rv)
    {
    }

    public final boolean a(MenuItem menuitem)
    {
        if (!b.a())
        {
            return false;
        }
        int i = menuitem.getItemId();
        for (menuitem = d.iterator(); menuitem.hasNext();)
        {
            gpt gpt1 = (gpt)menuitem.next();
            if (gpt1.a == i)
            {
                c.b(gpt1);
                return true;
            }
        }

        return false;
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        b = (gxr)ae.a(gxr);
        c = (gpu)ae.a(gpu);
        c.a(new gym(this));
    }
}
