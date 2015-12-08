// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class zq extends android.media.MediaRouter.VolumeCallback
{

    private zp a;

    public zq(zp zp1)
    {
        a = zp1;
    }

    public final void onVolumeSetRequest(android.media.MediaRouter.RouteInfo routeinfo, int i)
    {
        a.a(routeinfo, i);
    }

    public final void onVolumeUpdateRequest(android.media.MediaRouter.RouteInfo routeinfo, int i)
    {
        a.b(routeinfo, i);
    }
}
