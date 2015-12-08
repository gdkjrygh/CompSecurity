// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v7.widget:
//            y

final class z
    implements Runnable
{

    final y a;

    z(y y1)
    {
        a = y1;
        super();
    }

    public final void run()
    {
        y.a(a).getParent().requestDisallowInterceptTouchEvent(true);
    }
}
