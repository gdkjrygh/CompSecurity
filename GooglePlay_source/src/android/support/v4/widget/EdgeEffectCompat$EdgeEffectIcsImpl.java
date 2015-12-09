// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

// Referenced classes of package android.support.v4.widget:
//            EdgeEffectCompat, EdgeEffectCompatIcs

static class 
    implements 
{

    public final boolean draw(Object obj, Canvas canvas)
    {
        return ((EdgeEffect)obj).draw(canvas);
    }

    public final void finish(Object obj)
    {
        ((EdgeEffect)obj).finish();
    }

    public final boolean isFinished(Object obj)
    {
        return ((EdgeEffect)obj).isFinished();
    }

    public final Object newEdgeEffect(Context context)
    {
        return new EdgeEffect(context);
    }

    public final boolean onAbsorb(Object obj, int i)
    {
        ((EdgeEffect)obj).onAbsorb(i);
        return true;
    }

    public final boolean onPull(Object obj, float f)
    {
        return EdgeEffectCompatIcs.onPull(obj, f);
    }

    public boolean onPull(Object obj, float f, float f1)
    {
        return EdgeEffectCompatIcs.onPull(obj, f);
    }

    public final boolean onRelease(Object obj)
    {
        obj = (EdgeEffect)obj;
        ((EdgeEffect) (obj)).onRelease();
        return ((EdgeEffect) (obj)).isFinished();
    }

    public final void setSize(Object obj, int i, int j)
    {
        ((EdgeEffect)obj).setSize(i, j);
    }

    ()
    {
    }
}
