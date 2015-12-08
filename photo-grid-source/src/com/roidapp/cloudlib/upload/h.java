// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.upload;

import android.view.View;
import com.roidapp.baselib.e.l;

// Referenced classes of package com.roidapp.cloudlib.upload:
//            UploadManagerActivity, c

final class h
    implements android.view.View.OnClickListener
{

    final UploadManagerActivity a;

    h(UploadManagerActivity uploadmanageractivity)
    {
        a = uploadmanageractivity;
        super();
    }

    public final void onClick(View view)
    {
        if (a.d.f())
        {
            return;
        }
        if (a.d.c() - a.d.d() > 10 && !l.c(a))
        {
            a.showDialog(1);
            return;
        } else
        {
            a.d.b();
            return;
        }
    }
}
