// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.photos.list.fastscroll.FastScrollRecyclerView;
import java.util.Iterator;
import java.util.List;

final class hat
    implements hyo
{

    final hae a;

    hat(hae hae1)
    {
        a = hae1;
        super();
    }

    public final void a(ekp ekp1, int i, hyk hyk1)
    {
        if (hae.l(a) != null && i != -1)
        {
            int j = hae.l(a).a(i);
            int k = hae.g(a).getHeight();
            int l = hae.g(a).getPaddingTop();
            int i1 = hae.g(a).getPaddingBottom();
            i = a.g().getDimensionPixelOffset(b.vc);
            ekp1 = ((RecyclerView) (hae.g(a))).e.findViewByPosition(j);
            boolean flag = false;
            if (ekp1 == null)
            {
                flag = true;
                ekp1 = a;
                if (j >= hae.n(a))
                {
                    i = k - l - i1 - 1;
                }
                ekp1.a(j, i);
            }
            hae.g(a).requestLayout();
            hae.j(a).a(new hav(this, j, hyk1, flag));
            return;
        }
        for (Iterator iterator = hae.m(a).a().iterator(); iterator.hasNext();)
        {
            iws iws1 = (iws)iterator.next();
            if (iws1.b.equals(ekp1))
            {
                hyk1.a((View)iws1.a.getParent());
                return;
            }
        }

        hyk1.a(null);
    }
}
