// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.view.View;

// Referenced classes of package com.pandora.android.view:
//            TrackInfoView

class a
    implements android.view.Listener
{

    final TrackInfoView a;

    public boolean onLongClick(View view)
    {
        return true;
    }

    (TrackInfoView trackinfoview)
    {
        a = trackinfoview;
        super();
    }
}
