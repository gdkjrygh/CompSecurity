// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.content.DialogInterface;

// Referenced classes of package com.EnterpriseMobileBanking:
//            AppHelper

static final class val.lob
    implements android.content.ce.OnClickListener
{

    final String val$lob;
    final String val$save;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        android.app.AlertDialog _tmp = AppHelper.access$202(null);
        AppHelper.access$300(val$save, val$lob);
    }

    stener(String s, String s1)
    {
        val$save = s;
        val$lob = s1;
        super();
    }
}
