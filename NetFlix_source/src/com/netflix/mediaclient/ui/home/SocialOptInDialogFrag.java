// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.home;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import java.util.concurrent.atomic.AtomicBoolean;

public class SocialOptInDialogFrag extends NetflixDialogFrag
{
    public static interface OptInResponseHandler
    {

        public abstract void onAccept();

        public abstract void onDecline();
    }


    private static final String TAG = "social";
    private final AtomicBoolean mClicked = new AtomicBoolean(false);

    public SocialOptInDialogFrag()
    {
    }

    public static SocialOptInDialogFrag newInstance()
    {
        SocialOptInDialogFrag socialoptindialogfrag = new SocialOptInDialogFrag();
        socialoptindialogfrag.setStyle(1, 0x7f0d00cb);
        socialoptindialogfrag.setArguments(new Bundle());
        return socialoptindialogfrag;
    }

    public boolean isLoadingData()
    {
        return false;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030061, viewgroup);
        viewgroup = (Button)layoutinflater.findViewById(0x7f070066);
        bundle = (Button)layoutinflater.findViewById(0x7f07006a);
        bundle.requestFocus();
        final OptInResponseHandler handler = getActivity();
        if (!(handler instanceof OptInResponseHandler))
        {
            Log.e("social", "Activity is not OptInResponseHandler! THis should not happen!");
            return layoutinflater;
        }
        handler = (OptInResponseHandler)handler;
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            final SocialOptInDialogFrag this$0;
            final OptInResponseHandler val$handler;

            public void onClick(View view)
            {
label0:
                {
                    Log.d("social", "User opted In!");
                    synchronized (mClicked)
                    {
                        if (!mClicked.get())
                        {
                            break label0;
                        }
                        Log.w("social", "Already clicked!");
                    }
                    return;
                }
                mClicked.set(true);
                view;
                JVM INSTR monitorexit ;
                dismiss();
                getFragmentManager().beginTransaction().remove(SocialOptInDialogFrag.this).commit();
                handler.onAccept();
                return;
                exception;
                view;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$0 = SocialOptInDialogFrag.this;
                handler = optinresponsehandler;
                super();
            }
        });
        if (viewgroup != null)
        {
            viewgroup.setOnClickListener(new android.view.View.OnClickListener() {

                final SocialOptInDialogFrag this$0;
                final OptInResponseHandler val$handler;

                public void onClick(View view)
                {
label0:
                    {
                        Log.d("social", "User opted out!");
                        synchronized (mClicked)
                        {
                            if (!mClicked.get())
                            {
                                break label0;
                            }
                            Log.w("social", "Already clicked!");
                        }
                        return;
                    }
                    mClicked.set(true);
                    view;
                    JVM INSTR monitorexit ;
                    dismiss();
                    getFragmentManager().beginTransaction().remove(SocialOptInDialogFrag.this).commit();
                    handler.onDecline();
                    return;
                    exception;
                    view;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                this$0 = SocialOptInDialogFrag.this;
                handler = optinresponsehandler;
                super();
            }
            });
            return layoutinflater;
        } else
        {
            Log.e("social", "NO button not found! THis should not happen!");
            return layoutinflater;
        }
    }

}
