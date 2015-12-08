// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.dialog.video;

import android.support.v7.app.MediaRouteControllerDialogFragment;
import android.support.v7.app.MediaRouteDialogFactory;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.dialog.video:
//            VideoMediaRouteControllerDialogFragment

public class VideoMediaRouteDialogFactory extends MediaRouteDialogFactory
{

    public VideoMediaRouteDialogFactory()
    {
    }

    public volatile MediaRouteControllerDialogFragment onCreateControllerDialogFragment()
    {
        return onCreateControllerDialogFragment();
    }

    public VideoMediaRouteControllerDialogFragment onCreateControllerDialogFragment()
    {
        return new VideoMediaRouteControllerDialogFragment();
    }
}
