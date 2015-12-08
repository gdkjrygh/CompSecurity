// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class afx
{
    public static final class a extends Enum
        implements afq
    {

        public static final a a;
        private static final a b[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(afx$a, s);
        }

        public static a[] values()
        {
            return (a[])b.clone();
        }

        public final void a(Object obj)
        {
            if (obj == null)
            {
                throw new NullPointerException();
            } else
            {
                return;
            }
        }

        static 
        {
            a = new a("INSTANCE");
            b = (new a[] {
                a
            });
        }

        private a(String s)
        {
            super(s, 0);
        }
    }

}
