// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v7.widget:
//            f

final class a
    implements Runnable
{

    final ArrayList a;
    final f b;

    public final void run()
    {
        a a1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); f.a(b, a1))
        {
            a1 = (b)iterator.next();
        }

        a.clear();
        f.b(b).remove(a);
    }

    (f f1, ArrayList arraylist)
    {
        b = f1;
        a = arraylist;
        super();
    }
}
