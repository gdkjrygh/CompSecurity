// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.profile;

import android.support.v4.app.FragmentActivity;
import com.fitbit.home.ui.b;
import com.fitbit.ui.dialogs.a;

// Referenced classes of package com.fitbit.onboarding.profile:
//            AboutYouActivity

class a extends b
{

    final AboutYouActivity a;

    protected String a()
    {
        return com.fitbit.ui.dialogs.a.a(a);
    }

    (AboutYouActivity aboutyouactivity, FragmentActivity fragmentactivity, com.fitbit.home.ui.y y, android.content.ancelListener ancellistener)
    {
        a = aboutyouactivity;
        super(fragmentactivity, y, ancellistener);
    }
}
