// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.developer;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.experiment.Experiments;

// Referenced classes of package com.pinterest.developer:
//            DeveloperExperimentView

class b
    implements android.widget.Listener
{

    final String a[];
    final String b;
    final DeveloperExperimentView c;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (a[i] == "no_group")
        {
            adapterview = null;
        } else
        {
            adapterview = a[i];
        }
        Experiments.b(b, adapterview);
        Experiments.a(b, adapterview);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    (DeveloperExperimentView developerexperimentview, String as[], String s)
    {
        c = developerexperimentview;
        a = as;
        b = s;
        super();
    }
}
