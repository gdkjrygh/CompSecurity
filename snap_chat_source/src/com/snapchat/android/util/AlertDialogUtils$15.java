// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import android.content.Context;
import android.widget.Toast;
import com.snapchat.android.Timber;

// Referenced classes of package com.snapchat.android.util:
//            AlertDialogUtils

static final class val.context
    implements Runnable
{

    final Context val$context;
    final int val$length;
    final String val$string;

    public final void run()
    {
        int i = AlertDialogUtils.a(val$length);
        try
        {
            if (AlertDialogUtils.a(val$string))
            {
                AlertDialogUtils.a(Toast.makeText(val$context, val$string, i));
                AlertDialogUtils.b().show();
                return;
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            Timber.c("AlertDialogUtils", "Well, this is awkward.", new Object[0]);
            Timber.a("AlertDialogUtils", illegalstateexception);
            return;
        }
        Timber.d("AlertDialogUtils", (new StringBuilder("Toasting wayyy too many times ")).append(val$string).toString(), new Object[0]);
        return;
    }

    (int i, String s, Context context1)
    {
        val$length = i;
        val$string = s;
        val$context = context1;
        super();
    }
}
