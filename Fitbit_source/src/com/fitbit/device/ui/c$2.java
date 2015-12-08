// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.ui.b;

// Referenced classes of package com.fitbit.device.ui:
//            c

class a
    implements android.widget.oundButton.OnCheckedChangeListener
{

    final c a;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        boolean flag1 = b.c(com.fitbit.savedstate.aStoreUtilsSavedState.ConfirmationScope.a);
        if (!flag || flag1)
        {
            TrackerSyncPreferencesSavedState.c(flag);
            return;
        }
        if (!b.d(com.fitbit.savedstate.aStoreUtilsSavedState.ConfirmationScope.a))
        {
            b.e(com.fitbit.savedstate.aStoreUtilsSavedState.ConfirmationScope.a);
            return;
        } else
        {
            b.f(com.fitbit.savedstate.aStoreUtilsSavedState.ConfirmationScope.a);
            c.a(a).setChecked(false);
            TrackerSyncPreferencesSavedState.c(false);
            return;
        }
    }

    tton(c c1)
    {
        a = c1;
        super();
    }
}
