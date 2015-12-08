// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Formatter;
import java.util.Locale;
import kik.android.chat.KikApplication;

// Referenced classes of package kik.android.widget:
//            ej, ek, el, em, 
//            en

public class VideoController extends FrameLayout
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(int i1);

        public abstract void b();

        public abstract int c();

        public abstract int d();

        public abstract boolean e();

        public abstract boolean f();

        public abstract boolean g();

        public abstract boolean h();
    }

    private static final class b extends Handler
    {

        private final WeakReference a;

        public final void handleMessage(Message message)
        {
            VideoController videocontroller = (VideoController)a.get();
            if (videocontroller != null && VideoController.c(videocontroller) != null)
            {
                int i1;
                switch (message.what)
                {
                default:
                    return;

                case 1: // '\001'
                    videocontroller.c();
                    return;

                case 2: // '\002'
                    i1 = videocontroller.d();
                    break;
                }
                if (!VideoController.e(videocontroller) && VideoController.f(videocontroller) && VideoController.c(videocontroller).e())
                {
                    sendMessageDelayed(obtainMessage(2), 1000 - i1 % 1000);
                    return;
                }
            }
        }

        b(VideoController videocontroller)
        {
            a = new WeakReference(videocontroller);
        }
    }


    private android.view.View.OnClickListener A;
    StringBuilder a;
    Formatter b;
    private a c;
    private Context d;
    private ViewGroup e;
    private View f;
    private ProgressBar g;
    private TextView h;
    private TextView i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private android.view.View.OnClickListener o;
    private android.view.View.OnClickListener p;
    private ImageButton q;
    private ImageButton r;
    private ImageButton s;
    private ImageButton t;
    private ImageButton u;
    private Handler v;
    private android.view.View.OnClickListener w;
    private android.view.View.OnClickListener x;
    private android.widget.SeekBar.OnSeekBarChangeListener y;
    private android.view.View.OnClickListener z;

    private VideoController(Context context)
    {
        super(context);
        v = new b(this);
        w = new ej(this);
        x = new ek(this);
        y = new el(this);
        z = new em(this);
        A = new en(this);
        d = context;
        l = true;
    }

    public VideoController(Context context, byte byte0)
    {
        this(context);
    }

    public VideoController(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        v = new b(this);
        w = new ej(this);
        x = new ek(this);
        y = new el(this);
        z = new em(this);
        A = new en(this);
        f = null;
        d = context;
        l = true;
        m = true;
    }

    static String a(VideoController videocontroller, int i1)
    {
        return videocontroller.b(i1);
    }

    private void a(View view)
    {
        boolean flag1 = true;
        q = (ImageButton)view.findViewById(0x7f0e01a0);
        if (q != null)
        {
            q.requestFocus();
            q.setOnClickListener(w);
        }
        r = (ImageButton)view.findViewById(0x7f0e019d);
        int i1;
        boolean flag;
        if (r != null)
        {
            r.setOnClickListener(A);
            if (!m)
            {
                Object obj = r;
                ShapeDrawable shapedrawable;
                if (l)
                {
                    i1 = 0;
                } else
                {
                    i1 = 8;
                }
                ((ImageButton) (obj)).setVisibility(i1);
            }
        }
        s = (ImageButton)view.findViewById(0x7f0e019c);
        if (s != null)
        {
            s.setOnClickListener(z);
            if (!m)
            {
                obj = s;
                if (l)
                {
                    i1 = 0;
                } else
                {
                    i1 = 8;
                }
                ((ImageButton) (obj)).setVisibility(i1);
            }
        }
        t = (ImageButton)view.findViewById(0x7f0e019e);
        if (t != null && !m && !n)
        {
            t.setVisibility(8);
        }
        u = (ImageButton)view.findViewById(0x7f0e019b);
        if (u != null && !m && !n)
        {
            u.setVisibility(8);
        }
        g = (ProgressBar)view.findViewById(0x7f0e01a1);
        if (g != null)
        {
            if (g instanceof SeekBar)
            {
                obj = (SeekBar)g;
                shapedrawable = new ShapeDrawable(new RectShape());
                shapedrawable.getPaint().setColor(Color.rgb(0, 0, 0));
                shapedrawable.setIntrinsicHeight(KikApplication.a(-80));
                shapedrawable.setIntrinsicWidth(KikApplication.a(30));
                ((SeekBar) (obj)).setThumb(shapedrawable);
                ((SeekBar) (obj)).getProgressDrawable().setColorFilter(Color.rgb(255, 255, 255), android.graphics.PorterDuff.Mode.SRC_IN);
                ((SeekBar) (obj)).setOnSeekBarChangeListener(y);
                ((SeekBar) (obj)).setEnabled(false);
            }
            g.setMax(1000);
        }
        h = (TextView)view.findViewById(0x7f0e01a2);
        i = (TextView)view.findViewById(0x7f0e019f);
        a = new StringBuilder();
        b = new Formatter(a, Locale.getDefault());
        if (t != null)
        {
            t.setOnClickListener(o);
            view = t;
            if (o != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setEnabled(flag);
        }
        if (u != null)
        {
            u.setOnClickListener(p);
            view = u;
            if (p != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            view.setEnabled(flag);
        }
    }

    static void a(VideoController videocontroller)
    {
        videocontroller.g();
    }

    static boolean a(VideoController videocontroller, boolean flag)
    {
        videocontroller.k = flag;
        return flag;
    }

    static Handler b(VideoController videocontroller)
    {
        return videocontroller.v;
    }

    private String b(int i1)
    {
        int k1 = i1 / 1000;
        i1 = k1 % 60;
        int j1 = (k1 / 60) % 60;
        k1 /= 3600;
        a.setLength(0);
        if (k1 > 0)
        {
            return b.format("%d:%02d:%02d", new Object[] {
                Integer.valueOf(k1), Integer.valueOf(j1), Integer.valueOf(i1)
            }).toString();
        } else
        {
            return b.format("%02d:%02d", new Object[] {
                Integer.valueOf(j1), Integer.valueOf(i1)
            }).toString();
        }
    }

    static a c(VideoController videocontroller)
    {
        return videocontroller.c;
    }

    static TextView d(VideoController videocontroller)
    {
        return videocontroller.i;
    }

    static boolean e(VideoController videocontroller)
    {
        return videocontroller.k;
    }

    private void f()
    {
        if (c != null)
        {
            try
            {
                if (q != null && !c.f())
                {
                    q.setEnabled(false);
                }
                if (s != null && !c.g())
                {
                    s.setEnabled(false);
                }
                if (r != null && !c.h())
                {
                    r.setEnabled(false);
                    return;
                }
            }
            catch (IncompatibleClassChangeError incompatibleclasschangeerror)
            {
                return;
            }
        }
    }

    static boolean f(VideoController videocontroller)
    {
        return videocontroller.j;
    }

    private void g()
    {
        if (c == null)
        {
            return;
        }
        if (c.e())
        {
            c.b();
        } else
        {
            c.a();
        }
        e();
    }

    public final void a()
    {
        a(0);
    }

    public final void a(int i1)
    {
        if (!j && e != null)
        {
            d();
            if (q != null)
            {
                q.requestFocus();
            }
            f();
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -2, 80);
            e.addView(this, layoutparams);
            j = true;
        }
        e();
        v.sendEmptyMessage(2);
        Message message = v.obtainMessage(1);
        if (i1 != 0)
        {
            v.removeMessages(1);
            v.sendMessageDelayed(message, i1);
        }
    }

    public final void a(ViewGroup viewgroup)
    {
        e = viewgroup;
        viewgroup = new android.widget.FrameLayout.LayoutParams(-1, -1);
        removeAllViews();
        f = ((LayoutInflater)d.getSystemService("layout_inflater")).inflate(0x7f03007e, null);
        a(f);
        addView(f, viewgroup);
    }

    public final void a(a a1)
    {
        c = a1;
        e();
    }

    public final boolean b()
    {
        return j;
    }

    public final void c()
    {
        if (e == null)
        {
            return;
        }
        try
        {
            e.removeView(this);
            v.removeMessages(2);
        }
        catch (IllegalArgumentException illegalargumentexception) { }
        j = false;
    }

    public final int d()
    {
        int i1;
        if (c == null || k)
        {
            i1 = 0;
        } else
        {
            int j1 = c.d();
            i1 = c.c();
            if (g != null && i1 > 0)
            {
                long l1 = (1000L * (long)j1) / (long)i1;
                g.setProgress((int)l1);
            }
            if (h != null)
            {
                h.setText(b(i1));
            }
            i1 = j1;
            if (i != null)
            {
                i.setText(b(j1));
                return j1;
            }
        }
        return i1;
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        boolean flag;
        int i1;
        i1 = keyevent.getKeyCode();
        if (keyevent.getRepeatCount() == 0 && keyevent.getAction() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i1 != 79 && i1 != 85 && i1 != 62)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag)
        {
            g();
            a(0);
            if (q != null)
            {
                q.requestFocus();
                return true;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (i1 != 126)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag && !c.e())
        {
            c.a();
            e();
            a(0);
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (i1 != 86 && i1 != 127)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag && c.e())
        {
            c.b();
            e();
            a(0);
            return true;
        }
        if (true) goto _L1; else goto _L5
_L5:
        if (i1 == 25 || i1 == 24 || i1 == 164)
        {
            return super.dispatchKeyEvent(keyevent);
        }
        if (i1 == 4 || i1 == 82)
        {
            if (flag)
            {
                c();
                return true;
            }
        } else
        {
            a(0);
            return super.dispatchKeyEvent(keyevent);
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final void e()
    {
        if (f == null || q == null || c == null)
        {
            return;
        }
        if (c.e())
        {
            q.setImageResource(0x7f020143);
            return;
        } else
        {
            q.setImageResource(0x7f020144);
            return;
        }
    }

    public void onFinishInflate()
    {
        if (f != null)
        {
            a(f);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        a(0);
        return true;
    }

    public boolean onTrackballEvent(MotionEvent motionevent)
    {
        a(0);
        return false;
    }

    public void setEnabled(boolean flag)
    {
        boolean flag2 = true;
        if (q != null)
        {
            q.setEnabled(flag);
        }
        if (r != null)
        {
            r.setEnabled(flag);
        }
        if (s != null)
        {
            s.setEnabled(flag);
        }
        boolean flag1;
        if (t != null)
        {
            ImageButton imagebutton = t;
            if (flag && o != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            imagebutton.setEnabled(flag1);
        }
        if (u != null)
        {
            imagebutton = u;
            if (flag && p != null)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            imagebutton.setEnabled(flag1);
        }
        f();
        super.setEnabled(flag);
    }
}
