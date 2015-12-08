// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class lang.Object
    implements android.view.OnClickListener
{

    private wi a;

    public final void onClick(View view)
    {
        view = a;
        view.f = true;
        if (((wi) (view)).k != null)
        {
            ((wi) (view)).k.a();
        }
    }

    public >(wi wi1)
    {
        a = wi1;
        super();
    }
}
