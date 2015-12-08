// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.fastscroll;

import android.view.View;

// Referenced classes of package com.skype.android.widget.fastscroll:
//            FastScrollDelegate

final class a
    implements Runnable
{

    final FastScrollDelegate a;

    public final void run()
    {
        FastScrollDelegate.a(a);
        a.a.invalidate();
    }

    (FastScrollDelegate fastscrolldelegate)
    {
        a = fastscrolldelegate;
        super();
    }
}
