// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.messagetemplates;

import android.view.View;

// Referenced classes of package com.leanplum.messagetemplates:
//            BaseMessageDialog

final class g
    implements android.view.View.OnClickListener
{

    private BaseMessageDialog a;

    g(BaseMessageDialog basemessagedialog)
    {
        a = basemessagedialog;
        super();
    }

    public final void onClick(View view)
    {
        a.cancel();
    }
}
