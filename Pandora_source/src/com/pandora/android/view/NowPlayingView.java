// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.pandora.android.coachmark.e;
import com.pandora.radio.data.aa;

public abstract class NowPlayingView extends RelativeLayout
{

    public NowPlayingView(Context context)
    {
        super(context);
    }

    public NowPlayingView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public NowPlayingView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected abstract void a();

    public abstract void a(aa aa, String s, String s1);

    public abstract void b();

    public abstract boolean c();

    protected abstract boolean d();

    public abstract void e();

    protected abstract int getLayoutResId();

    public abstract aa getTrackData();

    public abstract String getTrackKey();

    protected void setCoachmarkManager(e e1)
    {
    }

    protected void setTrackViewAvailableListener(com.pandora.android.activity.o.a a1)
    {
    }

    protected void setTrackViewTransitionListener(com.pandora.android.activity.o.b b1)
    {
    }
}
