// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.graphics.Rect;
import java.util.Comparator;

// Referenced classes of package com.netflix.mediaclient.util:
//            ViewUtils

static final class 
    implements Comparator
{

    public int compare( ,  1)
    {
        byte byte0 = 1;
         = ViewUtils.getRect(.tView(), true);
        1 = ViewUtils.getRect(1.tView(), true);
        if (((Rect) ()).bottom < ((Rect) (1)).bottom)
        {
            byte0 = -1;
        } else
        if (((Rect) ()).bottom <= ((Rect) (1)).bottom)
        {
            return 0;
        }
        return byte0;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((compare)obj, (compare)obj1);
    }

    ()
    {
    }
}
