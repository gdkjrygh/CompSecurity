// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.view.View;
import com.tinder.adapters.f;
import com.tinder.model.Job;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.tinder.fragments:
//            FragmentJob

final class a
    implements android.view.stener
{

    final FragmentJob a;

    public final void onClick(View view)
    {
        for (view = FragmentJob.b(a).iterator(); view.hasNext();)
        {
            Job job = (Job)view.next();
            job.titleShown = false;
            job.companyShown = false;
        }

        FragmentJob.a(a, null);
        FragmentJob.c(a);
        a.a(true);
        FragmentJob.d(a).notifyDataSetChanged();
    }

    (FragmentJob fragmentjob)
    {
        a = fragmentjob;
        super();
    }
}
