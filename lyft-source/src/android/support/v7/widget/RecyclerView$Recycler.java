// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, RecyclerViewAccessibilityDelegate, ChildHelper, AdapterHelper

public final class f
{

    final ArrayList a = new ArrayList();
    final ArrayList b = new ArrayList();
    final RecyclerView c;
    private ArrayList d;
    private final List e;
    private int f;
    private iewPool g;
    private Extension h;

    static ArrayList a(f f1)
    {
        return f1.d;
    }

    private void a(ViewGroup viewgroup, boolean flag)
    {
        for (int k = viewgroup.getChildCount() - 1; k >= 0; k--)
        {
            View view = viewgroup.getChildAt(k);
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
            int l = viewgroup.getVisibility();
            viewgroup.setVisibility(4);
            viewgroup.setVisibility(l);
            return;
        }
    }

    private void d(View view)
    {
        if (c.isAccessibilityEnabled())
        {
            if (ViewCompat.e(view) == 0)
            {
                ViewCompat.c(view, 1);
            }
            if (!ViewCompat.b(view))
            {
                ViewCompat.a(view, RecyclerView.access$4000(c).b());
            }
        }
    }

    private void f(r r)
    {
        if (r.itemView instanceof ViewGroup)
        {
            a((ViewGroup)r.itemView, false);
        }
    }

