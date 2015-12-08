// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Point;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.photos.list.fastscroll.FastScrollRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lucasr.twowayview.TwoWayLayoutManager;

public final class haw
    implements ds, gzv, jhz
{

    hbn a;
    private boolean b;
    private boolean c;
    private hae d;

    public haw(hae hae1)
    {
        d = hae1;
        super();
    }

    private static View a(afn afn1)
    {
        if (afn1 instanceof fro)
        {
            return ((fro)afn1).o;
        } else
        {
            return afn1.a;
        }
    }

    private void a(hbo hbo1)
    {
        hbo.b(hbo1.d.a, a(hbo1.d));
        hbo1.d.a(true);
        a(hbo1.d).setLayerType(0, null);
    }

    private void b(afn afn1)
    {
        afn1.a(false);
        afn1.a.setPivotX(0.0F);
        afn1.a.setPivotY(0.0F);
        afn1 = a(afn1);
        if (android.os.Build.VERSION.SDK_INT < 16 || afn1.hasOverlappingRendering())
        {
            afn1.setLayerType(2, null);
        }
    }

    public final Object a(Point point, boolean flag)
    {
        b = true;
        a(point, -1);
        b(flag);
        return a;
    }

    public final void a(float f)
    {
        a.a(b, c, f);
        for (Iterator iterator = a.c.iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((hbp)iterator.next()).a.iterator();
            while (iterator1.hasNext()) 
            {
                hbo hbo1 = (hbo)iterator1.next();
                hbo1.a(hbo1.d.a, a(hbo1.d));
            }
        }

    }

    public final void a(afn afn1, afn afn2)
    {
        Iterator iterator = a.c.iterator();
        hbo hbo1;
label0:
        do
        {
            if (iterator.hasNext())
            {
                Iterator iterator1 = ((hbp)iterator.next()).a.iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        continue label0;
                    }
                    hbo1 = (hbo)iterator1.next();
                } while (hbo1.d != afn1);
            } else
            {
                hbo1 = null;
            }
            break;
        } while (true);
        if (hbo1 == null)
        {
            afn2.a.setVisibility(8);
            return;
        } else
        {
            a(hbo1);
            hbo1.d = afn2;
            b(afn2);
            hbo1.a(afn2.a, a(afn2));
            afn1.a.setVisibility(8);
            return;
        }
    }

    void a(Point point, int i)
    {
        Object obj1;
        obj1 = hae.g(d);
        hgz hgz1 = (hgz)((RecyclerView) (obj1)).d;
        Object obj = ((RecyclerView) (obj1)).e;
        int j;
        int l;
        boolean flag2;
        if (mk.h(((View) (obj1))) == 1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (obj instanceof adi)
        {
            l = ((adi)obj).c();
            j = ((adi)obj).d();
        } else
        if (obj instanceof TwoWayLayoutManager)
        {
            l = ((TwoWayLayoutManager)obj).getFirstVisiblePosition();
            j = ((TwoWayLayoutManager)obj).getLastVisiblePosition();
        } else
        {
            point = String.valueOf(obj);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(point).length() + 48)).append("Cannot calculate positions using layout manager ").append(point).toString());
        }
        obj = ((RecyclerView) (obj1)).b(l);
        do
        {
            afn afn1 = ((RecyclerView) (obj1)).b(l - 1);
            if (afn1 == null || afn1.a.getTop() > ((afn) (obj)).a.getTop() || afn1.a.getTop() == ((afn) (obj)).a.getTop() && (flag2 && afn1.a.getRight() <= ((afn) (obj)).a.getRight() || !flag2 && afn1.a.getLeft() >= ((afn) (obj)).a.getLeft()))
            {
                break;
            }
            l--;
            obj = afn1;
        } while (true);
        obj = ((RecyclerView) (obj1)).b(j);
        do
        {
            afn afn2 = ((RecyclerView) (obj1)).b(j + 1);
            if (afn2 == null || afn2.a.getTop() < ((afn) (obj)).a.getTop() || afn2.a.getTop() == ((afn) (obj)).a.getTop() && (flag2 && afn2.a.getRight() >= ((afn) (obj)).a.getRight() || !flag2 && afn2.a.getLeft() <= ((afn) (obj)).a.getLeft()))
            {
                break;
            }
            j++;
            obj = afn2;
        } while (true);
        Object obj2 = new ArrayList(j - l);
        for (; l <= j; l++)
        {
            obj = ((RecyclerView) (obj1)).b(l);
            if (obj != null)
            {
                ((List) (obj2)).add(obj);
            }
        }

        obj1 = new ArrayList();
        hbp hbp1 = null;
        obj = null;
        obj2 = ((List) (obj2)).iterator();
        while (((Iterator) (obj2)).hasNext()) 
        {
            afn afn3 = (afn)((Iterator) (obj2)).next();
            Object obj3 = afn3.a;
            int k = afn3.e;
            obj3 = new Rect(((View) (obj3)).getLeft(), ((View) (obj3)).getTop(), ((View) (obj3)).getRight(), ((View) (obj3)).getBottom());
            if (hbp1 == null || ((hbo) (obj)).c.top != ((Rect) (obj3)).top)
            {
                long l1;
                long l2;
                if (k == c.dO || k == c.dP)
                {
                    obj = hbq.a;
                } else
                {
                    obj = hbq.b;
                }
                hbp1 = new hbp(((hbq) (obj)), ((Rect) (obj3)).top, ((Rect) (obj3)).height());
                ((List) (obj1)).add(hbp1);
            }
            l2 = -1L;
            l1 = l2;
            if (k == c.dO)
            {
                obj = hgz1.f(afn3.c());
                l1 = l2;
                if (obj instanceof frj)
                {
                    l1 = ((frj)obj).b.d();
                }
            }
            obj = new hbo(hbp1, l1, afn3, ((Rect) (obj3)));
            hbp1.a.add(obj);
        }
        if (i == -1) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        boolean flag1;
        iterator = ((List) (obj1)).iterator();
        flag1 = false;
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        Iterator iterator1;
        boolean flag;
        iterator1 = ((hbp)iterator.next()).a.iterator();
        flag = flag1;
