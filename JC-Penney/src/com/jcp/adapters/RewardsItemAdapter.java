// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.jcp.fragments.rewards.RewardsDashboardFragment;
import com.jcp.model.rewards.Certificate;
import com.jcp.util.bn;
import com.jcp.util.bt;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            ck

public class RewardsItemAdapter extends ArrayAdapter
{

    private static RewardsItemAdapter d;
    private List a;
    private Context b;
    private LayoutInflater c;
    private final RewardsDashboardFragment e;

    public RewardsItemAdapter(RewardsDashboardFragment rewardsdashboardfragment, int i, List list)
    {
        super(rewardsdashboardfragment.i(), i, list);
        a = list;
        e = rewardsdashboardfragment;
        b = e.i();
        bn.a(list, b.getResources().getString(0x7f0702fc));
        c = (LayoutInflater)b.getSystemService("layout_inflater");
        d = this;
    }

    static RewardsItemAdapter a()
    {
        return d;
    }

    static void a(RewardsItemAdapter rewardsitemadapter, Certificate certificate)
    {
        rewardsitemadapter.a(certificate);
    }

    private void a(Certificate certificate)
    {
        e.a(certificate);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Certificate certificate = (Certificate)a.get(i);
        if (view != null)
        {
            RewardsListViewHolder rewardslistviewholder = (RewardsListViewHolder)view.getTag();
            viewgroup = view;
            view = rewardslistviewholder;
        } else
        {
            viewgroup = c.inflate(0x7f03005d, null);
            view = new RewardsListViewHolder(viewgroup);
            viewgroup.setTag(view);
        }
        bt.a(b, certificate.getAmount().doubleValue(), certificate.getType(), ((RewardsListViewHolder) (view)).earnRewardstv);
        if (certificate.getExpires() != null)
        {
            ((RewardsListViewHolder) (view)).rewardsExpDatetv.setText((new StringBuilder()).append(b.getString(0x7f0701c8)).append(" ").append(certificate.getExpires().substring(0, 12)).toString());
        } else
        {
            ((RewardsListViewHolder) (view)).rewardsExpDatetv.setText(" ");
        }
        if (certificate.getDaysLeft().intValue() <= 15)
        {
            ((RewardsListViewHolder) (view)).rewardsExpDatetv.setTextColor(0xffff0000);
        }
        if (certificate.isOpen())
        {
            ((RewardsListViewHolder) (view)).rewardsBottomSection.setVisibility(0);
            if (certificate.getCode() != null)
            {
                ((RewardsListViewHolder) (view)).rewardsavltv.setText(certificate.getCode());
            } else
            {
                ((RewardsListViewHolder) (view)).rewardsavltv.setText(" ");
            }
            if (certificate.getBarcode() != null)
            {
                ((RewardsListViewHolder) (view)).rewardBarCodeNumber.setText(certificate.getBarcode());
            } else
            {
                ((RewardsListViewHolder) (view)).rewardBarCodeNumber.setText(" ");
            }
            if (certificate.getSerialNumber() != null)
            {
                ((RewardsListViewHolder) (view)).rewardSerialNumber.setText(certificate.getSerialNumber());
            } else
            {
                ((RewardsListViewHolder) (view)).rewardSerialNumber.setText(" ");
            }
            ((RewardsListViewHolder) (view)).barcodeImage.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            if (certificate.getBarcode() != null)
            {
                ((RewardsListViewHolder) (view)).barcodeImage.getViewTreeObserver().addOnGlobalLayoutListener(new ck(this, view, certificate));
            }
        } else
        {
            ((RewardsListViewHolder) (view)).rewardsBottomSection.setVisibility(8);
        }
        bn.a(((RewardsListViewHolder) (view)).applyBagButton, certificate, b);
        ((RewardsListViewHolder) (view)).easyScanLayout.setTag(certificate);
        return viewgroup;
    }

    private class RewardsListViewHolder
        implements android.view.View.OnClickListener
    {

        protected Button applyBagButton;
        protected ImageView barcodeImage;
        protected TextView earnRewardstv;
        protected TextView easyScanLayout;
        protected TextView rewardBarCodeNumber;
        protected TextView rewardSerialNumber;
        protected LinearLayout rewardsBottomSection;
        protected TextView rewardsExpDatetv;
        protected TextView rewardsavltv;

        public void launchRewardCardActivity(View view)
        {
            Intent intent = new Intent(view.getContext(), com/jcp/activities/RewardsScanViewActivity);
            intent.putExtra("reward", ((Certificate)view.getTag()).getType());
            intent.putExtra("barcode_number", ((Certificate)view.getTag()).getSerialNumber());
            intent.putExtra("expiry", ((Certificate)view.getTag()).getExpires());
            view.getContext().startActivity(intent);
        }

        public void onClick(View view)
        {
            view = (Certificate)view.getTag();
            if (!view.isApplied())
            {
                com.jcp.h.a.q();
            }
            com.jcp.adapters.RewardsItemAdapter.a(com.jcp.adapters.RewardsItemAdapter.a(), view);
        }

        public RewardsListViewHolder(View view)
        {
            ButterKnife.inject(this, view);
        }
    }

}
