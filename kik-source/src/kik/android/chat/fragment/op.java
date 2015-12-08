// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.database.DataSetObserver;
import android.widget.Button;
import com.kik.view.adapters.v;
import kik.android.widget.KikAutoCompleteTextView;

// Referenced classes of package kik.android.chat.fragment:
//            KikRegistrationFragment

final class op extends DataSetObserver
{

    final KikRegistrationFragment a;

    op(KikRegistrationFragment kikregistrationfragment)
    {
        a = kikregistrationfragment;
        super();
    }

    public final void onChanged()
    {
        super.onChanged();
        if (a._emailField == null || a._registerButton == null)
        {
            return;
        } else
        {
            int i = ((v)a._emailField.getAdapter()).a();
            int j = a._registerButton.getBottom();
            int k = a._emailField.getBottom();
            int l = KikRegistrationFragment.j(a);
            a._emailField.setDropDownHeight(Math.min(i, (j - k) + l));
            return;
        }
    }
}
