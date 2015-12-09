// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.support.v4.app.Fragment;
import com.google.android.gms.games.appcontent.AppContentSection;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentFragment

final class val.isLast
    implements Runnable
{

    final val.isLast this$1;
    final boolean val$isLast;
    final AppContentSection val$section;

    public final void run()
    {
        if (!_fld0.isLast && ((Fragment) (_fld0)).mActivity != null)
        {
            AppContentFragment.access$1000(_fld0, val$section, val$isLast);
        }
    }

    ()
    {
        this$1 = final_;
        val$section = appcontentsection;
        val$isLast = Z.this;
        super();
    }
}
