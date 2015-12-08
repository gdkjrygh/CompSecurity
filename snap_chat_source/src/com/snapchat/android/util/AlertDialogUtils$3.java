// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import android.content.DialogInterface;
import android.content.SharedPreferences;

// Referenced classes of package com.snapchat.android.util:
//            AlertDialogUtils

static final class val.prefs
    implements android.content.lickListener
{

    final SharedPreferences val$prefs;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = val$prefs.edit();
        dialoginterface.putBoolean("firstTimeUsingBeta", false);
        dialoginterface.apply();
    }

    er(SharedPreferences sharedpreferences)
    {
        val$prefs = sharedpreferences;
        super();
    }
}
