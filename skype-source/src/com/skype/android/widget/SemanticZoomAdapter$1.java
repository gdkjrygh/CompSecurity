// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import com.skype.android.widget.recycler.OnAnyChangeObserver;

// Referenced classes of package com.skype.android.widget:
//            SemanticZoomAdapter

final class server extends OnAnyChangeObserver
{

    final SemanticZoomAdapter a;

    public final void onChanged()
    {
        a.notifyDataSetChanged();
    }

    server(SemanticZoomAdapter semanticzoomadapter)
    {
        a = semanticzoomadapter;
        super();
    }
}
