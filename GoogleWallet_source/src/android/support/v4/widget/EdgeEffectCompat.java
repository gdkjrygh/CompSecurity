// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;

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

        public final boolean onPull(Object obj, float f)
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

    static final class EdgeEffectIcsImpl
        implements EdgeEffectImpl
    {

        public final boolean draw(Object obj, Canvas canvas)
        {
            return EdgeEffectCompatIcs.draw(obj, canvas);
        }

        public final void finish(Object obj)
        {
            EdgeEffectCompatIcs.finish(obj);
        }

        public final boolean isFinished(Object obj)
        {
            return EdgeEffectCompatIcs.isFinished(obj);
        }

        public final Object newEdgeEffect(Context context)
        {
            return EdgeEffectCompatIcs.newEdgeEffect(context);
        }

        public final boolean onPull(Object obj, float f)
        {
            return EdgeEffectCompatIcs.onPull(obj, f);
        }

        public final boolean onRelease(Object obj)
        {
            return EdgeEffectCompatIcs.onRelease(obj);
        }

        public final void setSize(Object obj, int i, int j)
        {
            EdgeEffectCompatIcs.setSize(obj, i, j);
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

        public abstract boolean onPull(Object obj, float f);

        public abstract boolean onRelease(Object obj);

        public abstract void setSize(Object obj, int i, int j);
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

    public final boolean onPull(float f)
    {
        return IMPL.onPull(mEdgeEffect, f);
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
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new EdgeEffectIcsImpl();
        } else
        {
            IMPL = new BaseEdgeEffectImpl();
        }
    }
}
