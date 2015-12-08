// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import asg;
import java.lang.ref.WeakReference;

public final class ToolTipPopup
{

    final String a;
    final WeakReference b;
    final Context c;
    asg d;
    PopupWindow e;
    Style f;
    long g;
    final android.view.ViewTreeObserver.OnScrollChangedListener h = new android.view.ViewTreeObserver.OnScrollChangedListener() {

        private ToolTipPopup a;

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

    final void a()
    {
        if (b.get() != null)
        {
            ((View)b.get()).getViewTreeObserver().removeOnScrollChangedListener(h);
        }
    }

    public final void dismiss()
    {
        a();
        if (e != null)
        {
            e.dismiss();
        }
    }

    // Unreferenced inner class com/facebook/widget/ToolTipPopup$2

/* anonymous class */
    final class _cls2
        implements Runnable
    {

        private ToolTipPopup a;

        public final void run()
        {
            a.dismiss();
        }

            
            {
                a = ToolTipPopup.this;
                super();
            }
    }


    // Unreferenced inner class com/facebook/widget/ToolTipPopup$3

/* anonymous class */
    final class _cls3
        implements android.view.View.OnClickListener
    {

        private ToolTipPopup a;

        public final void onClick(View view)
        {
            a.dismiss();
        }

            
            {
                a = ToolTipPopup.this;
                super();
            }
    }


    private class Style extends Enum
    {

        public static final Style a;
        private static Style b;
        private static final Style c[];

        public static Style valueOf(String s)
        {
            return (Style)Enum.valueOf(com/facebook/widget/ToolTipPopup$Style, s);
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

}
