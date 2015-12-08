// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import com.roidapp.photogrid.common.az;

// Referenced classes of package com.roidapp.photogrid.release:
//            rf, BackgroundImageCrop

final class aj
    implements Runnable
{

    final BackgroundImageCrop a;

    aj(BackgroundImageCrop backgroundimagecrop)
    {
        a = backgroundimagecrop;
        super();
    }

    public final void run()
    {
        rf.a();
        android.graphics.Bitmap bitmap = rf.a(BackgroundImageCrop.b(a), 90);
        int i = az.G + 90;
        az.G = i;
        az.G = i % 360;
        BackgroundImageCrop.g(a).obtainMessage(1, bitmap).sendToTarget();
    }
}
