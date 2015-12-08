// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.app.Activity;

// Referenced classes of package org.chromium.base:
//            ApplicationStatus

static final class ion.a
    implements ion.a
{

    public final void a(Activity activity, boolean flag)
    {
        int i;
        if (flag && activity != ApplicationStatus.d())
        {
            if ((i = ApplicationStatus.a(activity)) != 6 && i != 5)
            {
                ApplicationStatus.b(activity);
                return;
            }
        }
    }

    ion.a()
    {
    }
}
