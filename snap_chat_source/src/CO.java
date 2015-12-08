// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.snapchat.android.Timber;

public final class CO
    implements android.view.View.OnTouchListener
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();

        public abstract void c();
    }

    final class b extends android.view.GestureDetector.SimpleOnGestureListener
    {

        public final boolean onSingleTapUp(MotionEvent motionevent)
        {
            return true;
        }

        private b()
        {
        }

        b(byte byte0)
        {
            this();
        }
    }


    public a a;
    private float b;
    private int c;
    private Context d;
    private ViewGroup e;
    private GestureDetector f;

    public CO(Context context, ViewGroup viewgroup)
    {
        f = new GestureDetector(d, new b((byte)0));
        d = context;
        e = viewgroup;
    }

    static a a(CO co)
    {
        return co.a;
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (!f.onTouchEvent(motionevent)) goto _L2; else goto _L1
_L1:
        a.a();
_L4:
        return false;
_L2:
        int i;
        int j;
        switch (motionevent.getAction())
        {
        default:
            return false;

        case 3: // '\003'
        case 4: // '\004'
            break;

        case 0: // '\0'
            b = motionevent.getRawY();
            c = 0;
            e.setTranslationY(0.0F);
            return false;

        case 2: // '\002'
            float f1 = motionevent.getRawY();
            if (e != null)
            {
                if (c <= 0)
                {
                    c = c + (int)(f1 - b);
                    if (c > 0)
                    {
                        c = 0;
                    }
                    e.setTranslationY(c);
                    e.invalidate();
                }
            } else
            {
                Timber.e("SipeAndTapListener", "no view handle set!", new Object[0]);
            }
            b = f1;
            return false;

        case 1: // '\001'
            i = e.getHeight();
            j = c;
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (i / 2 + j > 0)
        {
            e.animate().setListener(null);
            e.animate().setStartDelay(0L);
            e.animate().cancel();
            e.animate().translationYBy(-c);
            e.animate().setListener(new Jr() {

                private CO a;

                public final void onAnimationEnd(Animator animator)
                {
                    CO.a(a).c();
                }

            
            {
                a = CO.this;
                super();
            }
            });
            e.animate().start();
            return false;
        } else
        {
            a.b();
            return false;
        }
    }
}
