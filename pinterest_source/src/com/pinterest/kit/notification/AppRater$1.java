// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.notification;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.pinterest.kit.notification:
//            AppRater

final class val.editor
    implements android.content.face.OnClickListener
{

    final Context val$context;
    final android.content.rences.Editor val$editor;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        val$context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(AppRater.access$000())));
        if (val$editor != null)
        {
            val$editor.putBoolean("ARater__DONT_SHOW", true);
            val$editor.commit();
        }
        dialoginterface.dismiss();
    }

    tener()
    {
        val$context = context1;
        val$editor = editor1;
        super();
    }
}
