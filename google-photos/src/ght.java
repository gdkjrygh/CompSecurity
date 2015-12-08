// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ght
    implements android.view.View.OnClickListener
{

    private ghs a;

    ght(ghs ghs1)
    {
        a = ghs1;
        super();
    }

    public final void onClick(View view)
    {
        view.setClickable(false);
        ghs.a(a);
    }
}
