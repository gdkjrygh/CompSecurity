// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import com.fitbit.ui.d;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ExerciseListActivity, ExerciseListHeaderSwitchEvent

class a
    implements android.support.v4.view.istener
{

    final d a;
    final ExerciseListActivity b;

    public void onPageScrollStateChanged(int i)
    {
        a.onPageScrollStateChanged(i);
    }

    public void onPageScrolled(int i, float f, int j)
    {
        a.onPageScrolled(i, f, j);
    }

    public void onPageSelected(int i)
    {
        a.onPageSelected(i);
        ercisePagerAdapter.Type type = (ercisePagerAdapter.Type)ercisePagerAdapter.a(ExerciseListActivity.b(b)).get(i);
        switch (a[type.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            (new ExerciseListHeaderSwitchEvent()).a().f();
            return;

        case 2: // '\002'
            (new ExerciseListHeaderSwitchEvent()).b().f();
            return;

        case 3: // '\003'
            (new ExerciseListHeaderSwitchEvent()).c().f();
            return;

        case 4: // '\004'
            (new ExerciseListHeaderSwitchEvent()).d().f();
            return;

        case 5: // '\005'
            (new ExerciseListHeaderSwitchEvent()).e().f();
            break;
        }
    }

    hEvent(ExerciseListActivity exerciselistactivity, d d1)
    {
        b = exerciselistactivity;
        a = d1;
        super();
    }
}
