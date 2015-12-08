// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.view.snackbar.SnackBar;

public final class gbj
{

    public gbi a;
    public gbi b;
    private final u c;
    private final SnackBar d;

    public gbj(u u1, SnackBar snackbar)
    {
        c = u1;
        d = snackbar;
        d.a(new gbm(d, 0x7f03003a, "Additional info bar"));
        d.a(new gbm(d, 0x7f030067, "Gaia bar"));
        a = new gbi(d, 0x7f110399, c.a_(), "Offline bar");
        d.a(a);
        b = new gbi(d, 0x7f110495, c.a_(), "Player preview bar");
        d.a(b);
        u1 = c.a_();
        snackbar = (eti)u1.a(b.d());
        if (snackbar != null)
        {
            snackbar.a = b;
        }
        u1 = (fyj)u1.a(a.d());
        if (u1 != null)
        {
            u1.a = a;
        }
    }
}
