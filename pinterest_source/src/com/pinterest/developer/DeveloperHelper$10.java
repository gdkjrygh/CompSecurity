// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.developer;

import android.view.View;
import com.pinterest.activity.contacts.UploadContactsDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.base.Events;

final class ctsDialog
    implements android.view.r
{

    public final void onClick(View view)
    {
        Events.post(new DialogEvent(new UploadContactsDialog()));
    }

    ctsDialog()
    {
    }
}
