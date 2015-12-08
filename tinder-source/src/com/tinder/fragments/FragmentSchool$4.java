// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.widget.Toast;
import com.tinder.e.ax;
import com.tinder.managers.a;
import com.tinder.model.SparksEvent;

// Referenced classes of package com.tinder.fragments:
//            FragmentSchool

final class a
    implements ax
{

    final FragmentSchool a;

    public final void a(int i)
    {
        if (i == 204)
        {
            com.tinder.managers.a.a(new SparksEvent("School.Deny"));
            return;
        } else
        {
            Toast.makeText(a.getContext(), 0x7f06024a, 0).show();
            return;
        }
    }

    (FragmentSchool fragmentschool)
    {
        a = fragmentschool;
        super();
    }
}
