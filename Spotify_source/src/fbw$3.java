// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Button;
import com.spotify.mobile.android.spotlets.ads.FeaturedAction;

final class ang.Object
    implements eol
{

    private fbw a;

    public final void a(String s)
    {
    }

    public final void a(String s, boolean flag)
    {
        if (a.a == null || a.a.h() == null || !cty.a(s, a.a.h()))
        {
            return;
        }
        s = fbw.b(a);
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s.setEnabled(flag);
    }

    (fbw fbw1)
    {
        a = fbw1;
        super();
    }
}
