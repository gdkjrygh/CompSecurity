// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.view.View;

// Referenced classes of package com.fitbit.device.ui:
//            ExerciseOptionsActivity, AutoLapSelector

class a
    implements android.view.ivity._cls5
{

    final ExerciseOptionsActivity a;

    public void onClick(View view)
    {
        AutoLapSelector.a(a.b).show(a.getSupportFragmentManager(), null);
    }

    (ExerciseOptionsActivity exerciseoptionsactivity)
    {
        a = exerciseoptionsactivity;
        super();
    }
}
