// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty.discovery;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.base.view.DefaultViewHolder;
import com.google.android.apps.wallet.base.view.ViewHolder;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.android.apps.wallet.widgets.list.ListItemBinder;
import com.google.common.base.Strings;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

public class SimplifiedLoyaltyProgramListItemBinder
    implements ListItemBinder
{
    final class SimplifiedLoyaltyProgramListItemDisplay extends DefaultViewHolder
    {

        private TextView mCallToAction;
        private TextView mMerchantName;
        private TextView mProgramName;
        private ImageView programLogo;
        final SimplifiedLoyaltyProgramListItemBinder this$0;

        public final void setCallToAction(int i)
        {
            mCallToAction.setText(i);
        }

        public final void setCallToAction(String s)
        {
            mCallToAction.setText(s);
        }

        public final void setCallToActionVisible(boolean flag)
        {
            TextView textview = mCallToAction;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            textview.setVisibility(i);
        }

        public final void setMerchantName(String s)
        {
            mMerchantName.setText(s);
        }

        public final void setProgramLogo(String s)
        {
            if (Strings.isNullOrEmpty(s))
            {
                programLogo.setImageResource(com.google.android.apps.walletnfcrel.R.drawable.img_wobs_customgray);
                return;
            } else
            {
                picasso.load(Uri.parse(s)).resizeDimen(com.google.android.apps.walletnfcrel.R.dimen.list_item_primary_action, com.google.android.apps.walletnfcrel.R.dimen.list_item_primary_action).placeholder(com.google.android.apps.walletnfcrel.R.drawable.loyalty_img_loyalty_imgload).error(com.google.android.apps.walletnfcrel.R.drawable.loyalty_img_loyalty_imgload).into(programLogo);
                return;
            }
        }

        public final void setProgramName(String s)
        {
            mProgramName.setText(s);
        }

        public final void setView(View view)
        {
            super.setView(view);
            programLogo = (ImageView)findViewById(com.google.android.apps.walletnfcrel.R.id.loyalty_ProgramLogo);
            mMerchantName = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.loyalty_MerchantName);
            mProgramName = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.loyalty_ProgramName);
            mCallToAction = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.loyalty_CallToActionLink);
        }

        protected SimplifiedLoyaltyProgramListItemDisplay()
        {
            this$0 = SimplifiedLoyaltyProgramListItemBinder.this;
            super(com.google.android.apps.walletnfcrel.R.layout.loyalty_simplified_program_list_item);
        }
    }


    private final LayoutInflater mLayoutInflater;
    private final Picasso picasso;

    public SimplifiedLoyaltyProgramListItemBinder(LayoutInflater layoutinflater, Picasso picasso1)
    {
        mLayoutInflater = layoutinflater;
        picasso = picasso1;
    }

    private static void bind(int i, ViewHolder viewholder, com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram discoverableloyaltyprogram)
    {
        viewholder = (SimplifiedLoyaltyProgramListItemDisplay)viewholder;
        if (discoverableloyaltyprogram.nativeRenderingInfo != null)
        {
            viewholder.setProgramLogo(discoverableloyaltyprogram.nativeRenderingInfo.logoImageUrl);
            viewholder.setMerchantName(discoverableloyaltyprogram.nativeRenderingInfo.merchantName);
            viewholder.setProgramName(discoverableloyaltyprogram.nativeRenderingInfo.programName);
        }
        if (Protos.valueWithDefaultFalse(discoverableloyaltyprogram.signupSupported))
        {
            viewholder.setCallToActionVisible(true);
            if (discoverableloyaltyprogram.signupInfo != null && discoverableloyaltyprogram.signupInfo.signupIncentive != null)
            {
                viewholder.setCallToAction(discoverableloyaltyprogram.signupInfo.signupIncentive);
                return;
            } else
            {
                viewholder.setCallToAction(com.google.android.apps.walletnfcrel.R.string.loyalty_join_now);
                return;
            }
        } else
        {
            viewholder.setCallToActionVisible(false);
            return;
        }
    }

    private static boolean isEnabled(com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram discoverableloyaltyprogram)
    {
        return true;
    }

    public final volatile void bind(int i, ViewHolder viewholder, Object obj)
    {
        bind(i, viewholder, (com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram)obj);
    }

    public final ViewHolder createDisplay()
    {
        SimplifiedLoyaltyProgramListItemDisplay simplifiedloyaltyprogramlistitemdisplay = new SimplifiedLoyaltyProgramListItemDisplay();
        simplifiedloyaltyprogramlistitemdisplay.createView(mLayoutInflater);
        return simplifiedloyaltyprogramlistitemdisplay;
    }

    public final volatile boolean isEnabled(Object obj)
    {
        return isEnabled((com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram)obj);
    }

}
