// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.widget.GridView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.ViewUtils;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            SimilarItemsGridViewAdapter

class this._cls0
    implements android.view.tListener
{

    final SimilarItemsGridViewAdapter this$0;

    public void onGlobalLayout()
    {
        GridView gridview = SimilarItemsGridViewAdapter.access$000(SimilarItemsGridViewAdapter.this);
        int i = gridview.getWidth() - gridview.getPaddingLeft() - gridview.getPaddingRight();
        Log.v("SimilarItemsGridViewAdapter", (new StringBuilder()).append("View dimens: ").append(i).append(", ").append(gridview.getHeight()).toString());
        SimilarItemsGridViewAdapter.access$102(SimilarItemsGridViewAdapter.this, (int)((float)(i / SimilarItemsGridViewAdapter.access$200(SimilarItemsGridViewAdapter.this)) * 1.43F + 0.5F));
        Log.v("SimilarItemsGridViewAdapter", (new StringBuilder()).append("imgHeight: ").append(SimilarItemsGridViewAdapter.access$100(SimilarItemsGridViewAdapter.this)).toString());
        ViewUtils.removeGlobalLayoutListener(gridview, this);
    }

    ()
    {
        this$0 = SimilarItemsGridViewAdapter.this;
        super();
    }
}
