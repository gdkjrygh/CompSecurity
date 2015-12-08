// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.database.DataSetObserver;
import vl;

// Referenced classes of package android.support.v7.internal.widget:
//            ActivityChooserView

public final class a extends DataSetObserver
{

    private ActivityChooserView a;

    public final void onChanged()
    {
        super.onChanged();
        ActivityChooserView.a(a).notifyDataSetChanged();
    }

    public final void onInvalidated()
    {
        super.onInvalidated();
        ActivityChooserView.a(a).notifyDataSetInvalidated();
    }

    (ActivityChooserView activitychooserview)
    {
        a = activitychooserview;
        super();
    }
}
