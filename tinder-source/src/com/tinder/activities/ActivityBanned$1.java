// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.view.View;
import com.tinder.managers.a;
import com.tinder.managers.d;
import com.tinder.model.SparksEvent;

// Referenced classes of package com.tinder.activities:
//            ActivityBanned

final class a
    implements android.view.ner
{

    final ActivityBanned a;

    public final void onClick(View view)
    {
        view = new SparksEvent("Warning.Logout");
        view.put("version", Integer.valueOf(1));
        view.put("banned", Boolean.valueOf(true));
        com.tinder.managers.a.a(view);
        a.a.d();
    }

    (ActivityBanned activitybanned)
    {
        a = activitybanned;
        super();
    }
}
