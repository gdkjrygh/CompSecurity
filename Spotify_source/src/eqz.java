// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class eqz extends fyl
{

    public eqz()
    {
    }

    public static eqz a(Flags flags)
    {
        eqz eqz1 = new eqz();
        fyw.a(eqz1, flags);
        return eqz1;
    }

    public final boolean F()
    {
        return super.x_().canGoBack();
    }

    public final boolean G()
    {
        return super.x_().canGoForward();
    }

    public final void H()
    {
        super.x_().goForward();
    }

    protected final void a()
    {
        if (k() == null)
        {
            return;
        } else
        {
            c(k().getIntent().getStringExtra("initial_url_key"));
            return;
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        s();
    }

    public final void a(View view, Bundle bundle)
    {
        a();
    }

    protected final void a(String s)
    {
        if (!o() || super.x_() == null)
        {
            return;
        } else
        {
            super.a(s);
            ((eqy)k()).a();
            return;
        }
    }

    protected final WebView x_()
    {
        return super.x_();
    }
}
