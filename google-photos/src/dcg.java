// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Rect;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

public class dcg extends dcc
{

    private static final String g = dcg.getSimpleName();
    public int b;
    public Rect c;
    public int d;
    public int e;
    public int f;
    private final Map h = new HashMap();
    private final Runnable i = new dch(this);
    private AnimatorSet j;

    public dcg(dbc dbc)
    {
        super(dbc);
    }

    static int a(dcg dcg1, int k)
    {
        dcg1.b = 0;
        return 0;
    }

    static AnimatorSet a(dcg dcg1, AnimatorSet animatorset)
    {
        dcg1.j = null;
        return null;
    }

    static Map a(dcg dcg1)
    {
        return dcg1.h;
    }

    private void b(dbd dbd1)
    {
        int k = 0;
        Rect rect;
        boolean flag;
        if (!j.isStarted())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (dbd1.f)
        {
            int l = f;
            (new StringBuilder(63)).append("updateAnimations() KeyPosition = ").append(l).append(" resetViews = ").append(flag);
        }
        rect = new Rect(c);
        rect.offset(-dbd1.e.left, -dbd1.e.top);
        for (int i1 = dbd1.c.size(); k < i1; k++)
        {
            android.view.View view = ((dba)dbd1.c.valueAt(k)).a;
            dci dci1 = (dci)h.get(view);
            if (dci1 != null)
            {
                dci1.a(dbd1, view, rect, flag);
            }
        }

    }

    public final void a(dbd dbd1)
    {
        switch (b)
        {
        case 0: // '\0'
        default:
            return;

        case 1: // '\001'
            if (dbd1.a(75))
            {
                int j1 = dbd1.c.size();
                for (int k = 0; k < j1; k++)
                {
                    int k1 = dbd1.c.keyAt(k);
                    ((dba)dbd1.c.valueAt(k)).d = (short)(32767 - Math.abs(f - k1));
                }

                if (dbd1.f)
                {
                    int l = f;
                    (new StringBuilder(43)).append("startAnimations() KeyPosition = ").append(l);
                }
                j = new AnimatorSet();
                Object obj1 = new Rect(c);
                ((Rect) (obj1)).offset(-dbd1.e.left, -dbd1.e.top);
                j1 = dbd1.c.size();
                int i1 = 0;
                Object obj = null;
                for (; i1 < j1; i1++)
                {
                    Object obj2 = ((dba)dbd1.c.valueAt(i1)).a;
                    dci dci1 = new dci(dbd1, ((android.view.View) (obj2)), ((Rect) (obj1)));
                    h.put(obj2, dci1);
                    obj2 = ObjectAnimator.ofPropertyValuesHolder(obj2, new PropertyValuesHolder[] {
                        dci1.a, dci1.b, dci1.c, dci1.d
                    });
                    obj = czx.a(j, ((android.animation.AnimatorSet.Builder) (obj)), ((ObjectAnimator) (obj2)).setDuration(e));
                }

                j.setStartDelay(d);
                j.setInterpolator(dac.a);
                obj = j;
                obj1 = i;
                if (obj1 != null)
                {
                    ((Animator) (obj)).addListener(new dbe(dbd1, ((Runnable) (obj1))));
                }
                dbd1.a(((Animator) (obj)), 75);
                b = 2;
                return;
            } else
            {
                b = 0;
                return;
            }

        case 2: // '\002'
            b(dbd1);
            return;
        }
    }

}
