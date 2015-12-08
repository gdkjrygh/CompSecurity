// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ipb
{

    final Map a = new HashMap();
    final Map b = new HashMap();
    final Map c = new HashMap();
    final Set d = new HashSet();
    public ipn e;
    public Handler f;
    final Map g = new HashMap();
    private final ipk h;
    private int i;

    public ipb(ipk ipk1)
    {
        i = -1;
        h = ipk1;
    }

    static String a(int j, int k)
    {
        return (new StringBuilder(23)).append(j).append(":").append(k).toString();
    }

    public final void a(int j, String s1)
    {
        List list = (List)g.get(Integer.valueOf(j));
        if (list != null && !list.isEmpty() && list.contains(s1))
        {
            list.remove(s1);
            if (list.isEmpty())
            {
                g.remove(Integer.valueOf(j));
                if (i == j)
                {
                    a(j);
                    i = -1;
                    return;
                }
            }
        }
    }

    void a(View view, String s1)
    {
        if (s1 != null && !"verticalFold".equals(s1)) goto _L2; else goto _L1
_L1:
        if (view instanceof isr)
        {
            ((isr)view).setVerticalFold(1.0F);
        }
_L4:
        b(view, s1);
        view.setLayerType(0, null);
        return;
_L2:
        if (s1 == null || "linePercentDrawn".equals(s1))
        {
            if (view instanceof isv)
            {
                ((isv)view).setLinePercentDrawn(1.0F);
            }
        } else
        if (s1 == null || "alpha".equals(s1))
        {
            view.setAlpha(1.0F);
        } else
        if (s1 == null || "translationX".equals(s1))
        {
            view.setTranslationX(0.0F);
        } else
        if (s1 == null || "translationY".equals(s1))
        {
            view.setTranslationY(0.0F);
        } else
        if (s1 == null || "scaleX".equals(s1))
        {
            view.setScaleX(1.0F);
        } else
        if (s1 == null || "scaleY".equals(s1))
        {
            view.setScaleY(1.0F);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(iph iph, boolean flag, int j, int k, View view)
    {
        Object obj = a(j, k);
        if (!c.containsKey(obj))
        {
            c.put(obj, new ArrayList());
        }
        obj = (List)c.get(obj);
        iph = new ipp(this, iph, flag, view);
        ((List) (obj)).add(iph);
        iph.a(0.0F);
        view.setLayerType(2, null);
    }

    public final boolean a(int j)
    {
        if (!a.containsKey(Integer.valueOf(j)))
        {
            return false;
        }
        if (g.containsKey(Integer.valueOf(j)) && !((List)g.get(Integer.valueOf(j))).isEmpty())
        {
            i = j;
            return true;
        }
        Object obj = (List)a.get(Integer.valueOf(j));
        ipr ipr1 = new ipr(((List) (obj)));
        b.put(Integer.valueOf(j), obj);
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            ObjectAnimator objectanimator = (ObjectAnimator)((Iterator) (obj)).next();
            View view = (View)objectanimator.getTarget();
            if (view == null)
            {
                ((Iterator) (obj)).remove();
            } else
            {
                view.setLayerType(2, null);
                objectanimator.addListener(new ipd(this, view, ipr1, j));
                if (b.a((Boolean)view.getTag(s.bZ), false))
                {
                    view.setTag(s.bZ, null);
                    h.a();
                }
                objectanimator.start();
            }
        }

        a.remove(Integer.valueOf(j));
        d.add(Integer.valueOf(j));
        return true;
    }

    void b(View view, String s1)
    {
        Object obj;
        Object obj1;
        Object obj2;
        boolean flag;
        obj2 = null;
        obj = null;
        obj1 = null;
        flag = b.a((Boolean)view.getTag(s.bZ), false);
        if (!"alpha".equals(s1)) goto _L2; else goto _L1
_L1:
        int j = s.bZ;
        if (view.getAlpha() == 0.0F)
        {
            s1 = Boolean.valueOf(true);
        } else
        {
            s1 = null;
        }
        view.setTag(j, s1);
_L4:
        if (flag != b.a((Boolean)view.getTag(s.bZ), false))
        {
            h.a();
        }
        return;
_L2:
        if ("scaleX".equals(s1))
        {
            int k = s.bZ;
            s1 = obj1;
            if (view.getScaleX() == 0.0F)
            {
                s1 = Boolean.valueOf(true);
            }
            view.setTag(k, s1);
        } else
        if ("scaleY".equals(s1))
        {
            int l = s.bZ;
            s1 = obj2;
            if (view.getScaleY() == 0.0F)
            {
                s1 = Boolean.valueOf(true);
            }
            view.setTag(l, s1);
        } else
        if ("verticalFold".equals(s1))
        {
            int i1 = s.bZ;
            s1 = obj;
            if (view instanceof isr)
            {
                s1 = obj;
                if (((isr)view).k == 0.0F)
                {
                    s1 = Boolean.valueOf(true);
                }
            }
            view.setTag(i1, s1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
