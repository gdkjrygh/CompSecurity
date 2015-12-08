// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aak extends yw
{

    private final Object a;

    public aak(aaj aaj, Object obj)
    {
        a = obj;
    }

    public final void b(int i)
    {
        ((android.media.MediaRouter.RouteInfo)a).requestSetVolume(i);
    }

    public final void c(int i)
    {
        ((android.media.MediaRouter.RouteInfo)a).requestUpdateVolume(i);
    }
}
