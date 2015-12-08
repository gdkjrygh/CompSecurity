// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import android.widget.Toast;

// Referenced classes of package com.fsr.tracker.app:
//            ISurveyCallback, TrackingContext

public class JsInterface
{

    private ISurveyCallback callback;
    private TrackingContext trackingContext;

    public JsInterface(ISurveyCallback isurveycallback, TrackingContext trackingcontext)
    {
        callback = isurveycallback;
        trackingContext = trackingcontext;
    }

    public void abortSurvey()
    {
        callback.surveyAborted();
    }

    public void completeSurvey()
    {
        callback.surveyCompleted();
    }

    public void showToast(String s)
    {
        Toast.makeText(callback.getContext(), s, 0).show();
    }
}
