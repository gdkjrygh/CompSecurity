// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.app.AlertDialog;
import android.content.DialogInterface;

// Referenced classes of package com.EnterpriseMobileBanking:
//            AppHelper

static final class stener
    implements android.content.ce.OnClickListener
{

    public void onClick(DialogInterface dialoginterface, int i)
    {
        AppHelper.access$200().cancel();
        AlertDialog _tmp = AppHelper.access$202(null);
    }

    stener()
    {
    }
}
