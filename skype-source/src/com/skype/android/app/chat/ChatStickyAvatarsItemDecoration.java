// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.skype.android.util.ContactUtil;
import com.skype.android.widget.PathClippedImageView;
import com.skype.android.widget.PathType;

// Referenced classes of package com.skype.android.app.chat:
//            MessageAdapter, f

public class ChatStickyAvatarsItemDecoration extends android.support.v7.widget.RecyclerView.g
{

    private MessageAdapter adapter;
    private ContactUtil contactUtil;
    private final int defaultAvatarSize;
    private final int defaultBottomMargin;
    private final int defaultLeftMargin;
    private final int defaultTopMargin;
    private final int defaultYPosition;
    private final int dividerViewHeight;
    private LinearLayoutManager layoutManager;
    private PathClippedImageView mainAvatarView;
    private final Paint maskPaint = new Paint();
    private PathClippedImageView peekingAvatarView;
    private RecyclerView recyclerView;

    public ChatStickyAvatarsItemDecoration(RecyclerView recyclerview, ContactUtil contactutil)
    {
        contactUtil = contactutil;
        recyclerView = recyclerview;
        adapter = (MessageAdapter)recyclerview.getAdapter();
        layoutManager = (LinearLayoutManager)recyclerview.getLayoutManager();
        recyclerview = recyclerview.getResources();
        dividerViewHeight = recyclerview.getDimensionPixelSize(0x7f0c0184);
        defaultTopMargin = recyclerview.getDimensionPixelSize(0x7f0c007c);
        defaultBottomMargin = recyclerview.getDimensionPixelSize(0x7f0c0079);
        defaultLeftMargin = recyclerview.getDimensionPixelSize(0x7f0c007f);
        defaultAvatarSize = recyclerview.getDimensionPixelSize(0x7f0c0078);
        defaultYPosition = dividerViewHeight + defaultTopMargin;
        peekingAvatarView = createAvatarView();
        mainAvatarView = createAvatarView();
        maskPaint.setColor(-1);
    }

    private int alignToBottomOfViewHolder(f f1, int i)
    {
        int k = f1.itemView.getBottom();
        int j;
        if (f1.getTimestampView().getVisibility() == 0)
        {
            j = f1.getTimestampView().getHeight();
        } else
        {
            j = 0;
        }
        return Math.min(i, k - j - defaultAvatarSize - defaultBottomMargin);
    }

    private int alignToTopOfViewHolder(f f1, int i)
    {
        return Math.max(i, f1.itemView.getTop() + f1.avatar.getTop());
    }

    private PathClippedImageView createAvatarView()
    {
        PathClippedImageView pathclippedimageview = new PathClippedImageView(recyclerView.getContext());
        pathclippedimageview.setClipCircleEnabled(true);
        pathclippedimageview.setBorderWidth(0);
        pathclippedimageview.measure(android.view.View.MeasureSpec.makeMeasureSpec(defaultAvatarSize, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(defaultAvatarSize, 0x40000000));
        pathclippedimageview.layout(0, 0, defaultAvatarSize, defaultAvatarSize);
        return pathclippedimageview;
    }

    private void drawAvatar(Canvas canvas, View view, int i)
    {
        canvas.save();
        canvas.translate(defaultLeftMargin, i);
        view.draw(canvas);
        canvas.restore();
    }

    private f getInlineIncomingViewHolderForPosition(int i)
    {
        android.support.v7.widget.RecyclerView.v v = recyclerView.findViewHolderForPosition(i);
        if ((v instanceof f) && !((f)v).isOutgoing())
        {
            return (f)v;
        } else
        {
            return null;
        }
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.s s)
    {
label0:
        {
label1:
            {
                super.onDrawOver(canvas, recyclerview, s);
                if (recyclerview.getChildCount() <= 0 || adapter.getItemCount() <= 0)
                {
                    break label0;
                }
                int i = layoutManager.findFirstVisibleItemPosition();
                recyclerview = getInlineIncomingViewHolderForPosition(i);
                s = getInlineIncomingViewHolderForPosition(i + 1);
                f f1 = getInlineIncomingViewHolderForPosition(i + 2);
                if (recyclerview != null && (s == null || !s.isChained()))
                {
                    contactUtil.a(recyclerview.getContact(), peekingAvatarView, PathType.a);
                    int j;
                    int k;
                    int l;
                    if (recyclerview.isChained())
                    {
                        j = defaultYPosition;
                    } else
                    {
                        j = alignToTopOfViewHolder(recyclerview, defaultYPosition);
                    }
                    j = alignToBottomOfViewHolder(recyclerview, j);
                    canvas.drawRect(defaultLeftMargin, ((f) (recyclerview)).itemView.getTop(), defaultLeftMargin + defaultAvatarSize, defaultAvatarSize + j, maskPaint);
                    drawAvatar(canvas, peekingAvatarView, j);
                }
                if (s == null)
                {
                    break label0;
                }
                contactUtil.a(s.getContact(), mainAvatarView, PathType.a);
                k = defaultYPosition;
                j = k;
                if (!s.isChained())
                {
                    j = alignToTopOfViewHolder(s, k);
                }
                k = j;
                if (recyclerview != null)
                {
                    k = j;
                    if (!recyclerview.isChained())
                    {
                        k = alignToTopOfViewHolder(recyclerview, j);
                    }
                }
                if (f1 != null)
                {
                    j = k;
                    if (f1.isChained())
                    {
                        break label1;
                    }
                }
                j = alignToBottomOfViewHolder(s, k);
            }
            l = ((f) (s)).itemView.getTop();
            k = l;
            if (recyclerview != null)
            {
                k = l;
                if (s.isChained())
                {
                    k = ((f) (recyclerview)).itemView.getTop();
                }
            }
            canvas.drawRect(defaultLeftMargin, k, defaultLeftMargin + defaultAvatarSize, defaultAvatarSize + j, maskPaint);
            drawAvatar(canvas, mainAvatarView, j);
        }
    }
}
