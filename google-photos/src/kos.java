// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;

final class kos extends kot
{

    private FeedbackOptions g;

    kos(jyn jyn, FeedbackOptions feedbackoptions)
    {
        g = feedbackoptions;
        super(jyn);
    }

    protected final void a(jyl jyl)
    {
        jyl = (lao)jyl;
        FeedbackOptions feedbackoptions = g;
        ((lap)jyl.o()).b(lao.a(feedbackoptions, ((lao) (jyl)).a.getCacheDir()));
        a(((jyw) (Status.a)));
    }
}
