// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.crashlytics.android.Crashlytics;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.fragments:
//            e

final class a
    implements com.android.volley._cls2
{

    final e a;

    public final void a(VolleyError volleyerror)
    {
        if (volleyerror != null && volleyerror.getMessage() != null)
        {
            Crashlytics.a(volleyerror.toString());
            v.b(volleyerror.getMessage());
        }
        e.a(a).setVisibility(8);
        e.b(a).setVisibility(0);
    }

    Error(e e1)
    {
        a = e1;
        super();
    }
}
