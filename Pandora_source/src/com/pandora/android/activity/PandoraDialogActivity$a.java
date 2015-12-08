// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.pandora.android.util.s;

// Referenced classes of package com.pandora.android.activity:
//            PandoraDialogActivity, b

private abstract class <init>
{

    final PandoraDialogActivity a;

    private AlertDialog a(Activity activity, android.content.istener istener, int i, android.content.istener istener1, int j, boolean flag, String s)
    {
        android.app.smissListener smisslistener = new android.app.t>(activity);
        smisslistener.essage(s).ancelable(flag).egativeButton(activity.getString(j), istener1).ositiveButton(activity.getString(i), istener);
        istener = smisslistener.te();
        istener.setOnDismissListener(new android.content.DialogInterface.OnDismissListener(activity) {

            final Activity a;
            final PandoraDialogActivity.a b;

            public void onDismiss(DialogInterface dialoginterface)
            {
                if (com.pandora.android.activity.b.a().d() == 1)
                {
                    com.pandora.android.util.s.s();
                }
                a.finish();
            }

            
            {
                b = PandoraDialogActivity.a.this;
                a = activity;
                super();
            }
        });
        return istener;
    }

    static AlertDialog a(_cls1.a a1, Activity activity, android.content.istener istener, int i, android.content.istener istener1, int j, boolean flag, String s)
    {
        return a1.a(activity, istener, i, istener1, j, flag, s);
    }

    protected abstract AlertDialog a(Activity activity);

    private _cls1.a(PandoraDialogActivity pandoradialogactivity)
    {
        a = pandoradialogactivity;
        super();
    }

    a(PandoraDialogActivity pandoradialogactivity, a a1)
    {
        this(pandoradialogactivity);
    }
}
