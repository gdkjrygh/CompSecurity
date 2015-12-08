// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class abh
{

    public final ArrayList a = new ArrayList();
    public ArrayList b;
    public final ArrayList c = new ArrayList();
    public final List d;
    public abg e;
    public final RecyclerView f;
    private int g;

    public abh(RecyclerView recyclerview)
    {
        f = recyclerview;
        super();
        b = null;
        d = Collections.unmodifiableList(a);
        g = 2;
    }

    private abo a(long l, int i)
    {
        for (int j = a.size() - 1; j >= 0; j--)
        {
            abo abo1 = (abo)a.get(j);
            if (abo1.d != l || abo1.h())
            {
                continue;
            }
            if (i == abo1.e)
            {
                abo1.b(32);
                if (abo1.n() && !f.q.f)
                {
                    abo1.a(2, 14);
                }
                return abo1;
            }
            a.remove(j);
            f.removeDetachedView(abo1.a, false);
            b(abo1.a);
        }

        for (int k = c.size() - 1; k >= 0; k--)
        {
            abo abo2 = (abo)c.get(k);
            if (abo2.d != l)
            {
                continue;
            }
            if (i == abo2.e)
            {
                c.remove(k);
                return abo2;
            }
            c(k);
        }

        return null;
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

    private void c(abo abo1)
    {
        km.a(abo1.a, null);
        RecyclerView.t();
        if (RecyclerView.g(f) != null)
        {
            RecyclerView.g(f).a(abo1);
        }
        Object obj = f.q;
        f.d.c(abo1);
        abo1.i = null;
        abg abg1 = c();
        int i = abo1.e;
        ArrayList arraylist = (ArrayList)abg1.a.get(i);
        obj = arraylist;
        if (arraylist == null)
        {
            ArrayList arraylist1 = new ArrayList();
            abg1.a.put(i, arraylist1);
            obj = arraylist1;
            if (abg1.b.indexOfKey(i) < 0)
            {
                abg1.b.put(i, 5);
                obj = arraylist1;
            }
        }
        if (abg1.b.get(i) > ((ArrayList) (obj)).size())
        {
            abo1.r();
            ((ArrayList) (obj)).add(abo1);
        }
    }

    private abo d(int i)
    {
        boolean flag;
        int k;
label0:
        {
            flag = false;
            if (b != null)
            {
                k = b.size();
                if (k != 0)
                {
                    break label0;
                }
            }
            return null;
        }
        for (int j = 0; j < k; j++)
        {
            abo abo1 = (abo)b.get(j);
            if (!abo1.h() && abo1.c() == i)
            {
                abo1.b(32);
                return abo1;
            }
        }

        if (RecyclerView.g(f).b)
        {
            i = f.b.a(i, 0);
            if (i > 0 && i < RecyclerView.g(f).b())
            {
                long l = RecyclerView.g(f).b(i);
                for (i = ((flag) ? 1 : 0); i < k; i++)
                {
                    abo abo2 = (abo)b.get(i);
                    if (!abo2.h() && abo2.d == l)
                    {
                        abo2.b(32);
                        return abo2;
                    }
                }

            }
        }
        return null;
    }

    private abo e(int i)
    {
        Object obj;
        int k;
        boolean flag;
        int i1;
        flag = false;
        i1 = a.size();
        for (int j = 0; j < i1; j++)
        {
            abo abo1 = (abo)a.get(j);
            if (!abo1.h() && abo1.c() == i && !abo1.k() && (f.q.f || !abo1.n()))
            {
                abo1.b(32);
                return abo1;
            }
        }

        obj = f.c;
        i1 = ((zu) (obj)).c.size();
        k = 0;
_L7:
        if (k >= i1) goto _L2; else goto _L1
_L1:
        View view;
        Object obj1;
        view = (View)((zu) (obj)).c.get(k);
        obj1 = ((zu) (obj)).a.b(view);
        if (((abo) (obj1)).c() != i || ((abo) (obj1)).k()) goto _L4; else goto _L3
_L3:
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_359;
        }
        obj = RecyclerView.b(view);
        obj1 = f.c;
        i = ((zu) (obj1)).a.a(view);
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("view is not a child, cannot hide ")).append(view).toString());
        }
        break; /* Loop/switch isn't completed */
_L4:
        k++;
        continue; /* Loop/switch isn't completed */
_L2:
        view = null;
        if (true) goto _L3; else goto _L5
