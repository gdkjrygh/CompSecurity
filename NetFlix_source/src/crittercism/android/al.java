// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


// Referenced classes of package crittercism.android:
//            aj, ak

public final class al
{
    public static final class a extends aj
    {

        private String a;

        public final String a()
        {
            return (new StringBuilder("http://www.amazon.com/gp/mas/dl/android?p=")).append(a).toString();
        }

        private a(String s)
        {
            a = s;
        }

        a(String s, byte byte0)
        {
            this(s);
        }
    }

    public static final class a.a
        implements ak
    {

        public final aj a(String s)
        {
            if (s == null)
            {
                throw new NullPointerException("packageName cannot be null");
            } else
            {
                return new a(s, (byte)0);
            }
        }

        public a.a()
        {
        }
    }

    public static final class b extends aj
    {

        private String a;

        public final String a()
        {
            return (new StringBuilder("market://details?id=")).append(a).toString();
        }

        private b(String s)
        {
            a = s;
        }

        b(String s, byte byte0)
        {
            this(s);
        }
    }

    public static final class b.a
        implements ak
    {

        public final aj a(String s)
        {
            if (s == null)
            {
                throw new NullPointerException("packageName cannot be null");
            } else
            {
                return new b(s, (byte)0);
            }
        }

        public b.a()
        {
        }
    }

}
