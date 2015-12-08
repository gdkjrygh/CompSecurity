// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.pandora.android.util:
//            s

static final class b
    implements android.content.gInterface.OnClickListener
{

    final Context a;
    final Intent b;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            a.startActivity(b);
            break;
        }
    }

    e(Context context, Intent intent)
    {
        a = context;
        b = intent;
        super();
    }
}
