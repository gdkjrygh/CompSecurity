// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.SnappableSeekBar;
import com.netflix.mediaclient.util.ViewUtils;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxMiniPlayerViews

class this._cls0
    implements android.view.balLayoutListener
{

    final MdxMiniPlayerViews this$0;

    public void onGlobalLayout()
    {
        if (MdxMiniPlayerViews.access$900(MdxMiniPlayerViews.this).getHeight() <= 0)
        {
            return;
        } else
        {
            Rect rect = MdxMiniPlayerViews.access$900(MdxMiniPlayerViews.this).getCachedThumb().getBounds();
            int i = (rect.right - rect.left) / 2;
            Log.v("MdxMiniPlayerViews", (new StringBuilder()).append("Setting thumb offset: ").append(i).toString());
            MdxMiniPlayerViews.access$900(MdxMiniPlayerViews.this).setThumbOffset(i);
            ViewUtils.removeGlobalLayoutListener(MdxMiniPlayerViews.access$900(MdxMiniPlayerViews.this), this);
            return;
        }
    }

    ar()
    {
        this$0 = MdxMiniPlayerViews.this;
        super();
    }
}
