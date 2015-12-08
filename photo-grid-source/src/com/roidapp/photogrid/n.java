// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.as;
import android.support.v7.widget.t;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid:
//            a, k

final class n extends as
{

    final int a;
    final GridLayoutManager b;
    final k c;

    n(k k, int i, GridLayoutManager gridlayoutmanager)
    {
        c = k;
        a = i;
        b = gridlayoutmanager;
        super();
    }

    public final void a(Rect rect, View view)
    {
        if (view instanceof a)
        {
            rect.left = -a * 2;
            rect.right = -a * 2;
        } else
        {
            int i = RecyclerView.c(view);
            view = b.c();
            if (view.a(i) == 1)
            {
                if (view.a(i, 2) % 2 == 0)
                {
                    rect.right = a;
                } else
                {
                    rect.left = a;
                }
                rect.bottom = a * 2;
                return;
            }
        }
    }
}
