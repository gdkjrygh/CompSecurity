// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import com.fitbit.pedometer.l;
import com.fitbit.pedometer.service.a;
import com.fitbit.savedstate.PedometerSavedState;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.p;

// Referenced classes of package com.fitbit.settings.ui:
//            SoftTrackerSettingsActivity_

public class SoftTrackerSettingsActivity extends FitbitActivity
{

    protected Button a;
    protected EditText b;
    protected EditText c;
    protected RadioGroup d;
    protected RadioGroup e;
    protected CheckBox f;

    public SoftTrackerSettingsActivity()
    {
    }

    private int a(com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue htccompatibilitycheckresultreplacementvalue)
    {
        static class _cls1
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue.values().length];
                try
                {
                    b[com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    b[com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    b[com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue.h.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                a = new int[com.fitbit.savedstate.PedometerSavedState.MetsAndActivityCalculationMethod.values().length];
                try
                {
                    a[com.fitbit.savedstate.PedometerSavedState.MetsAndActivityCalculationMethod.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.savedstate.PedometerSavedState.MetsAndActivityCalculationMethod.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.savedstate.PedometerSavedState.MetsAndActivityCalculationMethod.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.b[htccompatibilitycheckresultreplacementvalue.ordinal()])
        {
        case 1: // '\001'
        default:
            return 0x7f1101c3;

        case 2: // '\002'
            return 0x7f1101c4;

        case 3: // '\003'
            return 0x7f1101c5;

        case 4: // '\004'
            return 0x7f1101c6;

        case 5: // '\005'
            return 0x7f1101c7;

        case 6: // '\006'
            return 0x7f1101c8;

        case 7: // '\007'
            return 0x7f1101c9;

        case 8: // '\b'
            return 0x7f1101ca;
        }
    }

    private int a(com.fitbit.savedstate.PedometerSavedState.MetsAndActivityCalculationMethod metsandactivitycalculationmethod)
    {
        switch (com.fitbit.settings.ui._cls1.a[metsandactivitycalculationmethod.ordinal()])
        {
        case 1: // '\001'
        default:
            return 0x7f1101bf;

        case 2: // '\002'
            return 0x7f1101c1;

        case 3: // '\003'
            return 0x7f1101c0;
        }
    }

    public static void a(Context context)
    {
        context.startActivity(new Intent(context, com/fitbit/settings/ui/SoftTrackerSettingsActivity_));
    }

    private com.fitbit.savedstate.PedometerSavedState.MetsAndActivityCalculationMethod b(int i)
    {
        com.fitbit.savedstate.PedometerSavedState.MetsAndActivityCalculationMethod metsandactivitycalculationmethod = com.fitbit.savedstate.PedometerSavedState.MetsAndActivityCalculationMethod.a;
        if (0x7f1101bf == i)
        {
            metsandactivitycalculationmethod = com.fitbit.savedstate.PedometerSavedState.MetsAndActivityCalculationMethod.a;
        } else
        {
            if (0x7f1101c1 == i)
            {
                return com.fitbit.savedstate.PedometerSavedState.MetsAndActivityCalculationMethod.c;
            }
            if (0x7f1101c0 == i)
            {
                return com.fitbit.savedstate.PedometerSavedState.MetsAndActivityCalculationMethod.b;
            }
        }
        return metsandactivitycalculationmethod;
    }

    private com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue c(int i)
    {
        com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue htccompatibilitycheckresultreplacementvalue = com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue.a;
        if (0x7f1101c3 == i)
        {
            htccompatibilitycheckresultreplacementvalue = com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue.a;
        } else
        {
            if (0x7f1101c4 == i)
            {
                return com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue.b;
            }
            if (0x7f1101c5 == i)
            {
                return com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue.c;
            }
            if (0x7f1101c6 == i)
            {
                return com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue.d;
            }
            if (0x7f1101c7 == i)
            {
                return com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue.e;
            }
            if (0x7f1101c8 == i)
            {
                return com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue.f;
            }
            if (0x7f1101c9 == i)
            {
                return com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue.g;
            }
            if (0x7f1101ca == i)
            {
                return com.fitbit.savedstate.PedometerSavedState.HtcCompatibilityCheckResultReplacementValue.h;
            }
        }
        return htccompatibilitycheckresultreplacementvalue;
    }

    protected void e()
    {
        b.setText((new StringBuilder()).append("").append(PedometerSavedState.k()).toString());
        c.setText((new StringBuilder()).append("").append(PedometerSavedState.l()).toString());
        d.check(a(PedometerSavedState.n()));
        e.check(a(PedometerSavedState.o()));
        f.setVisibility(8);
    }

    protected void f()
    {
        Object obj = null;
        Integer integer;
        boolean flag;
        try
        {
            integer = Integer.valueOf(b.getText().toString());
        }
        catch (Exception exception)
        {
            exception = null;
        }
        if (integer != null && integer.intValue() > 0)
        {
            PedometerSavedState.a(integer.intValue());
        }
        try
        {
            integer = Integer.valueOf(c.getText().toString());
        }
        catch (Exception exception1)
        {
            exception1 = obj;
        }
        if (integer != null && integer.intValue() > 0)
        {
            PedometerSavedState.b(integer.intValue());
        }
        PedometerSavedState.a(b(d.getCheckedRadioButtonId()));
        PedometerSavedState.a(c(e.getCheckedRadioButtonId()));
        flag = l.a();
        if (p.l() && !flag)
        {
            com.fitbit.pedometer.service.a.a(false);
            com.fitbit.multipledevice.a.a().b();
        }
        finish();
    }
}
