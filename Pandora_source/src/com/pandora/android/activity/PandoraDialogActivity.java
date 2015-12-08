// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.pandora.android.iap.c;
import com.pandora.android.iap.d;
import com.pandora.android.util.s;
import com.pandora.radio.data.af;
import p.cc.e;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity, b

public class PandoraDialogActivity extends BaseFragmentActivity
{
    private abstract class a
    {

        final PandoraDialogActivity a;

        private AlertDialog a(Activity activity, android.content.DialogInterface.OnClickListener onclicklistener, int i, android.content.DialogInterface.OnClickListener onclicklistener1, int j, boolean flag, String s)
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
            builder.setMessage(s).setCancelable(flag).setNegativeButton(activity.getString(j), onclicklistener1).setPositiveButton(activity.getString(i), onclicklistener);
            onclicklistener = builder.create();
            onclicklistener.setOnDismissListener(new android.content.DialogInterface.OnDismissListener(this, activity) {

                final Activity a;
                final a b;

                public void onDismiss(DialogInterface dialoginterface)
                {
                    if (com.pandora.android.activity.b.a().d() == 1)
                    {
                        s.s();
                    }
                    a.finish();
                }

            
            {
                b = a1;
                a = activity;
                super();
            }
            });
            return onclicklistener;
        }

        static AlertDialog a(a a1, Activity activity, android.content.DialogInterface.OnClickListener onclicklistener, int i, android.content.DialogInterface.OnClickListener onclicklistener1, int j, boolean flag, String s)
        {
            return a1.a(activity, onclicklistener, i, onclicklistener1, j, flag, s);
        }

        protected abstract AlertDialog a(Activity activity);

        private a()
        {
            a = PandoraDialogActivity.this;
            super();
        }

    }

    private class b extends a
    {

        final PandoraDialogActivity b;
        private Intent c;

        static Intent a(b b1)
        {
            return b1.c;
        }

        protected AlertDialog a(Activity activity)
        {
            String s = String.format(activity.getString(0x7f080204), new Object[] {
                com.pandora.android.provider.b.a.d().c()
            });
            return a.a(this, activity, new android.content.DialogInterface.OnClickListener(this) {

                final b a;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    if (s.m())
                    {
                        com.pandora.android.iap.d.d.a().e().a(b.a(a).getStringExtra("AMAZON_PURCHASE_USER"), b.a(a).getStringExtra("AMAZON_PURCHASE_TOKEN"), b.a(a).getStringExtra("AMAZON_PURCHASE_SKU"));
                    } else
                    {
                        e e1 = new e(null, b.a(a).getStringExtra("GOOGLEPLAY_PURCHASE_TOKEN"), b.a(a).getStringExtra("GOOGLEPLAY_PURCHASE_ORDER_ID"), b.a(a).getStringExtra("GOOGLEPLAY_PURCHASE_ITEM"), null);
                        com.pandora.android.iap.d.d.a().d().b(e1);
                    }
                    dialoginterface.cancel();
                }

            
            {
                a = b1;
                super();
            }
            }, 0x7f080201, new android.content.DialogInterface.OnClickListener(this) {

                final b a;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface.cancel();
                }

            
            {
                a = b1;
                super();
            }
            }, 0x7f0800c3, true, s);
        }

        public b(Intent intent)
        {
            b = PandoraDialogActivity.this;
            super();
            c = intent;
        }
    }


    public PandoraDialogActivity()
    {
    }

    public static Bundle a(Bundle bundle)
    {
        bundle.putInt("dialog_type", 2174);
        return bundle;
    }

    protected void a(Context context, Intent intent, String s)
    {
    }

    protected IntentFilter l()
    {
        return null;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent().getExtras();
        if (bundle == null || !bundle.containsKey("dialog_type"))
        {
            finish();
            throw new UnsupportedOperationException("Unknown dialog type! Make sure to add dialog type by calling appendDialogTypeToExtras() before starting PandoraDialogActivity");
        }
        switch (bundle.getInt("dialog_type"))
        {
        default:
            finish();
            throw new UnsupportedOperationException("PandoraDialogFactory: Unknown dialog type. Have you declared your dialog in PandoraDialogActivity?");

        case 2174: 
            (new b(getIntent())).a(this).show();
            break;
        }
    }
}
