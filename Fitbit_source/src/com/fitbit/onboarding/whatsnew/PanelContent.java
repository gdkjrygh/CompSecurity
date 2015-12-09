// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.whatsnew;

import android.os.Parcel;
import android.os.Parcelable;

public class PanelContent
    implements Parcelable
{
    public static final class PanelTheme extends Enum
    {

        public static final PanelTheme a;
        public static final PanelTheme b;
        private static final PanelTheme c[];
        private int theme;

        public static PanelTheme valueOf(String s)
        {
            return (PanelTheme)Enum.valueOf(com/fitbit/onboarding/whatsnew/PanelContent$PanelTheme, s);
        }

        public static PanelTheme[] values()
        {
            return (PanelTheme[])c.clone();
        }

        public int a()
        {
            return theme;
        }

        static 
        {
            a = new PanelTheme("DARK_THEME", 0, 0x7f0c01e6);
            b = new PanelTheme("LIGHT_THEME", 1, 0x7f0c01e5);
            c = (new PanelTheme[] {
                a, b
            });
        }

        private PanelTheme(String s, int k, int l)
        {
            super(s, k);
            theme = l;
        }
    }

    public static class a
    {

        private int a;
        private String b;
        private String c;
        private String d;
        private android.view.View.OnClickListener e;
        private boolean f;
        private boolean g;
        private int h;
        private int i;
        private int j;

        static int a(a a1)
        {
            return a1.a;
        }

        static String b(a a1)
        {
            return a1.b;
        }

        static String c(a a1)
        {
            return a1.c;
        }

        static String d(a a1)
        {
            return a1.d;
        }

        static boolean e(a a1)
        {
            return a1.f;
        }

        static boolean f(a a1)
        {
            return a1.g;
        }

        static int g(a a1)
        {
            return a1.h;
        }

        static int h(a a1)
        {
            return a1.i;
        }

        static int i(a a1)
        {
            return a1.j;
        }

        public a a(int k)
        {
            a = k;
            return this;
        }

        public a a(android.view.View.OnClickListener onclicklistener)
        {
            e = onclicklistener;
            return this;
        }

        public a a(PanelTheme paneltheme)
        {
            j = paneltheme.a();
            return this;
        }

        public a a(String s)
        {
            b = s;
            return this;
        }

        public a a(boolean flag)
        {
            f = flag;
            return this;
        }

        public PanelContent a()
        {
            return new PanelContent(this);
        }

        public a b(int k)
        {
            h = k;
            return this;
        }

        public a b(String s)
        {
            b = s;
            return this;
        }

        public a b(boolean flag)
        {
            g = flag;
            return this;
        }

        public a c(int k)
        {
            i = k;
            return this;
        }

        public a c(String s)
        {
            d = s;
            return this;
        }

        public a()
        {
            h = -1;
            i = -1;
        }

        public a(int k, String s, String s1)
        {
            h = -1;
            i = -1;
            a = k;
            b = s;
            c = s1;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public PanelContent a(Parcel parcel)
        {
            return new PanelContent(parcel);
        }

        public PanelContent[] a(int k)
        {
            return new PanelContent[k];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int k)
        {
            return a(k);
        }

    };
    private int a;
    private String b;
    private String c;
    private String d;
    private android.view.View.OnClickListener e;
    private boolean f;
    private boolean g;
    private int h;
    private int i;
    private int j;

    private PanelContent(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        f = false;
        g = false;
        h = -1;
        i = -1;
        j = -1;
        a = parcel.readInt();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        boolean flag;
        if (parcel.readInt() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        if (parcel.readInt() > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        g = flag;
        h = parcel.readInt();
        i = parcel.readInt();
        j = parcel.readInt();
    }


    private PanelContent(a a1)
    {
        f = false;
        g = false;
        h = -1;
        i = -1;
        j = -1;
        a = a.a(a1);
        b = a.b(a1);
        c = a.c(a1);
        d = a.d(a1);
        f = a.e(a1);
        g = a.f(a1);
        h = a.g(a1);
        i = a.h(a1);
        j = a.i(a1);
    }


    public int a()
    {
        return j;
    }

    public void a(android.view.View.OnClickListener onclicklistener)
    {
        e = onclicklistener;
    }

    public int b()
    {
        return a;
    }

    public int c()
    {
        return h;
    }

    public int d()
    {
        return i;
    }

    public int describeContents()
    {
        return 0;
    }

    public android.view.View.OnClickListener e()
    {
        return e;
    }

    public String f()
    {
        return b;
    }

    public String g()
    {
        return c;
    }

    public String h()
    {
        return d;
    }

    public boolean i()
    {
        return f;
    }

    public boolean j()
    {
        return g;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        boolean flag = true;
        parcel.writeInt(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        if (f)
        {
            k = 1;
        } else
        {
            k = -1;
        }
        parcel.writeInt(k);
        if (g)
        {
            k = ((flag) ? 1 : 0);
        } else
        {
            k = -1;
        }
        parcel.writeInt(k);
        parcel.writeInt(h);
        parcel.writeInt(i);
        parcel.writeInt(j);
    }

}
