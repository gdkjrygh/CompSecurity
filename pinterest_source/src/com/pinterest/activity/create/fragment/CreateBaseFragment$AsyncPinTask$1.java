// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import com.pinterest.base.Application;

class val.message
    implements Runnable
{

    final val.message this$1;
    final String val$message;

    public void run()
    {
        Application.showToastShort(val$message);
    }

    ()
    {
        this$1 = final_;
        val$message = String.this;
        super();
    }
}
