// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.os.TraceCompat;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            bi, RecyclerView, bf, ay, 
//            al, a, d, f, 
//            ap, bg, bj

public final class az
{

    final ArrayList a = new ArrayList();
    final ArrayList b = new ArrayList();
    final RecyclerView c;
    private ArrayList d;
    private final List e;
    private int f;
    private ay g;
    private bg h;

    public az(RecyclerView recyclerview)
    {
        c = recyclerview;
        super();
        d = null;
        e = Collections.unmodifiableList(a);
        f = 2;
    }

    private bi a(long l, int i)
    {
        for (int j = a.size() - 1; j >= 0; j--)
        {
            bi bi1 = (bi)a.get(j);
            if (bi1.d != l || bi1.g())
            {
                continue;
            }
            if (i == bi1.e)
            {
                bi1.a(32);
                if (bi1.n() && !c.e.a())
                {
                    bi1.a(2, 14);
                }
                return bi1;
            }
            a.remove(j);
            c.removeDetachedView(bi1.a, false);
            b(bi1.a);
        }

        for (int k = b.size() - 1; k >= 0; k--)
        {
            bi bi2 = (bi)b.get(k);
            if (bi2.d != l)
            {
                continue;
            }
            if (i == bi2.e)
            {
                b.remove(k);
                return bi2;
            }
            c(k);
        }

        return null;
    }

    static ArrayList a(az az1)
    {
        return az1.d;
    }

    private void a(ViewGroup viewgroup, boolean flag)
    {
        for (int i = viewgroup.getChildCount() - 1; i >= 0; i--)
        {
            View view = viewgroup.getChildAt(i);
            if (view instanceof ViewGroup)
            {
                a((ViewGroup)view, true);
            }
        }

        if (!flag)
        {
            return;
        }
        if (viewgroup.getVisibility() == 4)
        {
            viewgroup.setVisibility(0);
            viewgroup.setVisibility(4);
            return;
        } else
        {
            int j = viewgroup.getVisibility();
            viewgroup.setVisibility(4);
            viewgroup.setVisibility(j);
            return;
        }
    }

    private void c(bi bi1)
    {
        ViewCompat.setAccessibilityDelegate(bi1.a, null);
        if (RecyclerView.u(c) != null)
        {
            RecyclerView.u(c);
        }
        if (RecyclerView.g(c) != null)
        {
            RecyclerView.g(c);
        }
        if (c.e != null)
        {
            c.e.a(bi1);
        }
        bi1.i = null;
        d().a(bi1);
    }

    private bi d(int i)
    {
        boolean flag;
        int k;
label0:
        {
            flag = false;
            if (d != null)
            {
                k = d.size();
                if (k != 0)
                {
                    break label0;
                }
            }
            return null;
        }
        for (int j = 0; j < k; j++)
        {
            bi bi1 = (bi)d.get(j);
            if (!bi1.g() && bi1.c() == i)
            {
                bi1.a(32);
                return bi1;
            }
        }

        if (RecyclerView.g(c).k_())
        {
            i = c.b.a(i, 0);
            if (i > 0 && i < RecyclerView.g(c).a())
            {
                long l = RecyclerView.g(c).b(i);
                for (i = ((flag) ? 1 : 0); i < k; i++)
                {
                    bi bi2 = (bi)d.get(i);
                    if (!bi2.g() && bi2.d == l)
                    {
                        bi2.a(32);
                        return bi2;
                    }
                }

            }
        }
        return null;
    }

