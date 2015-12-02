// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.qihoo360.mobilesafe.b.a;

public class b
{

    private final Handler a;
    private View b;
    private View c;
    private WindowManager d;
    private android.view.WindowManager.LayoutParams e;

    public b(Context context, Handler handler)
    {
        a = handler;
        d = (WindowManager)context.getSystemService("window");
        e = new android.view.WindowManager.LayoutParams();
        e.width = -1;
        e.height = -2;
        e.type = 2003;
        e.flags = 136;
        e.format = -3;
        e.gravity = 48;
        e.y = com.qihoo360.mobilesafe.b.a.b(context) / 6;
        b = View.inflate(context, 0x7f0300a6, null);
        b.setOnTouchListener(new android.view.View.OnTouchListener() {

            final b a;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                a.e();
                return false;
            }

            
            {
                a = b.this;
                super();
            }
        });
        c = View.inflate(context, 0x7f0300a5, null);
        c.setOnTouchListener(new android.view.View.OnTouchListener() {

            final b a;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                a.e();
                return false;
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a()
    {
        a.sendMessageDelayed(a.obtainMessage(101), 100L);
    }

    public void b()
    {
        a.sendMessageDelayed(a.obtainMessage(103), 100L);
    }

    public void c()
    {
        e();
        d.addView(b, e);
        a.sendMessageDelayed(a.obtainMessage(102), 2000L);
    }

    public void d()
    {
        e();
        d.addView(c, e);
        a.sendMessageDelayed(a.obtainMessage(104), 2000L);
    }

    public void e()
    {
        if (b.getParent() != null)
        {
            d.removeViewImmediate(b);
        }
        if (c.getParent() != null)
        {
            d.removeViewImmediate(c);
        }
        if (a.hasMessages(102))
        {
            a.removeMessages(102);
        }
        if (a.hasMessages(104))
        {
            a.removeMessages(104);
        }
    }
}
