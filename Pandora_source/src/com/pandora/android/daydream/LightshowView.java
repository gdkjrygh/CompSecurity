// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.TextureView;
import p.df.a;

// Referenced classes of package com.pandora.android.daydream:
//            LightshowRenderer

public class LightshowView extends TextureView
    implements android.view.TextureView.SurfaceTextureListener
{

    private LightshowRenderer a;

    public LightshowView(Context context)
    {
        super(context);
        c();
    }

    public LightshowView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c();
    }

    private void c()
    {
        if (isInEditMode())
        {
            return;
        } else
        {
            setSurfaceTextureListener(this);
            return;
        }
    }

    public void a()
    {
        if (a == null || !a.isAlive())
        {
            a = new LightshowRenderer(this);
            a.a(true);
            a.start();
        }
    }

    public void b()
    {
        if (a == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        a.a(false);
        flag = true;
_L3:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        a.join();
        flag = false;
        continue; /* Loop/switch isn't completed */
        InterruptedException interruptedexception;
        interruptedexception;
        p.df.a.a("LightshowView", "InterruptedException", interruptedexception);
        if (true) goto _L3; else goto _L2
_L2:
    }

    public LightshowRenderer.State getSaveState()
    {
        if (a == null)
        {
            return null;
        } else
        {
            return a.a();
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        super.onRestoreInstanceState(parcelable);
        a.b((LightshowRenderer.State)parcelable);
    }

    protected Parcelable onSaveInstanceState()
    {
        super.onSaveInstanceState();
        return getSaveState();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        p.df.a.a("LightshowView", "onSurfaceTextureAvailable");
        a();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        p.df.a.a("LightshowView", "onSurfaceTextureDestroyed");
        b();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        p.df.a.a("LightshowView", "onSurfaceTextureSizeChanged, restart view");
        b();
        a();
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }
}
