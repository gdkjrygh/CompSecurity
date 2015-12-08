// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.a;

import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.release.ParentActivity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.roidapp.photogrid.cloud.a:
//            q, l, a

final class r
    implements android.widget.AbsListView.OnScrollListener
{

    final q a;
    private Set b;
    private String c;
    private int d;
    private boolean e;

    private r(q q1, boolean flag)
    {
        a = q1;
        super();
        if (q1.f != null)
        {
            q1 = (new StringBuilder()).append(q1.f.replaceAll("/", "_")).append("_").toString().replaceAll("__", "_");
        } else
        {
            q1 = "";
        }
        c = q1;
        f.a((new StringBuilder()).append(c).append("Page").toString(), 1, 0);
        e = flag;
    }

    r(q q1, boolean flag, byte byte0)
    {
        this(q1, flag);
    }

    static String a(r r1)
    {
        return r1.c;
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (q.a(a) == null || j == 0 || abslistview == null) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        if (b == null)
        {
            b = new HashSet(q.a(a).size() + 2);
        }
        k = ((ListView)abslistview).getHeaderViewsCount();
        j1 = q.a(a).size();
        i1 = i - k;
        k = 0;
_L22:
        if (k >= j) goto _L2; else goto _L3
_L3:
        if (i1 < 0) goto _L5; else goto _L4
_L4:
        if (i1 >= j1) goto _L2; else goto _L6
_L6:
        l l1 = (l)q.a(a).get(i1);
        if (l1 == null || l1.f) goto _L5; else goto _L7
_L7:
        abslistview = null;
        l1.d();
        JVM INSTR tableswitch 0 8: default 188
    //                   0 336
    //                   1 273
    //                   2 320
    //                   3 328
    //                   4 403
    //                   5 419
    //                   6 411
    //                   7 427
    //                   8 435;
           goto _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L8:
        i = 0;
_L18:
        if (abslistview != null)
        {
            int k1 = abslistview.hashCode();
            if (!b.contains(Integer.valueOf(k1)))
            {
                f.a((new StringBuilder()).append(c).append(abslistview).toString(), 5, i);
                b.add(Integer.valueOf(k1));
            }
        }
_L5:
        i1++;
        k++;
        continue; /* Loop/switch isn't completed */
_L10:
        if (az.q != 5)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!a.b)
        {
            abslistview = "Filter";
            i = 0;
        } else
        {
            abslistview = "Retouch";
            i = 0;
        }
          goto _L18
        if (az.q != 0) goto _L8; else goto _L19
_L19:
        abslistview = "Template";
        i = 0;
          goto _L18
_L11:
        abslistview = "Sticker";
        i = 0;
          goto _L18
_L12:
        abslistview = "mode";
        i = 0;
          goto _L18
_L9:
        if (d != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = ((a)l1).b;
        d = l1.hashCode();
        abslistview = "adCard1";
          goto _L18
        if (d == l1.hashCode()) goto _L8; else goto _L20
_L20:
        i = ((a)l1).b;
        d = l1.hashCode();
        abslistview = "adCard2";
          goto _L18
_L13:
        abslistview = "CMBackup";
        i = 0;
          goto _L18
_L15:
        abslistview = "followUS";
        i = 0;
          goto _L18
_L14:
        abslistview = "home";
        i = 0;
          goto _L18
_L16:
        abslistview = "Starcard";
        i = 0;
          goto _L18
_L17:
        abslistview = "FBInvite";
        i = 0;
          goto _L18
_L2:
        return;
        if (true) goto _L22; else goto _L21
_L21:
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (1 == i && a.d != null)
        {
            abslistview = a.d.getCurrentFocus();
            if (abslistview != null)
            {
                abslistview.clearFocus();
            }
        }
    }
}
