// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe;

import com.facebook.abtest.qe.annotations.ForQuickExperiment;
import com.facebook.abtest.qe.annotations.IsFullExperimentSyncEnabled;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.prefs.provider.LibraryPreferencesList;
import com.facebook.prefs.provider.a;

// Referenced classes of package com.facebook.abtest.qe:
//            n

public class l extends c
{

    public l()
    {
    }

    protected void a()
    {
        b(java/lang/Boolean, com/facebook/abtest/qe/annotations/IsFullExperimentSyncEnabled);
        a(com/facebook/prefs/provider/a, com/facebook/prefs/provider/LibraryPreferencesList).a(com/facebook/prefs/provider/a, com/facebook/abtest/qe/annotations/ForQuickExperiment);
        a(com/facebook/prefs/provider/a).a(com/facebook/abtest/qe/annotations/ForQuickExperiment).a(new n(this, null));
    }
}
