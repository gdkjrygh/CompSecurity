// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TextClock extends TextView
{

    protected DateFormat a;
    protected TypefaceSpan b;
    private boolean c;
    private boolean d;
    private Date e;
    private final ContentObserver f;
    private final BroadcastReceiver g;

    public TextClock(Context context)
    {
        super(context);
        f = new ContentObserver(new Handler()) {

            final TextClock a;

            public void onChange(boolean flag)
            {
                a.a(TextClock.a(a));
                TextClock.b(a);
            }

            public void onChange(boolean flag, Uri uri)
            {
                a.a(TextClock.a(a));
                TextClock.b(a);
            }

            
            {
                a = TextClock.this;
                super(handler);
            }
        };
        g = new BroadcastReceiver() {

            final TextClock a;

            public void onReceive(Context context1, Intent intent)
            {
                a.a(TextClock.a(a));
                TextClock.c(a);
                TextClock.b(a);
            }

            
            {
                a = TextClock.this;
                super();
            }
        };
        a(((AttributeSet) (null)));
    }

    public TextClock(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TextClock(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        f = new _cls1(new Handler());
        g = new _cls2();
        if (!isInEditMode())
        {
            a(attributeset);
        }
    }

    private void a()
    {
        e = new Date();
    }

    private void a(AttributeSet attributeset)
    {
        a();
        attributeset = getContext().obtainStyledAttributes(attributeset, com.pandora.android.R.styleable.TextClock);
        String s;
        s = attributeset.getString(0);
        d = attributeset.getBoolean(1, false);
        if (s == null) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT > 16)
        {
            b = new TypefaceSpan(s);
        }
_L4:
        a(d);
        attributeset.recycle();
        return;
_L2:
        if (android.os.Build.VERSION.SDK_INT <= 16) goto _L4; else goto _L3
_L3:
        b = new TypefaceSpan("sans-serif-thin");
          goto _L4
        Exception exception;
        exception;
        attributeset.recycle();
        throw exception;
    }

    static boolean a(TextClock textclock)
    {
        return textclock.d;
    }

    private void b()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.TIME_TICK");
        intentfilter.addAction("android.intent.action.TIME_SET");
        intentfilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        getContext().registerReceiver(g, intentfilter, null, getHandler());
    }

    static void b(TextClock textclock)
    {
        textclock.f();
    }

    private void c()
    {
        getContext().getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, f);
    }

    static void c(TextClock textclock)
    {
        textclock.a();
    }

    private void d()
    {
        getContext().unregisterReceiver(g);
    }

    private void e()
    {
        getContext().getContentResolver().unregisterContentObserver(f);
    }

    private void f()
    {
        e.setTime(System.currentTimeMillis());
        String s = a.format(e);
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(s);
        if (b != null)
        {
            spannablestringbuilder.setSpan(b, 0, s.length(), 18);
        }
        setText(spannablestringbuilder);
    }

    protected void a(boolean flag)
    {
        if (android.text.format.DateFormat.is24HourFormat(getContext()))
        {
            String s;
            if (flag)
            {
                s = "H:mm a";
            } else
            {
                s = "H:mm";
            }
            a = new SimpleDateFormat(s);
            return;
        }
        String s1;
        if (flag)
        {
            s1 = "h:mm a";
        } else
        {
            s1 = "h:mm";
        }
        a = new SimpleDateFormat(s1);
    }

    public DateFormat getFormat()
    {
        return a;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (!c)
        {
            c = true;
            b();
            c();
            a();
            f();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (c)
        {
            d();
            e();
            c = false;
        }
    }
}
