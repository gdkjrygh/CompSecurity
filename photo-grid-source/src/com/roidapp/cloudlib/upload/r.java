// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.upload;

import android.view.View;

// Referenced classes of package com.roidapp.cloudlib.upload:
//            o, UploadManagerActivity, c

final class r
    implements android.view.View.OnClickListener
{

    final o a;

    r(o o1)
    {
        a = o1;
        super();
    }

    public final void onClick(View view)
    {
        if (view.getTag() != null)
        {
            int i = Integer.parseInt(view.getTag().toString());
            a.a.d.a(i);
        }
    }
}
