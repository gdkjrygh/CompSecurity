// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.skype.SkyLib;
import com.skype.android.util.ServerClock;
import com.skype.android.util.TimeAnomalyException;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;

// Referenced classes of package com.skype.android.app.chat:
//            MessageAdapter, MessageHolder

public class ChatTimedividerItemDecoration extends android.support.v7.widget.RecyclerView.g
{
    private static final class a
    {

        TextView dividerTextView;
        View lineLeft;
        View lineRight;

        public final void update(String s, boolean flag)
        {
            boolean flag1 = false;
            dividerTextView.setText(s);
            s = lineLeft;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 4;
            }
            s.setVisibility(i);
            s = lineRight;
            if (flag)
            {
                i = ((flag1) ? 1 : 0);
            } else
            {
                i = 4;
            }
            s.setVisibility(i);
        }

        public a(View view)
        {
            dividerTextView = (TextView)view.findViewById(0x7f1002cb);
            lineLeft = view.findViewById(0x7f1002cd);
            lineRight = view.findViewById(0x7f1002cc);
        }
    }


    private MessageAdapter adapter;
    private final int clippingMargin;
    private View dividerView;
    private final int dividerViewHeight;
    private a dividerViewHolder;
    private LinearLayoutManager layoutManager;
    private RecyclerView recyclerView;
    private ServerClock serverClock;
    private TimeAnomalyTelemetry timeAnomalyTelemetry;
    private TimeUtil timeUtil;

    public ChatTimedividerItemDecoration(RecyclerView recyclerview, TimeUtil timeutil, SkyLib skylib, TimeAnomalyTelemetry timeanomalytelemetry)
    {
        recyclerView = recyclerview;
        timeUtil = timeutil;
        timeAnomalyTelemetry = timeanomalytelemetry;
        adapter = (MessageAdapter)recyclerview.getAdapter();
        layoutManager = (LinearLayoutManager)recyclerview.getLayoutManager();
        clippingMargin = recyclerview.getResources().getDimensionPixelSize(0x7f0c0239);
        dividerViewHeight = recyclerview.getResources().getDimensionPixelSize(0x7f0c0184);
        serverClock = new ServerClock(skylib);
        inflateDividerView(recyclerview);
    }

    private int findNextdividerPosition(int i)
    {
        for (i++; i < layoutManager.findLastVisibleItemPosition(); i++)
        {
            if (hasTimeDivider(i))
            {
                return i;
            }
        }

        return -1;
    }

    private int getDecoratedTop(int i)
    {
        View view = layoutManager.findViewByPosition(i);
        if (view == null)
        {
            return 0;
        } else
        {
            return layoutManager.getDecoratedTop(view);
        }
    }

    private boolean hasTimeDivider(int i)
    {
        long l;
        if (i != -1)
        {
            if ((l = adapter.getItem(i).getTimestamp()) != 0L)
            {
                if (i != 0)
                {
                    long l1 = adapter.getItem(i - 1).getTimestamp();
                    if (l1 != 0L && !timeUtil.e(l, l1))
                    {
                        return true;
                    }
                } else
                {
                    return true;
                }
            }
        }
        return false;
    }

    private void inflateDividerView(RecyclerView recyclerview)
    {
        dividerView = LayoutInflater.from(recyclerview.getContext()).inflate(0x7f03004d, recyclerview, false);
        dividerView.setLayoutParams(new android.support.v7.widget.RecyclerView.j(-1));
        dividerViewHolder = new a(dividerView);
    }

    public void bindDividerViewToPosition(int i, boolean flag)
    {
        String s;
        MessageHolder messageholder;
        messageholder = adapter.getItem(i);
        s = "";
        String s1;
        long l = serverClock.a();
        s1 = timeUtil.d(l, TimeUtil.h(messageholder.getTimestamp()));
        s = s1;
_L2:
        dividerViewHolder.update(s, flag);
        dividerView.measure(android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(dividerViewHeight, 0x40000000));
        dividerView.layout(0, 0, dividerView.getMeasuredWidth(), dividerView.getMeasuredHeight());
        return;
        TimeAnomalyException timeanomalyexception;
        timeanomalyexception;
        timeAnomalyTelemetry.a(timeanomalyexception, Integer.valueOf(messageholder.getTypeOrdinal()), "ChatTimedividerItemDecoration#bindDividerViewToPosition");
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void clearCache()
    {
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.s s)
    {
        super.getItemOffsets(rect, view, recyclerview, s);
        for (int i = recyclerview.getChildPosition(view); i == -1 || !hasTimeDivider(i);)
        {
            return;
        }

        rect.top = dividerViewHeight;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.s s)
    {
        super.onDraw(canvas, recyclerview, s);
        if (recyclerview.getChildCount() > 0 && adapter.getItemCount() > 0)
        {
            for (int i = 0; i < recyclerview.getChildCount(); i++)
            {
                int j = recyclerview.getChildAdapterPosition(recyclerview.getChildAt(i));
                if (j == -1 || !hasTimeDivider(j))
                {
                    continue;
                }
                int k = getDecoratedTop(j);
                if (k > 0)
                {
                    bindDividerViewToPosition(j, true);
                    canvas.save();
                    canvas.translate(0.0F, k);
                    dividerView.draw(canvas);
                    canvas.restore();
                }
            }

        }
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.s s)
    {
        super.onDrawOver(canvas, recyclerview, s);
        if (recyclerview.getChildCount() > 0 && adapter.getItemCount() > 0)
        {
            int k = layoutManager.findFirstVisibleItemPosition();
            if (k != -1 && adapter.getItem(k).getTimestamp() != 0L)
            {
                boolean flag = false;
                if (getDecoratedTop(k) <= 0)
                {
                    int j = findNextdividerPosition(k);
                    int i = ((flag) ? 1 : 0);
                    if (j != -1)
                    {
                        j = getDecoratedTop(j) - dividerViewHeight;
                        i = ((flag) ? 1 : 0);
                        if (j < 0)
                        {
                            i = j;
                        }
                    }
                    bindDividerViewToPosition(k, false);
                    canvas.save();
                    canvas.translate(0.0F, i);
                    canvas.clipRect(0, 0, canvas.getWidth() - clippingMargin, canvas.getHeight());
                    dividerView.draw(canvas);
                    canvas.restore();
                    return;
                }
            }
        }
    }
}
