// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.Intent;
import android.view.View;
import com.tinder.activities.ActivityJob;

// Referenced classes of package com.tinder.fragments:
//            w

final class a
    implements android.view.OnClickListener
{

    final w a;

    public final void onClick(View view)
    {
        a.startActivity(new Intent(a.getActivity(), com/tinder/activities/ActivityJob));
    }

    vityJob(w w1)
    {
        a = w1;
        super();
    }
}
