// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.animation;

import android.view.View;
import com.nineoldandroids.util.FloatProperty;
import com.nineoldandroids.view.animation.AnimatorProxy;

// Referenced classes of package com.nineoldandroids.animation:
//            PreHoneycombCompat

static final class _cls9 extends FloatProperty
{

    public Float get(View view)
    {
        return Float.valueOf(AnimatorProxy.wrap(view).getScaleY());
    }

    public volatile Object get(Object obj)
    {
        return get((View)obj);
    }

    public void setValue(View view, float f)
    {
        AnimatorProxy.wrap(view).setScaleY(f);
    }

    public volatile void setValue(Object obj, float f)
    {
        setValue((View)obj, f);
    }

    _cls9(String s)
    {
        super(s);
    }
}
