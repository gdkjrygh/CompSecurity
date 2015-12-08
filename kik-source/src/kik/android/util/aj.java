// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.content.Context;
import android.widget.ListView;
import com.kik.cache.ad;
import kik.a.d.m;
import kik.android.chat.fragment.as;

// Referenced classes of package kik.android.util:
//            ab

public final class aj extends ab
{

    private as e;

    public aj(Context context, ad ad)
    {
        super(context, ad);
    }

    public final void a(boolean flag, m m, ListView listview)
    {
        int i = a();
        int j = a(i);
        if (e == null || listview.getAdapter() == null || flag)
        {
            e = new as(m, d, i, j);
            listview.setAdapter(e);
            return;
        } else
        {
            e.a(m, i, j);
            return;
        }
    }
}
