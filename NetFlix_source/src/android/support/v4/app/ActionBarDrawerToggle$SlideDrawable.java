// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewCompat;
import android.view.Window;

// Referenced classes of package android.support.v4.app:
//            ActionBarDrawerToggle

private class <init> extends LevelListDrawable
    implements android.graphics.drawable.it>
{

    private final boolean mHasMirroring;
    private float mOffset;
    private float mPosition;
    private final Rect mTmpRect;
    final ActionBarDrawerToggle this$0;

    public void draw(Canvas canvas)
    {
        int i = 1;
        copyBounds(mTmpRect);
        canvas.save();
        boolean flag;
        int j;
        if (ViewCompat.getLayoutDirection(ActionBarDrawerToggle.access$300(ActionBarDrawerToggle.this).getWindow().getDecorView()) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i = -1;
        }
        j = mTmpRect.width();
        canvas.translate(-mOffset * (float)j * mPosition * (float)i, 0.0F);
        if (flag && !mHasMirroring)
        {
            canvas.translate(j, 0.0F);
            canvas.scale(-1F, 1.0F);
        }
        super.draw(canvas);
        canvas.restore();
    }

    public float getPosition()
    {
        return mPosition;
    }

    public void setOffset(float f)
    {
        mOffset = f;
        invalidateSelf();
    }

    public void setPosition(float f)
    {
        mPosition = f;
        invalidateSelf();
    }

    private (Drawable drawable)
    {
        this$0 = ActionBarDrawerToggle.this;
        super();
        boolean flag;
        if (android.os.it> > 18)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mHasMirroring = flag;
        mTmpRect = new Rect();
        if (DrawableCompat.isAutoMirrored(drawable))
        {
            DrawableCompat.setAutoMirrored(this, true);
        }
        addLevel(0, 0, drawable);
    }

    addLevel(Drawable drawable, addLevel addlevel)
    {
        this(drawable);
    }
}
