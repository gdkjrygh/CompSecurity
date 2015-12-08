// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.CheckBox;

final class fqs
    implements android.view.View.OnClickListener
{

    private fqm a;

    fqs(fqm fqm1)
    {
        a = fqm1;
        super();
    }

    public final void onClick(View view)
    {
        if (!fqm.d(a).b())
        {
            return;
        }
        view = fqm.f(a);
        boolean flag;
        if (!fqm.f(a).isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setChecked(flag);
    }
}
