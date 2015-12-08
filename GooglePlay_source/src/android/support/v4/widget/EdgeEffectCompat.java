// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

// Referenced classes of package android.support.v4.widget:
//            EdgeEffectCompatIcs

public final class EdgeEffectCompat
{
    static final class BaseEdgeEffectImpl
        implements EdgeEffectImpl
    {

        public final boolean draw(Object obj, Canvas canvas)
        {
            return false;
        }

        public final void finish(Object obj)
        {
        }

        public final boolean isFinished(Object obj)
        {
            return true;
        }

        public final Object newEdgeEffect(Context context)
        {
            return null;
        }

        public final boolean onAbsorb(Object obj, int i)
        {
            return false;
        }

        public final boolean onPull(Object obj, float f)
        {
            return false;
        }

        public final boolean onPull(Object obj, float f, float f1)
        {
            return false;
        }

        public final boolean onRelease(Object obj)
        {
            return false;
        }

        public final void setSize(Object obj, int i, int j)
        {
        }

        BaseEdgeEffectImpl()
        {
        }
    }

    static class EdgeEffectIcsImpl
        implements EdgeEffectImpl
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

        EdgeEffectIcsImpl()
        {
        }
    }

    static interface EdgeEffectImpl
    {

        public abstract boolean draw(Object obj, Canvas canvas);

        public abstract void finish(Object obj);

        public abstract boolean isFinished(Object obj);

        public abstract Object newEdgeEffect(Context context);

        public abstract boolean onAbsorb(Object obj, int i);

        public abstract boolean onPull(Object obj, float f);

        public abstract boolean onPull(Object obj, float f, float f1);

        public abstract boolean onRelease(Object obj);

        public abstract void setSize(Object obj, int i, int j);
    }

    static final class EdgeEffectLollipopImpl extends EdgeEffectIcsImpl
    {

        public final boolean onPull(Object obj, float f, float f1)
        {
            ((EdgeEffect)obj).onPull(f, f1);
            return true;
        }

        EdgeEffectLollipopImpl()
        {
        }
    }


    private static final EdgeEffectImpl IMPL;
    private Object mEdgeEffect;

    public EdgeEffectCompat(Context context)
    {
        mEdgeEffect = IMPL.newEdgeEffect(context);
    }

    public final boolean draw(Canvas canvas)
    {
        return IMPL.draw(mEdgeEffect, canvas);
    }

    public final void finish()
    {
        IMPL.finish(mEdgeEffect);
    }

    public final boolean isFinished()
    {
        return IMPL.isFinished(mEdgeEffect);
    }

    public final boolean onAbsorb(int i)
    {
        return IMPL.onAbsorb(mEdgeEffect, i);
    }

    public final boolean onPull(float f)
    {
        return IMPL.onPull(mEdgeEffect, f);
    }

    public final boolean onPull(float f, float f1)
    {
        return IMPL.onPull(mEdgeEffect, f, f1);
    }

    public final boolean onRelease()
    {
        return IMPL.onRelease(mEdgeEffect);
    }

    public final void setSize(int i, int j)
    {
        IMPL.setSize(mEdgeEffect, i, j);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            IMPL = new EdgeEffectLollipopImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new EdgeEffectIcsImpl();
        } else
        {
            IMPL = new BaseEdgeEffectImpl();
        }
    }
}
