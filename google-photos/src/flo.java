// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class flo
    implements atm
{

    private final atm a;

    flo(atm atm1)
    {
        a = atm1;
    }

    public final atn a(Object obj, int i, int j, ani ani)
    {
        obj = (gap)obj;
        android.net.Uri uri = ((gap) (obj)).b();
        return new atn(new flr(uri, ((gap) (obj)).c()), a.a(uri, i, j, ani).c);
    }

    public final boolean a(Object obj)
    {
        obj = (gap)obj;
        return ((gap) (obj)).g().e() && a.a(((gap) (obj)).b());
    }
}
