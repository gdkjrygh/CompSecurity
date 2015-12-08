// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import com.skype.android.widget.recycler.OnAnyChangeObserver;

// Referenced classes of package com.skype.android.widget:
//            SeparatedColumnsAdapter

final class er extends OnAnyChangeObserver
{

    final SeparatedColumnsAdapter a;

    public final void onChanged()
    {
        SeparatedColumnsAdapter.a(a);
    }

    er(SeparatedColumnsAdapter separatedcolumnsadapter)
    {
        a = separatedcolumnsadapter;
        super();
    }
}
