// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.upload;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.roidapp.cloudlib.upload:
//            UploadManagerActivity

public class a extends BroadcastReceiver
{

    final UploadManagerActivity a;

    public void onReceive(Context context, Intent intent)
    {
        UploadManagerActivity.b(a);
    }

    public (UploadManagerActivity uploadmanageractivity)
    {
        a = uploadmanageractivity;
        super();
    }
}
