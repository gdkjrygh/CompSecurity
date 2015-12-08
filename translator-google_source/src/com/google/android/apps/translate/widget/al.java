// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.view.View;
import com.google.android.libraries.translate.e.m;

// Referenced classes of package com.google.android.apps.translate.widget:
//            PartialStateButton

final class al
    implements android.view.View.OnClickListener
{

    final PartialStateButton a;

    al(PartialStateButton partialstatebutton)
    {
        a = partialstatebutton;
        super();
    }

    public final void onClick(View view)
    {
        if (PartialStateButton.a(a))
        {
            m.a(PartialStateButton.b(a), 1);
        } else
        if (PartialStateButton.c(a) != null)
        {
            PartialStateButton.c(a).onClick(view);
            return;
        }
    }
}
