// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.i18n.phonenumbers.a;
import java.util.List;

// Referenced classes of package com.tinder.fragments:
//            bk

final class a
    implements TextWatcher
{

    final bk a;

    public final void afterTextChanged(Editable editable)
    {
        editable.toString();
        if (!com.tinder.fragments.bk.a(a))
        {
            String s = editable.toString();
            editable = com.tinder.fragments.bk.a(s);
            com.tinder.fragments.bk.a(a, editable.length());
            if (bk.b(a) > bk.c(a))
            {
                editable = bk.d(a).a(s.charAt(s.length() - 1));
            } else
            {
                a a1 = bk.d(a);
                a1.a = "";
                a1.d.setLength(0);
                a1.e.setLength(0);
                a1.b.setLength(0);
                a1.m = 0;
                a1.c = "";
                a1.p.setLength(0);
                a1.r = "";
                a1.s.setLength(0);
                a1.f = true;
                a1.g = false;
                a1.o = 0;
                a1.n = 0;
                a1.h = false;
                a1.i = false;
                a1.t.clear();
                a1.q = false;
                if (!a1.l.equals(a1.k))
                {
                    a1.l = a1.a(a1.j);
                }
                editable = com.tinder.fragments.bk.a(a, editable);
            }
            bk.b(a, bk.b(a));
            com.tinder.fragments.bk.a(a, true);
            a.b.setText(editable);
        } else
        {
            com.tinder.fragments.bk.a(a, false);
        }
        a.b.setSelection(a.b.getText().length());
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    rs.a(bk bk1)
    {
        a = bk1;
        super();
    }
}
