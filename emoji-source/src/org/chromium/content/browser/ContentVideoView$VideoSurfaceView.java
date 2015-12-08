// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.Context;
import android.view.SurfaceView;

// Referenced classes of package org.chromium.content.browser:
//            ContentVideoView

private class this._cls0 extends SurfaceView
{

    final ContentVideoView this$0;

    protected void onMeasure(int i, int j)
    {
        boolean flag = true;
        boolean flag1 = true;
        int k = ((flag1) ? 1 : 0);
        int l = ((flag) ? 1 : 0);
        if (ContentVideoView.access$000(ContentVideoView.this) > 0)
        {
            k = ((flag1) ? 1 : 0);
            l = ((flag) ? 1 : 0);
            if (ContentVideoView.access$100(ContentVideoView.this) > 0)
            {
                i = getDefaultSize(ContentVideoView.access$000(ContentVideoView.this), i);
                j = getDefaultSize(ContentVideoView.access$100(ContentVideoView.this), j);
                if (ContentVideoView.access$000(ContentVideoView.this) * j > ContentVideoView.access$100(ContentVideoView.this) * i)
                {
                    k = (ContentVideoView.access$100(ContentVideoView.this) * i) / ContentVideoView.access$000(ContentVideoView.this);
                    l = i;
                } else
                {
                    k = j;
                    l = i;
                    if (ContentVideoView.access$000(ContentVideoView.this) * j < ContentVideoView.access$100(ContentVideoView.this) * i)
                    {
                        l = (ContentVideoView.access$000(ContentVideoView.this) * j) / ContentVideoView.access$100(ContentVideoView.this);
                        k = j;
                    }
                }
            }
        }
        if (ContentVideoView.access$200(ContentVideoView.this))
        {
            if (ContentVideoView.access$300(ContentVideoView.this) == ContentVideoView.access$400(ContentVideoView.this))
            {
                if (ContentVideoView.access$500(ContentVideoView.this) != ContentVideoView.access$600(ContentVideoView.this))
                {
                    ContentVideoView.access$402(ContentVideoView.this, System.currentTimeMillis());
                }
            } else
            if (!ContentVideoView.access$700(ContentVideoView.this) && ContentVideoView.access$500(ContentVideoView.this) == ContentVideoView.access$600(ContentVideoView.this) && System.currentTimeMillis() - ContentVideoView.access$400(ContentVideoView.this) < 5000L)
            {
                ContentVideoView.access$702(ContentVideoView.this, true);
            }
        }
        setMeasuredDimension(l, k);
    }

    public (Context context)
    {
        this$0 = ContentVideoView.this;
        super(context);
    }
}
