// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class flx
    implements atm
{

    static final anf a;
    private final atm b;

    flx(atm atm1)
    {
        b = atm1;
    }

    public final atn a(Object obj, int i, int j, ani ani1)
    {
        obj = (gap)obj;
        mjw mjw1 = (mjw)ani1.a(a);
        obj = new mjn(((gap) (obj)).a(), mjw1, ((gap) (obj)).d());
        return b.a(obj, i, j, ani1);
    }

    public final boolean a(Object obj)
    {
        return ((gap)obj).g().f();
    }

    static 
    {
        a = anf.a("com.google.android.apps.photos.glide.impl.FifeUrlOptions", fln.a);
    }
}
