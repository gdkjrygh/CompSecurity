// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.google.android.libraries.bind.data.BindingViewGroup;
import com.google.android.libraries.bind.data.Data;
import com.google.android.libraries.bind.data.DataList;
import com.google.android.libraries.bind.data.DataViewHelper;

// Referenced classes of package com.google.android.libraries.bind.widget:
//            BoundFrameLayout, BindingViewGroupHelper

public class BindingFrameLayout extends BoundFrameLayout
    implements BindingViewGroup
{

    protected final BindingViewGroupHelper bindingViewGroupHelper;

    public BindingFrameLayout(Context context)
    {
        this(context, null, 0);
    }

    public BindingFrameLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BindingFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        bindingViewGroupHelper = new BindingViewGroupHelper(this);
        context = context.obtainStyledAttributes(attributeset, com.google.android.libraries.bind.R.styleable.BindingFrameLayout);
        bindingViewGroupHelper.isOwnedByParent = context.getBoolean(0, false);
        bindingViewGroupHelper.supportsAnimationCapture = context.getBoolean(1, true);
        context.recycle();
    }

    public void draw(Canvas canvas)
    {
        float f;
        BindingViewGroupHelper bindingviewgrouphelper;
label0:
        {
            bindingviewgrouphelper = bindingViewGroupHelper;
            if (bindingviewgrouphelper.blendMode$204c4ecf != 2 && (bindingviewgrouphelper.viewGroup instanceof BindingViewGroup))
            {
                ((BindingViewGroup)bindingviewgrouphelper.viewGroup).superDrawProxy(canvas);
            }
            if (bindingviewgrouphelper.blendedBitmap != null && !bindingviewgrouphelper.capturing)
            {
                f = (float)(System.currentTimeMillis() - bindingviewgrouphelper.blendBitmapStartTimeMs) / (float)bindingviewgrouphelper.blendBitmapDurationMs;
                if (f < 1.0F)
                {
                    break label0;
                }
                bindingviewgrouphelper.clearBlendedBitmap();
            }
            return;
        }
        if (!bindingviewgrouphelper.blendedBitmapDstComputed)
        {
            bindingviewgrouphelper.blendedBitmapDstRect.left = 0;
            bindingviewgrouphelper.blendedBitmapDstRect.top = 0;
            bindingviewgrouphelper.blendedBitmapDstRect.right = bindingviewgrouphelper.viewGroup.getWidth();
            bindingviewgrouphelper.blendedBitmapDstRect.bottom = bindingviewgrouphelper.viewGroup.getHeight();
            if (bindingviewgrouphelper.blendedBitmapSrcRect.left < 0)
            {
                Rect rect = bindingviewgrouphelper.blendedBitmapDstRect;
                rect.left = rect.left + (-bindingviewgrouphelper.blendedBitmapSrcRect.left * bindingviewgrouphelper.viewGroup.getWidth()) / bindingviewgrouphelper.blendedBitmapSrcRect.width();
            }
            if (bindingviewgrouphelper.blendedBitmapSrcRect.top < 0)
            {
                Rect rect1 = bindingviewgrouphelper.blendedBitmapDstRect;
                rect1.top = rect1.top + (-bindingviewgrouphelper.blendedBitmapSrcRect.top * bindingviewgrouphelper.viewGroup.getHeight()) / bindingviewgrouphelper.blendedBitmapSrcRect.height();
            }
            if (bindingviewgrouphelper.blendedBitmapSrcRect.right > bindingviewgrouphelper.blendedBitmap.getWidth())
            {
                Rect rect2 = bindingviewgrouphelper.blendedBitmapDstRect;
                rect2.right = rect2.right - ((bindingviewgrouphelper.blendedBitmapSrcRect.right - bindingviewgrouphelper.blendedBitmap.getWidth()) * bindingviewgrouphelper.viewGroup.getWidth()) / bindingviewgrouphelper.blendedBitmapSrcRect.width();
            }
            if (bindingviewgrouphelper.blendedBitmapSrcRect.bottom > bindingviewgrouphelper.blendedBitmap.getHeight())
            {
                Rect rect3 = bindingviewgrouphelper.blendedBitmapDstRect;
                rect3.bottom = rect3.bottom - ((bindingviewgrouphelper.blendedBitmapSrcRect.bottom - bindingviewgrouphelper.blendedBitmap.getHeight()) * bindingviewgrouphelper.viewGroup.getHeight()) / bindingviewgrouphelper.blendedBitmapSrcRect.height();
            }
            bindingviewgrouphelper.blendedBitmapSrcRect.left = Math.max(0, bindingviewgrouphelper.blendedBitmapSrcRect.left);
            bindingviewgrouphelper.blendedBitmapSrcRect.top = Math.max(0, bindingviewgrouphelper.blendedBitmapSrcRect.top);
            bindingviewgrouphelper.blendedBitmapSrcRect.right = Math.min(bindingviewgrouphelper.blendedBitmap.getWidth(), bindingviewgrouphelper.blendedBitmapSrcRect.right);
            bindingviewgrouphelper.blendedBitmapSrcRect.bottom = Math.min(bindingviewgrouphelper.blendedBitmap.getHeight(), bindingviewgrouphelper.blendedBitmapSrcRect.bottom);
            bindingviewgrouphelper.blendedBitmapDstComputed = true;
        }
        if (bindingviewgrouphelper.blendMode$204c4ecf == 1)
        {
            BindingViewGroupHelper.blendPaint.setAlpha((int)Math.floor((1.0F - f) * 255F));
        }
        canvas.drawBitmap(bindingviewgrouphelper.blendedBitmap, bindingviewgrouphelper.blendedBitmapSrcRect, bindingviewgrouphelper.blendedBitmapDstRect, BindingViewGroupHelper.blendPaint);
        bindingviewgrouphelper.viewGroup.invalidate();
    }

    public final Data getData()
    {
        return bindingViewGroupHelper.getData();
    }

    public final DataList getDataRow()
    {
        return ((DataViewHelper) (bindingViewGroupHelper)).dataRow;
    }

    public final boolean isOwnedByParent()
    {
        return bindingViewGroupHelper.isOwnedByParent;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        BindingViewGroupHelper bindingviewgrouphelper = bindingViewGroupHelper;
        bindingviewgrouphelper.attached = true;
        bindingviewgrouphelper.temporarilyDetached = false;
        bindingviewgrouphelper.updateRegistrationIfNeeded();
    }

    public final void onDataUpdated(Data data)
    {
        BindingViewGroupHelper bindingviewgrouphelper = bindingViewGroupHelper;
        ((BindingViewGroup)bindingviewgrouphelper.viewGroup).updateBoundDataProxy(data);
        bindingviewgrouphelper.boundData = data;
        bindingviewgrouphelper.clearBlendedBitmap();
        bindingviewgrouphelper.sendDataToChildrenWhoWantIt(bindingviewgrouphelper.viewGroup, data);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        BindingViewGroupHelper bindingviewgrouphelper = bindingViewGroupHelper;
        bindingviewgrouphelper.attached = false;
        bindingviewgrouphelper.temporarilyDetached = false;
        bindingviewgrouphelper.updateRegistrationIfNeeded();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        BindingViewGroupHelper.markDescendantsAsOwned(bindingViewGroupHelper.viewGroup);
    }

    public void onFinishTemporaryDetach()
    {
        super.onFinishTemporaryDetach();
        bindingViewGroupHelper.onFinishTemporaryDetach();
    }

    protected void onMeasure(int i, int j)
    {
        BindingViewGroupHelper bindingviewgrouphelper = bindingViewGroupHelper;
        if (((DataViewHelper) (bindingviewgrouphelper)).temporarilyDetached)
        {
            bindingviewgrouphelper.onFinishTemporaryDetach();
        }
        super.onMeasure(i, j);
    }

    public void onStartTemporaryDetach()
    {
        super.onStartTemporaryDetach();
        BindingViewGroupHelper bindingviewgrouphelper = bindingViewGroupHelper;
        bindingviewgrouphelper.temporarilyDetached = true;
        bindingviewgrouphelper.updateRegistrationIfNeeded();
    }

    public final void prepareForRecycling()
    {
        BindingViewGroupHelper bindingviewgrouphelper = bindingViewGroupHelper;
        bindingviewgrouphelper.setDataRow(null);
        bindingviewgrouphelper.cardGroup = null;
        bindingviewgrouphelper.cardGroupPosition = -1;
        bindingviewgrouphelper.viewGroup.setOnLongClickListener(null);
        bindingviewgrouphelper.viewGroup.setLongClickable(false);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            bindingviewgrouphelper.viewGroup.animate().cancel();
        }
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            bindingviewgrouphelper.viewGroup.setTranslationX(0.0F);
            bindingviewgrouphelper.viewGroup.setTranslationY(0.0F);
            bindingviewgrouphelper.viewGroup.setScaleX(1.0F);
            bindingviewgrouphelper.viewGroup.setScaleY(1.0F);
            bindingviewgrouphelper.viewGroup.setAlpha(1.0F);
            bindingviewgrouphelper.viewGroup.setRotation(0.0F);
        }
        if (bindingviewgrouphelper.viewGroup instanceof BindingViewGroup)
        {
            ((BindingViewGroup)bindingviewgrouphelper.viewGroup).setMeasuredDimensionProxy$255f295();
        }
    }

    public final void setDataRow(DataList datalist)
    {
        bindingViewGroupHelper.setDataRow(datalist);
    }

    public final void setMeasuredDimensionProxy$255f295()
    {
        setMeasuredDimension(0, 0);
    }

    public final void setOwnedByParent$1385ff()
    {
        bindingViewGroupHelper.isOwnedByParent = true;
    }

    public final void superDrawProxy(Canvas canvas)
    {
        super.draw(canvas);
    }

    public final void updateBoundDataProxy(Data data)
    {
        updateBoundData(data);
    }
}
