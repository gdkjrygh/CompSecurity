// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dialog;

import android.view.View;

// Referenced classes of package com.spotify.mobile.android.ui.activity.dialog:
//            TrialReminderActivity

final class a
    implements android.view.y.dialog.TrialReminderActivity._cls1
{

    private TrialReminderActivity a;

    public final void onClick(View view)
    {
        TrialReminderActivity.a(a);
        a.setResult(-1);
        a.finish();
    }

    (TrialReminderActivity trialreminderactivity)
    {
        a = trialreminderactivity;
        super();
    }
}
