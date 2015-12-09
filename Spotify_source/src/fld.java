// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.android.paste.widget.CheckableImageButton;
import java.util.Formatter;
import java.util.Locale;

public final class fld extends FrameLayout
{

    public final Context a;
    public fle b;
    public ViewGroup c;
    public TextView d;
    public final Handler e = new flf(this);
    public TextView f;
    private ProgressBar g;
    private TextView h;
    private boolean i;
    private StringBuilder j;
    private Formatter k;
    private CheckableImageButton l;
    private ImageButton m;
    private ImageButton n;
    private View o;
    private android.view.View.OnClickListener p;
    private android.view.View.OnClickListener q;
    private android.view.View.OnClickListener r;

    public fld(Context context)
    {
        super(context);
        p = new android.view.View.OnClickListener() {

            private fld a;

            public final void onClick(View view)
            {
                fld.b(a);
                a.a();
            }

            
            {
                a = fld.this;
                super();
            }
        };
        q = new android.view.View.OnClickListener() {

            private fld a;

            public final void onClick(View view)
            {
                if (fld.c(a) != null)
                {
                    fld.c(a).j();
                }
                a.a();
            }

            
            {
                a = fld.this;
                super();
            }
        };
        r = new android.view.View.OnClickListener() {

            private fld a;

            public final void onClick(View view)
            {
                if (fld.c(a) != null)
                {
                    fld.c(a).k();
                }
                a.a();
            }

            
            {
                a = fld.this;
                super();
            }
        };
        a = context;
        inflate(a, 0x7f0300d8, this);
        setLayoutTransition(new LayoutTransition());
        setVisibility(8);
        findViewById(0x7f110445).setVisibility(0);
        findViewById(0x7f110483).setVisibility(8);
        findViewById(0x7f110482).setVisibility(8);
        o = findViewById(0x7f110414);
        l = (CheckableImageButton)findViewById(0x7f110485);
        if (l != null)
        {
            l.requestFocus();
            l.setOnClickListener(p);
            context = fyd.b(getContext(), 60, 2);
            android.graphics.drawable.Drawable drawable = fyd.a(getContext(), 60, 2);
            StateListDrawable statelistdrawable = new StateListDrawable();
            statelistdrawable.addState(new int[] {
                0xfefeff60
            }, context);
            statelistdrawable.addState(new int[] {
                0x10100a0
            }, drawable);
            l.setImageDrawable(statelistdrawable);
        }
        m = (ImageButton)findViewById(0x7f110486);
        m.setImageDrawable(fyd.c(getContext()));
        n = (ImageButton)findViewById(0x7f110484);
        n.setImageDrawable(fyd.a(getContext()));
        f();
        g = (ProgressBar)findViewById(0x7f1103d3);
        g.setMax(1000);
        g.setEnabled(false);
        d = (TextView)findViewById(0x7f1103d4);
        h = (TextView)findViewById(0x7f1103d2);
        j = new StringBuilder();
        k = new Formatter(j, Locale.getDefault());
        f = (TextView)findViewById(0x7f110413);
        setOnClickListener(new android.view.View.OnClickListener() {

            private fld a;

            public final void onClick(View view)
            {
                if (fld.a(a))
                {
                    a.b();
                    return;
                } else
                {
                    a.a();
                    return;
                }
            }

            
            {
                a = fld.this;
                super();
            }
        });
        f();
    }

    static boolean a(fld fld1)
    {
        return fld1.i;
    }

    static void b(fld fld1)
    {
        fld1.e();
    }

    static fle c(fld fld1)
    {
        return fld1.b;
    }

    private long d()
    {
        if (b == null)
        {
            return 0L;
        }
        long l1 = b.g();
        long l2 = b.f();
        if (g != null)
        {
            if (l2 > 0L)
            {
                l2 = (1000L * l1) / l2;
                g.setProgress((int)l2);
            }
            b.i();
            g.setSecondaryProgress(0);
        }
        h.setText(a(l1));
        if (b.l())
        {
            m.setEnabled(true);
        }
        return l1;
    }

