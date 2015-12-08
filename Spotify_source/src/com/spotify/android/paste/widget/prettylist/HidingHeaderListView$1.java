// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget.prettylist;

import android.database.DataSetObserver;

// Referenced classes of package com.spotify.android.paste.widget.prettylist:
//            HidingHeaderListView

final class a extends DataSetObserver
{

    private HidingHeaderListView a;

    public final void onChanged()
    {
        if (HidingHeaderListView.a(a))
        {
            a.requestLayout();
        }
    }

    public final void onInvalidated()
    {
        if (HidingHeaderListView.a(a))
        {
            a.requestLayout();
        }
    }

    (HidingHeaderListView hidingheaderlistview)
    {
        a = hidingheaderlistview;
        super();
    }
}
