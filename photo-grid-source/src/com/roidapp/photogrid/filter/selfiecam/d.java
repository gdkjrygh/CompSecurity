// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.content.Intent;

// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            SelfieCamImageEditGLESActivity, SystemCameraActivity

final class d
    implements Runnable
{

    final SelfieCamImageEditGLESActivity a;

    d(SelfieCamImageEditGLESActivity selfiecamimageeditglesactivity)
    {
        a = selfiecamimageeditglesactivity;
        super();
    }

    public final void run()
    {
        SelfieCamImageEditGLESActivity.c(a);
        Intent intent = new Intent(a, com/roidapp/photogrid/filter/selfiecam/SystemCameraActivity);
        a.startActivity(intent);
        a.finish();
    }
}
