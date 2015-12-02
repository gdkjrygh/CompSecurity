// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.c;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.ListAdapter;
import com.facebook.reflex.Widget;
import com.facebook.reflex.ak;
import com.facebook.reflex.t;
import com.facebook.reflex.view.b.k;
import com.facebook.reflex.view.h;
import com.facebook.reflex.w;

// Referenced classes of package com.facebook.reflex.view.c:
//            t, o, p, q

class r
    implements ak, w
{

    final o a;
    private com.facebook.reflex.view.b.r b;

    private r(o o1)
    {
        a = o1;
        super();
    }

    r(o o1, p p1)
    {
        this(o1);
    }

    private View a()
    {
        if (b instanceof com.facebook.reflex.view.c.t)
        {
            return ((com.facebook.reflex.view.c.t)b).a();
        } else
        {
            return b.f();
        }
    }

    static com.facebook.reflex.view.b.r a(r r1, com.facebook.reflex.view.b.r r2)
    {
        r1.b = r2;
        return r2;
    }

    private boolean a(int i)
    {
        int j;
        long l;
        if (o.a(a).getAdapter() == null)
        {
            l = 0L;
        } else
        {
            l = o.a(a).getAdapter().getItemId(i);
        }
        j = o.a(a).getHeaderViewsCount();
        return o.a(a).performItemClick(a(), j + i, l);
    }

    private boolean b(int i)
    {
        android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener;
        long l;
        boolean flag;
        boolean flag1;
        if (o.a(a).getAdapter() == null)
        {
            l = 0L;
        } else
        {
            l = o.a(a).getAdapter().getItemId(i);
        }
        i += o.a(a).getHeaderViewsCount();
        onitemlongclicklistener = o.a(a).getOnItemLongClickListener();
        if (onitemlongclicklistener != null)
        {
            flag = onitemlongclicklistener.onItemLongClick(o.a(a), a(), i, l);
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag)
        {
            flag1 = flag;
            if (o.a(a).getParent() != null)
            {
                android.widget.AdapterView.AdapterContextMenuInfo adaptercontextmenuinfo = new android.widget.AdapterView.AdapterContextMenuInfo(a(), i, l);
                o.a(a).setContextMenuInfo(adaptercontextmenuinfo);
                flag1 = o.a(a).getParent().showContextMenuForChild(o.a(a));
            }
        }
        if (flag1)
        {
            o.a(a).performHapticFeedback(0);
        }
        return flag1;
    }

    public void a(com.facebook.reflex.r r1)
    {
        if (o.b(a))
        {
            int i = o.a(a).b((int)b.getBackingWidget().e());
            if (o.a(a).getAdapter() == null || o.a(a).getAdapter().isEnabled(i))
            {
                switch (p.a[r1.a().ordinal()])
                {
                default:
                    return;

                case 1: // '\001'
                case 2: // '\002'
                    o.a(a, b, false);
                    a.c(-1);
                    o.a(a, false);
                    return;

                case 3: // '\003'
                    break;
                }
                if (b(i))
                {
                    o.a(a, b, false);
                    a.c(-1);
                    return;
                } else
                {
                    o.a(a, true);
                    return;
                }
            }
        }
    }

    public void b(com.facebook.reflex.r r1)
    {
        MotionEvent motionevent = k.a(r1);
        k.a().a(b.f(), motionevent);
        boolean flag = b.f().dispatchTouchEvent(motionevent);
        motionevent.recycle();
        if (!flag)
        {
            int i = o.a(a).b((int)b.getBackingWidget().e());
            if (o.a(a).getAdapter() == null || o.a(a).getAdapter().isEnabled(i))
            {
                switch (p.a[r1.a().ordinal()])
                {
                default:
                    return;

                case 1: // '\001'
                    a(i);
                    o.a(a, b, false);
                    a.c(-1);
                    // fall through

                case 2: // '\002'
                    if (o.b(a))
                    {
                        o.c(a).a(b);
                        o.a(a).postDelayed(o.c(a), 10L);
                        return;
                    } else
                    {
                        o.a(a, b, false);
                        a.c(-1);
                        return;
                    }

                case 3: // '\003'
                    o.a(a, b, true);
                    a.c(i);
                    return;
                }
            }
        }
    }
}
