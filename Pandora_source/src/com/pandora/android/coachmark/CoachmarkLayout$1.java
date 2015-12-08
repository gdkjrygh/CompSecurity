// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.coachmark;

import android.view.View;
import com.pandora.android.provider.b;
import com.pandora.radio.util.k;
import p.cw.c;

// Referenced classes of package com.pandora.android.coachmark:
//            CoachmarkLayout, CoachmarkBuilder

class a
    implements android.view.er
{

    final CoachmarkBuilder a;
    final CoachmarkLayout b;

    public void onClick(View view)
    {
        view.setOnClickListener(null);
        b.a(b);
        b.a.b().o().a(b.getType().tType, b.getType().tType.tType, true, tType.tType);
        view = CoachmarkLayout.a(b).a();
        if (view instanceof )
        {
            (()view).a(a);
        }
    }

    (CoachmarkLayout coachmarklayout, CoachmarkBuilder coachmarkbuilder)
    {
        b = coachmarklayout;
        a = coachmarkbuilder;
        super();
    }
}
