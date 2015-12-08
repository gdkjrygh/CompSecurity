// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import com.fitbit.data.domain.device.ExerciseOption;
import com.fitbit.e.a;
import com.mobeta.android.dslv.DragSortListView;

// Referenced classes of package com.fitbit.device.ui:
//            ExerciseOptionsActivity

class a
    implements com.mobeta.android.dslv.
{

    final ExerciseOptionsActivity a;

    public void a(int i, int j)
    {
        com.fitbit.e.a.a("ExerciseOptionsActivity", "drop %s to %s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
        if (i != j)
        {
            ExerciseOption exerciseoption = (ExerciseOption)com.fitbit.device.ui.ExerciseOptionsActivity.a(a).getItem(i);
            com.fitbit.device.ui.ExerciseOptionsActivity.a(a).remove(exerciseoption);
            com.fitbit.device.ui.ExerciseOptionsActivity.a(a).insert(exerciseoption, j);
            a.c.b(i, j);
        }
        com.fitbit.device.ui.ExerciseOptionsActivity.a(a, false);
    }

    (ExerciseOptionsActivity exerciseoptionsactivity)
    {
        a = exerciseoptionsactivity;
        super();
    }
}
