// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.social.login.ui.CurrentAccountBannerView;

public final class njk
    implements Runnable
{

    private CurrentAccountBannerView a;

    public njk(CurrentAccountBannerView currentaccountbannerview)
    {
        a = currentaccountbannerview;
        super();
    }

    public final void run()
    {
        if (CurrentAccountBannerView.a(a) != null)
        {
            a.announceForAccessibility(CurrentAccountBannerView.a(a));
            CurrentAccountBannerView.a(a, null);
        }
    }
}
