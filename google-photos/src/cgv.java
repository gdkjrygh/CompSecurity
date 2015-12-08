// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class cgv
    implements Runnable
{

    private View a;

    cgv(cgp cgp, View view)
    {
        a = view;
        super();
    }

    public final void run()
    {
        a.setVisibility(8);
    }
}
