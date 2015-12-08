// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.upload;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.cloudlib.upload:
//            UploadManagerActivity, c

final class l
    implements android.content.DialogInterface.OnClickListener
{

    final UploadManagerActivity a;

    l(UploadManagerActivity uploadmanageractivity)
    {
        a = uploadmanageractivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.d.c(UploadManagerActivity.a(a));
    }
}
