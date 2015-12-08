// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.view.View;
import android.widget.AdapterView;
import com.tinder.adapters.f;
import com.tinder.model.Job;
import java.util.List;

// Referenced classes of package com.tinder.fragments:
//            FragmentJob

final class a
    implements android.widget.ItemClickListener
{

    final FragmentJob a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (i < FragmentJob.b(a).size())
        {
            int j = 0;
            while (j < FragmentJob.b(a).size()) 
            {
                adapterview = (Job)FragmentJob.b(a).get(j);
                if (j == i)
                {
                    adapterview.companyShown = adapterview.hasCompany();
                    adapterview.titleShown = adapterview.hasTitle();
                    FragmentJob.a(a, adapterview);
                    a.a(false);
                } else
                {
                    adapterview.titleShown = false;
                    adapterview.companyShown = false;
                }
                j++;
            }
            FragmentJob.c(a);
            FragmentJob.d(a).notifyDataSetChanged();
        }
    }

    ickListener(FragmentJob fragmentjob)
    {
        a = fragmentjob;
        super();
    }
}
