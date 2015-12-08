// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

// Referenced classes of package org.chromium.content.browser:
//            ContentViewRenderView, ContentViewCore

class this._cls0
    implements android.view.reListener
{

    static final boolean $assertionsDisabled;
    final ContentViewRenderView this$0;

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        if (!$assertionsDisabled && ContentViewRenderView.access$000(ContentViewRenderView.this) == 0L)
        {
            throw new AssertionError();
        } else
        {
            ContentViewRenderView.access$102(ContentViewRenderView.this, new Surface(surfacetexture));
            ContentViewRenderView.access$200(ContentViewRenderView.this, ContentViewRenderView.access$000(ContentViewRenderView.this));
            onSurfaceTextureSizeChanged(surfacetexture, i, j);
            onReadyToRender();
            return;
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        if (!$assertionsDisabled && ContentViewRenderView.access$000(ContentViewRenderView.this) == 0L)
        {
            throw new AssertionError();
        } else
        {
            ContentViewRenderView.access$500(ContentViewRenderView.this, ContentViewRenderView.access$000(ContentViewRenderView.this));
            ContentViewRenderView.access$100(ContentViewRenderView.this).release();
            ContentViewRenderView.access$102(ContentViewRenderView.this, null);
            return true;
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        if (!$assertionsDisabled && (ContentViewRenderView.access$000(ContentViewRenderView.this) == 0L || ContentViewRenderView.access$100(ContentViewRenderView.this) == null))
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && surfacetexture != ContentViewRenderView.access$300(ContentViewRenderView.this).getSurfaceTexture())
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && ContentViewRenderView.access$100(ContentViewRenderView.this) == null)
        {
            throw new AssertionError();
        }
        ContentViewRenderView.access$400(ContentViewRenderView.this, ContentViewRenderView.access$000(ContentViewRenderView.this), 1, i, j, ContentViewRenderView.access$100(ContentViewRenderView.this));
        if (mContentViewCore != null)
        {
            mContentViewCore.onPhysicalBackingSizeChanged(i, j);
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/ContentViewRenderView.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    ()
    {
        this$0 = ContentViewRenderView.this;
        super();
    }
}
