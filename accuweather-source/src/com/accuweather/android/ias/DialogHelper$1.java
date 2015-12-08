// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.ias;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.accuweather.android.ias:
//            DialogHelper

static final class val.context
    implements android.content..OnClickListener
{

    final Context val$context;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.cancel();
        ((Activity)val$context).finish();
    }

    ener(Context context1)
    {
        val$context = context1;
        super();
    }
}
