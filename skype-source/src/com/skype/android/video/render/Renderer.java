// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.render;

import android.view.TextureView;

public interface Renderer
{

    public abstract int blockRender();

    public abstract TextureView getTextureView();

    public abstract int setRenderParameters(int i, int j);

    public abstract void setZoomBestFit();

    public abstract void setZoomIn();

    public abstract void setZoomOut();

    public abstract int start(int i, int j);

    public abstract int stop();
}