    r a(int k, int l, boolean flag)
    {
        int i1;
        boolean flag1;
        int j1;
        flag1 = false;
        j1 = a.size();
        i1 = 0;
_L10:
        if (i1 >= j1) goto _L2; else goto _L1
_L1:
        Object obj = (r)a.get(i1);
        if (((r) (obj)).wasReturnedFromScrap() || ((r) (obj)).getLayoutPosition() != k || ((r) (obj)).isInvalid() || !r.isInvalid(c.mState) && ((r) (obj)).isRemoved()) goto _L4; else goto _L3
_L3:
        if (l == -1 || ((r) (obj)).getItemViewType() == l) goto _L6; else goto _L5
_L5:
        Log.e("RecyclerView", (new StringBuilder()).append("Scrap view for position ").append(k).append(" isn't dirty but has").append(" wrong view type! (found ").append(((r) (obj)).getItemViewType()).append(" but expected ").append(l).append(")").toString());
_L2:
        if (!flag)
        {
            obj = c.mChildHelper.a(k, l);
            if (obj != null)
            {
                c.mItemAnimator.c(c.getChildViewHolder(((View) (obj))));
            }
        }
        i1 = b.size();
        l = ((flag1) ? 1 : 0);
_L8:
        if (l >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (r)b.get(l);
        if (!((r) (obj)).isInvalid() && ((r) (obj)).getLayoutPosition() == k)
        {
            if (!flag)
            {
                b.remove(l);
            }
            return ((r) (obj));
        }
        l++;
        continue; /* Loop/switch isn't completed */
_L6:
        ((r) (obj)).addFlags(32);
        return ((r) (obj));
_L4:
        i1++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L8; else goto _L7
_L7:
        return null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    r a(long l, int k, boolean flag)
    {
        int i1 = a.size() - 1;
_L5:
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        r r1;
        r1 = (r)a.get(i1);
        if (r1.getItemId() != l || r1.wasReturnedFromScrap())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k != r1.getItemViewType()) goto _L4; else goto _L3
_L3:
        r r;
        r1.addFlags(32);
        r = r1;
        if (r1.isRemoved())
        {
            r = r1;
            if (!c.mState.c())
            {
                r1.setFlags(2, 14);
                r = r1;
            }
        }
_L8:
        return r;
_L4:
        if (!flag)
        {
            a.remove(i1);
            c.removeDetachedView(r1.itemView, false);
            b(r1.itemView);
        }
        i1--;
          goto _L5
_L2:
        i1 = b.size() - 1;
_L9:
        if (i1 < 0) goto _L7; else goto _L6
_L6:
label0:
        {
            r r2 = (r)b.get(i1);
            if (r2.getItemId() != l)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (k != r2.getItemViewType())
            {
                break label0;
            }
            r = r2;
            if (!flag)
            {
                b.remove(i1);
                return r2;
            }
        }
          goto _L8
        if (!flag)
        {
            c(i1);
        }
        i1--;
          goto _L9
_L7:
        return null;
          goto _L8
    }

    View a(int k, boolean flag)
    {
        boolean flag1 = true;
        if (k < 0 || k >= c.mState.c())
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Invalid item position ").append(k).append("(").append(k).append("). Item count:").append(c.mState.c()).toString());
        }
        Object obj;
        Object obj1;
        Object obj2;
        int l;
        int i1;
        int j1;
        int k1;
        if (c.mState.c())
        {
            obj1 = e(k);
            if (obj1 != null)
            {
                l = 1;
            } else
            {
                l = 0;
            }
        } else
        {
            obj1 = null;
            l = 0;
        }
        obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj1 = a(k, -1, flag);
        obj = obj1;
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        if (a(((r) (obj1)))) goto _L5; else goto _L4
_L4:
        if (flag) goto _L7; else goto _L6
_L6:
        ((r) (obj1)).addFlags(4);
        if (!((r) (obj1)).isScrap()) goto _L9; else goto _L8
_L8:
        c.removeDetachedView(((r) (obj1)).itemView, false);
        ((r) (obj1)).unScrap();
_L17:
        b(((r) (obj1)));
_L7:
        obj = null;
_L2:
        obj2 = obj;
        j1 = l;
        if (obj != null) goto _L11; else goto _L10
_L10:
        j1 = c.mAdapterHelper.a(k);
        if (j1 < 0 || j1 >= RecyclerView.access$2400(c).etItemCount())
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Inconsistency detected. Invalid item position ").append(k).append("(offset:").append(j1).append(").").append("state:").append(c.mState.c()).toString());
        }
        k1 = RecyclerView.access$2400(c).etItemViewType(j1);
        obj1 = obj;
        i1 = l;
        if (RecyclerView.access$2400(c).asStableIds())
        {
            obj = a(RecyclerView.access$2400(c).etItemId(j1), k1, flag);
            obj1 = obj;
            i1 = l;
            if (obj != null)
            {
                obj.mPosition = j1;
                i1 = 1;
                obj1 = obj;
            }
        }
        obj = obj1;
        if (obj1 == null)
        {
            obj = obj1;
            if (h != null)
            {
                obj2 = h.a(this, k, k1);
                obj = obj1;
                if (obj2 != null)
                {
                    obj1 = c.getChildViewHolder(((View) (obj2)));
                    if (obj1 == null)
                    {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                    }
                    obj = obj1;
                    if (((r) (obj1)).shouldIgnore())
                    {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                    }
                }
            }
        }
        obj1 = obj;
        if (obj == null)
        {
            obj = f().a(k1);
            obj1 = obj;
            if (obj != null)
            {
                ((r) (obj)).resetInternal();
                obj1 = obj;
                if (RecyclerView.access$3900())
                {
                    f(((r) (obj)));
                    obj1 = obj;
                }
            }
        }
        obj2 = obj1;
        j1 = i1;
          goto _L12
_L9:
        if (((r) (obj1)).wasReturnedFromScrap())
        {
            ((r) (obj1)).clearReturnedFromScrapFlag();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        l = 1;
        obj = obj1;
          goto _L2
_L12:
        if (obj1 != null) goto _L11; else goto _L13
_L13:
        obj1 = RecyclerView.access$2400(c).reateViewHolder(c, k1);
        l = i1;
_L15:
        if (c.mState.c() && ((r) (obj1)).isBound())
        {
            obj1.mPreLayoutPosition = k;
            k = 0;
        } else
        if (!((r) (obj1)).isBound() || ((r) (obj1)).needsUpdate() || ((r) (obj1)).isInvalid())
        {
            i1 = c.mAdapterHelper.a(k);
            obj1.mOwnerRecyclerView = c;
            RecyclerView.access$2400(c).indViewHolder(((r) (obj1)), i1);
            d(((r) (obj1)).itemView);
            if (c.mState.c())
            {
                obj1.mPreLayoutPosition = k;
            }
            k = 1;
        } else
        {
            k = 0;
        }
        obj = ((r) (obj1)).itemView.getLayoutParams();
        if (obj == null)
        {
            obj = (ams)c.generateDefaultLayoutParams();
            ((r) (obj1)).itemView.setLayoutParams(((android.view.) (obj)));
        } else
        if (!c.checkLayoutParams(((android.view.) (obj))))
        {
            obj = (ams)c.generateLayoutParams(((android.view.) (obj)));
            ((r) (obj1)).itemView.setLayoutParams(((android.view.) (obj)));
        } else
        {
            obj = (ams)obj;
        }
        obj.a = ((r) (obj1));
        if (l != 0 && k != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        obj.d = flag;
        return ((r) (obj1)).itemView;
_L11:
        l = j1;
        obj1 = obj2;
        if (true) goto _L15; else goto _L14
_L14:
        if (true) goto _L17; else goto _L16
_L16:
    }

    public void a()
    {
        a.clear();
        c();
    }

    public void a(int k)
    {
        f = k;
        for (int l = b.size() - 1; l >= 0 && b.size() > k; l--)
        {
            c(l);
        }

    }

    void a(int k, int l)
    {
        byte byte0;
        int i1;
        int j1;
        int k1;
        int l1;
        if (k < l)
        {
            byte0 = -1;
            i1 = l;
            j1 = k;
        } else
        {
            byte0 = 1;
            i1 = k;
            j1 = l;
        }
        l1 = b.size();
        k1 = 0;
        while (k1 < l1) 
        {
            r r = (r)b.get(k1);
            if (r != null && r.mPosition >= j1 && r.mPosition <= i1)
            {
                if (r.mPosition == k)
                {
                    r.offsetPosition(l - k, false);
                } else
                {
                    r.offsetPosition(byte0, false);
                }
            }
            k1++;
        }
    }

    void a(r.offsetPosition offsetposition, r.offsetPosition offsetposition1, boolean flag)
    {
        a();
        f().a(offsetposition, offsetposition1, flag);
    }

    void a(iewPool iewpool)
    {
        if (g != null)
        {
            g.b();
        }
        g = iewpool;
        if (iewpool != null)
        {
            g.a(c.getAdapter());
        }
    }

    void a(Extension extension)
    {
        h = extension;
    }

    public void a(View view)
    {
        r r;
        r = RecyclerView.getChildViewHolderInt(view);
        if (r.isTmpDetached())
        {
            c.removeDetachedView(view, false);
        }
        if (!r.isScrap()) goto _L2; else goto _L1
_L1:
        r.unScrap();
_L4:
        b(r);
        return;
_L2:
        if (r.wasReturnedFromScrap())
        {
            r.clearReturnedFromScrapFlag();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    boolean a(r r)
    {
        if (!r.isRemoved())
        {
            if (r.mPosition < 0 || r.mPosition >= RecyclerView.access$2400(c).etItemCount())
            {
                throw new IndexOutOfBoundsException((new StringBuilder()).append("Inconsistency detected. Invalid view holder adapter position").append(r).toString());
            }
            if (!c.mState.c() && RecyclerView.access$2400(c).etItemViewType(r.mPosition) != r.getItemViewType())
            {
                return false;
            }
            if (RecyclerView.access$2400(c).asStableIds() && r.getItemId() != RecyclerView.access$2400(c).etItemId(r.mPosition))
            {
                return false;
            }
        }
        return true;
    }

    public View b(int k)
    {
        return a(k, false);
    }

    public List b()
    {
        return e;
    }

    void b(int k, int l)
    {
        int j1 = b.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            r r = (r)b.get(i1);
            if (r != null && r.getLayoutPosition() >= k)
            {
                r.offsetPosition(l, true);
            }
        }

    }

    void b(int k, int l, boolean flag)
    {
        int i1 = b.size() - 1;
        while (i1 >= 0) 
        {
            r r = (r)b.get(i1);
            if (r != null)
            {
                if (r.getLayoutPosition() >= k + l)
                {
                    r.offsetPosition(-l, flag);
                } else
                if (r.getLayoutPosition() >= k)
                {
                    r.addFlags(8);
                    c(i1);
                }
            }
            i1--;
        }
    }

    void b(r r)
    {
        int k;
        boolean flag1 = true;
        boolean flag = false;
        if (r.isScrap() || r.itemView.getParent() != null)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("Scrapped or attached views may not be recycled. isScrap:").append(r.isScrap()).append(" isAttached:");
            if (r.itemView.getParent() == null)
            {
                flag1 = false;
            }
            throw new IllegalArgumentException(stringbuilder.append(flag1).toString());
        }
        if (r.isTmpDetached())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Tmp detached view should be removed from RecyclerView before it can be recycled: ").append(r).toString());
        }
        if (r.shouldIgnore())
        {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
        }
        flag1 = r.access._mth4100(r);
        if (RecyclerView.access$2400(c) != null && flag1 && RecyclerView.access$2400(c).nFailedToRecycleView(r))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k == 0 && !r.isRecyclable())
        {
            break MISSING_BLOCK_LABEL_293;
        }
        if (r.hasAnyOfTheFlags(78)) goto _L2; else goto _L1
_L1:
        k = b.size();
        if (k == f && k > 0)
        {
            c(0);
        }
        if (k >= f) goto _L2; else goto _L3
_L3:
        b.add(r);
        k = 1;
_L4:
        if (k == 0)
        {
            c(r);
            flag = true;
        }
_L5:
        c.mState.c(r);
        if (k == 0 && !flag && flag1)
        {
            r.mOwnerRecyclerView = null;
        }
        return;
_L2:
        k = 0;
          goto _L4
        k = 0;
          goto _L5
    }

    void b(View view)
    {
        view = RecyclerView.getChildViewHolderInt(view);
        r.access._mth4202(view, null);
        view.clearReturnedFromScrapFlag();
        b(((r) (view)));
    }

    void c()
    {
        for (int k = b.size() - 1; k >= 0; k--)
        {
            c(k);
        }

        b.clear();
    }

    void c(int k)
    {
        c((r)b.get(k));
        b.remove(k);
    }

    void c(int k, int l)
    {
        int i1 = b.size() - 1;
        while (i1 >= 0) 
        {
            r r = (r)b.get(i1);
            if (r != null)
            {
                int j1 = r.getLayoutPosition();
                if (j1 >= k && j1 < k + l)
                {
                    r.addFlags(2);
                    c(i1);
                }
            }
            i1--;
        }
    }

    void c(r r)
    {
        ViewCompat.a(r.itemView, null);
        e(r);
        r.mOwnerRecyclerView = null;
        f().a(r);
    }

    void c(View view)
    {
        view = RecyclerView.getChildViewHolderInt(view);
        view.setScrapContainer(this);
        if (!view.isChanged() || !RecyclerView.access$2600(c))
        {
            if (view.isInvalid() && !view.isRemoved() && !RecyclerView.access$2400(c).asStableIds())
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

    int d()
    {
        return a.size();
    }

    View d(int k)
    {
        return ((r)a.get(k)).itemView;
    }

    void d(r r)
    {
        if (!r.isChanged() || !RecyclerView.access$2600(c) || d == null)
        {
            a.remove(r);
        } else
        {
            d.remove(r);
        }
        r.access._mth4202(r, null);
        r.clearReturnedFromScrapFlag();
    }

    r e(int k)
    {
        boolean flag;
        int i1;
label0:
        {
            flag = false;
            if (d != null)
            {
                i1 = d.size();
                if (i1 != 0)
                {
                    break label0;
                }
            }
            return null;
        }
        for (int l = 0; l < i1; l++)
        {
            r r = (r)d.get(l);
            if (!r.wasReturnedFromScrap() && r.getLayoutPosition() == k)
            {
                r.addFlags(32);
                return r;
            }
        }

        if (RecyclerView.access$2400(c).asStableIds())
        {
            k = c.mAdapterHelper.a(k);
            if (k > 0 && k < RecyclerView.access$2400(c).etItemCount())
            {
                long l1 = RecyclerView.access$2400(c).etItemId(k);
                for (k = ((flag) ? 1 : 0); k < i1; k++)
                {
                    r r1 = (r)d.get(k);
                    if (!r1.wasReturnedFromScrap() && r1.getItemId() == l1)
                    {
                        r1.addFlags(32);
                        return r1;
                    }
                }

            }
        }
        return null;
    }

    void e()
    {
        a.clear();
    }

    void e(r r)
    {
        if (RecyclerView.access$4300(c) != null)
        {
            RecyclerView.access$4300(c).a(r);
        }
        if (RecyclerView.access$2400(c) != null)
        {
            RecyclerView.access$2400(c).nViewRecycled(r);
        }
        if (c.mState != null)
        {
            c.mState.c(r);
        }
    }

    iewPool f()
    {
        if (g == null)
        {
            g = new iewPool();
        }
        return g;
    }

    void g()
    {
        int l = b.size();
        for (int k = 0; k < l; k++)
        {
            r r = (r)b.get(k);
            if (r != null)
            {
                r.addFlags(512);
            }
        }

    }

    void h()
    {
        if (RecyclerView.access$2400(c) != null && RecyclerView.access$2400(c).asStableIds())
        {
            int l = b.size();
            for (int k = 0; k < l; k++)
            {
                r r = (r)b.get(k);
                if (r != null)
                {
                    r.addFlags(6);
                    r.addChangePayload(null);
                }
            }

        } else
        {
            c();
        }
    }

    void i()
    {
        boolean flag = false;
        int j1 = b.size();
        for (int k = 0; k < j1; k++)
        {
            ((r)b.get(k)).clearOldPosition();
        }

        j1 = a.size();
        for (int l = 0; l < j1; l++)
        {
            ((r)a.get(l)).clearOldPosition();
        }

        if (d != null)
        {
            int k1 = d.size();
            for (int i1 = ((flag) ? 1 : 0); i1 < k1; i1++)
            {
                ((r)d.get(i1)).clearOldPosition();
            }

        }
    }

    void j()
    {
        int l = b.size();
        for (int k = 0; k < l; k++)
        {
            ams ams = (ams)((r)b.get(k)).itemView.getLayoutParams();
            if (ams != null)
            {
                ams.c = true;
            }
        }

    }

    public iewPool(RecyclerView recyclerview)
    {
        c = recyclerview;
        super();
        d = null;
        e = Collections.unmodifiableList(a);
        f = 2;
    }
}
