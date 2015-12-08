// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.ao;
import com.crashlytics.android.internal.at;
import com.crashlytics.android.internal.aw;

// Referenced classes of package com.crashlytics.android:
//            d

final class as
    implements at
{

    private d a;

    as(d d1)
    {
        a = d1;
        super();
    }

    public final Object a(aw aw1)
    {
        boolean flag = false;
        if (aw1.d.a)
        {
            aw1 = a;
            if (!d.n())
            {
                flag = true;
            }
            return Boolean.valueOf(flag);
        } else
        {
            return Boolean.valueOf(false);
        }
    }
}
