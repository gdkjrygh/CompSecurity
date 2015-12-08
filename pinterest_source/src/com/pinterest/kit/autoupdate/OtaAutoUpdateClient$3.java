// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.autoupdate;

import android.view.View;
import com.pinterest.activity.task.dialog.BaseDialog;

// Referenced classes of package com.pinterest.kit.autoupdate:
//            AutoUpdateManager

final class a
    implements android.view.oUpdateClient._cls3
{

    final BaseDialog a;

    public final void onClick(View view)
    {
        AutoUpdateManager.a().startUpdate(null);
        a.dismiss();
    }

    (BaseDialog basedialog)
    {
        a = basedialog;
        super();
    }
}
