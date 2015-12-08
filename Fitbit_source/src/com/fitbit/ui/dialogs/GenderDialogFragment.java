// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.dialogs;

import android.view.View;
import com.fitbit.data.domain.Gender;
import com.fitbit.ui.views.OnboardingGenderPicker;

// Referenced classes of package com.fitbit.ui.dialogs:
//            PickerDialogFragment

public class GenderDialogFragment extends PickerDialogFragment
    implements com.fitbit.ui.views.OnboardingGenderPicker.a
{

    private Gender c;
    private OnboardingGenderPicker d;
    private com.fitbit.ui.views.OnboardingGenderPicker.a e;

    public GenderDialogFragment()
    {
    }

    public static GenderDialogFragment c()
    {
        return new GenderDialogFragment();
    }

    protected final void a()
    {
        b(0x7f08045d);
        a(0x7f0401d9);
    }

    protected final void a(View view)
    {
        d = (OnboardingGenderPicker)view;
        d.a(c);
        d.a(this);
    }

    public final void a(Gender gender)
    {
        c = gender;
        if (d != null)
        {
            d.a(gender);
        }
    }

    public final void a(com.fitbit.ui.views.OnboardingGenderPicker.a a1)
    {
        e = a1;
    }

    public void a(OnboardingGenderPicker onboardinggenderpicker)
    {
        c = onboardinggenderpicker.a();
    }

    protected final void b()
    {
        if (e != null)
        {
            e.a(d);
        }
        dismiss();
    }
}
