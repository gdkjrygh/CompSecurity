// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.ias;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.accuweather.android.utilities.Data;
import com.viewpagerindicator.CirclePageIndicator;

// Referenced classes of package com.accuweather.android.ias:
//            AmazonProductAdapter, AmazonUtilities

public class AmazonProductChoiceDialog extends DialogFragment
{

    private String mDate;
    private String mDay;
    private String mShortText;

    public AmazonProductChoiceDialog()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mShortText = getArguments().getString("shorttext");
        mDay = getArguments().getString("day");
        mDate = getArguments().getString("date");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.accuweather.android.R.layout.amazon_dialog, viewgroup);
        viewgroup = (ViewPager)layoutinflater.findViewById(com.accuweather.android.R.id.amazon_view_pager);
        bundle = new AmazonProductAdapter(getChildFragmentManager());
        bundle.setProducts(AmazonUtilities.getAmazonModelList());
        viewgroup.setClipChildren(false);
        viewgroup.setAdapter(bundle);
        bundle = (CirclePageIndicator)layoutinflater.findViewById(com.accuweather.android.R.id.indicator);
        bundle.setViewPager(viewgroup);
        bundle.setFillColor(getActivity().getResources().getColor(com.accuweather.android.R.color.darker_blue));
        View view = layoutinflater.findViewById(com.accuweather.android.R.id.line_separator);
        TextView textview = (TextView)layoutinflater.findViewById(com.accuweather.android.R.id.amazon_weather_statement);
        TextView textview1 = (TextView)layoutinflater.findViewById(com.accuweather.android.R.id.tap_to_view_product_details);
        Button button = (Button)layoutinflater.findViewById(com.accuweather.android.R.id.cancel);
        setTypeFaces(textview, textview1, button);
        view.setVisibility(0);
        textview.setVisibility(0);
        textview1.setVisibility(0);
        viewgroup.setVisibility(0);
        bundle.setVisibility(0);
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final AmazonProductChoiceDialog this$0;

            public void onClick(View view1)
            {
                getDialog().dismiss();
            }

            
            {
                this$0 = AmazonProductChoiceDialog.this;
                super();
            }
        });
        getDialog().requestWindowFeature(1);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        textview.setText((new StringBuilder()).append(mShortText).append(" ").append(getActivity().getString(com.accuweather.android.R.string.On_UC_Abbr3).toLowerCase()).append(" ").append(mDay).append(", ").append(mDate).toString());
        return layoutinflater;
    }

    protected void setTypeFaces(TextView textview, TextView textview1, Button button)
    {
        textview.setTypeface(Data.getRobotoBoldCondensed());
        textview1.setTypeface(Data.getRobotoCondensed());
        button.setTypeface(Data.getRobotoCondensed());
    }
}
