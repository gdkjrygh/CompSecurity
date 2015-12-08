// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.app.NavigationUrl;

public class BuyCallForwardingDialog extends SkypeDialogFragment
{

    NavigationUrl navigationUrl;

    public BuyCallForwardingDialog()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getMaterialDialogBuilder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(0x7f030070, null);
        bundle.b(view);
        ((TextView)view.findViewById(0x7f10033b)).setText(getString(0x7f08046c));
        ((TextView)view.findViewById(0x7f10033d)).setText(0x7f08046d);
        ((TextView)view.findViewById(0x7f10033e)).setVisibility(8);
        ((ImageView)view.findViewById(0x7f10033a)).setVisibility(8);
        bundle.a(0x7f080232);
        bundle.a(0x7f080115, new android.content.DialogInterface.OnClickListener() {

            final BuyCallForwardingDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                navigationUrl.goToUrl(getActivity(), com.skype.android.res.Urls.Type.e);
            }

            
            {
                this$0 = BuyCallForwardingDialog.this;
                super();
            }
        });
        bundle.b(0x7f080120, null);
        bundle = bundle.c();
        bundle.setCanceledOnTouchOutside(true);
        return bundle;
    }
}
