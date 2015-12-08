// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import android.content.DialogInterface;

// Referenced classes of package com.snapchat.android.util:
//            AlertDialogUtils

static final class val.onClickListener
    implements android.content.ickListener
{

    final android.content.ickListener val$onClickListener;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (val$onClickListener != null)
        {
            val$onClickListener.onClick(dialoginterface, i);
        }
        dialoginterface.cancel();
    }

    r(android.content.ickListener icklistener)
    {
        val$onClickListener = icklistener;
        super();
    }
}
