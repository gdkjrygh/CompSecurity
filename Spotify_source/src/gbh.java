// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.view.snackbar.SnackBar;

public abstract class gbh
    implements gbk
{

    final int a;
    private final SnackBar b;
    private boolean c;
    private final String d;

    protected gbh(SnackBar snackbar, int i, String s)
    {
        b = snackbar;
        c = false;
        a = i;
        d = s;
    }

    public final int a()
    {
        return a;
    }

    public final void a(boolean flag)
    {
        if (c != flag)
        {
            b.a();
        }
        c = flag;
    }

    public boolean b()
    {
        return c;
    }

    public final String c()
    {
        return d;
    }
}
