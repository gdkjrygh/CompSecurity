// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.surveys;

import android.content.DialogInterface;
import android.view.View;
import com.android.a.d;

// Referenced classes of package com.android.slyce.report.surveys:
//            k

class p
    implements android.content.DialogInterface.OnClickListener
{

    final k a;

    p(k k1)
    {
        a = k1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.findViewById(d.com_mixpanel_android_activity_survey_id).setVisibility(0);
        k.a(a, true);
        k.a(a, com.android.slyce.report.surveys.k.d(a));
    }
}
