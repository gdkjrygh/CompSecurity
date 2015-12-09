// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ang.Object
    implements Runnable
{

    private View a;

    public final void run()
    {
        a.findViewById(0x7f1102c3).setVisibility(0);
    }

    (View view)
    {
        a = view;
        super();
    }
}
