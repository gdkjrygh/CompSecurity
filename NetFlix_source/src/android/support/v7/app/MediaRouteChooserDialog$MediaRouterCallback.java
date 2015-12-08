// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.media.MediaRouter;

// Referenced classes of package android.support.v7.app:
//            MediaRouteChooserDialog

private final class <init> extends android.support.v7.media.nit>
{

    final MediaRouteChooserDialog this$0;

    public void onRouteAdded(MediaRouter mediarouter, android.support.v7.media.nit> nit>)
    {
        refreshRoutes();
    }

    public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.nit> nit>)
    {
        refreshRoutes();
    }

    public void onRouteRemoved(MediaRouter mediarouter, android.support.v7.media.nit> nit>)
    {
        refreshRoutes();
    }

    public void onRouteSelected(MediaRouter mediarouter, android.support.v7.media.nit> nit>)
    {
        dismiss();
    }

    private ()
    {
        this$0 = MediaRouteChooserDialog.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
