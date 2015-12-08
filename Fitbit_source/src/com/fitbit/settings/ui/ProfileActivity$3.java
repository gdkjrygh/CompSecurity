// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.widget.Toast;
import com.fitbit.data.domain.User;

// Referenced classes of package com.fitbit.settings.ui:
//            ProfileActivity

class a extends com.fitbit.friends.ui.
{

    final int a;
    final ProfileActivity b;

    public void a()
    {
        Toast.makeText(b, b.getString(a, new Object[] {
            ProfileActivity.a(b).P()
        }), 0).show();
    }

    (ProfileActivity profileactivity, int i)
    {
        b = profileactivity;
        a = i;
        super();
    }
}
