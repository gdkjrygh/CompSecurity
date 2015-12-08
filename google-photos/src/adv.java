// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewParent;

final class adv
    implements Runnable
{

    private adu a;

    adv(adu adu1)
    {
        a = adu1;
        super();
    }

    public final void run()
    {
        adu.a(a).getParent().requestDisallowInterceptTouchEvent(true);
    }
}
