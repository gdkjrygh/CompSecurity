// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.view.SurfaceHolder;

// Referenced classes of package org.chromium.content.browser:
//            ContentViewRenderView, ContentViewCore

class this._cls0
    implements android.view.iewRenderView._cls3
{

    static final boolean $assertionsDisabled;
    final ContentViewRenderView this$0;

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        if (!$assertionsDisabled && ContentViewRenderView.access$000(ContentViewRenderView.this) == 0L)
        {
            throw new AssertionError();
        }
        ContentViewRenderView.access$400(ContentViewRenderView.this, ContentViewRenderView.access$000(ContentViewRenderView.this), i, j, k, surfaceholder.getSurface());
        if (mContentViewCore != null)
        {
            mContentViewCore.onPhysicalBackingSizeChanged(j, k);
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        if (!$assertionsDisabled && ContentViewRenderView.access$000(ContentViewRenderView.this) == 0L)
        {
            throw new AssertionError();
        } else
        {
            ContentViewRenderView.access$200(ContentViewRenderView.this, ContentViewRenderView.access$000(ContentViewRenderView.this));
            onReadyToRender();
            return;
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        if (!$assertionsDisabled && ContentViewRenderView.access$000(ContentViewRenderView.this) == 0L)
        {
            throw new AssertionError();
        } else
        {
            ContentViewRenderView.access$500(ContentViewRenderView.this, ContentViewRenderView.access$000(ContentViewRenderView.this));
            return;
        }
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
