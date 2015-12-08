// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.media.f;
import android.support.v7.media.g;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;

// Referenced classes of package android.support.v7.app:
//            s

public class p extends Dialog
{
    private final class a extends android.support.v7.media.g.a
    {

        final p a;

        public void c(g g1, android.support.v7.media.g.f f1)
        {
            android.support.v7.app.p.f(a);
        }

        public void e(g g1, android.support.v7.media.g.f f1)
        {
            android.support.v7.app.p.f(a);
        }

        public void f(g g1, android.support.v7.media.g.f f1)
        {
            if (f1 == p.d(a))
            {
                p.b(a);
            }
        }

        private a()
        {
            a = p.this;
            super();
        }

    }


    private final g a;
    private final a b;
    private final android.support.v7.media.g.f c;
    private boolean d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private boolean h;
    private LinearLayout i;
    private SeekBar j;
    private boolean k;
    private View l;
    private Button m;

    public p(Context context)
    {
        this(context, 0);
    }

    public p(Context context, int i1)
    {
        super(s.a(context, true), i1);
        h = true;
        a = android.support.v7.media.g.a(getContext());
        b = new a();
        c = a.c();
    }

    private boolean a()
    {
        boolean flag = true;
        if (!c.f() || c.g())
        {
            dismiss();
            flag = false;
        } else
        {
            setTitle(c.b());
            c();
            Drawable drawable = b();
            if (drawable != g)
            {
                g = drawable;
                drawable.setVisible(false, true);
                getWindow().setFeatureDrawable(3, drawable);
                return true;
            }
        }
        return flag;
    }

    static boolean a(p p1)
    {
        return p1.k;
    }

    static boolean a(p p1, boolean flag)
    {
        p1.k = flag;
        return flag;
    }

    private Drawable b()
    {
        if (c.e())
        {
            if (e == null)
            {
                e = s.b(getContext(), android.support.v7.mediarouter.R.attr.mediaRouteConnectingDrawable);
            }
            return e;
        }
        if (f == null)
        {
            f = s.b(getContext(), android.support.v7.mediarouter.R.attr.mediaRouteOnDrawable);
        }
        return f;
    }

    static void b(p p1)
    {
        p1.c();
    }

    static SeekBar c(p p1)
    {
        return p1.j;
    }

    private void c()
    {
label0:
        {
            if (!k)
            {
                if (!d())
                {
                    break label0;
                }
                i.setVisibility(0);
                j.setMax(c.l());
                j.setProgress(c.k());
            }
            return;
        }
        i.setVisibility(8);
    }

    static android.support.v7.media.g.f d(p p1)
    {
        return p1.c;
    }

    private boolean d()
    {
        return h && c.j() == 1;
    }

    static g e(p p1)
    {
        return p1.a;
    }

    static boolean f(p p1)
    {
        return p1.a();
    }

    public View a(Bundle bundle)
    {
        return null;
    }

    public void a(boolean flag)
    {
        if (h != flag)
        {
            h = flag;
            if (d)
            {
                c();
            }
        }
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        a.a(f.a, b, 2);
        a();
    }

    protected void onCreate(Bundle bundle)
    {
label0:
        {
            super.onCreate(bundle);
            getWindow().requestFeature(3);
            setContentView(android.support.v7.mediarouter.R.layout.mr_media_route_controller_dialog);
            i = (LinearLayout)findViewById(android.support.v7.mediarouter.R.id.media_route_volume_layout);
            j = (SeekBar)findViewById(android.support.v7.mediarouter.R.id.media_route_volume_slider);
            j.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener() {

                final p a;
                private final Runnable b = new _cls1(this);

                public void onProgressChanged(SeekBar seekbar, int i1, boolean flag)
                {
                    if (flag)
                    {
                        p.d(a).a(i1);
                    }
                }

                public void onStartTrackingTouch(SeekBar seekbar)
                {
                    if (p.a(a))
                    {
                        p.c(a).removeCallbacks(b);
                        return;
                    } else
                    {
                        p.a(a, true);
                        return;
                    }
                }

                public void onStopTrackingTouch(SeekBar seekbar)
                {
                    p.c(a).postDelayed(b, 250L);
                }

            
            {
                a = p.this;
                super();
            }
            });
            m = (Button)findViewById(android.support.v7.mediarouter.R.id.media_route_disconnect_button);
            m.setOnClickListener(new android.view.View.OnClickListener() {

                final p a;

                public void onClick(View view)
                {
                    if (p.d(a).f())
                    {
                        p.e(a).b().n();
                    }
                    a.dismiss();
                }

            
            {
                a = p.this;
                super();
            }
            });
            d = true;
            if (a())
            {
                l = a(bundle);
                bundle = (FrameLayout)findViewById(android.support.v7.mediarouter.R.id.media_route_control_frame);
                if (l == null)
                {
                    break label0;
                }
                bundle.addView(l);
                bundle.setVisibility(0);
            }
            return;
        }
        bundle.setVisibility(8);
    }

    public void onDetachedFromWindow()
    {
        a.a(b);
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 25 || i1 == 24)
        {
            keyevent = c;
            if (i1 == 25)
            {
                i1 = -1;
            } else
            {
                i1 = 1;
            }
            keyevent.b(i1);
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        if (i1 == 25 || i1 == 24)
        {
            return true;
        } else
        {
            return super.onKeyUp(i1, keyevent);
        }
    }

    // Unreferenced inner class android/support/v7/app/p$1$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        final _cls1 a;

        public void run()
        {
            if (p.a(a.a))
            {
                p.a(a.a, false);
                p.b(a.a);
            }
        }

            
            {
                a = _pcls1;
                super();
            }
    }

}
