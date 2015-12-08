// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.roidapp.cloudlib.common.e;
import com.roidapp.cloudlib.template.b.c;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            TemplateSelectorActivity

final class cs extends e
{

    final TemplateSelectorActivity a;

    cs(TemplateSelectorActivity templateselectoractivity)
    {
        a = templateselectoractivity;
        super();
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        getDialog().setCanceledOnTouchOutside(false);
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        if (TemplateSelectorActivity.d(a) != null)
        {
            TemplateSelectorActivity.d(a).removeMessages(9218);
        }
    }
}
