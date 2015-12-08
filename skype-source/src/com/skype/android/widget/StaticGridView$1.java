// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.database.DataSetObserver;
import com.skype.android.util.UpdateScheduler;

// Referenced classes of package com.skype.android.widget:
//            StaticGridView

final class a extends DataSetObserver
{

    final StaticGridView a;

    public final void onChanged()
    {
        StaticGridView.a(a).a(0);
    }

    (StaticGridView staticgridview)
    {
        a = staticgridview;
        super();
    }
}
