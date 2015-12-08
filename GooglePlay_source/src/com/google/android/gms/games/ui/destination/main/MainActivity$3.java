// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import android.content.DialogInterface;
import com.google.android.gms.games.ui.destination.sharedprefs.SharedPrefsConfig;

// Referenced classes of package com.google.android.gms.games.ui.destination.main:
//            MainActivity

final class this._cls0
    implements android.content..OnClickListener
{

    final MainActivity this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        SharedPrefsConfig.setBoolean(MainActivity.this, "showConfidentialityWarning", false);
    }

    efsConfig()
    {
        this$0 = MainActivity.this;
        super();
    }
}
