// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack;

import android.content.Intent;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.b;
import java.util.concurrent.Callable;

// Referenced classes of package com.fitbit.runtrack:
//            c

public class e
    implements Callable
{

    private final ExerciseSession a;
    private final b b;
    private final c c;

    public e(ExerciseSession exercisesession, b b1, c c1)
    {
        a = exercisesession;
        b = b1;
        c = c1;
    }

    public Intent a()
    {
        java.util.List list = b.i(a);
        return c.b(a, list, null, null);
    }

    public Object call()
        throws Exception
    {
        return a();
    }
}
