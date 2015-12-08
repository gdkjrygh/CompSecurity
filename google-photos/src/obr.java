// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.google.android.libraries.social.silentfeedback.impl.SilentFeedbackService;

public final class obr
    implements lzu
{

    private SilentFeedbackService a;

    public obr(SilentFeedbackService silentfeedbackservice)
    {
        a = silentfeedbackservice;
        super();
    }

    public final void a(lzh lzh1)
    {
        int i = lzh1.a();
        Log.e("SilentFeedbackService", (new StringBuilder(74)).append("GoogleApiClient silent feedback connection failed with result: ").append(i).toString());
        SilentFeedbackService.a(a);
    }
}
