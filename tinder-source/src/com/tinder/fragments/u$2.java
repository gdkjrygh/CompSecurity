// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.Intent;
import android.view.View;
import com.tinder.activities.ActivityUsername;

// Referenced classes of package com.tinder.fragments:
//            u

final class a
    implements android.view..OnClickListener
{

    final u a;

    public final void onClick(View view)
    {
        a.startActivityForResult(new Intent(a.getActivity(), com/tinder/activities/ActivityUsername), 8833);
    }

    ivityUsername(u u1)
    {
        a = u1;
        super();
    }
}
