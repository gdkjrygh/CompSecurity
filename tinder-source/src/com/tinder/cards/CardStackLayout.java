// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.cards;

import android.content.Context;
import android.database.DataSetObserver;
import android.support.v4.g.g;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import com.tinder.e.d;
import com.tinder.utils.ad;
import com.tinder.utils.o;
import com.tinder.utils.v;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

// Referenced classes of package com.tinder.cards:
//            a, d, c

public class CardStackLayout extends FrameLayout
    implements d
{
    public static interface a
    {

        public abstract void a(int k, boolean flag);

        public abstract void b(com.tinder.cards.a a1);
    }

    private final class b extends DataSetObserver
    {

        final CardStackLayout a;

        public final void onChanged()
        {
            CardStackLayout.a(a);
        }

        public final void onInvalidated()
        {
            CardStackLayout.b(a);
        }

        private b()
        {
            a = CardStackLayout.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }


    private WeakReference a;
    private WeakReference b;
    private LinkedList c;
    private b d;
    private BaseAdapter e;
    private int f;
    private float g;
    private float h;
    private com.tinder.cards.d i[];
    private c j;

    public CardStackLayout(Context context)
    {
        super(context);
        c = new LinkedList();
        f = 4;
        g = 12F;
        h = 0.03F;
        a(context);
    }

    public CardStackLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new LinkedList();
        f = 4;
        g = 12F;
        h = 0.03F;
        a(context);
    }

    public CardStackLayout(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        c = new LinkedList();
        f = 4;
        g = 12F;
        h = 0.03F;
        a(context);
    }

    public CardStackLayout(Context context, AttributeSet attributeset, int k, int l)
    {
        super(context, attributeset, k, l);
        c = new LinkedList();
        f = 4;
        g = 12F;
        h = 0.03F;
        a(context);
    }

    private int a(int k)
    {
        return i.length - (getChildCount() - k);
    }

    private void a()
    {
        int l = getChildCount() - 1;
        for (int k = l; k >= 0; k--)
        {
            e.getView(k, getChildAt(l - k), this);
        }

    }

    private void a(Context context)
    {
        d = new b((byte)0);
        g = ad.a(g, context);
        c();
    }

    private static void a(View view)
    {
        view.setTranslationX(0.0F);
        view.setTranslationY(0.0F);
        view.setRotation(0.0F);
        if (o.a())
        {
            view.setTranslationZ(0.0F);
        }
    }

    static void a(CardStackLayout cardstacklayout)
    {
        cardstacklayout.a(false);
    }

    private void a(boolean flag)
    {
        int k = 0;
        int i1 = e.getCount();
        int l = getChildCount();
        if (i1 > 0)
        {
            if (flag)
            {
                for (l = getChildCount(); k < l; k++)
                {
                    b((com.tinder.cards.a)getChildAt(k));
                }

                removeAllViews();
                k = Math.min(f, i1) - 1;
                (new StringBuilder("trigger layout limit ")).append(k).append(" ncc ").append(getChildCount());
                while (k >= 0) 
                {
                    View view = e.getView(k, getRecycleableView(), this);
                    if (view != null)
                    {
                        addView(view);
                    } else
                    {
                        v.b((new StringBuilder("Card Stack adapter returned null view for postion ")).append(k).toString());
                    }
                    k--;
                }
            } else
            if (l < f && l < i1)
            {
                int j1 = Math.min(i1 - (i1 - l), f - l);
                (new StringBuilder("tailing views start ")).append(l).append(" add count ").append(j1);
                for (k = l; k < l + j1 && k < i1 - 1; k++)
                {
                    addView(e.getView(k, getRecycleableView(), this), k - l);
                }

            } else
            if (l > i1)
            {
                l -= i1;
                for (k = 0; k < l; k++)
                {
                    b((com.tinder.cards.a)getChildAt(k));
                }

                removeViews(0, l);
            }
            a();
            b();
            k = getChildCount();
            if (k > 0)
            {
                com.tinder.cards.a a1 = (com.tinder.cards.a)getChildAt(k - 1);
                a1.setCardListener(this);
                if (o.a(b))
                {
                    ((a)b.get()).b(a1);
                }
            }
        }
        if (o.a(b))
        {
            ((a)b.get()).a(getChildCount(), flag);
        }
    }

    private int b(int k)
    {
        return Math.min(i.length - k - 1, i.length - 2);
    }

    private void b()
    {
        int l = getChildCount();
        for (int k = 0; k < l; k++)
        {
            int i1 = a(k);
            com.tinder.cards.a a1 = (com.tinder.cards.a)getChildAt(k);
            a1.setTranslationY(i[i1].c);
            ad.c(a1, i[i1].g);
            if (o.e())
            {
                a1.setTranslationZ(i[i1].a);
            }
            a1.setDimAlpha(i[i1].i);
        }

    }

    static void b(CardStackLayout cardstacklayout)
    {
        cardstacklayout.a();
    }

    private void b(com.tinder.cards.a a1)
    {
        if (a1 == null)
        {
            v.b("attempt recycleCard() on null card");
        } else
        {
            c.add(a1);
            a1.removeListener();
            removeView(a1);
            if (o.a(b))
            {
                b.get();
                getChildCount();
                return;
            }
        }
    }

    private int c(int k)
    {
        if (k == 0 && getChildCount() == f)
        {
            return 0;
        } else
        {
            return (k * k) / 2 + 4;
        }
    }

    private void c()
    {
        i = new com.tinder.cards.d[f];
        int k = 0;
        do
        {
            while (k < i.length) 
            {
                int l = b(k);
                int j1 = b(k + 1);
                com.tinder.cards.d d1 = new com.tinder.cards.d();
                i[k] = d1;
                d1.c = (float)l * g;
                d1.d = (float)j1 * g;
                d1.g = 1.0F - (float)l * h;
                d1.h = 1.0F - (float)j1 * h;
                d1.a = c(k);
                d1.b = (float)c(k + 1) - 0.25F;
                if (j != null)
                {
                    int i1 = getChildCount() - (getChildCount() - k);
                    g g1;
                    if (i1 == 0)
                    {
                        g1 = new g(Float.valueOf(j.c), Float.valueOf(j.c));
                    } else
                    if (i1 > 0 && i1 < getChildCount() - 1)
                    {
                        g1 = new g(Float.valueOf(j.c), Float.valueOf(j.b));
                    } else
                    {
                        g1 = new g(Float.valueOf(j.b), Float.valueOf(j.a));
                    }
                    d1.i = ((Float)g1.a).floatValue();
                    d1.j = ((Float)g1.b).floatValue();
                }
                k++;
            }
            return;
        } while (true);
    }

    private View getRecycleableView()
    {
        if (c.isEmpty())
        {
            return null;
        } else
        {
            return (View)c.pop();
        }
    }

    public final void a(float f1)
    {
        int l = getChildCount();
        for (int k = 0; k < l - 1; k++)
        {
            com.tinder.cards.a a1 = (com.tinder.cards.a)getChildAt(k);
            int i1 = a(k);
            a1.setTranslationY(o.a(f1, 0.0F, i[i1].c, 1.0F, i[i1].d));
            ad.c(a1, o.a(f1, 0.0F, i[i1].g, 1.0F, i[i1].h));
            if (a1.isUsingDim())
            {
                a1.setDimAlpha(o.a(f1, 0.0F, i[i1].i, 1.0F, i[i1].j));
            }
            if (o.e())
            {
                a1.setTranslationZ(o.a(f1, 0.0F, i[i1].a, 1.0F, i[i1].b));
            }
        }

    }

    public final void a(com.tinder.cards.a a1)
    {
        if (o.a(a))
        {
            ((d)a.get()).a(a1);
        }
    }

    public final void a(com.tinder.cards.a a1, float f1, float f2, float f3, float f4, boolean flag)
    {
        a(f1);
        if (o.a(a))
        {
            ((d)a.get()).a(a1, f1, f2, f3, f4, flag);
        }
    }

    public final void a(com.tinder.cards.a a1, boolean flag)
    {
        b(a1);
        if (o.a(a))
        {
            ((d)a.get()).a(a1, flag);
        }
        a(((View) (a1)));
    }

    public final void b(com.tinder.cards.a a1, boolean flag)
    {
        b(a1);
        if (o.a(a))
        {
            ((d)a.get()).b(a1, flag);
        }
        a(a1);
    }

    public final void c(com.tinder.cards.a a1, boolean flag)
    {
        b(a1);
        if (o.a(a))
        {
            ((d)a.get()).c(a1, flag);
        }
        a(a1);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return true;
    }

    public void setAdapter(BaseAdapter baseadapter)
    {
        if (e != null)
        {
            e.unregisterDataSetObserver(d);
        }
        e = baseadapter;
        e.registerDataSetObserver(d);
        a(true);
    }

    public void setDimConfig(c c1)
    {
        j = c1;
    }

    public void setDisplayMax(int k)
    {
        f = k;
        c();
        if (e != null && d != null)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            a(true);
        }
    }

    public void setListenerCards(d d1)
    {
        a = new WeakReference(d1);
    }

    public void setListenerStack(a a1)
    {
        b = new WeakReference(a1);
    }
}
