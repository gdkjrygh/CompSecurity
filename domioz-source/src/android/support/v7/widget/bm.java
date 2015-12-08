// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.bp;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            bv, RecyclerView, bs, bc, 
//            k, bl, n, p, 
//            bf, bt, bw

public final class bm
{

    final ArrayList a = new ArrayList();
    final ArrayList b = new ArrayList();
    final RecyclerView c;
    private ArrayList d;
    private final List e;
    private int f;
    private bl g;
    private bt h;

    public bm(RecyclerView recyclerview)
    {
        c = recyclerview;
        super();
        d = null;
        e = Collections.unmodifiableList(a);
        f = 2;
    }

    private bv a(long l, int i)
    {
        for (int j = a.size() - 1; j >= 0; j--)
        {
            bv bv1 = (bv)a.get(j);
            if (bv1.getItemId() != l || bv1.wasReturnedFromScrap())
            {
                continue;
            }
            if (i == bv1.getItemViewType())
            {
                bv1.addFlags(32);
                if (bv1.isRemoved() && !c.e.a())
                {
                    bv1.setFlags(2, 14);
                }
                return bv1;
            }
            a.remove(j);
            c.removeDetachedView(bv1.itemView, false);
            b(bv1.itemView);
        }

        for (int i1 = b.size() - 1; i1 >= 0; i1--)
        {
            bv bv2 = (bv)b.get(i1);
            if (bv2.getItemId() != l)
            {
                continue;
            }
            if (i == bv2.getItemViewType())
            {
                b.remove(i1);
                return bv2;
            }
            b(i1);
        }

        return null;
    }

