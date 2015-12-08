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
        clerView.v v;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); f.a(b, v))
        {
            v = (clerView.v)iterator.next();
        }

        a.clear();
        f.c(b).remove(a);
    }

    clerView.v(f f1, ArrayList arraylist)
    {
        b = f1;
        a = arraylist;
        super();
    }
}
