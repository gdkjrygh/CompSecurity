// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bx;

import android.app.Activity;
import twitter4j.Twitter;

public interface e
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/bx/e$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("SUCCESS", 0);
            b = new a("FAILURE", 1);
            c = new a("DISCONNECT", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface b
    {

        public abstract void a();

        public abstract void b();

        public abstract void c();
    }


    public abstract void a(Activity activity, b b1);

    public abstract void a(String s);

    public abstract void a(a a1);

    public abstract boolean a();

    public abstract boolean a(b b1);

    public abstract void b();

    public abstract boolean b(b b1);

    public abstract boolean c();

    public abstract Twitter d();
}
