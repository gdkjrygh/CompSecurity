// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.os.AsyncTask;
import android.util.Pair;
import com.fitbit.data.domain.Length;
import com.fitbit.e.a;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.runtrack.data.b;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.ad;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            RecordExerciseSessionActivity

class a extends AsyncTask
{

    final RecordExerciseSessionActivity a;

    protected transient Pair a(ExerciseSession aexercisesession[])
    {
        return Pair.create(com.fitbit.runtrack.ui.RecordExerciseSessionActivity.b(a).e(aexercisesession[0]), com.fitbit.runtrack.ui.RecordExerciseSessionActivity.b(a).g(aexercisesession[0]));
    }

    protected void a(Pair pair)
    {
        super.onPostExecute(pair);
        com.fitbit.e.a.a(RecordExerciseSessionActivity.g(), "Finishing Exercise Session", new Object[0]);
        List list = (List)pair.first;
        double d = ((ExerciseStat)((Pair)pair.second).first).a().a(com.fitbit.data.domain.a).b();
        if (list.isEmpty() || list.size() < 2 || Double.isNaN(d) || d <= 10D)
        {
            pair = SimpleConfirmDialogFragment.a(a, 0x7f080485, 0x7f080160, 0x7f080416, 0x7f080415);
            ad.a(a.getSupportFragmentManager(), "no_activity_dialog", pair);
            return;
        } else
        {
            RecordExerciseSessionActivity.c(a);
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((ExerciseSession[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Pair)obj);
    }

    (RecordExerciseSessionActivity recordexercisesessionactivity)
    {
        a = recordexercisesessionactivity;
        super();
    }
}
