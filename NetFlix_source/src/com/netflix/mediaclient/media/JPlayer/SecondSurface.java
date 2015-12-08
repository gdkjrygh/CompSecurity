// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;

public class SecondSurface
    implements android.view.TextureView.SurfaceTextureListener
{

    private static final String TAG = "JPlayer_Surface2";
    private final android.view.ViewGroup.LayoutParams layoutParams;
    private final TextureView mSurface2;
    private int mSurfaceTextureHeight;
    private int mSurfaceTextureWidth;

    public SecondSurface(TextureView textureview)
    {
        mSurfaceTextureWidth = 0;
        mSurfaceTextureHeight = 0;
        mSurface2 = textureview;
        mSurface2.setSurfaceTextureListener(this);
        layoutParams = mSurface2.getLayoutParams();
        mSurface2.setVisibility(0);
        mSurface2.setAlpha(0.0F);
    }

    public final Surface getSurface()
    {
        if (mSurface2.isAvailable())
        {
            return new Surface(mSurface2.getSurfaceTexture());
        } else
        {
            return null;
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        if (Log.isLoggable("JPlayer_Surface2", 3))
        {
            Log.d("JPlayer_Surface2", (new StringBuilder()).append("onSurfaceTextureAvailable ").append(i).append(" x ").append(j).toString());
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        Log.d("JPlayer_Surface2", "onSurfaceTextureDestroyed");
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        if (Log.isLoggable("JPlayer_Surface2", 3))
        {
            Log.d("JPlayer_Surface2", (new StringBuilder()).append("onSurfaceTextureSizeChanged ").append(i).append(" x ").append(j).toString());
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }

    public void setSurfaceInvisible()
    {
        Log.d("JPlayer_Surface2", "Surface2 invisiable");
        mSurface2.setAlpha(0.0F);
    }

    public void setSurfaceSize(int i, int j)
    {
        if (mSurfaceTextureWidth != i || mSurfaceTextureHeight != j)
        {
            layoutParams.width = i;
            layoutParams.height = j;
            mSurface2.setLayoutParams(layoutParams);
            mSurface2.requestLayout();
            if (Log.isLoggable("JPlayer_Surface2", 3))
            {
                Log.d("JPlayer_Surface2", (new StringBuilder()).append("layout ").append(layoutParams.width).append(" x ").append(layoutParams.height).toString());
            }
            mSurfaceTextureWidth = i;
            mSurfaceTextureHeight = j;
        }
    }

    public void setSurfaceVisible()
    {
        Log.d("JPlayer_Surface2", "Surface2 visiable");
        mSurface2.setAlpha(1.0F);
    }
}
