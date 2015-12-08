// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class fve
{

    public final Context a;

    private fve(Context context)
    {
        a = context;
    }

    public static fve a(Context context)
    {
        return new fve(context);
    }

    public final fvy a(doc doc1)
    {
        fvx fvx1 = fvt.a(a);
        fvx1.a.a = fxr.a(doc1.a(), doc1.b(), doc1);
        return new fvy(fvx1.a, (byte)0);
    }

    public final fxd a(String s, String s1)
    {
        Object obj = a;
        fwv fwv1 = new fwv();
        fwv1.a = ((Context) (obj));
        obj = new fxc(fwv1, (byte)0);
        ((fxc) (obj)).a.b = fxr.a(s, s1);
        return new fxd(((fxc) (obj)).a, (byte)0);
    }

    public final fuu b(String s, String s1)
    {
        return (new fum(a)).a(s, s1);
    }

    public final fvc c(String s, String s1)
    {
        return (new fuw(a)).a(s, s1);
    }

    public final fvy d(String s, String s1)
    {
        fvx fvx1 = fvt.a(a);
        fvx1.a.a = fxr.a(s, s1);
        return new fvy(fvx1.a, (byte)0);
    }

    public final fvq e(String s, String s1)
    {
        return (new fvg(a)).a(s, s1);
    }

    public final fwo f(String s, String s1)
    {
        return (new fwi(a)).a(s, s1);
    }
}