    static long d(fld fld1)
    {
        return fld1.d();
    }

    static fle e(fld fld1)
    {
        fld1.b = null;
        return null;
    }

    private void e()
    {
        if (b == null)
        {
            return;
        }
        if (b.h())
        {
            b.e();
        } else
        {
            b.d();
        }
        c();
    }

    private void f()
    {
        if (m != null)
        {
            m.setVisibility(0);
            m.setOnClickListener(q);
            ImageButton imagebutton = m;
            boolean flag;
            if (q != null && b != null && b.l())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            imagebutton.setEnabled(flag);
        }
        if (n != null)
        {
            n.setVisibility(0);
            n.setOnClickListener(r);
            n.setEnabled(false);
        }
    }

    public final String a(long l1)
    {
        int k1 = (int)(l1 / 1000L);
        int i1 = k1 % 60;
        int j1 = (k1 / 60) % 60;
        k1 /= 3600;
        j.setLength(0);
        if (k1 > 0)
        {
            return k.format("%d:%02d:%02d", new Object[] {
                Integer.valueOf(k1), Integer.valueOf(j1), Integer.valueOf(i1)
            }).toString();
        } else
        {
            return k.format("%d:%02d", new Object[] {
                Integer.valueOf(j1), Integer.valueOf(i1)
            }).toString();
        }
    }

    public final void a()
    {
        if (!i && c != null)
        {
            d();
            if (l != null)
            {
                l.requestFocus();
            }
            setVisibility(0);
            o.setVisibility(0);
            f.setVisibility(0);
            i = true;
        }
        c();
        e.sendEmptyMessage(2);
        android.os.Message message = e.obtainMessage(1);
        e.removeMessages(1);
        e.sendMessageDelayed(message, 2500L);
    }

    public final void b()
    {
        if (c == null)
        {
            return;
        } else
        {
            o.setVisibility(8);
            f.setVisibility(8);
            i = false;
            return;
        }
    }

    public final void c()
    {
        if (l == null || b == null)
        {
            return;
        }
        if (b.h())
        {
            l.setImageDrawable(fyd.b(a, 60, 2));
            l.setContentDescription(getContext().getString(0x7f0803eb));
            return;
        } else
        {
            l.setImageDrawable(fyd.a(a, 60, 2));
            l.setContentDescription(getContext().getString(0x7f0803ec));
            return;
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag2 = true;
        int i1 = keyevent.getKeyCode();
        if (keyevent.getRepeatCount() == 0 && keyevent.getAction() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i1;
        JVM INSTR lookupswitch 11: default 124
    //                   4: 272
    //                   24: 266
    //                   25: 266
    //                   62: 143
    //                   79: 143
    //                   82: 272
    //                   85: 143
    //                   86: 223
    //                   126: 180
    //                   127: 223
    //                   164: 266;
           goto _L1 _L2 _L3 _L3 _L4 _L4 _L2 _L4 _L5 _L6 _L5 _L3
_L1:
        a();
        flag1 = super.dispatchKeyEvent(keyevent);
_L8:
        return flag1;
_L4:
        flag1 = flag2;
        if (flag)
        {
            e();
            a();
            flag1 = flag2;
            if (l != null)
            {
                l.requestFocus();
                return true;
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        flag1 = flag2;
        if (flag)
        {
            flag1 = flag2;
            if (!b.h())
            {
                b.d();
                c();
                a();
                return true;
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        flag1 = flag2;
        if (flag)
        {
            flag1 = flag2;
            if (b.h())
            {
                b.e();
                c();
                a();
                return true;
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        return super.dispatchKeyEvent(keyevent);
_L2:
        flag1 = flag2;
        if (flag)
        {
            b();
            return true;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final boolean onTrackballEvent(MotionEvent motionevent)
    {
        a();
        return false;
    }
}
