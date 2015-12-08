// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.os.AsyncTask;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.ActivityItem;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.e.a;
import com.fitbit.runtrack.SupportedActivity;
import com.fitbit.runtrack.data.ExerciseSession;

// Referenced classes of package com.fitbit.runtrack.ui:
//            RecordExerciseSessionActivity

private static final class c extends AsyncTask
{

    private static final String a = "RECORD ACTIVITY";
    private final a b;
    private final ExerciseSession c;

    protected transient Void a(ActivityLogEntry aactivitylogentry[])
    {
        ActivityLogEntry activitylogentry = aactivitylogentry[0];
        SupportedActivity supportedactivity = SupportedActivity.a(c);
        try
        {
            aactivitylogentry = supportedactivity.a();
        }
        // Misplaced declaration of an exception variable
        catch (ActivityLogEntry aactivitylogentry[])
        {
            com.fitbit.e.a.e("RECORD ACTIVITY", String.format("Have no local data for %s, assuming defaults until next sync", new Object[] {
                supportedactivity.name()
            }), aactivitylogentry, new Object[0]);
            aactivitylogentry = new ActivityItem();
            aactivitylogentry.a(supportedactivity.name);
            aactivitylogentry.a(true);
            aactivitylogentry.setServerId(supportedactivity.id);
            aactivitylogentry.b(false);
            aactivitylogentry.a(1.0D);
            aactivitylogentry = ActivityBusinessLogic.a().a(aactivitylogentry);
        }
        activitylogentry.a(aactivitylogentry);
        if (aactivitylogentry == null)
        {
            aactivitylogentry = "";
        } else
        {
            aactivitylogentry = aactivitylogentry.a();
        }
        activitylogentry.c(aactivitylogentry);
        ActivityBusinessLogic.a().a(activitylogentry, FitBitApplication.a());
        return null;
    }

    protected void a(Void void1)
    {
        b.a();
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((ActivityLogEntry[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    public ion(ion ion, ExerciseSession exercisesession)
    {
        b = ion;
        c = exercisesession;
    }
}
