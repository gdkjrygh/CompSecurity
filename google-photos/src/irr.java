// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class irr
    implements isy
{

    private irq a;

    public irr(irq irq1)
    {
        a = irq1;
        super();
    }

    public final void a(View view)
    {
        ipb ipb1 = irq.a(a);
        int i = isb.a(view).z();
        if (ipb1.a.containsKey(Integer.valueOf(i)))
        {
            Iterator iterator = ((List)ipb1.a.get(Integer.valueOf(i))).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ObjectAnimator objectanimator = (ObjectAnimator)iterator.next();
                View view1 = (View)objectanimator.getTarget();
                if (view1 == null)
                {
                    objectanimator.cancel();
                    ipb1.a(view, null);
                    iterator.remove();
                } else
                if (view1.equals(view))
                {
                    objectanimator.cancel();
                    ipb1.a(view1, objectanimator.getPropertyName());
                    iterator.remove();
                }
            } while (true);
            if (((List)ipb1.a.get(Integer.valueOf(i))).size() == 0)
            {
                ipb1.a.remove(Integer.valueOf(i));
            }
        }
        if (ipb1.b.containsKey(Integer.valueOf(i)))
        {
            Iterator iterator1 = ((List)ipb1.b.get(Integer.valueOf(i))).iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                ObjectAnimator objectanimator1 = (ObjectAnimator)iterator1.next();
                View view2 = (View)objectanimator1.getTarget();
                if (view2 == null)
                {
                    objectanimator1.cancel();
                    ipb1.a(view, null);
                    iterator1.remove();
                } else
                if (view2.equals(view))
                {
                    objectanimator1.cancel();
                    ipb1.a(view2, objectanimator1.getPropertyName());
                    iterator1.remove();
                }
            } while (true);
        }
        i = isb.a(view).z();
        String s = ipb.a(isb.a(view).j(), i);
        if (ipb1.c.containsKey(s))
        {
            Iterator iterator2 = ((List)ipb1.c.get(s)).iterator();
            do
            {
                if (!iterator2.hasNext())
                {
                    break;
                }
                Object obj = (ipp)iterator2.next();
                View view3 = ((ipp) (obj)).b;
                if (view3.equals(view))
                {
                    for (obj = ((ipp) (obj)).a.a().iterator(); ((Iterator) (obj)).hasNext(); ipb1.a(view3, (String)((Iterator) (obj)).next())) { }
                    iterator2.remove();
                }
            } while (true);
            if (((List)ipb1.c.get(s)).size() == 0)
            {
                ipb1.c.remove(s);
            }
        }
    }
}
