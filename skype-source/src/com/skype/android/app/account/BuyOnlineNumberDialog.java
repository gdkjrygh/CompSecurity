// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.Account;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.app.NavigationUrl;
import com.skype.android.util.SkypeCredit;
import com.skype.android.util.SkypeNumber;
import java.util.Date;

public class BuyOnlineNumberDialog extends SkypeDialogFragment
{

    Account account;
    private int buttonResourceId;
    NavigationUrl navigationUrl;
    SkypeCredit skypeCredit;
    SkypeNumber skypeNumber;

    public BuyOnlineNumberDialog()
    {
        buttonResourceId = 0;
    }

    private static final String formatDate(Context context, long l)
    {
        return DateFormat.getDateFormat(context).format(new Date(l));
    }

    private void update(View view)
    {
        ImageView imageview = (ImageView)view.findViewById(0x7f10033a);
        imageview.setImageResource(0x7f0201df);
        long l = (long)account.getCapabilityStatus(com.skype.Contact.CAPABILITY.CAPABILITY_SKYPEIN).m_expiryTimestamp * 1000L;
        String as[] = account.getSkypeinNumbersProp().split(" ");
        TextView textview3 = (TextView)view.findViewById(0x7f10033b);
        TextView textview = (TextView)view.findViewById(0x7f10033c);
        textview.setVisibility(8);
        TextView textview1 = (TextView)view.findViewById(0x7f10033d);
        TextView textview2 = (TextView)view.findViewById(0x7f10033e);
        buttonResourceId = 0;
        Object obj = null;
        view = null;
        int i = 0x7f080485;
        int j = 0x7f080462;
        if (l == 0L)
        {
            textview3.setVisibility(8);
            imageview.setVisibility(8);
            buttonResourceId = 0x7f080116;
        } else
        if (skypeNumber.a())
        {
            buttonResourceId = 0x7f080171;
            textview3.setText(getString(0x7f080433, new Object[] {
                formatDate(getActivity(), l)
            }));
        } else
        if (skypeNumber.b())
        {
            textview3.setText(0x7f080432);
            buttonResourceId = 0x7f080171;
        } else
        {
            textview.setVisibility(0);
            imageview.setVisibility(8);
            boolean flag = false;
            j = 0;
            textview3.setText(0x7f0804e8);
            view = obj;
            if (as != null)
            {
                view = new StringBuilder();
                int k = as.length;
                for (i = 0; i < k; i++)
                {
                    view.append(as[i]).append("\n");
                }

                view = view.toString();
                view = view.substring(0, view.length() - 1);
            }
            buttonResourceId = 0x7f080355;
            i = ((flag) ? 1 : 0);
        }
        if (view != null)
        {
            textview.setText(view);
        }
        if (i != 0)
        {
            textview1.setText(i);
        } else
        {
            textview1.setVisibility(8);
        }
        if (j != 0)
        {
            textview2.setText(j);
            return;
        } else
        {
            textview2.setVisibility(8);
            return;
        }
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
        update(view);
        bundle.b(view);
        bundle.a(0x7f080278);
        bundle.b(0x7f080120, null);
        bundle.a(buttonResourceId, new android.content.DialogInterface.OnClickListener() {

            final BuyOnlineNumberDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                navigationUrl.goToUrl(getActivity(), com.skype.android.res.Urls.Type.c);
            }

            
            {
                this$0 = BuyOnlineNumberDialog.this;
                super();
            }
        });
        bundle = bundle.c();
        bundle.setCanceledOnTouchOutside(true);
        return bundle;
    }
}
