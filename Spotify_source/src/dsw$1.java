// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.util.Assertion;
import java.util.List;

final class ang.Object
    implements android.view.nClickListener
{

    private dsw a;

    public final void onClick(View view)
    {
        if (a.c == null)
        {
            return;
        }
        view = (dsx)view.getTag(0x7f1100e8);
        int i = a.b.indexOf(view);
        if (i < 0)
        {
            Assertion.b("Invalid tab clicked");
            return;
        } else
        {
            a.a(i);
            return;
        }
    }

    (dsw dsw1)
    {
        a = dsw1;
        super();
    }
}
