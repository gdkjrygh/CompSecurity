// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import com.facebook.g;
import com.google.common.a.hq;
import com.google.common.d.a.i;
import com.google.common.d.a.s;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.chatheads:
//            br, al, ef

class bx
    implements br
{

    final al a;
    private final Resources b;
    private int c;

    public bx(al al1)
    {
        a = al1;
        super();
        b = al.c(al1).getResources();
        a();
    }

    public PointF a(int j)
    {
        float f = 0.0F;
        int k = Math.min(j, 3);
        for (j = 1; j <= k; j++)
        {
            f += (float)c / (float)j;
        }

        return new PointF(f + (float)al.d(a), al.e(a));
    }

    public s a(List list)
    {
        java.util.ArrayList arraylist = hq.a();
        PointF pointf = new PointF(al.d(a), al.e(a));
        Iterator iterator = list.iterator();
        int j = 0;
        list = null;
        while (iterator.hasNext()) 
        {
            ef ef1 = (ef)iterator.next();
            if (list == null)
            {
                arraylist.add(ef1.a(pointf));
            } else
            {
                arraylist.add(ef1.a(list, new PointF((float)c / (float)j, 0.0F)));
            }
            j++;
            list = ef1;
        }
        return i.a(arraylist);
    }

    public void a()
    {
        c = b.getDimensionPixelOffset(g.chat_head_first_stack_offset);
    }
}
