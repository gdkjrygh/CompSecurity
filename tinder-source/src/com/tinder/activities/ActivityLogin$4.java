// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.content.DialogInterface;
import com.tinder.managers.f;
import java.util.List;

// Referenced classes of package com.tinder.activities:
//            ActivityLogin

final class a
    implements android.content.OnDismissListener
{

    final List a;
    final ActivityLogin b;

    public final void onDismiss(DialogInterface dialoginterface)
    {
        b.c.a(b, (String[])a.toArray(new String[a.size()]));
    }

    issListener(ActivityLogin activitylogin, List list)
    {
        b = activitylogin;
        a = list;
        super();
    }
}
