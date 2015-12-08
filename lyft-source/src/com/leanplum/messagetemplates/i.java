// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.messagetemplates;

import android.view.View;

// Referenced classes of package com.leanplum.messagetemplates:
//            BaseMessageDialog, BaseMessageOptions

final class i
    implements android.view.View.OnClickListener
{

    private BaseMessageDialog a;

    i(BaseMessageDialog basemessagedialog)
    {
        a = basemessagedialog;
        super();
    }

    public final void onClick(View view)
    {
        if (!BaseMessageDialog.b(a))
        {
            a.options.accept();
            a.cancel();
        }
    }
}
