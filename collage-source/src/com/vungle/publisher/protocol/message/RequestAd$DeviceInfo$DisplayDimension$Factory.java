// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol.message;

import android.util.DisplayMetrics;
import com.vungle.publisher.bt;

// Referenced classes of package com.vungle.publisher.protocol.message:
//            MessageFactory

public static class Y extends MessageFactory
{

    protected bt a;

    protected final Object a()
    {
        return new Y();
    }

    protected final volatile Object[] a(int i)
    {
        return new Y[i];
    }

    protected final Y b()
    {
        Y y = null;
        DisplayMetrics displaymetrics = a.h();
        if (displaymetrics.heightPixels > 0 || displaymetrics.widthPixels > 0)
        {
            y = new a();
            y.a = Integer.valueOf(displaymetrics.heightPixels);
            y.a = Integer.valueOf(displaymetrics.widthPixels);
        }
        return y;
    }

    protected Y()
    {
    }
}
