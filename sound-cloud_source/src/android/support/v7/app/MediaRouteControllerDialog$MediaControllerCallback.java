// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;

// Referenced classes of package android.support.v7.app:
//            MediaRouteControllerDialog

private final class <init> extends android.support.v4.media.session._cls1_01_
{

    final MediaRouteControllerDialog this$0;

    public final void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
    {
        MediaRouteControllerDialog mediaroutecontrollerdialog = MediaRouteControllerDialog.this;
        if (mediametadatacompat == null)
        {
            mediametadatacompat = null;
        } else
        {
            mediametadatacompat = mediametadatacompat.getDescription();
        }
        MediaRouteControllerDialog.access$1102(mediaroutecontrollerdialog, mediametadatacompat);
        boolean _tmp = MediaRouteControllerDialog.access$700(MediaRouteControllerDialog.this);
    }

    public final void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
    {
        MediaRouteControllerDialog.access$1002(MediaRouteControllerDialog.this, playbackstatecompat);
        boolean _tmp = MediaRouteControllerDialog.access$700(MediaRouteControllerDialog.this);
    }

    public final void onSessionDestroyed()
    {
        if (MediaRouteControllerDialog.access$800(MediaRouteControllerDialog.this) != null)
        {
            MediaRouteControllerDialog.access$800(MediaRouteControllerDialog.this).unregisterCallback(MediaRouteControllerDialog.access$900(MediaRouteControllerDialog.this));
            MediaRouteControllerDialog.access$802(MediaRouteControllerDialog.this, null);
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
