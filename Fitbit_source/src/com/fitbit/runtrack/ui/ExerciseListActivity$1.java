// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.LoaderManager;
import com.fitbit.data.bl.dg;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ExerciseListActivity

class a extends c
{

    final ExerciseListActivity a;

    protected void a(Intent intent)
    {
        long al[] = intent.getLongArrayExtra(dg.c);
        if (al != null)
        {
            ExerciseListActivity.a(a).sendMessage(ExerciseListActivity.a(a).obtainMessage(3, al));
        } else
        {
            long l = intent.getLongExtra(dg.b, -1L);
            if (l != -1L)
            {
                intent = new Bundle();
                intent.putLong(dg.b, l);
                a.getSupportLoaderManager().restartLoader(0x7f110016, intent, a);
                return;
            }
        }
    }

    (ExerciseListActivity exerciselistactivity)
    {
        a = exerciselistactivity;
        super();
    }
}
