// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package wei.mark.standout.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.LinkedList;
import java.util.Queue;
import wei.mark.standout.StandOutWindow;
import wei.mark.standout.a.a;
import wei.mark.standout.b;

// Referenced classes of package wei.mark.standout.ui:
//            a

public class Window extends FrameLayout
{
    public final class a
    {

        wei.mark.standout.StandOutWindow.StandOutLayoutParams a;
        float b;
        float c;
        final Window d;

        public final a a(int i1, int j1)
        {
            if (a != null)
            {
                if (b < 0.0F || b > 1.0F || c < 0.0F || c > 1.0F)
                {
                    throw new IllegalStateException("Anchor point must be between 0 and 1, inclusive.");
                }
                int i2 = a.width;
                int j2 = a.height;
                if (i1 != 0x80000000)
                {
                    a.width = i1;
                }
                if (j1 != 0x80000000)
                {
                    a.height = j1;
                }
                int l1 = a.d;
                int k1 = a.e;
                j1 = k1;
                i1 = l1;
                if (wei.mark.standout.b.a(d.f, wei.mark.standout.a.a.j))
                {
                    i1 = Math.min(l1, d.i);
                    j1 = Math.min(k1, d.j);
                }
                a.width = Math.min(Math.max(a.width, a.b), i1);
                a.height = Math.min(Math.max(a.height, a.c), j1);
                if (wei.mark.standout.b.a(d.f, wei.mark.standout.a.a.k))
                {
                    i1 = (int)((float)a.height * d.g.i);
                    j1 = (int)((float)a.width / d.g.i);
                    if (j1 >= a.c && j1 <= a.e)
                    {
                        a.height = j1;
                    } else
                    {
                        a.width = i1;
                    }
                }
                b((int)((float)a.x + (float)i2 * b), (int)((float)a.y + (float)j2 * c));
            }
            return this;
        }

        public final void a()
        {
            if (a != null)
            {
                wei.mark.standout.ui.Window.a(d).updateViewLayout(d.b, a);
                a = null;
            }
        }

        public final a b(int i1, int j1)
        {
            if (a != null)
            {
                if (b < 0.0F || b > 1.0F || c < 0.0F || c > 1.0F)
                {
                    throw new IllegalStateException("Anchor point must be between 0 and 1, inclusive.");
                }
                if (i1 != 0x80000000)
                {
                    a.x = (int)((float)i1 - (float)a.width * b);
                }
                if (j1 != 0x80000000)
                {
                    a.y = (int)((float)j1 - (float)a.height * c);
                }
                if (wei.mark.standout.b.a(d.f, wei.mark.standout.a.a.j))
                {
                    if (a.gravity != 51)
                    {
                        throw new IllegalStateException((new StringBuilder("The window ")).append(d.b).append(" gravity must be TOP|LEFT if FLAG_WINDOW_EDGE_LIMITS_ENABLE or FLAG_WINDOW_EDGE_TILE_ENABLE is set.").toString());
                    }
                    a.x = Math.min(Math.max(a.x, 0), d.i - a.width);
                    a.y = Math.min(Math.max(a.y, 0), d.j - a.height);
                }
            }
            return this;
        }

        public a()
        {
            d = Window.this;
            super();
            a = Window.this.b();
            c = 0.0F;
            b = 0.0F;
        }
    }


    public Class a;
    public int b;
    public int c;
    public boolean d;
    public wei.mark.standout.StandOutWindow.StandOutLayoutParams e;
    public int f;
    public wei.mark.standout.ui.a g;
    public Bundle h;
    int i;
    int j;
    private final StandOutWindow k;
    private LayoutInflater l;

    public Window(Context context)
    {
        super(context);
        k = null;
    }

