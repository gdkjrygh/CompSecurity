// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import com.android.slyce.report.surveys.k;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            i, al

class an
    implements i
{

    final UpdateDisplayState.DisplayState.SurveyState a;
    final Activity b;
    final int c;
    final al d;

    an(al al, UpdateDisplayState.DisplayState.SurveyState surveystate, Activity activity, int j)
    {
        d = al;
        a = surveystate;
        b = activity;
        c = j;
        super();
    }

    public void a(Bitmap bitmap, int j)
    {
        a.a(bitmap);
        a.a(j);
        bitmap = new Intent(b.getApplicationContext(), com/android/slyce/report/surveys/k);
        bitmap.addFlags(0x10000000);
        bitmap.addFlags(0x20000);
        bitmap.putExtra("com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY", c);
        b.startActivity(bitmap);
    }
}
