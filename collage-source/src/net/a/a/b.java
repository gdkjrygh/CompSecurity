// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.cardinalblue.android.b.e;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.view.CustomRelativeLayout;

public class b
{
    private static class a extends Handler
    {

        public void handleMessage(Message message)
        {
            super.handleMessage(message);
            if (message.what == 1 && (message.obj instanceof PopupWindow))
            {
                k.a((PopupWindow)message.obj);
            }
        }

        private a()
        {
        }

    }


    protected Context a;
    protected PopupWindow b;
    protected View c;
    protected WindowManager d;
    private Handler e;

    public b(Context context)
    {
        a = context;
        b = new PopupWindow(context);
        b.setTouchInterceptor(new android.view.View.OnTouchListener() {

            final b a;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 4)
                {
                    k.a(a.b);
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
        d = (WindowManager)context.getSystemService("window");
    }

    protected void a()
    {
        if (c == null)
        {
            return;
        }
        if (c instanceof CustomRelativeLayout)
        {
            ((CustomRelativeLayout)c).setDispatchKeyEventListener(new com.cardinalblue.android.piccollage.view.CustomRelativeLayout.a() {

                final b a;

                public void a(KeyEvent keyevent)
                {
                    if (keyevent.getKeyCode() == 4 && keyevent.getRepeatCount() == 0 && a.b.isShowing())
                    {
                        a.c();
                    }
                }

            
            {
                a = b.this;
                super();
            }
            });
        }
        c.setOnTouchListener(new android.view.View.OnTouchListener() {

            final b a;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 0 && a.b.isShowing())
                {
                    a.c();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(long l)
    {
        if (e != null)
        {
            e.removeMessages(1);
        }
        if (!b.isShowing())
        {
            return;
        }
        if (l == 0L)
        {
            k.a(b);
            return;
        }
        if (e == null)
        {
            e = new a();
        }
        Message message = new Message();
        message.what = 1;
        message.obj = b;
        e.sendMessageDelayed(message, l);
    }

    public void a(View view)
    {
        c = view;
        b.setContentView(view);
    }

    public void a(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        b.setOnDismissListener(ondismisslistener);
    }

    protected void b()
    {
        if (c == null)
        {
            throw new IllegalStateException("setContentView was not called with a view to display.");
        }
        a();
        b.setBackgroundDrawable(new BitmapDrawable());
        b.setWidth(-2);
        b.setHeight(-2);
        b.setTouchable(true);
        if (!com.cardinalblue.android.b.e.a())
        {
            b.setFocusable(true);
        }
        b.setOutsideTouchable(true);
        b.setContentView(c);
    }

    public void c()
    {
        a(c.getResources().getInteger(0x10e0001));
    }

    public boolean d()
    {
        return b.isShowing();
    }
}