    public Window(StandOutWindow standoutwindow, int i1)
    {
        super(standoutwindow);
        standoutwindow.setTheme(standoutwindow.getThemeStyle());
        k = standoutwindow;
        l = LayoutInflater.from(standoutwindow);
        a = standoutwindow.getClass();
        b = i1;
        e = standoutwindow.getParams(i1, this);
        f = standoutwindow.getFlags(i1);
        g = new wei.mark.standout.ui.a();
        g.i = (float)e.width / (float)e.height;
        h = new Bundle();
        Object obj = k.getResources().getDisplayMetrics();
        i = ((DisplayMetrics) (obj)).widthPixels;
        j = ((DisplayMetrics) (obj)).heightPixels;
        Object obj1;
        if (wei.mark.standout.b.a(f, wei.mark.standout.a.a.a))
        {
            obj1 = l.inflate(wei.mark.standout.a.c.system_window_decorators, null);
            obj = (ImageView)((View) (obj1)).findViewById(wei.mark.standout.a.b.window_icon);
            ((ImageView) (obj)).setImageResource(k.getAppIcon());
            ((ImageView) (obj)).setOnClickListener(new android.view.View.OnClickListener(((ImageView) (obj))) {

                final ImageView a;
                final Window b;

                public final void onClick(View view4)
                {
                    view4 = wei.mark.standout.ui.Window.a(b).getDropDown(b.b);
                    if (view4 != null)
                    {
                        view4.showAsDropDown(a);
                    }
                }

            
            {
                b = Window.this;
                a = imageview;
                super();
            }
            });
            ((TextView)((View) (obj1)).findViewById(wei.mark.standout.a.b.title)).setText(k.getTitle(b));
            obj = ((View) (obj1)).findViewById(wei.mark.standout.a.b.hide);
            ((View) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

                final Window a;

                public final void onClick(View view4)
                {
                    wei.mark.standout.ui.Window.a(a).hide(a.b);
                }

            
            {
                a = Window.this;
                super();
            }
            });
            ((View) (obj)).setVisibility(8);
            View view = ((View) (obj1)).findViewById(wei.mark.standout.a.b.maximize);
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final Window a;

                public final void onClick(View view4)
                {
                    view4 = a.b();
                    if (a.h.getBoolean("isMaximized") && ((wei.mark.standout.StandOutWindow.StandOutLayoutParams) (view4)).width == a.i && ((wei.mark.standout.StandOutWindow.StandOutLayoutParams) (view4)).height == a.j && ((wei.mark.standout.StandOutWindow.StandOutLayoutParams) (view4)).x == 0 && ((wei.mark.standout.StandOutWindow.StandOutLayoutParams) (view4)).y == 0)
                    {
                        a.h.putBoolean("isMaximized", false);
                        int j1 = a.h.getInt("widthBeforeMaximize", -1);
                        int k1 = a.h.getInt("heightBeforeMaximize", -1);
                        int l1 = a.h.getInt("xBeforeMaximize", -1);
                        int i2 = a.h.getInt("yBeforeMaximize", -1);
                        a.a().a(j1, k1).b(l1, i2).a();
                        return;
                    } else
                    {
                        a.h.putBoolean("isMaximized", true);
                        a.h.putInt("widthBeforeMaximize", ((wei.mark.standout.StandOutWindow.StandOutLayoutParams) (view4)).width);
                        a.h.putInt("heightBeforeMaximize", ((wei.mark.standout.StandOutWindow.StandOutLayoutParams) (view4)).height);
                        a.h.putInt("xBeforeMaximize", ((wei.mark.standout.StandOutWindow.StandOutLayoutParams) (view4)).x);
                        a.h.putInt("yBeforeMaximize", ((wei.mark.standout.StandOutWindow.StandOutLayoutParams) (view4)).y);
                        view4 = a.a();
                        view4.a((int)((float)((a) (view4)).d.i * 1.0F), (int)((float)((a) (view4)).d.j * 1.0F)).b(0, 0).a();
                        return;
                    }
                }

            
            {
                a = Window.this;
                super();
            }
            });
            View view1 = ((View) (obj1)).findViewById(wei.mark.standout.a.b.close);
            view1.setOnClickListener(new android.view.View.OnClickListener() {

                final Window a;

                public final void onClick(View view4)
                {
                    wei.mark.standout.ui.Window.a(a).close(a.b);
                }

            
            {
                a = Window.this;
                super();
            }
            });
            View view2 = ((View) (obj1)).findViewById(wei.mark.standout.a.b.titlebar);
            view2.setOnTouchListener(new android.view.View.OnTouchListener() {

                final Window a;

                public final boolean onTouch(View view4, MotionEvent motionevent)
                {
                    return wei.mark.standout.ui.Window.a(a).onTouchHandleMove(a.b, a, view4, motionevent);
                }

            
            {
                a = Window.this;
                super();
            }
            });
            View view3 = ((View) (obj1)).findViewById(wei.mark.standout.a.b.corner);
            view3.setOnTouchListener(new android.view.View.OnTouchListener() {

                final Window a;

                public final boolean onTouch(View view4, MotionEvent motionevent)
                {
                    return wei.mark.standout.ui.Window.a(a).onTouchHandleResize(a.b, a, view4, motionevent);
                }

            
            {
                a = Window.this;
                super();
            }
            });
            if (wei.mark.standout.b.a(f, wei.mark.standout.a.a.g))
            {
                ((View) (obj)).setVisibility(0);
            }
            if (wei.mark.standout.b.a(f, wei.mark.standout.a.a.d))
            {
                view.setVisibility(8);
            }
            if (wei.mark.standout.b.a(f, wei.mark.standout.a.a.b))
            {
                view1.setVisibility(8);
            }
            if (wei.mark.standout.b.a(f, wei.mark.standout.a.a.e))
            {
                view2.setOnTouchListener(null);
            }
            if (wei.mark.standout.b.a(f, wei.mark.standout.a.a.c))
            {
                view3.setVisibility(8);
            }
            obj = (FrameLayout)((View) (obj1)).findViewById(wei.mark.standout.a.b.body);
        } else
        {
            obj1 = new FrameLayout(standoutwindow);
            ((View) (obj1)).setId(wei.mark.standout.a.b.content);
            obj = (FrameLayout)obj1;
        }
        addView(((View) (obj1)));
        ((FrameLayout) (obj)).setOnTouchListener(new android.view.View.OnTouchListener(standoutwindow, i1) {

            final StandOutWindow a;
            final int b;
            final Window c;

            public final boolean onTouch(View view4, MotionEvent motionevent)
            {
                boolean flag1 = false;
                boolean flag;
                if (a.onTouchHandleMove(b, c, view4, motionevent))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (a.onTouchBody(b, c, view4, motionevent) || flag)
                {
                    flag1 = true;
                }
                return flag1;
            }

            
            {
                c = Window.this;
                a = standoutwindow;
                b = i1;
                super();
            }
        });
        standoutwindow.createAndAttachView(i1, ((FrameLayout) (obj)));
        if (((FrameLayout) (obj)).getChildCount() == 0)
        {
            throw new RuntimeException("You must attach your view to the given frame in createAndAttachView()");
        }
        if (!wei.mark.standout.b.a(f, wei.mark.standout.a.a.o))
        {
            a(((View) (obj)));
        }
        if (!wei.mark.standout.b.a(f, wei.mark.standout.a.a.p))
        {
            if (!wei.mark.standout.b.a(f, wei.mark.standout.a.a.q))
            {
                standoutwindow = ((View) (obj)).findViewById(wei.mark.standout.a.b.corner);
                if (standoutwindow != null)
                {
                    standoutwindow.setOnTouchListener(new android.view.View.OnTouchListener() {

                        final Window a;

                        public final boolean onTouch(View view4, MotionEvent motionevent)
                        {
                            return wei.mark.standout.ui.Window.a(a).onTouchHandleResize(a.b, a, view4, motionevent);
                        }

            
            {
                a = Window.this;
                super();
            }
                    });
                }
            }
            if (!wei.mark.standout.b.a(f, wei.mark.standout.a.a.r))
            {
                standoutwindow = ((View) (obj)).findViewById(wei.mark.standout.a.b.window_icon);
                if (standoutwindow != null)
                {
                    standoutwindow.setOnClickListener(new android.view.View.OnClickListener(standoutwindow) {

                        final View a;
                        final Window b;

                        public final void onClick(View view4)
                        {
                            view4 = wei.mark.standout.ui.Window.a(b).getDropDown(b.b);
                            if (view4 != null)
                            {
                                view4.showAsDropDown(a);
                            }
                        }

            
            {
                b = Window.this;
                a = view;
                super();
            }
                    });
                }
            }
        }
        setTag(((FrameLayout) (obj)).getTag());
    }

    static StandOutWindow a(Window window)
    {
        return window.k;
    }

    private static void a(View view)
    {
        LinkedList linkedlist = new LinkedList();
        linkedlist.add(view);
        do
        {
            view = (View)linkedlist.poll();
            if (view == null)
            {
                break;
            }
            if (view instanceof ViewGroup)
            {
                view = (ViewGroup)view;
                int i1 = 0;
                while (i1 < view.getChildCount()) 
                {
                    linkedlist.add(view.getChildAt(i1));
                    i1++;
                }
            }
        } while (true);
    }

    public final a a()
    {
        return new a();
    }

    public final boolean a(boolean flag)
    {
        if (wei.mark.standout.b.a(f, wei.mark.standout.a.a.m) || flag == d)
        {
            return false;
        }
        d = flag;
        if (k.onFocusChange(b, this, flag))
        {
            StringBuilder stringbuilder = (new StringBuilder("Window ")).append(b).append(" focus change ");
            String s;
            if (flag)
            {
                s = "(true)";
            } else
            {
                s = "(false)";
            }
            stringbuilder.append(s).append(" cancelled by implementation.");
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            d = flag;
            return false;
        }
        if (!wei.mark.standout.b.a(f, wei.mark.standout.a.a.n))
        {
            Object obj = findViewById(wei.mark.standout.a.b.content);
            if (flag)
            {
                ((View) (obj)).setBackgroundResource(wei.mark.standout.a.a.border_focused);
            } else
            if (wei.mark.standout.b.a(f, wei.mark.standout.a.a.a))
            {
                ((View) (obj)).setBackgroundResource(wei.mark.standout.a.a.border);
            } else
            {
                ((View) (obj)).setBackgroundResource(0);
            }
        }
        obj = b();
        ((wei.mark.standout.StandOutWindow.StandOutLayoutParams) (obj)).a(flag);
        k.updateViewLayout(b, ((wei.mark.standout.StandOutWindow.StandOutLayoutParams) (obj)));
        if (!flag) goto _L2; else goto _L1
_L1:
        k.setFocusedWindow(this);
_L4:
        return true;
_L2:
        if (k.getFocusedWindow() == this)
        {
            k.setFocusedWindow(null);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final wei.mark.standout.StandOutWindow.StandOutLayoutParams b()
    {
        wei.mark.standout.StandOutWindow.StandOutLayoutParams standoutlayoutparams1 = (wei.mark.standout.StandOutWindow.StandOutLayoutParams)super.getLayoutParams();
        wei.mark.standout.StandOutWindow.StandOutLayoutParams standoutlayoutparams = standoutlayoutparams1;
        if (standoutlayoutparams1 == null)
        {
            standoutlayoutparams = e;
        }
        return standoutlayoutparams;
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (k.onKeyEvent(b, this, keyevent))
        {
            (new StringBuilder("Window ")).append(b).append(" key event ").append(keyevent).append(" cancelled by implementation.");
            return false;
        }
        if (keyevent.getAction() != 1) goto _L2; else goto _L1
_L1:
        keyevent.getKeyCode();
        JVM INSTR tableswitch 4 4: default 84
    //                   4 90;
           goto _L2 _L3
_L2:
        return super.dispatchKeyEvent(keyevent);
_L3:
        k.unfocus(this);
        return true;
    }

    public android.view.ViewGroup.LayoutParams getLayoutParams()
    {
        return b();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (c == 2 || c == 0)
        {
            return true;
        }
        wei.mark.standout.StandOutWindow.StandOutLayoutParams standoutlayoutparams = b();
        if (motionevent.getAction() == 0 && k.getFocusedWindow() != this)
        {
            k.focus(b);
        }
        if (motionevent.getPointerCount() >= 2 && wei.mark.standout.b.a(f, wei.mark.standout.a.a.l) && (motionevent.getAction() & 0xff) == 5)
        {
            g.f = 1.0D;
            g.e = -1D;
            g.g = standoutlayoutparams.width;
            g.h = standoutlayoutparams.height;
            return true;
        } else
        {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 4 4: default 24
    //                   4 144;
           goto _L1 _L2
_L1:
        if (motionevent.getPointerCount() < 2 || !wei.mark.standout.b.a(f, wei.mark.standout.a.a.l)) goto _L4; else goto _L3
_L3:
        double d1;
        float f1 = motionevent.getX(0);
        float f2 = motionevent.getY(0);
        float f3 = motionevent.getX(1);
        float f4 = motionevent.getY(1);
        d1 = Math.sqrt(Math.pow(f1 - f3, 2D) + Math.pow(f2 - f4, 2D));
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 2 2: default 128
    //                   2 182;
           goto _L5 _L6
_L5:
        k.onResize(b, this, this, motionevent);
_L4:
        return true;
_L2:
        if (k.getFocusedWindow() == this)
        {
            k.unfocus(this);
        }
        k.onTouchBody(b, this, this, motionevent);
          goto _L1
_L6:
        if (g.e == -1D)
        {
            g.e = d1;
        }
        Object obj = g;
        obj.f = ((wei.mark.standout.ui.a) (obj)).f * (d1 / g.e);
        g.e = d1;
        obj = a();
        obj.b = 0.5F;
        obj.c = 0.5F;
        ((a) (obj)).a((int)(g.g * g.f), (int)(g.h * g.f)).a();
          goto _L5
    }

    public void setDisplayDimensions(int i1, int j1)
    {
        int k1;
label0:
        {
            DisplayMetrics displaymetrics = k.getResources().getDisplayMetrics();
            if (i1 > 0)
            {
                k1 = i1;
                i1 = j1;
                if (j1 > 0)
                {
                    break label0;
                }
            }
            k1 = displaymetrics.widthPixels;
            i1 = displaymetrics.heightPixels;
        }
        i = k1;
        j = i1;
    }

    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof wei.mark.standout.StandOutWindow.StandOutLayoutParams)
        {
            super.setLayoutParams(layoutparams);
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Window")).append(b).append(": LayoutParams must be an instance of StandOutLayoutParams.").toString());
        }
    }
}
