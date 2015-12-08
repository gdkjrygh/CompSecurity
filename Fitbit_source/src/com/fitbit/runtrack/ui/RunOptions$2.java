// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import com.fitbit.savedstate.MobileRunSavedState;
import java.util.EnumSet;

// Referenced classes of package com.fitbit.runtrack.ui:
//            RunOptions

class a
    implements alogFragment.c
{

    final RunOptions a;

    public void a(int i, boolean aflag[])
    {
        EnumSet enumset = EnumSet.noneOf(com/fitbit/savedstate/MobileRunSavedState$AudioCue);
        for (i = 0; i < aflag.length; i++)
        {
            if (aflag[i])
            {
                enumset.add(com.fitbit.savedstate.dState.AudioCue.values()[i]);
            }
        }

        MobileRunSavedState.a(enumset);
        RunOptions.a(a, enumset);
    }

    State(RunOptions runoptions)
    {
        a = runoptions;
        super();
    }
}
