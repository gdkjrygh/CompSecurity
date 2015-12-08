// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.util.StateSet;
import android.view.View;
import android.view.animation.Animation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

final class o
{
    static final class a
    {

        final int a[];
        final Animation b;

        private a(int ai[], Animation animation)
        {
            a = ai;
            b = animation;
        }

        a(int ai[], Animation animation, byte byte0)
        {
            this(ai, animation);
        }
    }


    private final ArrayList a = new ArrayList();
    private a b;
    private Animation c;
    private WeakReference d;
    private android.view.animation.Animation.AnimationListener e;

    o()
    {
        b = null;
        c = null;
        e = new android.view.animation.Animation.AnimationListener() {

            final o a;

            public final void onAnimationEnd(Animation animation)
            {
                if (o.a(a) == animation)
                {
                    o.b(a);
                }
            }

            public final void onAnimationRepeat(Animation animation)
            {
            }

            public final void onAnimationStart(Animation animation)
            {
            }

            
            {
                a = o.this;
                super();
            }
        };
    }

    static Animation a(o o1)
    {
        return o1.c;
    }

    private View b()
    {
        if (d == null)
        {
            return null;
        } else
        {
            return (View)d.get();
        }
    }

    static Animation b(o o1)
    {
        o1.c = null;
        return null;
    }

    public final void a()
    {
        if (c != null)
        {
            View view = b();
            if (view != null && view.getAnimation() == c)
            {
                view.clearAnimation();
            }
        }
    }

    final void a(View view)
    {
        View view1 = b();
        if (view1 != view)
        {
            if (view1 != null)
            {
                View view2 = b();
                int j = a.size();
                for (int i = 0; i < j; i++)
                {
                    Animation animation = ((a)a.get(i)).b;
                    if (view2.getAnimation() == animation)
                    {
                        view2.clearAnimation();
                    }
                }

                d = null;
                b = null;
                c = null;
            }
            if (view != null)
            {
                d = new WeakReference(view);
                return;
            }
        }
    }

    final void a(int ai[])
    {
        Object obj;
        int i;
        int j;
        obj = null;
        j = a.size();
        i = 0;
_L9:
        a a1 = obj;
        if (i >= j) goto _L2; else goto _L1
_L1:
        a1 = (a)a.get(i);
        if (!StateSet.stateSetMatches(a1.a, ai)) goto _L3; else goto _L2
_L2:
        if (a1 != b) goto _L5; else goto _L4
_L4:
        return;
_L3:
        i++;
        continue; /* Loop/switch isn't completed */
_L5:
        if (b != null && c != null)
        {
            ai = b();
            if (ai != null && ai.getAnimation() == c)
            {
                ai.clearAnimation();
            }
            c = null;
        }
        b = a1;
        if (a1 == null) goto _L4; else goto _L6
_L6:
        c = a1.b;
        ai = b();
        if (ai == null) goto _L4; else goto _L7
_L7:
        ai.startAnimation(c);
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void a(int ai[], Animation animation)
    {
        ai = new a(ai, animation, (byte)0);
        animation.setAnimationListener(e);
        a.add(ai);
    }
}
