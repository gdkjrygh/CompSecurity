// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.content.Context;
import android.widget.ListView;
import com.kik.android.a;
import com.kik.cache.ad;
import java.util.List;
import kik.a.d.k;
import kik.a.e.r;
import kik.a.e.w;
import kik.android.chat.fragment.at;

// Referenced classes of package kik.android.util:
//            ab, ao

public final class ap extends ab
{

    private at e;
    private w f;
    private r g;

    public ap(Context context, ad ad, w w, r r)
    {
        super(context, ad);
        f = w;
        g = r;
    }

    public final void a(boolean flag, k k, List list, boolean flag1, ListView listview, ao ao, a a1)
    {
        int i = a();
        int j = a(i);
        if (e == null || listview.getAdapter() == null || flag)
        {
            e = new at(k, list, f, d, ao, i, j, flag1, g, a1);
            listview.setAdapter(e);
            return;
        } else
        {
            e.a(list, i, j, flag1);
            return;
        }
    }
}
