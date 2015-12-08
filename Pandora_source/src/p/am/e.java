// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.am;


// Referenced classes of package p.am:
//            c, d

public class e
    implements c
{
    public static class a
        implements d
    {

        public c a(boolean flag, boolean flag1)
        {
            return e.c();
        }

        public a()
        {
        }
    }


    private static final e a = new e();
    private static final d b = new a();

    public e()
    {
    }

    public static d a()
    {
        return b;
    }

    public static c b()
    {
        return a;
    }

    static e c()
    {
        return a;
    }

    public boolean a(Object obj, c.a a1)
    {
        return false;
    }

}
