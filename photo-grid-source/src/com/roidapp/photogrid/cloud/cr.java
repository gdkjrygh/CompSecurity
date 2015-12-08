// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.app.AlertDialog;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            TemplateSelectorActivity

final class cr
    implements android.view.View.OnClickListener
{

    final AlertDialog a;
    final TemplateSelectorActivity b;

    cr(TemplateSelectorActivity templateselectoractivity, AlertDialog alertdialog)
    {
        b = templateselectoractivity;
        a = alertdialog;
        super();
    }

    public final void onClick(View view)
    {
        if (view.getId() == 0x7f0d00eb)
        {
            TemplateSelectorActivity.g(b);
        } else
        {
            TemplateSelectorActivity.h(b);
        }
        a.dismiss();
    }
}
