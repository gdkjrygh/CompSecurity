// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.view.View;
import com.tinder.managers.f;

// Referenced classes of package com.tinder.fragments:
//            FragmentJob

final class a
    implements android.view.stener
{

    final FragmentJob a;

    public final void onClick(View view)
    {
        view = a;
        ((FragmentJob) (view)).h.a(view, new String[] {
            "user_work_history"
        });
    }

    (FragmentJob fragmentjob)
    {
        a = fragmentjob;
        super();
    }
}
