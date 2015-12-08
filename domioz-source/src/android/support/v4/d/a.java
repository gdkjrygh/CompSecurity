// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.d;


// Referenced classes of package android.support.v4.d:
//            d, c, b

public final class a
{

    private static final b a;

    public static String a(String s)
    {
        return a.a(s);
    }

    public static String b(String s)
    {
        return a.b(s);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new d();
        } else
        {
            a = new c();
        }
    }
}
