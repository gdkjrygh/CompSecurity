// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;


// Referenced classes of package com.mixpanel.android.surveys:
//            SurveyActivity

final class h
    implements CardCarouselLayout.c
{

    final SurveyActivity a;

    h(SurveyActivity surveyactivity)
    {
        a = surveyactivity;
        super();
    }

    public final void a(com.mixpanel.android.mpmetrics.Survey.a a1, String s)
    {
        SurveyActivity.a(a, a1, s);
        SurveyActivity.b(a);
    }
}
