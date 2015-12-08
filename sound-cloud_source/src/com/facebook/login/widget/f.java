// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;

// Referenced classes of package com.facebook.login.widget:
//            g

public final class f
{
    private final class a extends FrameLayout
    {

        final f a;
        private ImageView b;
        private ImageView c;
        private View d;
        private ImageView e;

        static View a(a a1)
        {
            return a1.d;
        }

        static ImageView b(a a1)
        {
            return a1.c;
        }

        static ImageView c(a a1)
        {
            return a1.b;
        }

        static ImageView d(a a1)
        {
            return a1.e;
        }

        public final void a()
        {
            b.setVisibility(0);
            c.setVisibility(4);
        }

        public final void b()
        {
            b.setVisibility(4);
            c.setVisibility(0);
        }

        public a(Context context)
        {
            a = f.this;
            super(context);
            LayoutInflater.from(getContext()).inflate(com.facebook.O.e.com_facebook_tooltip_bubble, this);
            b = (ImageView)findViewById(com.facebook.O.d.com_facebook_tooltip_bubble_view_top_pointer);
            c = (ImageView)findViewById(com.facebook.O.d.com_facebook_tooltip_bubble_view_bottom_pointer);
            d = findViewById(com.facebook.O.d.com_facebook_body_frame);
            e = (ImageView)findViewById(com.facebook.O.d.com_facebook_button_xout);
        }
    }

    public static final class b extends Enum
    {

        public static final int a;
        public static final int b;
        private static final int c[];

        static 
        {
            a = 1;
            b = 2;
            c = (new int[] {
                a, b
            });
        }
    }


    final String a;
    final WeakReference b;
    final Context c;
    a d;
    PopupWindow e;
    int f;
    long g;
    final android.view.ViewTreeObserver.OnScrollChangedListener h = new g(this);

    public f(String s, View view)
    {
        f = b.a;
        g = 6000L;
        a = s;
        b = new WeakReference(view);
        c = view.getContext();
    }

    public final void a()
    {
        b();
        if (e != null)
        {
            e.dismiss();
        }
    }

    final void b()
    {
        if (b.get() != null)
        {
            ((View)b.get()).getViewTreeObserver().removeOnScrollChangedListener(h);
        }
    }
}
