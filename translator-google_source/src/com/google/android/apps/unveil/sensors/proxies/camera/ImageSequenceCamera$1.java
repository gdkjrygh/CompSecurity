// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors.proxies.camera;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.google.android.apps.unveil.sensors.proxies.camera:
//            ImageSequenceCamera

class this._cls0
    implements FilenameFilter
{

    final ImageSequenceCamera this$0;

    public boolean accept(File file, String s)
    {
        return s.contains(".jpg") || s.contains(".png");
    }

    Q()
    {
        this$0 = ImageSequenceCamera.this;
        super();
    }
}
