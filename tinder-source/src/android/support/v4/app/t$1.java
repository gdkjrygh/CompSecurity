// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.widget.ListView;

// Referenced classes of package android.support.v4.app:
//            t

final class a
    implements Runnable
{

    final t a;

    public final void run()
    {
        a.mList.focusableViewAvailable(a.mList);
    }

    (t t1)
    {
        a = t1;
        super();
    }
}
