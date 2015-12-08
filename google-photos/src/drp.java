// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.photos.allphotos.fragment.month.MonthView;
import com.google.android.apps.photos.list.fastscroll.FastScrollRecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class drp
    implements drn, ds, gzv, jhz
{

    hbn a;
    private final Context b;
    private final ekq c;
    private final hba d;
    private final hbg e;
    private final drr f;
    private Map g;
    private boolean h;
    private boolean i;

    drp(Context context, ekq ekq, hba hba1, hbg hbg, drr drr1)
    {
        g = new HashMap();
        b = context;
        c = ekq;
        d = hba1;
        e = hbg;
        f = drr1;
    }

    private static void a(dqy dqy1)
    {
        dqy1.o.setAlpha(1.0F);
        dqy1.o.setTranslationX(0.0F);
        dqy1.o.setTranslationY(0.0F);
        dqy1.p.d = null;
    }

    private static void a(hbo hbo1)
    {
        float f1 = ((hbo1.i - 1.0F) * (float)hbo1.c.height()) / 2.0F;
        dqy dqy1 = (dqy)hbo1.d;
        dqy1.o.setTranslationX(hbo1.j * 2.0F);
        dqy1.o.setTranslationY(f1 + hbo1.k);
    }

    public final Object a(Point point, boolean flag)
    {
        h = true;
        a(point, -1);
        b(flag);
        return a;
    }

    public final void a(float f1)
    {
        a.a(h, i, f1);
        for (Iterator iterator = a.c.iterator(); iterator.hasNext();)
        {
            Iterator iterator2 = ((hbp)iterator.next()).a.iterator();
            while (iterator2.hasNext()) 
            {
                hbo hbo1 = (hbo)iterator2.next();
                if (hbo1.d instanceof dqy)
                {
                    ((dqy)hbo1.d).p.invalidate();
                } else
                {
                    hbo1.a(hbo1.d.a, null);
                    hbo1.d.a.setTranslationX(hbo1.j * 2.0F);
                }
            }
        }

        Iterator iterator1 = g.values().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            List list = (List)iterator1.next();
            if (!list.isEmpty())
            {
                a((hbo)list.get(0));
            }
        } while (true);
    }

    public final void a(afn afn1, afn afn2)
    {
label0:
        {
            if (!(afn1 instanceof dqy) || !(afn2 instanceof dqy) || ((dqy)afn1).p.a != ((dqy)afn2).p.a)
            {
                break label0;
            }
            afn1 = (dqy)afn1;
            afn2 = (dqy)afn2;
            ((dqy) (afn1)).p.d = null;
            ((dqy) (afn2)).p.d = this;
            g.put(((dqy) (afn2)).p, g.get(((dqy) (afn1)).p));
            g.remove(((dqy) (afn1)).p);
            Iterator iterator = a.c.iterator();
            boolean flag = false;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Iterator iterator1 = ((hbp)iterator.next()).a.iterator();
                boolean flag1 = flag;
                do
                {
                    flag = flag1;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    hbo hbo1 = (hbo)iterator1.next();
                    if (hbo1.d == afn1)
                    {
                        hbo1.d = afn2;
                        if (!flag1)
                        {
                            a(hbo1);
                            flag1 = true;
                        }
                    }
                } while (true);
            } while (true);
            afn2.a(false);
            afn1.a(true);
            a(((dqy) (afn1)));
            ((dqy) (afn1)).a.setVisibility(8);
            return;
        }
        afn2.a.setVisibility(8);
    }

    void a(Point point, int j)
    {
        ArrayList arraylist = new ArrayList();
        aex aex1 = d.b();
        double d1 = 1.7976931348623157E+308D;
        Object obj = null;
        hbo hbo1 = null;
        int k = -1;
        int l = 0;
        Rect rect = new Rect();
        boolean flag = false;
        int k1 = 0;
        while (k1 < aex1.getChildCount()) 
        {
            Object obj1 = d;
            View view = aex1.getChildAt(k1);
            afn afn1 = ((hba) (obj1)).b.a.a(view);
            if (mk.h(afn1.a) == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (afn1.e == c.cd)
            {
                dqy dqy1 = (dqy)afn1;
                ArrayList arraylist1 = new ArrayList();
                dqy1.p.a(rect, 0);
                Object obj2;
                int i1;
                int l1;
                int i2;
                if (flag)
                {
                    l = rect.right - dqy1.a.getRight();
                } else
                {
                    l = rect.left + dqy1.p.getLeft();
                }
                i2 = dqy1.a.getTop();
                l1 = -1;
                obj2 = null;
                i1 = 0;
                obj1 = hbo1;
                hbo1 = ((hbo) (obj));
                obj = obj1;
                obj1 = obj2;
                for (; i1 < dqy1.p.a; i1++)
                {
                    Rect rect1 = new Rect();
                    dqy1.p.a(rect1, i1);
                    if (obj1 == null || rect1.top != l1)
                    {
                        obj1 = new hbp(hbq.a, rect1.top + i2, rect1.height());
                        arraylist.add(obj1);
                    }
                    l1 = rect1.top;
                    rect1.offset(dqy1.p.getLeft(), i2);
                    hbo hbo2 = new hbo(((hbp) (obj1)), -1L, afn1, rect1);
                    ((hbp) (obj1)).a.add(hbo2);
                    arraylist1.add(hbo2);
                    if (i1 == 0)
                    {
                        hbo1 = hbo2;
                    }
                    if (j != -1)
                    {
                        continue;
                    }
                    double d2 = Math.sqrt(Math.pow(rect1.centerX() - point.x, 2D) + Math.pow(rect1.centerY() - point.y, 2D));
                    if (d2 < d1)
                    {
                        k = i1;
                        obj = hbo1;
                        d1 = d2;
                    }
                }

                if (!arraylist1.isEmpty())
                {
                    g.put(dqy1.p, arraylist1);
                    dqy1.p.d = this;
                }
                i1 = k;
                obj1 = obj;
                if (j != -1)
                {
                    i1 = k;
                    obj1 = obj;
                    if (afn1.c() == j)
                    {
                        i1 = 0;
                        obj1 = hbo1;
                    }
                }
                k = i1;
            } else
            {
                int j1 = afn1.a.getTop();
                obj1 = new hbp(hbq.b, j1, afn1.a.getHeight());
                hbo hbo3 = new hbo(((hbp) (obj1)), -1L, afn1, new Rect(afn1.a.getLeft(), afn1.a.getTop(), afn1.a.getRight(), afn1.a.getBottom()));
                ((hbp) (obj1)).a.add(hbo3);
                arraylist.add(obj1);
                obj1 = hbo1;
                hbo1 = ((hbo) (obj));
            }
            k1++;
            obj = hbo1;
            hbo1 = ((hbo) (obj1));
        }
        long l2;
        if (hbo1 == null)
        {
            point = null;
        } else
        {
            point = ((dqy)hbo1.d).p.d();
        }
        if (hbo1 == null || point.isEmpty())
        {
            point = null;
        } else
        {
            point = ((iws)point.get(k)).b;
        }
        obj = c;
        if (point == null)
        {
            l2 = -1L;
        } else
        {
            l2 = point.d();
        }
        a = new hbn(hbo1, new har(((ekq) (obj)), point, l2, new fnc()), arraylist, l, e, flag);
    }

    public final void a(Point point, boolean flag, Object obj, jho jho)
    {
        obj = (hbn)obj;
        hba hba1;
        int j;
        if (((hbn) (obj)).a == null)
        {
            j = 0;
        } else
        {
            j = f.a(((hbn) (obj)).a.b);
        }
        hba1 = d;
        hba1.a(new hbd(hba1, j, Math.max(0, point.y - d.b.a.getPaddingTop() - b.getResources().getDimensionPixelSize(b.iV))));
        b.a(new drq(this, point, j, ((hbn) (obj)), flag, jho));
    }

    public final void a(MonthView monthview, int j, Rect rect, Paint paint)
    {
        monthview = (hbo)((List)g.get(monthview)).get(j);
        rect.offset((int)((hbo) (monthview)).j, (int)((hbo) (monthview)).k);
        rect.right = (int)((float)rect.left + (float)rect.width() * ((hbo) (monthview)).h);
        rect.bottom = (int)((float)rect.top + (float)rect.height() * ((hbo) (monthview)).i);
        paint.setAlpha((int)(((hbo) (monthview)).g * 255F));
    }

    public final void b()
    {
        HashSet hashset = new HashSet();
        for (Iterator iterator = a.c.iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((hbp)iterator.next()).a.iterator();
            while (iterator1.hasNext()) 
            {
                hbo hbo1 = (hbo)iterator1.next();
                if (!hashset.contains(hbo1.d))
                {
                    hbo1.d.a(true);
                    hashset.add(hbo1.d);
                    if (hbo1.d instanceof dqy)
                    {
                        a((dqy)hbo1.d);
                    } else
                    {
                        hbo.b(hbo1.d.a, null);
                    }
                }
            }
        }

        d.a(null);
        d.a(false);
    }

    void b(boolean flag)
    {
        i = flag;
        HashSet hashset = new HashSet();
        for (Iterator iterator = a.c.iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((hbp)iterator.next()).a.iterator();
            while (iterator1.hasNext()) 
            {
                hbo hbo1 = (hbo)iterator1.next();
                if (!hashset.contains(hbo1.d))
                {
                    hbo1.d.a(false);
                    hashset.add(hbo1.d);
                }
            }
        }

        d.a(new gzu(this));
        d.a(true);
    }
}
