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
        angeInfo angeinfo;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); DefaultItemAnimator.a(b, angeinfo))
        {
            angeinfo = (angeInfo)iterator.next();
        }

        a.clear();
        DefaultItemAnimator.b(b).remove(a);
    }

    angeInfo(DefaultItemAnimator defaultitemanimator, ArrayList arraylist)
    {
        b = defaultitemanimator;
        a = arraylist;
        super();
    }
}
