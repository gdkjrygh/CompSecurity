// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.video;

import android.util.Size;
import java.util.Comparator;

// Referenced classes of package com.google.android.gms.games.ui.video:
//            CameraPreviewController

private static final class <init>
    implements Comparator
{

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (Size)obj;
        obj1 = (Size)obj1;
        return Long.signum((long)((Size) (obj)).getWidth() * (long)((Size) (obj)).getHeight() - (long)((Size) (obj1)).getWidth() * (long)((Size) (obj1)).getHeight());
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
