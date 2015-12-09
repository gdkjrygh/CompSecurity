// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import android.content.Intent;
import com.pandora.radio.data.af;

public interface e
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/cx/e$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("INITIALIZING", 0);
            b = new a("SIGNED_IN", 1);
            c = new a("SIGNING_OUT", 2);
            d = new a("SIGNED_OUT", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract af a();

    public abstract void a(Intent intent);

    public abstract void a(String s, String s1);

    public abstract void a(String s, String s1, int i, String s2, boolean flag, String s3, boolean flag1);

    public abstract void a(boolean flag);
}
