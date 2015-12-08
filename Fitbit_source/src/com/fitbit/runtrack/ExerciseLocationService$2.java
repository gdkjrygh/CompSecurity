// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack;

import android.os.Handler;
import com.fitbit.e.a;
import com.fitbit.runtrack.data.ExerciseSegment;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.b;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack:
//            ExerciseLocationService, e

class a
    implements Runnable
{

    final ExerciseSession a;
    final ExerciseLocationService b;

    public void run()
    {
        Object obj = com.fitbit.runtrack.ExerciseLocationService.b(b).i(a);
        if (!((List) (obj)).isEmpty())
        {
            obj = (ExerciseSegment)((List) (obj)).get(((List) (obj)).size() - 1);
            if (!((ExerciseSegment) (obj)).a())
            {
                com.fitbit.runtrack.ExerciseLocationService.b(b).a(((ExerciseSegment) (obj)));
                com.fitbit.e.a.d(com.fitbit.runtrack.ExerciseLocationService.a(), String.format("Paused Session %s", new Object[] {
                    a.getUuid()
                }), new Object[0]);
            }
        }
        ExerciseLocationService.c(b);
        obj = (new e(a, com.fitbit.runtrack.ExerciseLocationService.b(b), ExerciseLocationService.d(b))).a();
    /* block-local class not found */
    class _cls1 {}

        ExerciseLocationService.f(b).post(new _cls1(((android.content.Intent) (obj))));
    }

    _cls1(ExerciseLocationService exerciselocationservice, ExerciseSession exercisesession)
    {
        b = exerciselocationservice;
        a = exercisesession;
        super();
    }
}
