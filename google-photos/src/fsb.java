// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class fsb
    implements android.view.View.OnClickListener
{

    public android.view.View.OnClickListener a;
    private final android.view.View.OnClickListener b;

    public fsb(android.view.View.OnClickListener onclicklistener)
    {
        b = onclicklistener;
    }

    public final void onClick(View view)
    {
        if (((hyy)olm.a(view.getContext(), hyy)).b())
        {
            b.onClick(view);
        } else
        if (a != null)
        {
            a.onClick(view);
            return;
        }
    }
}
