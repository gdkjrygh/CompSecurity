// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.q;
import com.fitbit.e.a;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.b;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.fitbit.runtrack:
//            ExerciseLocationService, c

public class g
    implements Callable
{

    private final String a;
    private final b b;
    private final Location c;
    private final c d;

    private g(ExerciseSession exercisesession, b b1, Location location, c c1)
    {
        a = "RecordExerciseEvent";
        b = b1;
        c = location;
        d = c1;
    }

    public g(b b1, Location location, c c1)
    {
        this(null, b1, location, c1);
    }

    public Intent a()
    {
        Object obj = null;
        Object obj1 = b.a(com.fitbit.runtrack.data.ExerciseSession.Status.b);
        if (((List) (obj1)).isEmpty())
        {
            com.fitbit.e.a.e("RecordExerciseEvent", "Notified of a new Location Update when there are no exercises, shutting down GPS, may have a crash", new Object[0]);
            obj = FitBitApplication.a();
            obj1 = com.fitbit.runtrack.ExerciseLocationService.b(((Context) (obj)));
            ((Context) (obj)).startService(((Intent) (obj1)));
            return ((Intent) (obj1));
        }
        ExerciseSession exercisesession = (ExerciseSession)((List) (obj1)).get(((List) (obj1)).size() - 1);
        List list;
        if (c != null)
        {
            obj1 = b.b(exercisesession, c);
            obj = b.g(exercisesession);
        } else
        {
            obj1 = null;
        }
        list = q.a().d(exercisesession);
        return d.b(exercisesession, list, ((com.fitbit.runtrack.data.ExerciseEvent) (obj1)), ((android.util.Pair) (obj)));
    }

    public Object call()
        throws Exception
    {
        return a();
    }
}
