// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.widget.ImageView;
import com.pinterest.ui.ObservableImageView;

// Referenced classes of package com.pinterest.ui.grid:
//            AdapterEmptyView

class this._cls0
    implements com.pinterest.ui..OnDrawListener
{

    final AdapterEmptyView this$0;

    public void onDraw(ImageView imageview)
    {
        AdapterEmptyView.access$300(AdapterEmptyView.this).setOnDrawListener(null);
        if (AdapterEmptyView.access$400(AdapterEmptyView.this).getMeasuredHeight() > 0)
        {
            AdapterEmptyView.access$800(AdapterEmptyView.this);
        }
    }

    awListener()
    {
        this$0 = AdapterEmptyView.this;
        super();
    }
}
