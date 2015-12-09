// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.util.bt;

// Referenced classes of package com.jcp.activities:
//            an

public class RewardsCardViewActivity extends an
{

    private String a;
    private String b;
    protected TextView mBarcodeNumberView;
    protected ImageView mBarcodeView;
    protected View mDividerView;
    protected TextView mEarnView;
    protected TextView mMemberTypeView;

    public RewardsCardViewActivity()
    {
    }

    private void c()
    {
        bt.a(mBarcodeView, b);
        mBarcodeNumberView.setText(b);
        String s = getResources().getString(0x7f070364);
        String s1 = getResources().getString(0x7f070452);
        if ("BASE".equalsIgnoreCase(a))
        {
            mMemberTypeView.setText(String.format(s, new Object[] {
                getResources().getString(0x7f07028c)
            }));
            mEarnView.setText(String.format(s1, new Object[] {
                Integer.valueOf(500), getResources().getString(0x7f07028d)
            }));
        } else
        {
            if ("GOLD".equalsIgnoreCase(a))
            {
                mMemberTypeView.setText(String.format(s, new Object[] {
                    getResources().getString(0x7f07028d)
                }));
                mEarnView.setText(String.format(s1, new Object[] {
                    Integer.valueOf(1000), getResources().getString(0x7f07028e)
                }));
                return;
            }
            if ("PLATINUM".equalsIgnoreCase(a))
            {
                mMemberTypeView.setText(String.format(s, new Object[] {
                    getResources().getString(0x7f07028e)
                }));
                mDividerView.setVisibility(8);
                mEarnView.setVisibility(8);
                return;
            }
        }
    }

    protected String a()
    {
        return "Rewards Dashboard Profile View";
    }

    protected String f()
    {
        return "JCP REWARDS (CAT1002850058)";
    }

    public void onClickClose()
    {
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03002c);
        ButterKnife.inject(this);
        bundle = getIntent().getExtras();
        if (bundle == null)
        {
            finish();
            return;
        } else
        {
            a = bundle.getString("member_type");
            b = bundle.getString("barcode_number");
            c();
            return;
        }
    }
}