    private bi e(int i)
    {
        d d1;
        int k;
        boolean flag;
        int l;
        flag = false;
        l = a.size();
        for (int j = 0; j < l; j++)
        {
            bi bi1 = (bi)a.get(j);
            if (!bi1.g() && bi1.c() == i && !bi1.j() && (bf.e(c.e) || !bi1.n()))
            {
                bi1.a(32);
                return bi1;
            }
        }

        d1 = c.c;
        l = d1.c.size();
        k = 0;
_L7:
        if (k >= l) goto _L2; else goto _L1
_L1:
        Object obj;
        bi bi2;
        obj = (View)d1.c.get(k);
        bi2 = d1.a.b(((View) (obj)));
        if (bi2.c() != i || bi2.j()) goto _L4; else goto _L3
_L3:
        if (obj != null)
        {
            c.d.c(c.a(((View) (obj))));
        }
        l = b.size();
        k = ((flag) ? 1 : 0);
_L5:
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        obj = (bi)b.get(k);
        if (!((bi) (obj)).j() && ((bi) (obj)).c() == i)
        {
            b.remove(k);
            return ((bi) (obj));
        }
        break MISSING_BLOCK_LABEL_263;
_L4:
        k++;
        continue; /* Loop/switch isn't completed */
_L2:
        obj = null;
          goto _L3
        k++;
          goto _L5
        return null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final int a(int i)
    {
        if (i < 0 || i >= c.e.e())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("invalid position ")).append(i).append(". State item count is ").append(c.e.e()).toString());
        }
        if (!c.e.a())
        {
            return i;
        } else
        {
            return c.b.a(i);
        }
    }

    public final void a()
    {
        a.clear();
        c();
    }

    final void a(bi bi1)
    {
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = false;
        if (bi1.e() || bi1.a.getParent() != null)
        {
            StringBuilder stringbuilder = (new StringBuilder("Scrapped or attached views may not be recycled. isScrap:")).append(bi1.e()).append(" isAttached:");
            if (bi1.a.getParent() == null)
            {
                flag2 = false;
            }
            throw new IllegalArgumentException(stringbuilder.append(flag2).toString());
        }
        if (bi1.p())
        {
            throw new IllegalArgumentException((new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ")).append(bi1).toString());
        }
        if (bi1.b())
        {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
        }
        flag2 = bi.a(bi1);
        if (RecyclerView.g(c) != null && flag2)
        {
            RecyclerView.g(c);
        }
        if (!bi1.r())
        {
            break MISSING_BLOCK_LABEL_279;
        }
        if (bi1.j() || bi1.n() || bi1.l()) goto _L2; else goto _L1
_L1:
        int i;
        i = b.size();
        if (i == f && i > 0)
        {
            c(0);
        }
        if (i >= f) goto _L2; else goto _L3
_L3:
        boolean flag;
        b.add(bi1);
        flag = true;
_L4:
        if (!flag)
        {
            c(bi1);
            flag1 = true;
        }
_L5:
        c.e.a(bi1);
        if (!flag && !flag1 && flag2)
        {
            bi1.i = null;
        }
        return;
_L2:
        flag = false;
          goto _L4
        flag = false;
          goto _L5
    }

    public final void a(View view)
    {
        bi bi1;
        bi1 = RecyclerView.b(view);
        if (bi1.p())
        {
            c.removeDetachedView(view, false);
        }
        if (!bi1.e()) goto _L2; else goto _L1
_L1:
        bi1.f();
_L4:
        a(bi1);
        return;
_L2:
        if (bi1.g())
        {
            bi1.h();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final View b(int i)
    {
        boolean flag1 = true;
        if (i < 0 || i >= c.e.e())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Invalid item position ")).append(i).append("(").append(i).append("). Item count:").append(c.e.e()).toString());
        }
        Object obj;
        Object obj1;
        Object obj2;
        int j;
        boolean flag;
        int k;
        int l;
        int i1;
        if (c.e.a())
        {
            obj1 = d(i);
            if (obj1 != null)
            {
                j = 1;
            } else
            {
                j = 0;
            }
        } else
        {
            obj1 = null;
            j = 0;
        }
        obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj1 = e(i);
        obj = obj1;
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        if (((bi) (obj1)).n()) goto _L5; else goto _L4
_L4:
        if (((bi) (obj1)).b < 0 || ((bi) (obj1)).b >= RecyclerView.g(c).a())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid view holder adapter position")).append(obj1).toString());
        }
        if (c.e.a() || RecyclerView.g(c).a(((bi) (obj1)).b) == ((bi) (obj1)).e) goto _L7; else goto _L6
_L6:
        flag = false;
_L15:
        if (!flag)
        {
            ((bi) (obj1)).a(4);
            if (((bi) (obj1)).e())
            {
                c.removeDetachedView(((bi) (obj1)).a, false);
                ((bi) (obj1)).f();
            } else
            if (((bi) (obj1)).g())
            {
                ((bi) (obj1)).h();
            }
            a(((bi) (obj1)));
            obj = null;
        } else
        {
            j = 1;
            obj = obj1;
        }
_L2:
        obj2 = obj;
        l = j;
        if (obj != null) goto _L9; else goto _L8
_L8:
        l = c.b.a(i);
        if (l < 0 || l >= RecyclerView.g(c).a())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid item position ")).append(i).append("(offset:").append(l).append(").state:").append(c.e.e()).toString());
        }
        i1 = RecyclerView.g(c).a(l);
        obj1 = obj;
        flag = j;
        if (RecyclerView.g(c).k_())
        {
            obj = a(RecyclerView.g(c).b(l), i1);
            obj1 = obj;
            flag = j;
            if (obj != null)
            {
                obj.b = l;
                flag = true;
                obj1 = obj;
            }
        }
        obj = obj1;
        if (obj1 == null)
        {
            obj = obj1;
            if (h != null)
            {
                obj2 = h.a();
                obj = obj1;
                if (obj2 != null)
                {
                    obj1 = c.a(((View) (obj2)));
                    if (obj1 == null)
                    {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                    }
                    obj = obj1;
                    if (((bi) (obj1)).b())
                    {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                    }
                }
            }
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = d().a(i1);
            if (obj1 != null)
            {
                ((bi) (obj1)).q();
                if (RecyclerView.i() && (((bi) (obj1)).a instanceof ViewGroup))
                {
                    a((ViewGroup)((bi) (obj1)).a, false);
                }
            }
        }
        obj2 = obj1;
        l = ((flag) ? 1 : 0);
          goto _L10
_L7:
        if (RecyclerView.g(c).k_() && ((bi) (obj1)).d != RecyclerView.g(c).b(((bi) (obj1)).b))
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = true;
        continue; /* Loop/switch isn't completed */
_L10:
        if (obj1 != null) goto _L9; else goto _L11
_L11:
        obj = RecyclerView.g(c);
        obj1 = c;
        TraceCompat.beginSection("RV CreateView");
        obj1 = ((al) (obj)).a(((ViewGroup) (obj1)), i1);
        obj1.e = i1;
        j = ((flag) ? 1 : 0);
        TraceCompat.endSection();
_L13:
        if (c.e.a() && ((bi) (obj1)).m())
        {
            obj1.f = i;
            i = 0;
        } else
        if (!((bi) (obj1)).m() || ((bi) (obj1)).k() || ((bi) (obj1)).j())
        {
            k = c.b.a(i);
            obj1.i = c;
            RecyclerView.g(c).b(((bi) (obj1)), k);
            obj = ((bi) (obj1)).a;
            if (RecyclerView.s(c) != null && RecyclerView.s(c).isEnabled())
            {
                if (ViewCompat.getImportantForAccessibility(((View) (obj))) == 0)
                {
                    ViewCompat.setImportantForAccessibility(((View) (obj)), 1);
                }
                if (!ViewCompat.hasAccessibilityDelegate(((View) (obj))))
                {
                    ViewCompat.setAccessibilityDelegate(((View) (obj)), RecyclerView.t(c).b);
                }
            }
            if (c.e.a())
            {
                obj1.f = i;
            }
            i = 1;
        } else
        {
            i = 0;
        }
        obj = ((bi) (obj1)).a.getLayoutParams();
        if (obj == null)
        {
            obj = (RecyclerView.LayoutParams)c.generateDefaultLayoutParams();
            ((bi) (obj1)).a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        if (!c.checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
        {
            obj = (RecyclerView.LayoutParams)c.generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            ((bi) (obj1)).a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        {
            obj = (RecyclerView.LayoutParams)obj;
        }
        obj.a = ((bi) (obj1));
        if (j == 0 || i == 0)
        {
            flag1 = false;
        }
        obj.d = flag1;
        return ((bi) (obj1)).a;
_L9:
        j = l;
        obj1 = obj2;
        if (true) goto _L13; else goto _L12
_L12:
        if (true) goto _L15; else goto _L14
_L14:
    }

    public final List b()
    {
        return e;
    }

    final void b(bi bi1)
    {
        if (!bi1.l() || !RecyclerView.i(c) || d == null)
        {
            a.remove(bi1);
        } else
        {
            d.remove(bi1);
        }
        bi.b(bi1);
        bi1.h();
    }

    final void b(View view)
    {
        view = RecyclerView.b(view);
        bi.b(view);
        view.h();
        a(view);
    }

    final void c()
    {
        for (int i = b.size() - 1; i >= 0; i--)
        {
            c(i);
        }

        b.clear();
    }

    final void c(int i)
    {
        c((bi)b.get(i));
        b.remove(i);
    }

    final void c(View view)
    {
        view = RecyclerView.b(view);
        view.a(this);
        if (!view.l() || !RecyclerView.i(c))
        {
            if (view.j() && !view.n() && !RecyclerView.g(c).k_())
            {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
            } else
            {
                a.add(view);
                return;
            }
        }
        if (d == null)
        {
            d = new ArrayList();
        }
        d.add(view);
    }

    final ay d()
    {
        if (g == null)
        {
            g = new ay();
        }
        return g;
    }

    final void e()
    {
        boolean flag = false;
        int l = b.size();
        for (int i = 0; i < l; i++)
        {
            ((bi)b.get(i)).a();
        }

        l = a.size();
        for (int j = 0; j < l; j++)
        {
            ((bi)a.get(j)).a();
        }

        if (d != null)
        {
            int i1 = d.size();
            for (int k = ((flag) ? 1 : 0); k < i1; k++)
            {
                ((bi)d.get(k)).a();
            }

        }
    }
}
