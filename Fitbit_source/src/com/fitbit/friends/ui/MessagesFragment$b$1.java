// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.content.Context;
import android.view.View;
import com.fitbit.data.domain.Notification;
import com.fitbit.settings.ui.ProfileActivity;

// Referenced classes of package com.fitbit.friends.ui:
//            MessagesFragment

class a
    implements android.view.ment.b._cls1
{

    final Notification a;
    final a b;

    public void onClick(View view)
    {
        a(b).startActivity(ProfileActivity.a(b(b), a.g()));
    }

    ( , Notification notification)
    {
        b = ;
        a = notification;
        super();
    }
}
