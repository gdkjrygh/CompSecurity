// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v7.widget:
//            ah, ad

class ai
    implements Runnable
{

    final ah a;

    private ai(ah ah1)
    {
        a = ah1;
        super();
    }

    ai(ah ah1, ad ad)
    {
        this(ah1);
    }

    public void run()
    {
        ah.a(a).getParent().requestDisallowInterceptTouchEvent(true);
    }
}
