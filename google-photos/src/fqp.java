// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.CheckBox;

final class fqp
    implements nug
{

    private fqm a;

    fqp(fqm fqm1)
    {
        a = fqm1;
        super();
    }

    public final void b_(Object obj)
    {
        if (fqm.d(a).b())
        {
            fqm.b(a, true);
            fqm.f(a).setChecked(((fqv)olm.a(a.a.getContext(), fqv)).a(fqm.e(a)));
            fqm.b(a, false);
        }
    }
}
