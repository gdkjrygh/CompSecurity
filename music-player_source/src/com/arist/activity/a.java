// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.os.Handler;
import com.arist.b.b;
import com.arist.model.b.d;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.arist.activity:
//            AddToListActivity, b

final class a extends Thread
{

    final AddToListActivity a;

    a(AddToListActivity addtolistactivity)
    {
        a = addtolistactivity;
        super();
    }

    static AddToListActivity a(a a1)
    {
        return a1.a;
    }

    public final void run()
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        do
        {
            if (i >= AddToListActivity.c(a).length)
            {
                arraylist.removeAll(com.arist.activity.AddToListActivity.b(a));
                AddToListActivity.e(a).a(arraylist, a.a);
                AddToListActivity.f(a).post(new com.arist.activity.b(this, arraylist));
                return;
            }
            if (AddToListActivity.c(a)[i])
            {
                arraylist.add((b)AddToListActivity.a(a).get(i));
            }
            i++;
        } while (true);
    }
}
