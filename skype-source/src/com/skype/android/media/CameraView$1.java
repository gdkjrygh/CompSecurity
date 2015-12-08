// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.content.Context;
import android.view.OrientationEventListener;

// Referenced classes of package com.skype.android.media:
//            CameraView

final class  extends OrientationEventListener
{

    final CameraView a;

    public final void onOrientationChanged(int i)
    {
        CameraView.access$000(a);
    }

    (CameraView cameraview, Context context)
    {
        a = cameraview;
        super(context, 2);
    }
}