_L7:
        flag1 = flag;
        if (!iterator1.hasNext()) goto _L5; else goto _L4
_L4:
        hbo hbo1;
        hbo1 = (hbo)iterator1.next();
        flag1 = flag;
        if (hbo1.d.c() == i)
        {
            flag1 = true;
        }
        flag = flag1;
        if (!flag1) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (hbo1.a.b != hbq.a) goto _L7; else goto _L8
_L8:
        hbo hbo2 = hbo1;
        if (hbo1 == null)
        {
            hbo2 = hbn.a(((List) (obj1)), point);
        }
        point = (haq)hae.k(d).b(haq);
        boolean flag3;
        if (point == null || hbo2 == null)
        {
            point = null;
        } else
        {
            point = point.a(hbo2.d.c());
        }
        if (mk.h(hae.g(d)) == 1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        a = new hbn(hbo2, point, ((List) (obj1)), 0, hae.e(d), flag3);
        return;
_L2:
        hbo1 = null;
        if (true) goto _L8; else goto _L9
_L9:
    }

    public final void a(Point point, boolean flag, Object obj, jho jho)
    {
        boolean flag1 = false;
        obj = (hbn)obj;
        haq haq1 = (haq)hae.i(d).a(haq);
        int i;
        int j;
        if (((hbn) (obj)).a == null)
        {
            i = 0;
        } else
        {
            i = haq1.b(((hbn) (obj)).a);
        }
        j = ((flag1) ? 1 : 0);
        if (((hbn) (obj)).a != null)
        {
            j = ((flag1) ? 1 : 0);
            if (haq1.a(((hbn) (obj)).a))
            {
                j = ((hbn) (obj)).b.c.top - hae.g(d).getPaddingTop();
            }
        }
        d.a(i, j);
        hae.j(d).a(new hax(this, point, i, ((hbn) (obj)), flag, jho));
    }

    public final void b()
    {
        for (Iterator iterator = a.c.iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((hbp)iterator.next()).a.iterator();
            while (iterator1.hasNext()) 
            {
                a((hbo)iterator1.next());
            }
        }

        d.a(null);
        d.a(false);
    }

    void b(boolean flag)
    {
        c = flag;
        for (Iterator iterator = a.c.iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((hbp)iterator.next()).a.iterator();
            while (iterator1.hasNext()) 
            {
                b(((hbo)iterator1.next()).d);
            }
        }

        d.a(new gzu(this));
        d.a(true);
    }
}
