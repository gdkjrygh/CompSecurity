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
//            ExerciseLocationService

class a
    implements Runnable
{

    final ExerciseSession a;
    final ExerciseLocationService b;

    public void run()
    {
        List list = com.fitbit.runtrack.ExerciseLocationService.b(b).i(a);
        if (!list.isEmpty() && ((ExerciseSegment)list.get(list.size() - 1)).a())
        {
            com.fitbit.runtrack.ExerciseLocationService.b(b).b(a);
            com.fitbit.e.a.d(com.fitbit.runtrack.ExerciseLocationService.a(), String.format("Resumed Session %s", new Object[] {
                a.getUuid()
            }), new Object[0]);
        }
        ExerciseLocationService.f(b).removeMessages(3, null);
        ExerciseLocationService.f(b).sendMessage(ExerciseLocationService.f(b).obtainMessage(4, a));
    }

    (ExerciseLocationService exerciselocationservice, ExerciseSession exercisesession)
    {
        b = exerciselocationservice;
        a = exercisesession;
        super();
    }
}
