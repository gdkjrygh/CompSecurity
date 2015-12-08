// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import jz;

// Referenced classes of package com.spotify.android.paste.widget:
//            HeaderView, ViewPagerIndicator

public final class a extends DataSetObserver
{

    private HeaderView a;

    private void a()
    {
        HeaderView.a(a).requestLayout();
        HeaderView.a(a).invalidate();
        ((jz) (HeaderView.b(a))).a.notifyChanged();
    }

    public final void onChanged()
    {
        a();
    }

    public final void onInvalidated()
    {
        a();
    }

    cator(HeaderView headerview)
    {
        a = headerview;
        super();
    }
}
