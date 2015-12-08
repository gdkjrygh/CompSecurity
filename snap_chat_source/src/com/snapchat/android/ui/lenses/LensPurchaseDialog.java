// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.lenses;

import BQ;
import BY;
import Gu;
import Zf;
import Zj;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.snapchat.android.billing.InAppBillingManager;

public class LensPurchaseDialog extends DialogFragment
{
    public static final class LensPurchaseDialogResult extends Enum
    {

        private static final LensPurchaseDialogResult $VALUES[];
        public static final LensPurchaseDialogResult BUY;
        public static final LensPurchaseDialogResult CANCEL;

        public static LensPurchaseDialogResult valueOf(String s)
        {
            return (LensPurchaseDialogResult)Enum.valueOf(com/snapchat/android/ui/lenses/LensPurchaseDialog$LensPurchaseDialogResult, s);
        }

        public static LensPurchaseDialogResult[] values()
        {
            return (LensPurchaseDialogResult[])$VALUES.clone();
        }

        static 
        {
            BUY = new LensPurchaseDialogResult("BUY", 0);
            CANCEL = new LensPurchaseDialogResult("CANCEL", 1);
            $VALUES = (new LensPurchaseDialogResult[] {
                BUY, CANCEL
            });
        }

        private LensPurchaseDialogResult(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface a
    {

        public abstract void a(LensPurchaseDialogResult lenspurchasedialogresult, BY by);
    }


    private final Zf a;
    private a b;

    public LensPurchaseDialog()
    {
        this(Gu.a().a);
    }

    private LensPurchaseDialog(Zf zf)
    {
        a = zf;
    }

    static a a(LensPurchaseDialog lenspurchasedialog)
    {
        return lenspurchasedialog.b;
    }

    public static LensPurchaseDialog a(BY by, InAppBillingManager inappbillingmanager)
    {
        LensPurchaseDialog lenspurchasedialog = new LensPurchaseDialog();
        inappbillingmanager = inappbillingmanager.b(by.mGplayIapId, com.snapchat.android.billing.InAppBillingManager.SkuType.LENS);
        Bundle bundle = new Bundle();
        bundle.putSerializable("lens", by);
        bundle.putString("lens_price", inappbillingmanager);
        lenspurchasedialog.setArguments(bundle);
        return lenspurchasedialog;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            b = (a)getActivity();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new ClassCastException((new StringBuilder()).append(getActivity().toString()).append(" must implement LensPurchaseDialogListener").toString());
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        Object obj = getArguments();
        bundle = (BY)((Bundle) (obj)).getSerializable("lens");
        String s = ((Bundle) (obj)).getString("lens_price");
        obj = getActivity().getLayoutInflater().inflate(0x7f040094, null);
        ((TextView)((View) (obj)).findViewById(0x7f0d031e)).setText(getString(0x7f08016d, new Object[] {
            s
        }));
        ((View) (obj)).findViewById(0x7f0d031f).setOnClickListener(new android.view.View.OnClickListener(bundle) {

            private BY a;
            private LensPurchaseDialog b;

            public final void onClick(View view)
            {
                b.dismiss();
                LensPurchaseDialog.a(b).a(LensPurchaseDialogResult.BUY, a);
            }

            
            {
                b = LensPurchaseDialog.this;
                a = by;
                super();
            }
        });
        ((View) (obj)).findViewById(0x7f0d0320).setOnClickListener(new android.view.View.OnClickListener() {

            private LensPurchaseDialog a;

            public final void onClick(View view)
            {
                a.dismiss();
                LensPurchaseDialog.a(a).a(LensPurchaseDialogResult.CANCEL, null);
            }

            
            {
                a = LensPurchaseDialog.this;
                super();
            }
        });
        a.a(((BQ) (bundle)).mIconLink).a().a((ImageView)((View) (obj)).findViewById(0x7f0d0321), null);
        bundle = new Dialog(getActivity());
        bundle.requestWindowFeature(1);
        bundle.setContentView(((View) (obj)));
        bundle.getWindow().setBackgroundDrawableResource(0x106000d);
        return bundle;
    }

    public void onPause()
    {
        super.onPause();
        dismissAllowingStateLoss();
    }
}
