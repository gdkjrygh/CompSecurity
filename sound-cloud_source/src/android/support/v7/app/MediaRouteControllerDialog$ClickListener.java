// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.IntentSender;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v7.media.MediaRouter;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            MediaRouteControllerDialog

private final class <init>
    implements android.view.kListener
{

    final MediaRouteControllerDialog this$0;

    public final void onClick(View view)
    {
        int i = view.getId();
        if (i != android.support.v7.mediarouter. && i != android.support.v7.mediarouter.) goto _L2; else goto _L1
_L1:
        if (MediaRouteControllerDialog.access$600(MediaRouteControllerDialog.this)._mth0())
        {
            view = MediaRouteControllerDialog.access$1200(MediaRouteControllerDialog.this);
            if (i == android.support.v7.mediarouter.)
            {
                i = 2;
            } else
            {
                i = 1;
            }
            view.unselect(i);
        }
        dismiss();
_L4:
        return;
_L2:
        if (i != android.support.v7.mediarouter.)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (MediaRouteControllerDialog.access$800(MediaRouteControllerDialog.this) != null && MediaRouteControllerDialog.access$1000(MediaRouteControllerDialog.this) != null)
        {
            if (MediaRouteControllerDialog.access$1000(MediaRouteControllerDialog.this).getState() == 3)
            {
                MediaRouteControllerDialog.access$800(MediaRouteControllerDialog.this).getTransportControls().ause();
                return;
            } else
            {
                MediaRouteControllerDialog.access$800(MediaRouteControllerDialog.this).getTransportControls().lay();
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (i != android.support.v7.mediarouter..play) goto _L4; else goto _L3
_L3:
        view = MediaRouteControllerDialog.access$600(MediaRouteControllerDialog.this)._mth0();
        if (view != null)
        {
            try
            {
                view.sendIntent(null, 0, null, null, null);
                dismiss();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                return;
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private Controls()
    {
        this$0 = MediaRouteControllerDialog.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
