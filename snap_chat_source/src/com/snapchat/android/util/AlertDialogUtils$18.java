// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.snapchat.android.util:
//            AlertDialogUtils

static final class val.context
    implements android.content.ickListener
{

    final Context val$context;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse("http://productforums.google.com/forum/#!topic/mobile/gsBvuZzG_xc/discussion"));
        dialoginterface.setFlags(32768);
        try
        {
            val$context.startActivity(dialoginterface);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            AlertDialogUtils.a("Could not start browser", val$context);
        }
    }

    r(Context context1)
    {
        val$context = context1;
        super();
    }
}
