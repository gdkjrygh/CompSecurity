// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.design.widget:
//            t

final class s
{
    private static interface a
    {

        public abstract void a(ViewGroup viewgroup, View view, Rect rect);
    }

    private static final class b
        implements a
    {

        public final void a(ViewGroup viewgroup, View view, Rect rect)
        {
            viewgroup.offsetDescendantRectToMyCoords(view, rect);
        }

        private b()
        {
        }

        b(byte byte0)
        {
            this();
        }
    }

    private static final class c
        implements a
    {

        public final void a(ViewGroup viewgroup, View view, Rect rect)
        {
            t.a(viewgroup, view, rect);
        }

        private c()
        {
        }

        c(byte byte0)
        {
            this();
        }
    }


    private static final a a;

    static void a(ViewGroup viewgroup, View view, Rect rect)
    {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        a.a(viewgroup, view, rect);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new c((byte)0);
        } else
        {
            a = new b((byte)0);
        }
    }
}
