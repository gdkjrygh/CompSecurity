// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ViewCompat, ViewCompatHC

static class _cls9 extends _cls9
{

    long getFrameTime()
    {
        return ViewCompatHC.getFrameTime();
    }

    public int getLayerType(View view)
    {
        return ViewCompatHC.getLayerType(view);
    }

    public int getMeasuredState(View view)
    {
        return ViewCompatHC.getMeasuredState(view);
    }

    public float getScaleX(View view)
    {
        return ViewCompatHC.getScaleX(view);
    }

    public float getTranslationY(View view)
    {
        return ViewCompatHC.getTranslationY(view);
    }

    public void jumpDrawablesToCurrentState(View view)
    {
        ViewCompatHC.jumpDrawablesToCurrentState(view);
    }

    public int resolveSizeAndState(int i, int j, int k)
    {
        return ViewCompatHC.resolveSizeAndState(i, j, k);
    }

    public void setActivated(View view, boolean flag)
    {
        ViewCompatHC.setActivated(view, flag);
    }

    public void setAlpha(View view, float f)
    {
        ViewCompatHC.setAlpha(view, f);
    }

    public void setLayerPaint(View view, Paint paint)
    {
        setLayerType(view, getLayerType(view), paint);
        view.invalidate();
    }

    public void setLayerType(View view, int i, Paint paint)
    {
        ViewCompatHC.setLayerType(view, i, paint);
    }

    public void setSaveFromParentEnabled(View view, boolean flag)
    {
        ViewCompatHC.setSaveFromParentEnabled(view, flag);
    }

    public void setScaleX(View view, float f)
    {
        ViewCompatHC.setScaleX(view, f);
    }

    public void setScaleY(View view, float f)
    {
        ViewCompatHC.setScaleY(view, f);
    }

    public void setTranslationX(View view, float f)
    {
        ViewCompatHC.setTranslationX(view, f);
    }

    public void setTranslationY(View view, float f)
    {
        ViewCompatHC.setTranslationY(view, f);
    }

    _cls9()
    {
    }
}
