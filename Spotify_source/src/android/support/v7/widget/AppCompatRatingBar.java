// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.RatingBar;
import km;
import wa;
import zo;

public class AppCompatRatingBar extends RatingBar
{

    private zo a;

    public AppCompatRatingBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f01013e);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        wa.a(context);
        a = new zo(this);
        a.a(attributeset, i);
    }

    protected void onMeasure(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        Bitmap bitmap;
        super.onMeasure(i, j);
        bitmap = a.a;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        setMeasuredDimension(km.a(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
