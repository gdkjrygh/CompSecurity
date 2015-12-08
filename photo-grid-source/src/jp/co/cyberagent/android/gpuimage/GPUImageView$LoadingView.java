// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageView

class init extends FrameLayout
{

    final GPUImageView this$0;

    private void init()
    {
        ProgressBar progressbar = new ProgressBar(getContext());
        progressbar.setLayoutParams(new android.widget.<init>(-2, -2, 17));
        addView(progressbar);
        setBackgroundColor(0xff000000);
    }

    public (Context context)
    {
        this$0 = GPUImageView.this;
        super(context);
        init();
    }

    public init(Context context, AttributeSet attributeset)
    {
        this$0 = GPUImageView.this;
        super(context, attributeset);
        init();
    }

    public init(Context context, AttributeSet attributeset, int i)
    {
        this$0 = GPUImageView.this;
        super(context, attributeset, i);
        init();
    }
}
