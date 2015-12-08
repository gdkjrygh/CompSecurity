// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import android.content.DialogInterface;
import java.util.List;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins:
//            NotificationPlugin

static final class 
    implements android.content.ckListener
{

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        NotificationPlugin.access$000().remove(dialoginterface);
    }

    ()
    {
    }
}
