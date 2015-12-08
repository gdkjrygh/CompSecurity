// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.app.Activity;
import android.view.View;
import com.google.android.libraries.translate.e.a;

// Referenced classes of package com.google.android.apps.translate.pref:
//            v

final class w
    implements android.view.View.OnClickListener
{

    final Activity a;
    final v b;

    w(v v, Activity activity)
    {
        b = v;
        a = activity;
        super();
    }

    public final void onClick(View view)
    {
        com.google.android.libraries.translate.e.a.a(a, null);
    }
}
