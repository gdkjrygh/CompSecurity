// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration.experiments;

import rx.b.b;

// Referenced classes of package com.soundcloud.android.configuration.experiments:
//            Assignment, ExperimentOperations

class this._cls0
    implements b
{

    final ExperimentOperations this$0;

    public void call(Assignment assignment)
    {
        (new StringBuilder("Loaded current experiment config\n")).append(assignment.toString());
        ExperimentOperations.access$002(ExperimentOperations.this, assignment);
    }

    public volatile void call(Object obj)
    {
        call((Assignment)obj);
    }

    ()
    {
        this$0 = ExperimentOperations.this;
        super();
    }
}
