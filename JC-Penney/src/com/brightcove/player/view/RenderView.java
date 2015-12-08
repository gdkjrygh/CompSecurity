// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.ViewParent;

public interface RenderView
{

    public abstract Context getContext();

    public abstract int getHeight();

    public abstract SurfaceHolder getHolder();

    public abstract android.view.ViewGroup.LayoutParams getLayoutParams();

    public abstract int getMeasuredHeight();

    public abstract ViewParent getParent();

    public abstract Surface getSurface();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract int getWidth();

    public abstract void invalidate();

    public abstract void setLayoutParams(android.view.ViewGroup.LayoutParams layoutparams);

    public abstract void setVideoSize(int i, int j);

    public abstract void setVisibility(int i);
}
