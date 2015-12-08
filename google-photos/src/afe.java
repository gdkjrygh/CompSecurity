// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class afe
{

    public final ArrayList a = new ArrayList();
    public ArrayList b;
    public final ArrayList c = new ArrayList();
    public final List d;
    public final RecyclerView e;
    private int f;
    private afd g;

    public afe(RecyclerView recyclerview)
    {
        e = recyclerview;
        super();
        b = null;
        d = Collections.unmodifiableList(a);
        f = 2;
    }

    private afn a(int i, int j, boolean flag)
    {
        boolean flag1;
        int k;
        flag1 = false;
        k = a.size();
        j = 0;
_L15:
        if (j >= k) goto _L2; else goto _L1
_L1:
        Object obj = (afn)a.get(j);
        if (((afn) (obj)).h() || ((afn) (obj)).d() != i || ((afn) (obj)).k() || !e.v.j && ((afn) (obj)).o()) goto _L4; else goto _L3
_L3:
        ((afn) (obj)).b(32);
_L11:
        return ((afn) (obj));
_L4:
        j++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (flag) goto _L6; else goto _L5
_L5:
        acn acn1;
        acn1 = e.c;
        k = acn1.c.size();
        j = 0;
_L12:
        if (j >= k) goto _L8; else goto _L7
_L7:
        afn afn2;
        obj = (View)acn1.c.get(j);
        afn2 = acn1.a.b(((View) (obj)));
        if (afn2.d() != i || afn2.k()) goto _L10; else goto _L9
_L9:
        if (obj != null)
        {
            e.q.c(e.a(((View) (obj))));
        }
_L6:
        k = c.size();
        j = ((flag1) ? 1 : 0);
_L13:
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_288;
        }
        afn afn1 = (afn)c.get(j);
        if (afn1.k() || afn1.d() != i)
        {
            break MISSING_BLOCK_LABEL_281;
        }
        obj = afn1;
        if (!flag)
        {
            c.remove(j);
            return afn1;
        }
          goto _L11
_L10:
        j++;
          goto _L12
_L8:
        obj = null;
          goto _L9
        j++;
          goto _L13
        return null;
        if (true) goto _L15; else goto _L14
_L14:
    }

    private afn a(long l, int i, boolean flag)
    {
        int j = a.size() - 1;
_L5:
        if (j < 0) goto _L2; else goto _L1
_L1:
        afn afn2;
        afn2 = (afn)a.get(j);
        if (afn2.d != l || afn2.h())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i != afn2.e) goto _L4; else goto _L3
_L3:
        afn afn1;
        afn2.b(32);
        afn1 = afn2;
        if (afn2.o())
        {
            afn1 = afn2;
            if (!e.v.j)
            {
                afn2.a(2, 14);
                afn1 = afn2;
            }
        }
_L8:
        return afn1;
_L4:
        if (!flag)
        {
            a.remove(j);
            e.removeDetachedView(afn2.a, false);
            b(afn2.a);
        }
        j--;
          goto _L5
_L2:
        j = c.size() - 1;
_L9:
        if (j < 0) goto _L7; else goto _L6
_L6:
label0:
        {
            afn afn3 = (afn)c.get(j);
            if (afn3.d != l)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (i != afn3.e)
            {
                break label0;
            }
            afn1 = afn3;
            if (!flag)
            {
                c.remove(j);
                return afn3;
            }
        }
          goto _L8
        if (!flag)
        {
            c(j);
        }
        j--;
          goto _L9
_L7:
        return null;
          goto _L8
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

    private void c(afn afn1)
    {
        mk.a(afn1.a, null);
        if (RecyclerView.r(e) != null)
        {
            RecyclerView.r(e).a(afn1);
        }
        if (RecyclerView.f(e) != null)
        {
            RecyclerView.f(e);
        }
        if (e.v != null)
        {
            e.v.a(afn1);
        }
        afn1.n = null;
        c().a(afn1);
    }

    private afn d(int i)
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
            afn afn1 = (afn)b.get(j);
            if (!afn1.h() && afn1.d() == i)
            {
                afn1.b(32);
                return afn1;
            }
        }

        if (RecyclerView.f(e).b)
        {
            i = e.b.a(i, 0);
            if (i > 0 && i < RecyclerView.f(e).a())
            {
                long l = RecyclerView.f(e).b(i);
                for (i = ((flag) ? 1 : 0); i < k; i++)
                {
                    afn afn2 = (afn)b.get(i);
                    if (!afn2.h() && afn2.d == l)
                    {
                        afn2.b(32);
                        return afn2;
                    }
                }

            }
        }
        return null;
    }

    public final int a(int i)
    {
        if (i < 0 || i >= e.v.b())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("invalid position ")).append(i).append(". State item count is ").append(e.v.b()).toString());
        }
        if (!e.v.j)
        {
            return i;
        } else
        {
            return e.b.a(i);
        }
    }

    final View a(int i, boolean flag)
    {
        flag = true;
        if (i < 0 || i >= e.v.b())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Invalid item position ")).append(i).append("(").append(i).append("). Item count:").append(e.v.b()).toString());
        }
        Object obj;
        Object obj1;
        boolean flag1;
        int j;
        int k;
        if (e.v.j)
        {
            obj1 = d(i);
            if (obj1 != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            j = ((flag1) ? 1 : 0);
        } else
        {
            obj1 = null;
            j = 0;
        }
        obj = obj1;
        flag1 = j;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj1 = a(i, -1, false);
        obj = obj1;
        flag1 = j;
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        if (((afn) (obj1)).o()) goto _L5; else goto _L4
_L4:
        if (((afn) (obj1)).b < 0 || ((afn) (obj1)).b >= RecyclerView.f(e).a())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid view holder adapter position")).append(obj1).toString());
        }
        if (e.v.j || RecyclerView.f(e).a(((afn) (obj1)).b) == ((afn) (obj1)).e) goto _L7; else goto _L6
