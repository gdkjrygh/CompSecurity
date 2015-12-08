// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.helper;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.pinterest.activity.create.PhotoGalleryActivity;

class val.view
    implements Runnable
{

    final val.view this$0;
    final View val$view;

    public void run()
    {
        Intent intent = new Intent(val$view.getContext(), com/pinterest/activity/create/PhotoGalleryActivity);
        val$view.getContext().startActivity(intent);
    }

    ()
    {
        this$0 = final_;
        val$view = View.this;
        super();
    }
}
