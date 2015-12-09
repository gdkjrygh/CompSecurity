// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack;

import android.os.Looper;
import android.text.TextUtils;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.ActivityItem;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.runtrack.data.ExerciseSession;
import java.util.ArrayList;
import java.util.List;

public final class SupportedActivity extends Enum
{

    public static final SupportedActivity a;
    public static final SupportedActivity b;
    public static final SupportedActivity c;
    public static final SupportedActivity d;
    private static final SupportedActivity e[];
    public final int id;
    public final boolean isRecordable;
    ActivityItem item;
    public final String name;
    public final com.fitbit.savedstate.MobileRunSavedState.TrackType type;

    private SupportedActivity(String s, int i, int j, com.fitbit.savedstate.MobileRunSavedState.TrackType tracktype, int k, boolean flag)
    {
        super(s, i);
        id = j;
        type = tracktype;
        name = FitBitApplication.a().getString(k);
        isRecordable = flag;
    }

    public static SupportedActivity a(long l)
    {
        SupportedActivity asupportedactivity[] = values();
        int j = asupportedactivity.length;
        for (int i = 0; i < j; i++)
        {
            SupportedActivity supportedactivity = asupportedactivity[i];
            if ((long)supportedactivity.id == l)
            {
                return supportedactivity;
            }
        }

        return null;
    }

    public static SupportedActivity a(ExerciseSession exercisesession)
    {
        SupportedActivity supportedactivity = a(exercisesession.h());
        exercisesession = supportedactivity;
        if (supportedactivity == null)
        {
            exercisesession = a;
        }
        return exercisesession;
    }

    public static SupportedActivity a(com.fitbit.savedstate.MobileRunSavedState.TrackType tracktype)
    {
        SupportedActivity supportedactivity = a;
        SupportedActivity asupportedactivity[] = values();
        int j = asupportedactivity.length;
        for (int i = 0; i < j; i++)
        {
            SupportedActivity supportedactivity1 = asupportedactivity[i];
            if (TextUtils.equals(supportedactivity1.name(), tracktype.name()))
            {
                return supportedactivity1;
            }
        }

        return supportedactivity;
    }

    public static List b()
    {
        ArrayList arraylist = new ArrayList();
        SupportedActivity asupportedactivity[] = values();
        int j = asupportedactivity.length;
        for (int i = 0; i < j; i++)
        {
            SupportedActivity supportedactivity = asupportedactivity[i];
            if (supportedactivity.isRecordable)
            {
                arraylist.add(supportedactivity);
            }
        }

        return arraylist;
    }

    public static SupportedActivity valueOf(String s)
    {
        return (SupportedActivity)Enum.valueOf(com/fitbit/runtrack/SupportedActivity, s);
    }

    public static SupportedActivity[] values()
    {
        return (SupportedActivity[])e.clone();
    }

    public ActivityItem a()
        throws ServerCommunicationException
    {
        if (item != null)
        {
            return item;
        }
        item = ActivityBusinessLogic.a().a(id);
        if (item != null)
        {
            return item;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread())
        {
            return null;
        } else
        {
            item = dg.d().b(id, new com.fitbit.data.bl.h.a() {

                final SupportedActivity a;

                public boolean a()
                {
                    return false;
                }

            
            {
                a = SupportedActivity.this;
                super();
            }
            });
            return item;
        }
    }

    public Length a(Profile profile)
    {
        if (a == this)
        {
            return profile.e();
        } else
        {
            return profile.f();
        }
    }

    static 
    {
        a = new SupportedActivity("Run", 0, 0x15f99, com.fitbit.savedstate.MobileRunSavedState.TrackType.a, 0x7f080491, true);
        b = new SupportedActivity("Walk", 1, 0x15f9d, com.fitbit.savedstate.MobileRunSavedState.TrackType.b, 0x7f08057c, true);
        c = new SupportedActivity("Hike", 2, 0x15f9c, com.fitbit.savedstate.MobileRunSavedState.TrackType.c, 0x7f080259, true);
        d = new SupportedActivity("Bike", 3, 0x15f91, com.fitbit.savedstate.MobileRunSavedState.TrackType.d, 0x7f08008b, false);
        e = (new SupportedActivity[] {
            a, b, c, d
        });
    }
}