_L5:
        if (!((zu) (obj1)).b.c(i))
        {
            throw new RuntimeException((new StringBuilder("trying to unhide a view that was not hidden")).append(view).toString());
        }
        ((zu) (obj1)).b.b(i);
        ((zu) (obj1)).b(view);
        i = f.c.c(view);
        if (i == -1)
        {
            throw new IllegalStateException((new StringBuilder("layout index should not be -1 after unhiding a view:")).append(obj).toString());
        } else
        {
            f.c.d(i);
            c(view);
            ((abo) (obj)).b(8224);
            return ((abo) (obj));
        }
        int j1 = c.size();
        for (int l = ((flag) ? 1 : 0); l < j1; l++)
        {
            abo abo2 = (abo)c.get(l);
            if (!abo2.k() && abo2.c() == i)
            {
                c.remove(l);
                return abo2;
            }
        }

        return null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final int a(int i)
    {
        if (i < 0 || i >= f.q.b())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("invalid position ")).append(i).append(". State item count is ").append(f.q.b()).toString());
        }
        if (!f.q.f)
        {
            return i;
        } else
        {
            return f.b.b(i);
        }
    }

    public final void a()
    {
        a.clear();
        b();
    }

    public final void a(abo abo1)
    {
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = false;
        if (abo1.f() || abo1.a.getParent() != null)
        {
            StringBuilder stringbuilder = (new StringBuilder("Scrapped or attached views may not be recycled. isScrap:")).append(abo1.f()).append(" isAttached:");
            if (abo1.a.getParent() == null)
            {
                flag2 = false;
            }
            throw new IllegalArgumentException(stringbuilder.append(flag2).toString());
        }
        if (abo1.o())
        {
            throw new IllegalArgumentException((new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ")).append(abo1).toString());
        }
        if (abo1.E_())
        {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
        }
        flag2 = abo.c(abo1);
        if (RecyclerView.g(f) != null && flag2)
        {
            RecyclerView.g(f);
        }
        if (!abo1.s())
        {
            break MISSING_BLOCK_LABEL_270;
        }
        if (abo1.a(14)) goto _L2; else goto _L1
_L1:
        int i;
        i = c.size();
        if (i == g && i > 0)
        {
            c(0);
        }
        if (i >= g) goto _L2; else goto _L3
_L3:
        boolean flag;
        c.add(abo1);
        flag = true;
_L4:
        if (!flag)
        {
            c(abo1);
            flag1 = true;
        }
_L5:
        f.d.c(abo1);
        if (!flag && !flag1 && flag2)
        {
            abo1.i = null;
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
        abo abo1;
        abo1 = RecyclerView.b(view);
        if (abo1.o())
        {
            f.removeDetachedView(view, false);
        }
        if (!abo1.f()) goto _L2; else goto _L1
_L1:
        abo1.g();
_L4:
        a(abo1);
        return;
_L2:
        if (abo1.h())
        {
            abo1.i();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final View b(int i)
    {
        boolean flag1 = true;
        if (i < 0 || i >= f.q.b())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Invalid item position ")).append(i).append("(").append(i).append("). Item count:").append(f.q.b()).toString());
        }
        Object obj;
        Object obj1;
        boolean flag;
        int j;
        int k;
        if (f.q.f)
        {
            obj1 = d(i);
            if (obj1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j = ((flag) ? 1 : 0);
        } else
        {
            obj1 = null;
            j = 0;
        }
        obj = obj1;
        flag = j;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj1 = e(i);
        obj = obj1;
        flag = j;
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        if (((abo) (obj1)).n()) goto _L5; else goto _L4
_L4:
        if (((abo) (obj1)).b < 0 || ((abo) (obj1)).b >= RecyclerView.g(f).b())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid view holder adapter position")).append(obj1).toString());
        }
        if (f.q.f || RecyclerView.g(f).a(((abo) (obj1)).b) == ((abo) (obj1)).e) goto _L7; else goto _L6
_L6:
        flag = false;
_L9:
        if (!flag)
        {
            ((abo) (obj1)).b(4);
            if (((abo) (obj1)).f())
            {
                f.removeDetachedView(((abo) (obj1)).a, false);
                ((abo) (obj1)).g();
            } else
            if (((abo) (obj1)).h())
            {
                ((abo) (obj1)).i();
            }
            a(((abo) (obj1)));
            obj = null;
            flag = j;
        } else
        {
            flag = true;
            obj = obj1;
        }
          goto _L2
_L7:
        if (RecyclerView.g(f).b && ((abo) (obj1)).d != RecyclerView.g(f).b(((abo) (obj1)).b))
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = true;
        continue; /* Loop/switch isn't completed */
_L2:
        if (obj == null)
        {
            k = f.b.b(i);
            if (k < 0 || k >= RecyclerView.g(f).b())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid item position ")).append(i).append("(offset:").append(k).append(").state:").append(f.q.b()).toString());
            }
            j = RecyclerView.g(f).a(k);
            if (RecyclerView.g(f).b)
            {
                obj1 = a(RecyclerView.g(f).b(k), j);
                obj = obj1;
                if (obj1 != null)
                {
                    obj1.b = k;
                    flag = true;
                    obj = obj1;
                }
            }
            obj1 = obj;
            if (obj == null)
            {
                obj1 = (ArrayList)c().a.get(j);
                if (obj1 != null && !((ArrayList) (obj1)).isEmpty())
                {
                    k = ((ArrayList) (obj1)).size() - 1;
                    obj = (abo)((ArrayList) (obj1)).get(k);
                    ((ArrayList) (obj1)).remove(k);
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    ((abo) (obj)).r();
                    if (RecyclerView.s() && (((abo) (obj)).a instanceof ViewGroup))
                    {
                        a((ViewGroup)((abo) (obj)).a, false);
                    }
                }
                obj1 = obj;
            }
            if (obj1 == null)
            {
                obj = RecyclerView.g(f);
                obj1 = f;
                gr.a("RV CreateView");
                obj = ((aav) (obj)).a(((ViewGroup) (obj1)), j);
                obj.e = j;
                gr.a();
            } else
            {
                obj = obj1;
            }
        }
        if (flag && !f.q.f && ((abo) (obj)).a(8192))
        {
            ((abo) (obj)).a(0, 8192);
            if (f.q.g)
            {
                aay.d(((abo) (obj)));
                obj1 = f.n;
                obj1 = f.q;
                ((abo) (obj)).q();
                obj1 = (new aba()).a(((abo) (obj)));
                RecyclerView.a(f, ((abo) (obj)), ((aba) (obj1)));
            }
        }
        if (f.q.f && ((abo) (obj)).m())
        {
            obj.f = i;
            i = 0;
        } else
        if (!((abo) (obj)).m() || ((abo) (obj)).l() || ((abo) (obj)).k())
        {
            j = f.b.b(i);
            obj.i = f;
            obj1 = RecyclerView.g(f);
            obj.b = j;
            if (((aav) (obj1)).b)
            {
                obj.d = ((aav) (obj1)).b(j);
            }
            ((abo) (obj)).a(1, 519);
            gr.a("RV OnBindView");
            ((abo) (obj)).q();
            ((aav) (obj1)).a(((abo) (obj)), j);
            ((abo) (obj)).p();
            gr.a();
            obj1 = ((abo) (obj)).a;
            if (f.n())
            {
                if (km.e(((View) (obj1))) == 0)
                {
                    km.c(((View) (obj1)), 1);
                }
                if (!km.b(((View) (obj1))))
                {
                    km.a(((View) (obj1)), RecyclerView.s(f).c);
                }
            }
            if (f.q.f)
            {
                obj.f = i;
            }
            i = 1;
        } else
        {
            i = 0;
        }
        obj1 = ((abo) (obj)).a.getLayoutParams();
        if (obj1 == null)
        {
            obj1 = (android.support.v7.widget.RecyclerView.LayoutParams)f.generateDefaultLayoutParams();
            ((abo) (obj)).a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        } else
        if (!f.checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1))))
        {
            obj1 = (android.support.v7.widget.RecyclerView.LayoutParams)f.generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
            ((abo) (obj)).a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        } else
        {
            obj1 = (android.support.v7.widget.RecyclerView.LayoutParams)obj1;
        }
        obj1.c = ((abo) (obj));
        if (!flag || i == 0)
        {
            flag1 = false;
        }
        obj1.f = flag1;
        return ((abo) (obj)).a;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void b()
    {
        for (int i = c.size() - 1; i >= 0; i--)
        {
            c(i);
        }

        c.clear();
    }

    public final void b(abo abo1)
    {
        if (abo.f(abo1))
        {
            b.remove(abo1);
        } else
        {
            a.remove(abo1);
        }
        abo.d(abo1);
        abo.e(abo1);
        abo1.i();
    }

    final void b(View view)
    {
        view = RecyclerView.b(view);
        abo.d(view);
        abo.e(view);
        view.i();
        a(view);
    }

    public final abg c()
    {
        if (e == null)
        {
            e = new abg();
        }
        return e;
    }

    public final void c(int i)
    {
        c((abo)c.get(i));
        c.remove(i);
    }

    final void c(View view)
    {
        view = RecyclerView.b(view);
        if (!view.t() || view.k() || RecyclerView.a(f, view))
        {
            if (view.k() && !view.n() && !RecyclerView.g(f).b)
            {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
            } else
            {
                view.a(this, false);
                a.add(view);
                return;
            }
        }
        if (b == null)
        {
            b = new ArrayList();
        }
        view.a(this, true);
        b.add(view);
    }
}
