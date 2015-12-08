// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jey
    implements ds
{

    private jev a;

    jey(jev jev1)
    {
        a = jev1;
        super();
    }

    public final void b_(Object obj)
    {
        jev.c(a);
        if (jev.d(a) == null || !jev.d(a).equals(jev.e(a).b.b(jdy)))
        {
            jev.f(a);
            jev.a(a, "onObservableChange<PhotoModel>");
            jev.g(a);
        }
    }
}
