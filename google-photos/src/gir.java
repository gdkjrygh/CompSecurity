// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class gir
    implements android.view.View.OnClickListener
{

    private gip a;

    gir(gip gip1)
    {
        a = gip1;
        super();
    }

    public final void onClick(View view)
    {
        a.O_().setResult(-1);
        a.O_().finish();
    }
}
