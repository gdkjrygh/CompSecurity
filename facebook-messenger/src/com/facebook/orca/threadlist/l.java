// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.view.View;

// Referenced classes of package com.facebook.orca.threadlist:
//            SyncDisabledWarningView

class l
    implements android.view.View.OnClickListener
{

    final SyncDisabledWarningView a;

    l(SyncDisabledWarningView syncdisabledwarningview)
    {
        a = syncdisabledwarningview;
        super();
    }

    public void onClick(View view)
    {
        SyncDisabledWarningView.a(a);
    }
}
