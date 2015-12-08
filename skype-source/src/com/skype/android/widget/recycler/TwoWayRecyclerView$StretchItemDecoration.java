// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.recycler;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package com.skype.android.widget.recycler:
//            OnStretchListener, TwoWayRecyclerView

public static final class a extends android.support.v7.widget.oration
    implements OnStretchListener
{

    final int a;
    int b;
    int c;
    int d;
    final android.support.v7.widget.oration.d e;

    public final void a(int i, int j, int k)
    {
        d = k;
        b = i;
        c = j;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, android.support.v7.widget.oration oration)
    {
        int i;
        switch (a)
        {
        case 2: // '\002'
        default:
            super.a(rect, view, recyclerview, oration);
            return;

        case 1: // '\001'
        case 3: // '\003'
            i = recyclerview.getChildAdapterPosition(view);
            break;
        }
        int j = e.e(i);
        int k = e.e(i, c);
        int l = b / c;
        i = b % c;
        if (k < i)
        {
            i = Math.min(j, i - k);
        } else
        {
            i = 0;
        }
        l = l * j + i;
        i = c - j;
        if (i != 0)
        {
            i = (l * k) / i;
        } else
        {
            i = l / 2;
        }
        j = l - i;
        if (d == 0)
        {
            rect.left = rect.left + i;
            rect.right = rect.right + j;
            return;
        } else
        {
            rect.top = rect.top + i;
            rect.bottom = rect.bottom + j;
            return;
        }
    }

    public (android.support.v7.widget.oration oration, int i)
    {
        e = oration;
        a = i;
    }
}
