// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.animation;

import android.view.View;
import com.nineoldandroids.util.IntProperty;
import com.nineoldandroids.view.animation.AnimatorProxy;

// Referenced classes of package com.nineoldandroids.animation:
//            PreHoneycombCompat

static final class _cls9 extends IntProperty
{

    public Integer get(View view)
    {
        return Integer.valueOf(AnimatorProxy.wrap(view).getScrollX());
    }

    public volatile Object get(Object obj)
    {
        return get((View)obj);
    }

    public void setValue(View view, int i)
    {
        AnimatorProxy.wrap(view).setScrollX(i);
    }

    public volatile void setValue(Object obj, int i)
    {
        setValue((View)obj, i);
    }

    _cls9(String s)
    {
        super(s);
    }
}
