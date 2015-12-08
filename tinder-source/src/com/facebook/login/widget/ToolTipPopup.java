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

public final class ToolTipPopup
{
    public static final class Style extends Enum
    {

        public static final Style a;
        public static final Style b;
        private static final Style c[];

        public static Style valueOf(String s)
        {
            return (Style)Enum.valueOf(com/facebook/login/widget/ToolTipPopup$Style, s);
        }

        public static Style[] values()
        {
            return (Style[])c.clone();
        }

        static 
        {
            a = new Style("BLUE", 0);
            b = new Style("BLACK", 1);
            c = (new Style[] {
                a, b
            });
        }

        private Style(String s, int i)
        {
            super(s, i);
        }
    }

    private final class a extends FrameLayout
    {

        final ToolTipPopup a;
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
            a = ToolTipPopup.this;
            super(context);
            LayoutInflater.from(getContext()).inflate(com.facebook.p.d.com_facebook_tooltip_bubble, this);
            b = (ImageView)findViewById(com.facebook.p.c.com_facebook_tooltip_bubble_view_top_pointer);
            c = (ImageView)findViewById(com.facebook.p.c.com_facebook_tooltip_bubble_view_bottom_pointer);
            d = findViewById(com.facebook.p.c.com_facebook_body_frame);
            e = (ImageView)findViewById(com.facebook.p.c.com_facebook_button_xout);
        }
    }


    final String a;
    final WeakReference b;
    final Context c;
    a d;
    PopupWindow e;
    Style f;
    long g;
    final android.view.ViewTreeObserver.OnScrollChangedListener h = new android.view.ViewTreeObserver.OnScrollChangedListener() {

        final ToolTipPopup a;

        public final void onScrollChanged()
        {
label0:
            {
                if (a.b.get() != null && a.e != null && a.e.isShowing())
                {
                    if (!a.e.isAboveAnchor())
                    {
                        break label0;
                    }
                    a.d.b();
                }
                return;
            }
            a.d.a();
        }

            
            {
                a = ToolTipPopup.this;
                super();
            }
    };

    public ToolTipPopup(String s, View view)
    {
        f = Style.a;
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

    // Unreferenced inner class com/facebook/login/widget/ToolTipPopup$2

/* anonymous class */
    final class _cls2
        implements Runnable
    {

        final ToolTipPopup a;

        public final void run()
        {
            a.a();
        }

            
            {
                a = ToolTipPopup.this;
                super();
            }
    }


    // Unreferenced inner class com/facebook/login/widget/ToolTipPopup$3

/* anonymous class */
    final class _cls3
        implements android.view.View.OnClickListener
    {

        final ToolTipPopup a;

        public final void onClick(View view)
        {
            a.a();
        }

            
            {
                a = ToolTipPopup.this;
                super();
            }
    }

}
