// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.ui.SwipeImageView;
import com.snapchat.android.ui.SwipeViewState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Fn
{
    public static interface a
    {

        public abstract void a(SwipeImageView swipeimageview);

        public abstract void a(SwipeImageView swipeimageview, boolean flag);

        public abstract void q();
    }


    public final Fp a;
    public final SwipeImageView b;
    public final SwipeViewState c;
    public final List d = new ArrayList();

    public Fn(Fp fp, SwipeImageView swipeimageview, SwipeViewState swipeviewstate)
    {
        a = fp;
        b = swipeimageview;
        c = swipeviewstate;
    }

    private void a()
    {
        c.i = com.snapchat.android.ui.SwipeViewState.MotionState.NOT_MOVING;
        Object obj = c;
        obj.e = 0;
        obj.f = 0;
        obj.g = 0.0F;
        boolean flag1 = a.a(c.d());
        obj = d.iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            a a1 = (a)((Iterator) (obj)).next();
            SwipeImageView swipeimageview = b;
            boolean flag;
            if (!c.d() && flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a1.a(swipeimageview, flag);
        }
        b(a.b.a);
        b(a.b.c);
    }

    private void b(int i)
    {
        Ho ho = b.b.a(i);
        if (ho != null)
        {
            ho.g();
        }
    }

    public final void a(int i)
    {
        boolean flag;
        boolean flag2;
        int k;
        flag2 = true;
        int j = c.e;
        float f = c.g;
        float f1 = c.n;
        k = (int)((float)j * (1.0F - f1) + f * f1);
        Iterator iterator;
        if (c.e != k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        if (k >= 0) goto _L4; else goto _L3
_L3:
        c.k = com.snapchat.android.ui.SwipeViewState.SwipeDirection.LEFT;
        a();
        flag = true;
_L5:
        c.b();
        c.e = k;
        if (!flag)
        {
            for (iterator = d.iterator(); iterator.hasNext(); ((a)iterator.next()).a(b)) { }
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (k != 0 && k != i)
        {
            if (k < i)
            {
                b.invalidate();
                flag = false;
                continue; /* Loop/switch isn't completed */
            }
            if (k > i)
            {
                c.k = com.snapchat.android.ui.SwipeViewState.SwipeDirection.RIGHT;
                a();
            }
        }
        flag = true;
        if (true) goto _L5; else goto _L2
_L2:
        boolean flag1;
        if (c.i == com.snapchat.android.ui.SwipeViewState.MotionState.AUTO_SCROLLING)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            b.post(new Runnable(i) {

                private int a;
                private Fn b;

                public final void run()
                {
                    b.a(a);
                }

            
            {
                b = Fn.this;
                a = i;
                super();
            }
            });
        }
        return;
    }

    public final void a(a a1)
    {
        d.add(a1);
    }
}
