// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fxg
    implements fxe
{

    private final Object b;
    private final fxf c;

    private fxg(Object obj, fxf fxf1)
    {
        b = ctz.a(obj);
        c = (fxf)ctz.a(fxf1);
    }

    public static fxe a(Object obj, fxf fxf1)
    {
        return new fxg(obj, fxf1);
    }

    public final void a(com.spotify.mobile.android.util.ClientEvent.Event event)
    {
        c.a(event, b);
    }
}
