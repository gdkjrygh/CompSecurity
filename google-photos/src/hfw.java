// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class hfw
    implements android.view.View.OnClickListener
{

    private hfv a;

    hfw(hfv hfv1)
    {
        a = hfv1;
        super();
    }

    public final void onClick(View view)
    {
        if (hfv.a(a) != null)
        {
            hfv.a(a).onClick(view);
        }
    }
}
