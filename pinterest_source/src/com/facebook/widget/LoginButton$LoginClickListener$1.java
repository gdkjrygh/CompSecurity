// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.DialogInterface;
import com.facebook.Session;

class val.openSession
    implements android.content.r._cls1
{

    final val.openSession this$1;
    final Session val$openSession;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        val$openSession.closeAndClearTokenInformation();
    }

    ()
    {
        this$1 = final_;
        val$openSession = Session.this;
        super();
    }
}
