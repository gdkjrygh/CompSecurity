// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class hxp extends mxf
{

    private hxo a;

    hxp(hxo hxo1)
    {
        a = hxo1;
        super();
    }

    public final void v()
    {
        if (hxo.a(a) == null)
        {
            return;
        } else
        {
            hxo.a(a).setVisibility(0);
            return;
        }
    }
}
