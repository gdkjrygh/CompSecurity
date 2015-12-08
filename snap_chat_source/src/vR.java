// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Point;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import com.snapchat.android.discover.ui.fragment.ChannelSpanSizeLookup;

public final class vR extends android.support.v7.widget.RecyclerView.g
{

    private final ChannelSpanSizeLookup a;

    public vR(ChannelSpanSizeLookup channelspansizelookup)
    {
        a = channelspansizelookup;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.s s)
    {
        rect.set(0, 0, 0, 0);
        rect = (android.support.v7.widget.GridLayoutManager.LayoutParams)view.getLayoutParams();
        view = (FrameLayout)view;
        if (view.getChildCount() > 0)
        {
            view = view.getChildAt(0).getLayoutParams();
            if (view instanceof android.widget.FrameLayout.LayoutParams)
            {
                view = (android.widget.FrameLayout.LayoutParams)view;
                recyclerview = a;
                int i = ((android.support.v7.widget.RecyclerView.LayoutParams) (rect)).c.c();
                rect = new Point();
                recyclerview.a(rect, i);
                if (((Point) (rect)).x < 0 || ((Point) (rect)).y < 0)
                {
                    i = 17;
                } else
                {
                    if (recyclerview.a())
                    {
                        if (recyclerview.b(i))
                        {
                            i = ((ChannelSpanSizeLookup) (recyclerview)).c % 3;
                        } else
                        {
                            i = 3;
                        }
                    } else
                    {
                        i = ((ChannelSpanSizeLookup) (recyclerview)).b.mLayoutFormat[((Point) (rect)).x];
                    }
                    if (i == 2)
                    {
                        if (((Point) (rect)).y == 0)
                        {
                            i = 0x800015;
                        } else
                        {
                            i = 0x800013;
                        }
                    } else
                    {
                        i = 17;
                    }
                }
                view.gravity = i;
            }
        }
    }
}
