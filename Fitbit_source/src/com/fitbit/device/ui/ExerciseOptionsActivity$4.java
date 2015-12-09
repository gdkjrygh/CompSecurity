// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import com.fitbit.data.domain.device.ExerciseOption;
import com.fitbit.e.a;
import com.fitbit.util.bh;

// Referenced classes of package com.fitbit.device.ui:
//            ExerciseOptionsActivity

class a
    implements com.mobeta.android.dslv.
{

    final ExerciseOptionsActivity a;

    public void a(int i)
    {
        com.fitbit.e.a.a("ExerciseOptionsActivity", "Remove %s", new Object[] {
            Integer.valueOf(i)
        });
        ExerciseOption exerciseoption = (ExerciseOption)com.fitbit.device.ui.ExerciseOptionsActivity.a(a).getItem(i);
        com.fitbit.device.ui.ExerciseOptionsActivity.a(a).remove(exerciseoption);
        com.fitbit.device.ui.ExerciseOptionsActivity.a(a, i);
        com.fitbit.device.ui.ExerciseOptionsActivity.a(a, exerciseoption);
        ExerciseOptionsActivity.b(a);
        com.fitbit.device.ui.ExerciseOptionsActivity.a(a, false);
        com.fitbit.device.ui.ExerciseOptionsActivity.a(a, bh.a(a, 0x7f0801a3, new String[] {
            exerciseoption.b()
        }));
    }

    (ExerciseOptionsActivity exerciseoptionsactivity)
    {
        a = exerciseoptionsactivity;
        super();
    }
}
