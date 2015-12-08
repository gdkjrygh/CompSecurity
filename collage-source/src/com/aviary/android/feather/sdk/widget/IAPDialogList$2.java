// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.widget.ListView;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            IAPDialogList

class a
    implements Runnable
{

    final IAPDialogList a;

    public void run()
    {
        if (IAPDialogList.c(a) != null)
        {
            IAPDialogList.c(a).clearFocus();
            IAPDialogList.c(a).clearChoices();
            IAPDialogList.c(a).invalidateViews();
        }
    }

    (IAPDialogList iapdialoglist)
    {
        a = iapdialoglist;
        super();
    }
}
