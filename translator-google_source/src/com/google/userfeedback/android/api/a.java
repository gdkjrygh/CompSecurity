// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.view.View;

// Referenced classes of package com.google.userfeedback.android.api:
//            m, PreviewActivity

final class a
    implements android.view.View.OnClickListener
{

    final Activity a;
    final PreviewActivity b;

    a(PreviewActivity previewactivity, Activity activity)
    {
        b = previewactivity;
        a = activity;
        super();
    }

    public final void onClick(View view)
    {
        view = m.c;
        Dialog dialog = view.a(a, ((m) (view)).d, ((m) (view)).e, ((m) (view)).b);
        if (dialog == null)
        {
            view.a(((m) (view)).d, ((m) (view)).e, ((m) (view)).b);
            view = new Intent();
            b.setResult(-1, view);
            b.finish();
            return;
        } else
        {
            dialog.show();
            return;
        }
    }
}
