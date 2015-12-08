// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bz;

import android.app.Application;
import android.content.res.Resources;
import android.text.TextWatcher;
import com.pandora.android.provider.b;

public class i
{
    public static class a
    {

        private com.pandora.android.view.HeaderLayout.d a;
        private boolean b;
        private com.pandora.android.view.HeaderLayout.a c;
        private com.pandora.android.view.HeaderLayout.a d;
        private com.pandora.android.view.HeaderLayout.b e;
        private CharSequence f;
        private CharSequence g;
        private boolean h;
        private boolean i;
        private int j;
        private int k;
        private com.pandora.android.view.HeaderLayout.c l;
        private android.view.View.OnClickListener m;
        private com.pandora.android.util.SearchBox.a n;
        private TextWatcher o;
        private CharSequence p;
        private boolean q;
        private boolean r;

        static com.pandora.android.view.HeaderLayout.d a(a a1)
        {
            return a1.a;
        }

        static boolean b(a a1)
        {
            return a1.b;
        }

        static CharSequence c(a a1)
        {
            return a1.f;
        }

        static com.pandora.android.view.HeaderLayout.a d(a a1)
        {
            return a1.c;
        }

        static com.pandora.android.view.HeaderLayout.a e(a a1)
        {
            return a1.d;
        }

        static CharSequence f(a a1)
        {
            return a1.g;
        }

        static com.pandora.android.view.HeaderLayout.b g(a a1)
        {
            return a1.e;
        }

        static boolean h(a a1)
        {
            return a1.h;
        }

        static boolean i(a a1)
        {
            return a1.i;
        }

        static int j(a a1)
        {
            return a1.j;
        }

        static int k(a a1)
        {
            return a1.k;
        }

        static com.pandora.android.view.HeaderLayout.c l(a a1)
        {
            return a1.l;
        }

        static android.view.View.OnClickListener m(a a1)
        {
            return a1.m;
        }

        static com.pandora.android.util.SearchBox.a n(a a1)
        {
            return a1.n;
        }

        static TextWatcher o(a a1)
        {
            return a1.o;
        }

        static CharSequence p(a a1)
        {
            return a1.p;
        }

        static boolean q(a a1)
        {
            return a1.q;
        }

        static boolean r(a a1)
        {
            return a1.r;
        }

        public a a(int i1)
        {
            j = i1;
            return this;
        }

        public a a(com.pandora.android.view.HeaderLayout.a a1)
        {
            c = a1;
            return this;
        }

        public a a(com.pandora.android.view.HeaderLayout.a a1, CharSequence charsequence)
        {
            d = a1;
            g = charsequence;
            return this;
        }

        public a a(com.pandora.android.view.HeaderLayout.b b1)
        {
            e = b1;
            return this;
        }

        public a a(com.pandora.android.view.HeaderLayout.c c1, android.view.View.OnClickListener onclicklistener)
        {
            l = c1;
            m = onclicklistener;
            return this;
        }

        public a a(com.pandora.android.view.HeaderLayout.c c1, com.pandora.android.util.SearchBox.a a1, TextWatcher textwatcher)
        {
            l = c1;
            n = a1;
            o = textwatcher;
            return this;
        }

        public a a(com.pandora.android.view.HeaderLayout.d d1)
        {
            a = d1;
            return this;
        }

        public a a(CharSequence charsequence)
        {
            f = charsequence;
            return this;
        }

        public a a(boolean flag)
        {
            h = flag;
            return this;
        }

        public i a()
        {
            return new i(this);
        }

        public a b(int i1)
        {
            k = i1;
            return this;
        }

        public a b(com.pandora.android.view.HeaderLayout.a a1)
        {
            return a(a1, ((CharSequence) (null)));
        }

        public a b(CharSequence charsequence)
        {
            p = charsequence;
            return this;
        }

        public a b(boolean flag)
        {
            q = flag;
            return this;
        }

        public a c(boolean flag)
        {
            r = flag;
            return this;
        }

        public a d(boolean flag)
        {
            b = flag;
            return this;
        }

        public a()
        {
            b = false;
            c = com.pandora.android.view.HeaderLayout.a.a;
            d = com.pandora.android.view.HeaderLayout.a.a;
            e = com.pandora.android.view.HeaderLayout.b.a;
            f = null;
            g = null;
            h = true;
            i = true;
            j = b.a.h().getResources().getColor(0x7f0b005a);
            k = -1;
            l = com.pandora.android.view.HeaderLayout.c.a;
            m = null;
            n = null;
            o = null;
            p = null;
            q = false;
            r = false;
        }
    }


    public final boolean a;
    public final com.pandora.android.view.HeaderLayout.d b;
    public final com.pandora.android.view.HeaderLayout.a c;
    public final com.pandora.android.view.HeaderLayout.a d;
    public final com.pandora.android.view.HeaderLayout.b e;
    public final CharSequence f;
    public final CharSequence g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final com.pandora.android.view.HeaderLayout.c l;
    public final android.view.View.OnClickListener m;
    public final com.pandora.android.util.SearchBox.a n;
    public final TextWatcher o;
    public final CharSequence p;
    public final boolean q;
    public final boolean r;

    public i(a a1)
    {
        b = a.a(a1);
        if (b == null)
        {
            throw new IllegalArgumentException("HeaderConfigurationAppEvent.headerType cannot be null");
        } else
        {
            a = p.bz.a.b(a1);
            f = a.c(a1);
            c = a.d(a1);
            d = a.e(a1);
            g = a.f(a1);
            e = a.g(a1);
            h = a.h(a1);
            i = a.i(a1);
            j = a.j(a1);
            k = a.k(a1);
            l = a.l(a1);
            m = a.m(a1);
            n = a.n(a1);
            o = a.o(a1);
            p = a.p(a1);
            q = a.q(a1);
            r = a.r(a1);
            return;
        }
    }
}
