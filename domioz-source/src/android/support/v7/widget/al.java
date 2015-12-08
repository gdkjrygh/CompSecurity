// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v7.widget:
//            ak

final class al
    implements Runnable
{

    final ak a;

    private al(ak ak1)
    {
        a = ak1;
        super();
    }

    al(ak ak1, byte byte0)
    {
        this(ak1);
    }

    public final void run()
    {
        ak.a(a).getParent().requestDisallowInterceptTouchEvent(true);
    }
}
