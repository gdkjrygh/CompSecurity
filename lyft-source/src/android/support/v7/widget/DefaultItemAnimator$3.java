// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v7.widget:
//            DefaultItemAnimator

class a
    implements Runnable
{

    final ArrayList a;
    final DefaultItemAnimator b;

    public void run()
    {
        r r;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); DefaultItemAnimator.a(b, r))
        {
            r = (r)iterator.next();
        }

        a.clear();
        DefaultItemAnimator.c(b).remove(a);
    }

    r(DefaultItemAnimator defaultitemanimator, ArrayList arraylist)
    {
        b = defaultitemanimator;
        a = arraylist;
        super();
    }
}
