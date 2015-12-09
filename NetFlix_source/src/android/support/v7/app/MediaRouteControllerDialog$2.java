// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.media.MediaRouter;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            MediaRouteControllerDialog

class this._cls0
    implements android.view.rDialog._cls2
{

    final MediaRouteControllerDialog this$0;

    public void onClick(View view)
    {
        if (MediaRouteControllerDialog.access$400(MediaRouteControllerDialog.this).ted())
        {
            MediaRouteControllerDialog.access$500(MediaRouteControllerDialog.this).getDefaultRoute()._mth0();
        }
        dismiss();
    }

    _cls9()
    {
        this$0 = MediaRouteControllerDialog.this;
        super();
    }
}
