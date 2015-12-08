// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;

import android.content.Context;
import android.view.OrientationEventListener;
import com.google.android.apps.unveil.env.w;

// Referenced classes of package com.google.android.apps.unveil.sensors:
//            aa

final class ab extends OrientationEventListener
{

    final aa a;

    ab(aa aa1, Context context)
    {
        a = aa1;
        super(context);
    }

    public final void onOrientationChanged(int i)
    {
        if (i != -1)
        {
            aa.a(a).c();
            aa.a(a, i);
        }
    }
}
