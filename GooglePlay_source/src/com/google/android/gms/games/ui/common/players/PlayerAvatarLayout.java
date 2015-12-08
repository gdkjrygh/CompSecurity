// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.players;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.play.utils.PlayTouchDelegate;

public final class PlayerAvatarLayout extends RelativeLayout
{

    private View mSubtitleOverlay;
    private final Rect mSubtitleOverlayRect;

    public PlayerAvatarLayout(Context context)
    {
        this(context, null);
    }

    public PlayerAvatarLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PlayerAvatarLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mSubtitleOverlayRect = new Rect();
    }

    protected final void onFinishInflate()
    {
        super.onFinishInflate();
        mSubtitleOverlay = findViewById(0x7f0d0231);
    }

    public final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        mSubtitleOverlay.getHitRect(mSubtitleOverlayRect);
        i = getContext().getResources().getDimensionPixelSize(0x7f0c017c);
        Rect rect = mSubtitleOverlayRect;
        rect.left = rect.left - i;
        rect = mSubtitleOverlayRect;
        rect.right = rect.right + i;
        rect = mSubtitleOverlayRect;
        rect.top = rect.top - i;
        rect = mSubtitleOverlayRect;
        rect.bottom = rect.bottom + i;
        setTouchDelegate(new PlayTouchDelegate(mSubtitleOverlayRect, mSubtitleOverlay));
    }
}
