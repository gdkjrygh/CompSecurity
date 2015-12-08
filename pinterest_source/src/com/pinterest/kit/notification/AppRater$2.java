// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.notification;

import android.content.DialogInterface;

final class val.editor
    implements android.content.face.OnClickListener
{

    final android.content.rences.Editor val$editor;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (val$editor != null)
        {
            val$editor.putLong("ARater__REMINDED_DATE", System.currentTimeMillis());
            val$editor.commit();
        }
        dialoginterface.dismiss();
    }

    tener()
    {
        val$editor = editor1;
        super();
    }
}