_L6:
        flag1 = false;
_L9:
        if (!flag1)
        {
            ((afn) (obj1)).b(4);
            if (((afn) (obj1)).f())
            {
                e.removeDetachedView(((afn) (obj1)).a, false);
                ((afn) (obj1)).g();
            } else
            if (((afn) (obj1)).h())
            {
                ((afn) (obj1)).i();
            }
            a(((afn) (obj1)));
            obj = null;
            flag1 = j;
        } else
        {
            flag1 = true;
            obj = obj1;
        }
          goto _L2
_L7:
        if (RecyclerView.f(e).b)
        {
            if (((afn) (obj1)).d == RecyclerView.f(e).b(((afn) (obj1)).b))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag1 = true;
        continue; /* Loop/switch isn't completed */
_L2:
        if (obj == null)
        {
            k = e.b.a(i);
            if (k < 0 || k >= RecyclerView.f(e).a())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid item position ")).append(i).append("(offset:").append(k).append(").state:").append(e.v.b()).toString());
            }
            j = RecyclerView.f(e).a(k);
            if (RecyclerView.f(e).b)
            {
                obj1 = a(RecyclerView.f(e).b(k), j, false);
                obj = obj1;
                if (obj1 != null)
                {
                    obj1.b = k;
                    flag1 = true;
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
                    obj = (afn)((ArrayList) (obj1)).get(k);
                    ((ArrayList) (obj1)).remove(k);
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    ((afn) (obj)).r();
                    if (RecyclerView.l() && (((afn) (obj)).a instanceof ViewGroup))
                    {
                        a((ViewGroup)((afn) (obj)).a, false);
                    }
                }
                obj1 = obj;
            }
            if (obj1 == null)
            {
                obj = RecyclerView.f(e).b(e, j);
            } else
            {
                obj = obj1;
            }
        }
        if (e.v.j && ((afn) (obj)).n())
        {
            obj.f = i;
            i = 0;
        } else
        if (!((afn) (obj)).n() || ((afn) (obj)).l() || ((afn) (obj)).k())
        {
            j = e.b.a(i);
            obj.n = e;
            RecyclerView.f(e).b(((afn) (obj)), j);
            obj1 = ((afn) (obj)).a;
            if (e.f())
            {
                if (mk.e(((View) (obj1))) == 0)
                {
                    mk.c(((View) (obj1)), 1);
                }
                if (!mk.b(((View) (obj1))))
                {
                    mk.a(((View) (obj1)), RecyclerView.q(e).c);
                }
            }
            if (e.v.j)
            {
                obj.f = i;
            }
            i = 1;
        } else
        {
            i = 0;
        }
        obj1 = ((afn) (obj)).a.getLayoutParams();
        if (obj1 == null)
        {
            obj1 = (aez)e.generateDefaultLayoutParams();
            ((afn) (obj)).a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        } else
        if (!e.checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1))))
        {
            obj1 = (aez)e.generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
            ((afn) (obj)).a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        } else
        {
            obj1 = (aez)obj1;
        }
        obj1.c = ((afn) (obj));
        if (!flag1 || i == 0)
        {
            flag = false;
        }
        obj1.f = flag;
        return ((afn) (obj)).a;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void a()
    {
        a.clear();
        b();
    }

    public final void a(afn afn1)
    {
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = false;
        if (afn1.f() || afn1.a.getParent() != null)
        {
            StringBuilder stringbuilder = (new StringBuilder("Scrapped or attached views may not be recycled. isScrap:")).append(afn1.f()).append(" isAttached:");
            if (afn1.a.getParent() == null)
            {
                flag2 = false;
            }
            throw new IllegalArgumentException(stringbuilder.append(flag2).toString());
        }
        if (afn1.p())
        {
            throw new IllegalArgumentException((new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ")).append(afn1).toString());
        }
        if (afn1.b())
        {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
        }
        flag2 = afn.c(afn1);
        if (RecyclerView.f(e) != null && flag2)
        {
            RecyclerView.f(e);
        }
        if (!afn1.s())
        {
            break MISSING_BLOCK_LABEL_270;
        }
        if (afn1.a(78)) goto _L2; else goto _L1
_L1:
        int i;
        i = c.size();
        if (i == f && i > 0)
        {
            c(0);
        }
        if (i >= f) goto _L2; else goto _L3
_L3:
        boolean flag;
        c.add(afn1);
        flag = true;
_L4:
        if (!flag)
        {
            c(afn1);
            flag1 = true;
        }
_L5:
        e.v.a(afn1);
        if (!flag && !flag1 && flag2)
        {
            afn1.n = null;
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
        afn afn1;
        afn1 = RecyclerView.b(view);
        if (afn1.p())
        {
            e.removeDetachedView(view, false);
        }
        if (!afn1.f()) goto _L2; else goto _L1
_L1:
        afn1.g();
_L4:
        a(afn1);
        return;
_L2:
        if (afn1.h())
        {
            afn1.i();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final View b(int i)
    {
        boolean flag1 = true;
        if (i < 0 || i >= e.v.b())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Invalid item position ")).append(i).append("(").append(i).append("). Item count:").append(e.v.b()).toString());
        }
        Object obj;
        Object obj1;
        boolean flag;
        int j;
        int k;
        if (e.v.j)
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
        obj1 = a(i, -1, false);
        obj = obj1;
        flag = j;
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        if (((afn) (obj1)).o()) goto _L5; else goto _L4
_L4:
        if (((afn) (obj1)).b < 0 || ((afn) (obj1)).b >= RecyclerView.f(e).a())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid view holder adapter position")).append(obj1).toString());
        }
        if (e.v.j || RecyclerView.f(e).a(((afn) (obj1)).b) == ((afn) (obj1)).e) goto _L7; else goto _L6
_L6:
        flag = false;
_L9:
        if (!flag)
        {
            ((afn) (obj1)).b(4);
            if (((afn) (obj1)).f())
            {
                e.removeDetachedView(((afn) (obj1)).a, false);
                ((afn) (obj1)).g();
            } else
            if (((afn) (obj1)).h())
            {
                ((afn) (obj1)).i();
            }
            a(((afn) (obj1)));
            obj = null;
            flag = j;
        } else
        {
            flag = true;
            obj = obj1;
        }
          goto _L2
_L7:
        if (RecyclerView.f(e).b)
        {
            if (((afn) (obj1)).d == RecyclerView.f(e).b(((afn) (obj1)).b))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = true;
        continue; /* Loop/switch isn't completed */
_L2:
        if (obj == null)
        {
            k = e.b.a(i);
            if (k < 0 || k >= RecyclerView.f(e).a())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid item position ")).append(i).append("(offset:").append(k).append(").state:").append(e.v.b()).toString());
            }
            j = RecyclerView.f(e).a(k);
            if (RecyclerView.f(e).b)
            {
                obj1 = a(RecyclerView.f(e).b(k), j, false);
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
                    obj = (afn)((ArrayList) (obj1)).get(k);
                    ((ArrayList) (obj1)).remove(k);
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    ((afn) (obj)).r();
                    if (RecyclerView.l() && (((afn) (obj)).a instanceof ViewGroup))
                    {
                        a((ViewGroup)((afn) (obj)).a, false);
                    }
                }
                obj1 = obj;
            }
            if (obj1 == null)
            {
                obj = RecyclerView.f(e).b(e, j);
            } else
            {
                obj = obj1;
            }
        }
        if (e.v.j && ((afn) (obj)).n())
        {
            obj.f = i;
            i = 0;
        } else
        if (!((afn) (obj)).n() || ((afn) (obj)).l() || ((afn) (obj)).k())
        {
            j = e.b.a(i);
            obj.n = e;
            RecyclerView.f(e).b(((afn) (obj)), j);
            obj1 = ((afn) (obj)).a;
            if (e.f())
            {
                if (mk.e(((View) (obj1))) == 0)
                {
                    mk.c(((View) (obj1)), 1);
                }
                if (!mk.b(((View) (obj1))))
                {
                    mk.a(((View) (obj1)), RecyclerView.q(e).c);
                }
            }
            if (e.v.j)
            {
                obj.f = i;
            }
            i = 1;
        } else
        {
            i = 0;
        }
        obj1 = ((afn) (obj)).a.getLayoutParams();
        if (obj1 == null)
        {
            obj1 = (aez)e.generateDefaultLayoutParams();
            ((afn) (obj)).a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        } else
        if (!e.checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1))))
        {
            obj1 = (aez)e.generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
            ((afn) (obj)).a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        } else
        {
            obj1 = (aez)obj1;
        }
        obj1.c = ((afn) (obj));
        if (!flag || i == 0)
        {
            flag1 = false;
        }
        obj1.f = flag1;
        return ((afn) (obj)).a;
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

    public final void b(afn afn1)
    {
        if (!afn1.m() || !RecyclerView.h(e) || b == null)
        {
            a.remove(afn1);
        } else
        {
            b.remove(afn1);
        }
        afn.a(afn1, null);
        afn1.i();
    }

    final void b(View view)
    {
        view = RecyclerView.b(view);
        afn.a(view, null);
        view.i();
        a(view);
    }

    public final afd c()
    {
        if (g == null)
        {
            g = new afd();
        }
        return g;
    }

    public final void c(int i)
    {
        c((afn)c.get(i));
        c.remove(i);
    }
}
