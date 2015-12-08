// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;

// Referenced classes of package android.support.v4.app:
//            be, az

final class bc extends android.transition.Transition.EpicenterCallback
{

    final be a;
    private Rect b;

    bc(be be1)
    {
        a = be1;
        super();
    }

    public Rect onGetEpicenter(Transition transition)
    {
        if (b == null && a.a != null)
        {
            b = az.b(a.a);
        }
        return b;
    }
}
