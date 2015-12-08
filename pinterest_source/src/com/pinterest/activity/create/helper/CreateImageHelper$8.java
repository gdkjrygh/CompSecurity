// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.helper;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.task.dialog.BaseDialog;

final class val.dialog
    implements android.widget.ickListener
{

    final BaseDialog val$dialog;
    final com.pinterest.activity.task.dialog.lickListener val$dialogClick;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        val$dialogClick.onClick(val$dialog, i);
    }

    ckListener()
    {
        val$dialogClick = licklistener;
        val$dialog = basedialog;
        super();
    }
}
