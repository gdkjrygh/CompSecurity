// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.b;

import android.text.Editable;
import android.text.TextWatcher;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.ab;

// Referenced classes of package com.roidapp.cloudlib.b:
//            a, j, g

final class f
    implements TextWatcher
{

    final a a;

    f(a a1)
    {
        a = a1;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
        if (com.roidapp.cloudlib.b.a.e(a) != null)
        {
            if (editable != null && editable.toString().length() > 0)
            {
                com.roidapp.cloudlib.b.a.f(a).b(0);
            } else
            {
                com.roidapp.cloudlib.b.a.g(a).b(8);
            }
        }
        if (com.roidapp.cloudlib.b.a.h(a))
        {
            if (com.roidapp.cloudlib.b.a.a(a) == 0)
            {
                com.roidapp.cloudlib.b.a.a(com.roidapp.cloudlib.b.a.i(a));
            } else
            {
                com.roidapp.cloudlib.b.a.a(com.roidapp.cloudlib.b.a.j(a));
            }
            if (editable != null && editable.length() > 1)
            {
                editable = editable.toString();
                com.roidapp.cloudlib.b.a.a(a, editable);
                com.roidapp.cloudlib.b.a.b(a, editable);
                return;
            }
            if (com.roidapp.cloudlib.b.a.a(a) == 0)
            {
                com.roidapp.cloudlib.b.a.b(a).f();
            } else
            {
                com.roidapp.cloudlib.b.a.d(a).f();
            }
            com.roidapp.cloudlib.b.a.k(a);
            if (editable != null && editable.length() > 0)
            {
                com.roidapp.cloudlib.b.a.a(a, editable.toString());
                if (com.roidapp.cloudlib.b.a.a(a) == 0)
                {
                    com.roidapp.cloudlib.b.a.b(a).f();
                    com.roidapp.cloudlib.b.a.b(a).a(editable.toString());
                    com.roidapp.cloudlib.b.a.b(a).a(at.aB);
                    return;
                } else
                {
                    com.roidapp.cloudlib.b.a.d(a).f();
                    com.roidapp.cloudlib.b.a.d(a).a(editable.toString());
                    com.roidapp.cloudlib.b.a.d(a).a(at.aB);
                    return;
                }
            } else
            {
                com.roidapp.cloudlib.b.a.a(a, "");
                return;
            }
        }
        com.roidapp.cloudlib.b.a.l(a);
        if (editable != null)
        {
            com.roidapp.cloudlib.b.a.a(a, editable.toString());
            return;
        } else
        {
            com.roidapp.cloudlib.b.a.a(a, "");
            return;
        }
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int k, int l)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int k, int l)
    {
    }
}
