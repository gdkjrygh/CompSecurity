// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package kik.android.widget:
//            ResizeEventList, di

final class dh
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final ViewTreeObserver a;
    final boolean b;
    final ArrayAdapter c;
    final HashMap d;
    final ResizeEventList e;

    dh(ResizeEventList resizeeventlist, ViewTreeObserver viewtreeobserver, boolean flag, ArrayAdapter arrayadapter, HashMap hashmap)
    {
        e = resizeeventlist;
        a = viewtreeobserver;
        b = flag;
        c = arrayadapter;
        d = hashmap;
        super();
    }

    public final boolean onPreDraw()
    {
        if (!a.isAlive())
        {
            return true;
        }
        a.removeOnPreDrawListener(this);
        int i = e.getFirstVisiblePosition();
        int j = e.getLastVisiblePosition();
        View view = e.getChildAt(j - i - 1);
        ArrayList arraylist = new ArrayList();
        AnimatorSet animatorset = new AnimatorSet();
        if (b)
        {
            i++;
        }
        j = 0;
        while (j < e.getChildCount()) 
        {
            Object obj = e.getChildAt(j);
            long l1 = c.getItemId(i + j);
            Rect rect = (Rect)d.get(Long.valueOf(l1));
            int i1 = ((View) (obj)).getTop();
            if (obj == view || rect == null)
            {
                int k = ((View) (obj)).getHeight() + e.getDividerHeight();
                if (j <= 0)
                {
                    k = -k;
                }
                obj = ObjectAnimator.ofFloat(obj, View.TRANSLATION_Y, new float[] {
                    (float)((k + i1) - i1), 0.0F
                });
                ((ObjectAnimator) (obj)).setDuration(100L);
                arraylist.add(obj);
            } else
            {
                int l = rect.top;
                obj = ObjectAnimator.ofFloat(obj, View.TRANSLATION_Y, new float[] {
                    (float)(l - i1), 0.0F
                });
                ((ObjectAnimator) (obj)).setDuration(100L);
                arraylist.add(obj);
            }
            d.remove(Long.valueOf(l1));
            j++;
        }
        animatorset.addListener(new di(this));
        animatorset.playTogether(arraylist);
        animatorset.start();
        return false;
    }
}
