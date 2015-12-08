// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.automation;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.kik.cards.web.automation:
//            a

final class c
    implements android.view.View.OnClickListener
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public final void onClick(View view)
    {
        com.kik.cards.web.automation.a.e(a).setText("");
        com.kik.cards.web.automation.a.d(a).setText("");
        com.kik.cards.web.automation.a.f(a).setText("");
    }
}
