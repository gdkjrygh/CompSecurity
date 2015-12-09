// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.animation.ArgbEvaluator;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{

    private final int a;
    private final int b;
    private final ArgbEvaluator c = new ArgbEvaluator();
    private final ArrayList d = new ArrayList();
    private final SparseBooleanArray e = new SparseBooleanArray();
    private int f;

    public d(int i, int j)
    {
        b = j;
        a = i;
    }

    public List a()
    {
        return d;
    }

    public void a(int i)
    {
        e.put(i, true);
    }

    public void onPageScrollStateChanged(int i)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((View)iterator.next()).animate().cancel()) { }
        i;
        JVM INSTR tableswitch 0 2: default 64
    //                   0 98
    //                   1 65
    //                   2 65;
           goto _L1 _L2 _L3 _L3
_L1:
        return;
_L3:
        Iterator iterator1 = d.iterator();
        while (iterator1.hasNext()) 
        {
            ((View)iterator1.next()).setAlpha(1.0F);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (e.get(f))
        {
            Iterator iterator2 = d.iterator();
            while (iterator2.hasNext()) 
            {
                ((View)iterator2.next()).animate().alpha(0.0F).setDuration(850L);
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onPageScrolled(int i, float f1, int j)
    {
        int l = ((Integer)c.evaluate(f1, Integer.valueOf(b), Integer.valueOf(a))).intValue();
        int i1 = ((Integer)c.evaluate(f1, Integer.valueOf(a), Integer.valueOf(b))).intValue();
        int k = 0;
        while (k < d.size()) 
        {
            if (k == i)
            {
                ((View)d.get(k)).getBackground().setColorFilter(i1, android.graphics.PorterDuff.Mode.SRC_OVER);
            } else
            if (k == i + 1 && j > 0 || k == i - 1 && j < 0)
            {
                ((View)d.get(k)).getBackground().setColorFilter(l, android.graphics.PorterDuff.Mode.SRC_OVER);
            } else
            {
                ((View)d.get(k)).getBackground().setColorFilter(b, android.graphics.PorterDuff.Mode.SRC_OVER);
            }
            k++;
        }
    }

    public void onPageSelected(int i)
    {
        f = i;
    }
}
