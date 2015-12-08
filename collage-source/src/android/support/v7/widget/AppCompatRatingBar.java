// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.widget.RatingBar;

// Referenced classes of package android.support.v7.widget:
//            TintManager, AppCompatProgressBarHelper

public class AppCompatRatingBar extends RatingBar
{

    private AppCompatProgressBarHelper mAppCompatProgressBarHelper;
    private TintManager mTintManager;

    public AppCompatRatingBar(Context context)
    {
        this(context, null);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.R.attr.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mTintManager = TintManager.get(context);
        mAppCompatProgressBarHelper = new AppCompatProgressBarHelper(this, mTintManager);
        mAppCompatProgressBarHelper.loadFromAttributes(attributeset, i);
    }

    protected void onMeasure(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        Bitmap bitmap;
        super.onMeasure(i, j);
        bitmap = mAppCompatProgressBarHelper.getSampleTime();
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        setMeasuredDimension(ViewCompat.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