    static ArrayList a(bm bm1)
    {
        return bm1.d;
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

    private bv c(int i)
    {
        boolean flag;
        int l;
label0:
        {
            flag = false;
            if (d != null)
            {
                l = d.size();
                if (l != 0)
                {
                    break label0;
                }
            }
            return null;
        }
        for (int j = 0; j < l; j++)
        {
            bv bv1 = (bv)d.get(j);
            if (!bv1.wasReturnedFromScrap() && bv1.getLayoutPosition() == i)
            {
                bv1.addFlags(32);
                return bv1;
            }
        }

        if (RecyclerView.g(c).hasStableIds())
        {
            i = c.b.a(i, 0);
            if (i > 0 && i < RecyclerView.g(c).getItemCount())
            {
                long l1 = RecyclerView.g(c).getItemId(i);
                for (i = ((flag) ? 1 : 0); i < l; i++)
                {
                    bv bv2 = (bv)d.get(i);
                    if (!bv2.wasReturnedFromScrap() && bv2.getItemId() == l1)
                    {
                        bv2.addFlags(32);
                        return bv2;
                    }
                }

            }
        }
        return null;
    }

    private void c(bv bv1)
    {
        bp.a(bv1.itemView, null);
        if (RecyclerView.u(c) != null)
        {
            RecyclerView.u(c);
        }
        if (RecyclerView.g(c) != null)
        {
            RecyclerView.g(c).onViewRecycled(bv1);
        }
        if (c.e != null)
        {
            c.e.a(bv1);
        }
        bv1.mOwnerRecyclerView = null;
        d().a(bv1);
    }

    private bv d(int i)
    {
        n n1;
        int l;
        boolean flag;
        int i1;
        flag = false;
        i1 = a.size();
        for (int j = 0; j < i1; j++)
        {
            bv bv1 = (bv)a.get(j);
            if (!bv1.wasReturnedFromScrap() && bv1.getLayoutPosition() == i && !bv1.isInvalid() && (bs.e(c.e) || !bv1.isRemoved()))
            {
                bv1.addFlags(32);
                return bv1;
            }
        }

        n1 = c.c;
        i1 = n1.c.size();
        l = 0;
_L7:
        if (l >= i1) goto _L2; else goto _L1
_L1:
        Object obj;
        bv bv2;
        obj = (View)n1.c.get(l);
        bv2 = n1.a.b(((View) (obj)));
        if (bv2.getLayoutPosition() != i || bv2.isInvalid()) goto _L4; else goto _L3
_L3:
        if (obj != null)
        {
            c.d.c(c.a(((View) (obj))));
        }
        i1 = b.size();
        l = ((flag) ? 1 : 0);
_L5:
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        obj = (bv)b.get(l);
        if (!((bv) (obj)).isInvalid() && ((bv) (obj)).getLayoutPosition() == i)
        {
            b.remove(l);
            return ((bv) (obj));
        }
        break MISSING_BLOCK_LABEL_263;
_L4:
        l++;
        continue; /* Loop/switch isn't completed */
_L2:
        obj = null;
          goto _L3
        l++;
          goto _L5
        return null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final View a(int i)
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
        int l;
        int i1;
        int j1;
        if (c.e.a())
        {
            obj1 = c(i);
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
        obj1 = d(i);
        obj = obj1;
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        if (((bv) (obj1)).isRemoved()) goto _L5; else goto _L4
_L4:
        if (((bv) (obj1)).mPosition < 0 || ((bv) (obj1)).mPosition >= RecyclerView.g(c).getItemCount())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid view holder adapter position")).append(obj1).toString());
        }
        if (c.e.a() || RecyclerView.g(c).getItemViewType(((bv) (obj1)).mPosition) == ((bv) (obj1)).getItemViewType()) goto _L7; else goto _L6
_L6:
        flag = false;
_L15:
        if (!flag)
        {
            ((bv) (obj1)).addFlags(4);
            if (((bv) (obj1)).isScrap())
            {
                c.removeDetachedView(((bv) (obj1)).itemView, false);
                ((bv) (obj1)).unScrap();
            } else
            if (((bv) (obj1)).wasReturnedFromScrap())
            {
                ((bv) (obj1)).clearReturnedFromScrapFlag();
            }
            a(((bv) (obj1)));
            obj = null;
        } else
        {
            j = 1;
            obj = obj1;
        }
_L2:
        obj2 = obj;
        i1 = j;
        if (obj != null) goto _L9; else goto _L8
_L8:
        i1 = c.b.a(i);
        if (i1 < 0 || i1 >= RecyclerView.g(c).getItemCount())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid item position ")).append(i).append("(offset:").append(i1).append(").state:").append(c.e.e()).toString());
        }
        j1 = RecyclerView.g(c).getItemViewType(i1);
        obj1 = obj;
        flag = j;
        if (RecyclerView.g(c).hasStableIds())
        {
            obj = a(RecyclerView.g(c).getItemId(i1), j1);
            obj1 = obj;
            flag = j;
            if (obj != null)
            {
                obj.mPosition = i1;
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
                    if (((bv) (obj1)).shouldIgnore())
                    {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                    }
                }
            }
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = d().a(j1);
            if (obj1 != null)
            {
                ((bv) (obj1)).resetInternal();
                if (RecyclerView.i() && (((bv) (obj1)).itemView instanceof ViewGroup))
                {
                    a((ViewGroup)((bv) (obj1)).itemView, false);
                }
            }
        }
        obj2 = obj1;
        i1 = ((flag) ? 1 : 0);
          goto _L10
_L7:
        if (RecyclerView.g(c).hasStableIds() && ((bv) (obj1)).getItemId() != RecyclerView.g(c).getItemId(((bv) (obj1)).mPosition))
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
        obj1 = RecyclerView.g(c).createViewHolder(c, j1);
        j = ((flag) ? 1 : 0);
_L13:
        if (c.e.a() && ((bv) (obj1)).isBound())
        {
            obj1.mPreLayoutPosition = i;
            i = 0;
        } else
        if (!((bv) (obj1)).isBound() || ((bv) (obj1)).needsUpdate() || ((bv) (obj1)).isInvalid())
        {
            l = c.b.a(i);
            obj1.mOwnerRecyclerView = c;
            RecyclerView.g(c).bindViewHolder(((bv) (obj1)), l);
            obj = ((bv) (obj1)).itemView;
            if (RecyclerView.s(c) != null && RecyclerView.s(c).isEnabled())
            {
                if (bp.e(((View) (obj))) == 0)
                {
                    bp.c(((View) (obj)), 1);
                }
                if (!bp.b(((View) (obj))))
                {
                    bp.a(((View) (obj)), RecyclerView.t(c).c);
                }
            }
            if (c.e.a())
            {
                obj1.mPreLayoutPosition = i;
            }
            i = 1;
        } else
        {
            i = 0;
        }
        obj = ((bv) (obj1)).itemView.getLayoutParams();
        if (obj == null)
        {
            obj = (RecyclerView.LayoutParams)c.generateDefaultLayoutParams();
            ((bv) (obj1)).itemView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        if (!c.checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
        {
            obj = (RecyclerView.LayoutParams)c.generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            ((bv) (obj1)).itemView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        {
            obj = (RecyclerView.LayoutParams)obj;
        }
        obj.a = ((bv) (obj1));
        if (j == 0 || i == 0)
        {
            flag1 = false;
        }
        obj.d = flag1;
        return ((bv) (obj1)).itemView;
_L9:
        j = i1;
        obj1 = obj2;
        if (true) goto _L13; else goto _L12
_L12:
        if (true) goto _L15; else goto _L14
_L14:
    }

    public final void a()
    {
        a.clear();
        c();
    }

    final void a(bv bv1)
    {
        int i;
        boolean flag1 = true;
        boolean flag = false;
        if (bv1.isScrap() || bv1.itemView.getParent() != null)
        {
            StringBuilder stringbuilder = (new StringBuilder("Scrapped or attached views may not be recycled. isScrap:")).append(bv1.isScrap()).append(" isAttached:");
            if (bv1.itemView.getParent() == null)
            {
                flag1 = false;
            }
            throw new IllegalArgumentException(stringbuilder.append(flag1).toString());
        }
        if (bv1.isTmpDetached())
        {
            throw new IllegalArgumentException((new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ")).append(bv1).toString());
        }
        if (bv1.shouldIgnore())
        {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
        }
        flag1 = bv.access$4000(bv1);
        if (RecyclerView.g(c) != null && flag1 && RecyclerView.g(c).onFailedToRecycleView(bv1))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0 && !bv1.isRecyclable())
        {
            break MISSING_BLOCK_LABEL_299;
        }
        if (bv1.isInvalid() || bv1.isRemoved() || bv1.isChanged()) goto _L2; else goto _L1
_L1:
        i = b.size();
        if (i == f && i > 0)
        {
            b(0);
        }
        if (i >= f) goto _L2; else goto _L3
_L3:
        b.add(bv1);
        i = 1;
_L4:
        if (i == 0)
        {
            c(bv1);
            flag = true;
        }
_L5:
        c.e.a(bv1);
        if (i == 0 && !flag && flag1)
        {
            bv1.mOwnerRecyclerView = null;
        }
        return;
_L2:
        i = 0;
          goto _L4
        i = 0;
          goto _L5
    }

    public final void a(View view)
    {
        bv bv1;
        bv1 = RecyclerView.b(view);
        if (bv1.isTmpDetached())
        {
            c.removeDetachedView(view, false);
        }
        if (!bv1.isScrap()) goto _L2; else goto _L1
_L1:
        bv1.unScrap();
_L4:
        a(bv1);
        return;
_L2:
        if (bv1.wasReturnedFromScrap())
        {
            bv1.clearReturnedFromScrapFlag();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final List b()
    {
        return e;
    }

    final void b(int i)
    {
        c((bv)b.get(i));
        b.remove(i);
    }

    final void b(bv bv1)
    {
        if (!bv1.isChanged() || !RecyclerView.i(c) || d == null)
        {
            a.remove(bv1);
        } else
        {
            d.remove(bv1);
        }
        bv.access$4102(bv1, null);
        bv1.clearReturnedFromScrapFlag();
    }

    final void b(View view)
    {
        view = RecyclerView.b(view);
        bv.access$4102(view, null);
        view.clearReturnedFromScrapFlag();
        a(view);
    }

    final void c()
    {
        for (int i = b.size() - 1; i >= 0; i--)
        {
            b(i);
        }

        b.clear();
    }

    final void c(View view)
    {
        view = RecyclerView.b(view);
        view.setScrapContainer(this);
        if (!view.isChanged() || !RecyclerView.i(c))
        {
            if (view.isInvalid() && !view.isRemoved() && !RecyclerView.g(c).hasStableIds())
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

    final bl d()
    {
        if (g == null)
        {
            g = new bl();
        }
        return g;
    }

    final void e()
    {
        boolean flag = false;
        int i1 = b.size();
        for (int i = 0; i < i1; i++)
        {
            ((bv)b.get(i)).clearOldPosition();
        }

        i1 = a.size();
        for (int j = 0; j < i1; j++)
        {
            ((bv)a.get(j)).clearOldPosition();
        }

        if (d != null)
        {
            int j1 = d.size();
            for (int l = ((flag) ? 1 : 0); l < j1; l++)
            {
                ((bv)d.get(l)).clearOldPosition();
            }

        }
    }
}
