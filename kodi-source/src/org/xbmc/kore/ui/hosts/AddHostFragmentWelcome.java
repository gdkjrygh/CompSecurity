// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class AddHostFragmentWelcome extends Fragment
{
    public static interface AddHostWelcomeListener
    {

        public abstract void onAddHostWelcomeCancel();

        public abstract void onAddHostWelcomeNext();
    }


    private AddHostWelcomeListener listener;

    public AddHostFragmentWelcome()
    {
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (getView() == null)
        {
            return;
        } else
        {
            bundle = (TextView)getView().findViewById(0x7f0e006b);
            bundle.setText(Html.fromHtml(getString(0x7f0700c0)));
            bundle.setMovementMethod(LinkMovementMethod.getInstance());
            bundle = (Button)getView().findViewById(0x7f0e009c);
            bundle.setText(0x7f07005b);
            bundle.setOnClickListener(new android.view.View.OnClickListener() {

                final AddHostFragmentWelcome this$0;

                public void onClick(View view)
                {
                    listener.onAddHostWelcomeNext();
                }

            
            {
                this$0 = AddHostFragmentWelcome.this;
                super();
            }
            });
            bundle = (Button)getView().findViewById(0x7f0e0097);
            bundle.setText(0x1040000);
            bundle.setOnClickListener(new android.view.View.OnClickListener() {

                final AddHostFragmentWelcome this$0;

                public void onClick(View view)
                {
                    listener.onAddHostWelcomeCancel();
                }

            
            {
                this$0 = AddHostFragmentWelcome.this;
                super();
            }
            });
            return;
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            listener = (AddHostWelcomeListener)activity;
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implement AddHostWelcomeListener interface.").toString());
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030024, viewgroup, false);
    }

}
