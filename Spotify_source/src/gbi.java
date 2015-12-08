// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;

public final class gbi extends gbh
{

    private final aa b;
    private boolean c;

    public gbi(SnackBar snackbar, int i, aa aa1, String s)
    {
        super(snackbar, i, s);
        c = false;
        b = aa1;
    }

    public final void a(Fragment fragment)
    {
        b.a().a(super.a, fragment, d()).c();
        b.b();
        c = true;
    }

    public final void a(ViewGroup viewgroup)
    {
        viewgroup = d();
        viewgroup = b.a(viewgroup);
        if (viewgroup != null)
        {
            b.a().c(viewgroup).c();
            b.b();
            c = true;
        }
    }

    public final boolean b()
    {
        return super.b() && c;
    }

    public final String d()
    {
        return (new StringBuilder("spotify:snackbar:")).append(super.a).toString();
    }
}
