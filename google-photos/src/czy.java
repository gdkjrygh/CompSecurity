// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class czy
    implements Runnable
{

    private View a;

    czy(View view)
    {
        a = view;
        super();
    }

    public final void run()
    {
        a.setTag(b.hr, null);
    }
}
