// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ToggleButton;

final class ang.Object
    implements android.view.nClickListener
{

    private ejl a;

    public final void onClick(View view)
    {
        if (a.b != null)
        {
            view = a.b;
            a.a.isChecked();
            view.a();
        }
    }

    (ejl ejl1)
    {
        a = ejl1;
        super();
    }
}
