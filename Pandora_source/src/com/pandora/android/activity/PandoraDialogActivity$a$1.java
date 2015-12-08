// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.content.DialogInterface;
import com.pandora.android.util.s;

// Referenced classes of package com.pandora.android.activity:
//            PandoraDialogActivity, b

class a
    implements android.content.istener
{

    final Activity a;
    final a b;

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (com.pandora.android.activity.b.a().d() == 1)
        {
            s.s();
        }
        a.finish();
    }

    ( , Activity activity)
    {
        b = ;
        a = activity;
        super();
    }
}
