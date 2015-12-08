// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.support.v7.widget.bi;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            i

final class l
    implements Runnable
{

    final ArrayList a;
    final i b;

    l(i j, ArrayList arraylist)
    {
        b = j;
        a = arraylist;
        super();
    }

    public final void run()
    {
        bi bi1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); i.a(b, bi1))
        {
            bi1 = (bi)iterator.next();
        }

        a.clear();
        i.c(b).remove(a);
    }
}
