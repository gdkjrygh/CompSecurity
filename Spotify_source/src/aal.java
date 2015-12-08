// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewParent;

final class aal
    implements Runnable
{

    private aak a;

    private aal(aak aak1)
    {
        a = aak1;
        super();
    }

    aal(aak aak1, byte byte0)
    {
        this(aak1);
    }

    public final void run()
    {
        aak.a(a).getParent().requestDisallowInterceptTouchEvent(true);
    }
}
