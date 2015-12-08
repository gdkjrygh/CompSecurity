// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.view.View;
import com.fitbit.data.bl.s;
import com.fitbit.data.domain.RankedUser;

// Referenced classes of package com.fitbit.settings.ui:
//            ProfileActivity

class a
    implements android.view.er
{

    final View a;
    final ProfileActivity b;

    public void onClick(View view)
    {
        s.a(view.getContext()).a((RankedUser)ProfileActivity.a(b), view.getContext(), null);
        a.setVisibility(8);
    }

    (ProfileActivity profileactivity, View view)
    {
        b = profileactivity;
        a = view;
        super();
    }
}
