// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.app.Activity;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.e.a;
import com.fitbit.runtrack.SupportedActivity;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.savedstate.s;
import com.fitbit.serverinteraction.PublicAPI;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.runtrack.ui:
//            RecordExerciseSessionActivity, PathTrackingMapFragment

public static final class e extends AsyncTask
{

    private static final String a = "wireId";
    private final Activity b;
    private final PathTrackingMapFragment c;
    private final SupportedActivity d;
    private boolean e;

    protected transient ExerciseSession a(Void avoid[])
    {
        if (TextUtils.isEmpty(s.a()))
        {
            try
            {
                avoid = dg.d().a().D();
                if (avoid.has("wireId"))
                {
                    s.a(avoid.getString("wireId"));
                }
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                com.fitbit.e.a.f(RecordExerciseSessionActivity.g(), avoid.getMessage(), avoid, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                com.fitbit.e.a.f(RecordExerciseSessionActivity.g(), avoid.getMessage(), avoid, new Object[0]);
            }
        }
        return new ExerciseSession(d.id);
    }

    protected void a(ExerciseSession exercisesession)
    {
        super.onPostExecute(exercisesession);
        b.startActivity(com.fitbit.runtrack.ui.RecordExerciseSessionActivity.a(b, exercisesession));
        if (e)
        {
            b.finish();
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((ExerciseSession)obj);
    }

    public ion(Activity activity, PathTrackingMapFragment pathtrackingmapfragment, SupportedActivity supportedactivity)
    {
        this(activity, pathtrackingmapfragment, supportedactivity, false);
    }

    public <init>(Activity activity, PathTrackingMapFragment pathtrackingmapfragment, SupportedActivity supportedactivity, boolean flag)
    {
        d = supportedactivity;
        c = pathtrackingmapfragment;
        b = activity;
        e = flag;
    }
}
