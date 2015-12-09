// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.video;

import android.util.Range;
import java.util.Comparator;

// Referenced classes of package com.google.android.gms.games.ui.video:
//            CameraPreviewController

static final class 
    implements Comparator
{

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (Range)obj;
        obj1 = (Range)obj1;
        return Integer.compare(((Integer)((Range) (obj)).getLower()).intValue(), ((Integer)((Range) (obj1)).getLower()).intValue());
    }

    ()
    {
    }
}
