// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.android.libraries.social.silentfeedback.impl.SilentFeedbackService;

public final class obp
    implements lzt
{

    final lzq a;
    final SilentFeedbackService b;
    private mba c;
    private Intent d;

    public obp(SilentFeedbackService silentfeedbackservice, mba mba1, Intent intent, lzq lzq)
    {
        b = silentfeedbackservice;
        c = mba1;
        d = intent;
        a = lzq;
        super();
    }

    public final void a()
    {
        try
        {
            c.a(SilentFeedbackService.a(b, d)).a(new obq(this));
            return;
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            SilentFeedbackService.a(b);
        }
    }

    public final void a(int i)
    {
    }
}
