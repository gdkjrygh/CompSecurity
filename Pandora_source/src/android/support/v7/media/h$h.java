// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;


// Referenced classes of package android.support.v7.media:
//            h

static class a extends android.media.aRouter.VolumeCallback
{

    protected final b a;

    public void onVolumeSetRequest(android.media.aRouter.RouteInfo routeinfo, int i)
    {
        a.a(routeinfo, i);
    }

    public void onVolumeUpdateRequest(android.media.aRouter.RouteInfo routeinfo, int i)
    {
        a.b(routeinfo, i);
    }

    public teInfo(teInfo teinfo)
    {
        a = teinfo;
    }
}
