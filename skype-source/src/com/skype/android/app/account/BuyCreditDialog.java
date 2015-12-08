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
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.app.NavigationUrl;
import com.skype.android.util.SkypeCredit;
import java.util.Date;

public class BuyCreditDialog extends SkypeDialogFragment
{

    private int buttonResourceId;
    SkypeCredit credit;
    NavigationUrl navigationUrl;
    private int titleResourceId;

    public BuyCreditDialog()
    {
    }

    private static final String formatDate(Context context, long l)
    {
        return DateFormat.getDateFormat(context).format(new Date(1000L * l));
    }

    private void update(View view)
    {
        credit.a();
        TextView textview;
        TextView textview1;
        TextView textview2;
        int i;
        int j;
        if (credit.e())
        {
            i = 0;
        } else
        {
            i = credit.c();
        }
        ((ImageView)view.findViewById(0x7f10033a)).setImageResource(0x7f0201fa);
        ((TextView)view.findViewById(0x7f10033b)).setText(credit.h());
        textview = (TextView)view.findViewById(0x7f10033c);
        textview1 = (TextView)view.findViewById(0x7f10033d);
        textview2 = (TextView)view.findViewById(0x7f10033e);
        j = 0;
        if (credit.d() <= 0L)
        {
            titleResourceId = 0x7f080274;
            buttonResourceId = 0x7f080115;
            i = 0x7f0804ce;
            j = 0x7f0804cf;
            view = getString(0x7f080430);
        } else
        if (credit.f())
        {
            titleResourceId = 0x7f08042e;
            buttonResourceId = 0x7f080350;
            view = getString(0x7f080431, new Object[] {
                formatDate(getActivity(), credit.d())
            });
            i = 0x7f0804d2;
        } else
        if (credit.g())
        {
            titleResourceId = 0x7f080274;
            buttonResourceId = 0x7f080350;
            view = getString(0x7f08042f);
            i = 0x7f0804d2;
        } else
        {
            if (i > 0)
            {
                if (i < 100)
                {
                    i = 0x7f080275;
                } else
                {
                    i = 0x7f080274;
                }
                titleResourceId = i;
                view = getString(0x7f080431, new Object[] {
                    formatDate(getActivity(), credit.d())
                });
            } else
            {
                titleResourceId = 0x7f080274;
                view = getString(0x7f080430);
            }
            i = 0x7f0804ce;
            j = 0x7f0804cf;
            buttonResourceId = 0x7f080115;
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
        bundle.b(view);
        bundle.b();
        update(view);
        bundle.a(titleResourceId);
        bundle.b(0x7f080117, new android.content.DialogInterface.OnClickListener() {

            final BuyCreditDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                navigationUrl.goToUrl(getActivity(), com.skype.android.res.Urls.Type.f);
            }

            
            {
                this$0 = BuyCreditDialog.this;
                super();
            }
        });
        bundle.a(buttonResourceId, new android.content.DialogInterface.OnClickListener() {

            final BuyCreditDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                navigationUrl.goToUrl(getActivity(), com.skype.android.res.Urls.Type.e);
            }

            
            {
                this$0 = BuyCreditDialog.this;
                super();
            }
        });
        bundle = bundle.c();
        bundle.getWindow().addFlags(2);
        bundle.setCanceledOnTouchOutside(true);
        return bundle;
    }
}
