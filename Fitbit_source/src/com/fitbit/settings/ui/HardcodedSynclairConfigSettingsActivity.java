// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.widget.RadioButton;
import com.fitbit.savedstate.HardcodedSynclairSavedState;
import com.fitbit.ui.FitbitActivity;

public class HardcodedSynclairConfigSettingsActivity extends FitbitActivity
{

    protected RadioButton a;
    protected RadioButton b;
    protected RadioButton c;

    public HardcodedSynclairConfigSettingsActivity()
    {
    }

    protected void e()
    {
        com.fitbit.savedstate.HardcodedSynclairSavedState.SynclairDebugConfigType synclairdebugconfigtype = HardcodedSynclairSavedState.h();
        if (com.fitbit.savedstate.HardcodedSynclairSavedState.SynclairDebugConfigType.b == synclairdebugconfigtype)
        {
            a.setChecked(true);
            return;
        }
        if (com.fitbit.savedstate.HardcodedSynclairSavedState.SynclairDebugConfigType.c == synclairdebugconfigtype)
        {
            b.setChecked(true);
            return;
        } else
        {
            c.setChecked(true);
            return;
        }
    }

    protected void f()
    {
        if (!a.isChecked()) goto _L2; else goto _L1
_L1:
        HardcodedSynclairSavedState.a(com.fitbit.savedstate.HardcodedSynclairSavedState.SynclairDebugConfigType.b);
_L4:
        finish();
        return;
_L2:
        if (b.isChecked())
        {
            HardcodedSynclairSavedState.a(com.fitbit.savedstate.HardcodedSynclairSavedState.SynclairDebugConfigType.c);
        } else
        if (c.isChecked())
        {
            HardcodedSynclairSavedState.a(com.fitbit.savedstate.HardcodedSynclairSavedState.SynclairDebugConfigType.a);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
