// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.Switch;

final class fii
    implements android.view.View.OnClickListener
{

    private fih a;

    fii(fih fih1)
    {
        a = fih1;
        super();
    }

    public final void onClick(View view)
    {
        view = (Switch)view;
        boolean flag = view.isChecked();
        if (!a.a.a(flag))
        {
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setChecked(flag);
        }
    }
}
