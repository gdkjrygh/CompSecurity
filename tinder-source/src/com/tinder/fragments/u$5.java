// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.Intent;
import android.view.View;
import com.tinder.activities.ActivityBlend;
import com.tinder.enums.Blend;
import com.tinder.managers.a;
import com.tinder.managers.ab;
import com.tinder.managers.ae;
import com.tinder.model.SparksEvent;

// Referenced classes of package com.tinder.fragments:
//            u

final class a
    implements android.view..OnClickListener
{

    final u a;

    public final void onClick(View view)
    {
        view = new SparksEvent("Menu.OpenBlendPage");
        ae ae1 = a.D;
        view.put("blend", Integer.valueOf(ab.c(ae.C()).source));
        com.tinder.managers.a.a(view);
        view = new Intent(a.getActivity(), com/tinder/activities/ActivityBlend);
        view.putExtra("blend", com.tinder.fragments.u.a(a).name);
        a.startActivityForResult(view, 8134);
    }

    ivityBlend(u u1)
    {
        a = u1;
        super();
    }
}
