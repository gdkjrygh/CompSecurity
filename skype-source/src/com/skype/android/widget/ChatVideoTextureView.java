// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import com.skype.android.media.VideoTextureView;

public class ChatVideoTextureView extends VideoTextureView
{
    public static interface SurfaceTextureDestroyedListener
    {

        public abstract void onSurfaceTextureDestroyed();
    }


    private SurfaceTextureDestroyedListener a;

    public ChatVideoTextureView(Context context)
    {
        super(context);
    }

    public ChatVideoTextureView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        if (a != null)
        {
            a.onSurfaceTextureDestroyed();
        }
        return super.onSurfaceTextureDestroyed(surfacetexture);
    }

    public void setOnSurfaceTextureDestroyedListener(SurfaceTextureDestroyedListener surfacetexturedestroyedlistener)
    {
        a = surfacetexturedestroyedlistener;
    }
}
