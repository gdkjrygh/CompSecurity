// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.listview;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.common.a.ev;
import com.google.common.a.ik;
import java.util.Map;

// Referenced classes of package com.facebook.widget.listview:
//            o, n

public class l
{

    public l()
    {
    }

    public o a(ListView listview)
    {
        int i = listview.getFirstVisiblePosition();
        int j = listview.getLastVisiblePosition();
        if (listview.isStackFromBottom())
        {
            if (listview.getCount() == 0 || j == listview.getCount() - 1)
            {
                return o.BOTTOM;
            }
            if (i == 0)
            {
                return o.TOP;
            }
        } else
        {
            if (listview.getCount() == 0 || i == 0)
            {
                return o.TOP;
            }
            if (j == listview.getCount() - 1)
            {
                return o.BOTTOM;
            }
        }
        return o.MIDDLE;
    }

    public ev b(ListView listview)
    {
        java.util.LinkedHashMap linkedhashmap;
        ListAdapter listadapter;
        int i;
        int j;
        int k;
        linkedhashmap = ik.b();
        j = listview.getFirstVisiblePosition();
        k = listview.getLastVisiblePosition();
        listadapter = listview.getAdapter();
        i = j;
_L2:
        long l1;
        if (i > k || i >= listadapter.getCount())
        {
            return ev.a(linkedhashmap);
        }
        l1 = listadapter.getItemId(i);
        if (l1 != 0x8000000000000000L)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        View view = listview.getChildAt(i - j);
        if (view != null)
        {
            linkedhashmap.put(Long.valueOf(l1), Integer.valueOf(view.getTop()));
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public n c(ListView listview)
    {
        return new n(a(listview), b(listview));
    }
}
