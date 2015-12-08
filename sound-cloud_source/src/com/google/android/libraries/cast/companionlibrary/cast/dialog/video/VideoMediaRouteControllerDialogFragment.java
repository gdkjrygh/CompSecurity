// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.dialog.video;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.MediaRouteControllerDialog;
import android.support.v7.app.MediaRouteControllerDialogFragment;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.dialog.video:
//            VideoMediaRouteControllerDialog

public class VideoMediaRouteControllerDialogFragment extends MediaRouteControllerDialogFragment
{

    public VideoMediaRouteControllerDialogFragment()
    {
    }

    public volatile MediaRouteControllerDialog onCreateControllerDialog(Context context, Bundle bundle)
    {
        return onCreateControllerDialog(context, bundle);
    }

    public VideoMediaRouteControllerDialog onCreateControllerDialog(Context context, Bundle bundle)
    {
        context = new VideoMediaRouteControllerDialog(context);
        context.setVolumeControlEnabled(false);
        return context;
    }
}
