// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class msj
    implements android.view.View.OnClickListener
{

    private final android.view.View.OnClickListener a;

    public msj(android.view.View.OnClickListener onclicklistener)
    {
        a = onclicklistener;
    }

    public final void onClick(View view)
    {
        mry.a(view, 4);
        a.onClick(view);
    }
}
