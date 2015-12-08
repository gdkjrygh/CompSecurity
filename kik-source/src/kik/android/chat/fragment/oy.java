// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Resources;
import android.widget.DatePicker;
import android.widget.EditText;
import java.util.Calendar;
import kik.android.widget.cd;

// Referenced classes of package kik.android.chat.fragment:
//            KikRegistrationFragment

final class oy
    implements android.app.DatePickerDialog.OnDateSetListener
{

    final KikRegistrationFragment a;

    oy(KikRegistrationFragment kikregistrationfragment)
    {
        a = kikregistrationfragment;
        super();
    }

    public final void onDateSet(DatePicker datepicker, int i, int j, int k)
    {
        KikRegistrationFragment.d(a).setTitle(a._firstnameField.getResources().getString(0x7f090295));
        KikRegistrationFragment.b(a).set(i, j, k);
        KikRegistrationFragment.e(a);
    }
}
