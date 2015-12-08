// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.social.silentfeedback.impl.SilentFeedbackService;

final class obq
    implements lzy
{

    private obp a;

    obq(obp obp1)
    {
        a = obp1;
        super();
    }

    public final void a(lzx lzx)
    {
        if (a.a.c())
        {
            a.a.b();
        }
        SilentFeedbackService.a(a.b);
    }
}
