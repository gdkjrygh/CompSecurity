// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.skype.android.animation:
//            SkypeAbstractAnimatorSet, BezierEasingInterpolator

public class SkypeMultiPropertyAnimatorSet extends SkypeAbstractAnimatorSet
{

    private View f;
    private HashMap g;
    private HashMap h;
    private ArrayList i;

    public SkypeMultiPropertyAnimatorSet(View view)
    {
        g = new HashMap();
        h = new HashMap();
        f = view;
    }

    protected final void a()
    {
        i = new ArrayList();
        AnimatorSet animatorset;
        for (Iterator iterator = h.keySet().iterator(); iterator.hasNext(); i.add(animatorset))
        {
            Object obj = (String)iterator.next();
            obj = (List)h.get(obj);
            animatorset = new AnimatorSet();
            animatorset.playSequentially(((List) (obj)));
        }

        for (Iterator iterator1 = i.iterator(); iterator1.hasNext(); ((AnimatorSet)iterator1.next()).start()) { }
    }

    protected final void a(float f1, float f2, float f3, float f4, String s, float f5, float f6, 
            long l)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(f, s, new float[] {
            f5, f6
        });
        objectanimator.setDuration(l);
        objectanimator.setInterpolator(new BezierEasingInterpolator(f1, f2, f3, f4, l));
        List list = (List)h.get(s);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            h.put(s, obj);
        }
        ((List) (obj)).add(objectanimator);
    }

    public final void a(float f1, float f2, SkypeAbstractAnimatorSet.Curve curve)
    {
        throw new UnsupportedOperationException("Not supported for MultiProperty animator sets");
    }

    public final transient void a(float f1, SkypeAbstractAnimatorSet.Curve curve, Pair apair[])
    {
        int k = apair.length;
        int j = 0;
        while (j < k) 
        {
            Pair pair = apair[j];
            Object obj = (ArrayList)g.get(pair.first);
            ArrayList arraylist = ((ArrayList) (obj));
            if (obj == null)
            {
                arraylist = new ArrayList();
                g.put(pair.first, arraylist);
            }
            float f2 = ((Float)pair.second).floatValue();
            if (curve == null)
            {
                obj = SkypeAbstractAnimatorSet.Curve.e();
            } else
            {
                obj = curve;
            }
            arraylist.add(new SkypeAbstractAnimatorSet.KeyFrame(this, f1, f2, ((SkypeAbstractAnimatorSet.Curve) (obj))));
            j++;
        }
    }

    public final void a(long l)
    {
        String s;
        for (Iterator iterator = g.keySet().iterator(); iterator.hasNext(); a(l, s, (ArrayList)g.get(s)))
        {
            s = (String)iterator.next();
        }

        a();
    }

    public final void b()
    {
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((AnimatorSet)iterator.next()).cancel()) { }
    }
}
