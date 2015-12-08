// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.view.View;

// Referenced classes of package com.skype.android.media:
//            LoopbackActivity, CamcorderView

final class a
    implements android.view.r
{

    final LoopbackActivity a;

    public final void onClick(View view)
    {
        int i = 1;
        view = LoopbackActivity.a(a);
        if (LoopbackActivity.a(a).getCameraFacing() == 1)
        {
            i = 0;
        }
        view.setCameraFacing(i);
    }

    (LoopbackActivity loopbackactivity)
    {
        a = loopbackactivity;
        super();
    }
}
