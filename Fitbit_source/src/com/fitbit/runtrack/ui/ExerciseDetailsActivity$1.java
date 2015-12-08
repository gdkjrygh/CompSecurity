// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.util.Pair;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.runtrack.data.b;
import com.fitbit.util.bf;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ExerciseDetailsActivity

class a extends bf
{

    final ExerciseDetailsActivity a;

    protected Pair a()
    {
        b b1 = new b();
        Pair pair = b1.g(ExerciseDetailsActivity.a(a));
        return Pair.create(new <init>((ExerciseStat)pair.first, (List)pair.second), b1.e(ExerciseDetailsActivity.a(a)));
    }

    protected Object f_()
    {
        return a();
    }

    (ExerciseDetailsActivity exercisedetailsactivity, Context context)
    {
        a = exercisedetailsactivity;
        super(context);
    }
}
