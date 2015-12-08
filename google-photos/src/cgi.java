// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;
import com.google.android.apps.moviemaker.ui.ImeDismissalReportingEditText;

public final class cgi
    implements dad
{

    private PlayerScreenFragment a;

    public cgi(PlayerScreenFragment playerscreenfragment)
    {
        a = playerscreenfragment;
        super();
    }

    public final void a(ImeDismissalReportingEditText imedismissalreportingedittext)
    {
        PlayerScreenFragment.c(a);
        PlayerScreenFragment.c(a, false);
        PlayerScreenFragment.d(a).a(imedismissalreportingedittext.getText().toString(), false);
    }
}
