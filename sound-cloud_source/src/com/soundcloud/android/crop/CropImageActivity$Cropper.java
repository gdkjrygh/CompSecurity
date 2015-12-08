// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crop;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;

// Referenced classes of package com.soundcloud.android.crop:
//            CropImageActivity, HighlightView, RotateBitmap, CropImageView

private class <init>
{

    final CropImageActivity this$0;

    private void makeDefault()
    {
        if (CropImageActivity.access$400(CropImageActivity.this) == null)
        {
            return;
        }
        HighlightView highlightview = new HighlightView(CropImageActivity.access$100(CropImageActivity.this));
        int j1 = CropImageActivity.access$400(CropImageActivity.this).getWidth();
        int i1 = CropImageActivity.access$400(CropImageActivity.this).getHeight();
        Rect rect = new Rect(0, 0, j1, i1);
        int j = (Math.min(j1, i1) * 4) / 5;
        RectF rectf;
        android.graphics.Matrix matrix;
        int i;
        int k;
        boolean flag;
        if (CropImageActivity.access$500(CropImageActivity.this) != 0 && CropImageActivity.access$600(CropImageActivity.this) != 0)
        {
            if (CropImageActivity.access$500(CropImageActivity.this) > CropImageActivity.access$600(CropImageActivity.this))
            {
                i = (CropImageActivity.access$600(CropImageActivity.this) * j) / CropImageActivity.access$500(CropImageActivity.this);
            } else
            {
                int l = (CropImageActivity.access$500(CropImageActivity.this) * j) / CropImageActivity.access$600(CropImageActivity.this);
                i = j;
                j = l;
            }
        } else
        {
            i = j;
        }
        k = (j1 - j) / 2;
        i1 = (i1 - i) / 2;
        rectf = new RectF(k, i1, j + k, i + i1);
        matrix = CropImageActivity.access$100(CropImageActivity.this).getUnrotatedMatrix();
        if (CropImageActivity.access$500(CropImageActivity.this) != 0 && CropImageActivity.access$600(CropImageActivity.this) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        highlightview.setup(matrix, rect, rectf, flag);
        CropImageActivity.access$100(CropImageActivity.this).add(highlightview);
    }

    public void crop()
    {
        class _cls1
            implements Runnable
        {

            final CropImageActivity.Cropper this$1;

            public void run()
            {
                makeDefault();
                CropImageActivity.access$100(this$0).invalidate();
                if (CropImageActivity.access$100(this$0).highlightViews.size() == 1)
                {
                    CropImageActivity.access$802(this$0, (HighlightView)CropImageActivity.access$100(this$0).highlightViews.get(0));
                    CropImageActivity.access$800(this$0).setFocus(true);
                }
            }

            _cls1()
            {
                this$1 = CropImageActivity.Cropper.this;
                super();
            }
        }

        CropImageActivity.access$200(CropImageActivity.this).post(new _cls1());
    }


    private _cls1()
    {
        this$0 = CropImageActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
