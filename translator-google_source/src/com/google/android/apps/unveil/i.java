// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil;

import android.content.Intent;
import com.google.android.apps.unveil.nonstop.c;
import com.google.android.apps.unveil.nonstop.d;
import com.google.android.apps.unveil.tracking.f;

// Referenced classes of package com.google.android.apps.unveil:
//            TrackingTestActivity

final class i
    implements Runnable
{

    final TrackingTestActivity a;

    i(TrackingTestActivity trackingtestactivity)
    {
        a = trackingtestactivity;
        super();
    }

    public final void run()
    {
        Intent intent = new Intent();
        intent.putExtra("performance_key", TrackingTestActivity.a(a).h());
        d d1 = ((c) (TrackingTestActivity.a(a))).b;
        float f1;
        if (d1.a <= 0)
        {
            f1 = 0.0F;
        } else
        {
            f1 = (float)d1.b / (float)d1.a;
        }
        intent.putExtra("cpu_key", f1);
        a.setResult(-1, intent);
        a.finish();
    }
}
