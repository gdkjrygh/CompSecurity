// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.browse.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.android.paste.widget.CardView;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import dmz;
import gji;
import gjj;

public class CoverCardHorizontal extends FrameLayout
{

    public Playlist a;
    public CardView b;
    public final gji c;

    public CoverCardHorizontal(Context context)
    {
        super(context);
        dmz.a(gjj);
        c = gjj.a(context);
    }

    public CoverCardHorizontal(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        dmz.a(gjj);
        c = gjj.a(context);
    }

    public static CoverCardHorizontal a(Context context, ViewGroup viewgroup)
    {
        return (CoverCardHorizontal)LayoutInflater.from(context).inflate(0x7f03003e, viewgroup, false);
    }

    public boolean hasFocusable()
    {
        return false;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        b = (CardView)findViewById(0x7f1102f0);
    }
}
