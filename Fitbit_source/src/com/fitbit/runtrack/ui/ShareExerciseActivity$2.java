// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.os.Bundle;
import android.support.v4.content.Loader;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.runtrack.a;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ShareExerciseActivity, ExerciseStatsView

class a
    implements android.support.v4.app.backs
{

    final ShareExerciseActivity a;

    public void a(Loader loader, ActivityLogEntry activitylogentry)
    {
        com.fitbit.runtrack.ui.ShareExerciseActivity.a(a, activitylogentry);
        ShareExerciseActivity.c(a).a(activitylogentry);
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new a(a, ShareExerciseActivity.b(a));
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (ActivityLogEntry)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    backs(ShareExerciseActivity shareexerciseactivity)
    {
        a = shareexerciseactivity;
        super();
    }
}
