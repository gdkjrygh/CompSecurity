// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import com.mixpanel.android.surveys.SurveyActivity;

final class z
    implements c.b
{

    final UpdateDisplayState.DisplayState.SurveyState a;
    final Activity b;
    final int c;
    final v.c d;

    z(v.c c1, UpdateDisplayState.DisplayState.SurveyState surveystate, Activity activity, int i)
    {
        d = c1;
        a = surveystate;
        b = activity;
        c = i;
        super();
    }

    public final void a(Bitmap bitmap, int i)
    {
        a.a(bitmap);
        a.a(i);
        bitmap = new Intent(b.getApplicationContext(), com/mixpanel/android/surveys/SurveyActivity);
        bitmap.addFlags(0x10000000);
        bitmap.addFlags(0x20000);
        bitmap.putExtra("com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY", c);
        b.startActivity(bitmap);
    }
}
