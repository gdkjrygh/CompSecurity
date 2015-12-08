// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.media.MediaRouter;

// Referenced classes of package android.support.v7.app:
//            MediaRouteControllerDialog

private final class <init> extends android.support.v7.media.nit>
{

    final MediaRouteControllerDialog this$0;

    public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.nit> nit>)
    {
        boolean _tmp = MediaRouteControllerDialog.access$600(MediaRouteControllerDialog.this);
    }

    public void onRouteUnselected(MediaRouter mediarouter, android.support.v7.media.is._cls0 _pcls0)
    {
        boolean _tmp = MediaRouteControllerDialog.access$600(MediaRouteControllerDialog.this);
    }

    public void onRouteVolumeChanged(MediaRouter mediarouter, android.support.v7.media.is._cls0 _pcls0)
    {
        if (_pcls0 == MediaRouteControllerDialog.access$400(MediaRouteControllerDialog.this))
        {
            MediaRouteControllerDialog.access$200(MediaRouteControllerDialog.this);
        }
    }

    private ()
    {
        this$0 = MediaRouteControllerDialog.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
