// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.ias;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.accuweather.android.utilities.AccuAnalytics;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.amazon.device.associates.AssociatesAPI;
import com.amazon.device.associates.NoListenerException;
import com.amazon.device.associates.NotInitializedException;
import com.amazon.device.associates.PurchaseExperience;
import com.amazon.device.associates.PurchaseRequest;
import com.amazon.device.associates.PurchaseResponse;
import com.amazon.device.associates.ReceiptsResponse;
import com.amazon.device.associates.SearchByIdResponse;
import com.amazon.device.associates.SearchResponse;
import com.amazon.device.associates.ServiceStatusResponse;
import com.amazon.device.associates.ShoppingListener;
import com.amazon.device.associates.ShoppingService;
import com.nostra13.universalimageloader.core.ImageLoader;

// Referenced classes of package com.accuweather.android.ias:
//            AmazonModel

public class AmazonProductFragment extends Fragment
    implements android.view.View.OnClickListener, ShoppingListener
{

    private static final String PRODUCT_BUNDLE_KEY = "product";
    private AmazonModel mAmazonModel;

    public AmazonProductFragment()
    {
    }

    private void init()
    {
        ImageView imageview = (ImageView)getView().findViewById(com.accuweather.android.R.id.product_img);
        TextView textview = (TextView)getView().findViewById(com.accuweather.android.R.id.description);
        TextView textview1 = (TextView)getView().findViewById(com.accuweather.android.R.id.price);
        View view = getView().findViewById(com.accuweather.android.R.id.touch_overlay);
        ImageLoader.getInstance().displayImage(mAmazonModel.getUrl(), imageview);
        textview.setText(mAmazonModel.getTitle());
        textview1.setText(mAmazonModel.getPrice());
        setTypeFaces(textview, textview1);
        view.setOnClickListener(this);
    }

    public static AmazonProductFragment newInstance(AmazonModel amazonmodel)
    {
        AmazonProductFragment amazonproductfragment = new AmazonProductFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("product", amazonmodel);
        amazonproductfragment.setArguments(bundle);
        return amazonproductfragment;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        init();
    }

    public void onClick(View view)
    {
        Logger.i(this, "onClick Amazon product");
        AccuAnalytics.logUiEvent(getActivity(), "Amazon shopping product click");
        view = new PurchaseRequest(mAmazonModel.getAsin(), view, true);
        view.setPurchaseExperience(PurchaseExperience.IN_APP);
        purchaseProduct(view);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getArguments() != null)
        {
            bundle = (AmazonModel)getArguments().getSerializable("product");
        } else
        {
            bundle = null;
        }
        mAmazonModel = bundle;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(com.accuweather.android.R.layout.amazon_list_item, null);
    }

    public void onPurchaseResponse(PurchaseResponse purchaseresponse)
    {
    }

    public void onReceiptsResponse(ReceiptsResponse receiptsresponse)
    {
    }

    public void onSearchByIdResponse(SearchByIdResponse searchbyidresponse)
    {
    }

    public void onSearchResponse(SearchResponse searchresponse)
    {
    }

    public void onServiceStatusResponse(ServiceStatusResponse servicestatusresponse)
    {
    }

    protected void purchaseProduct(PurchaseRequest purchaserequest)
    {
        try
        {
            AssociatesAPI.getShoppingService().purchase(purchaserequest);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PurchaseRequest purchaserequest)
        {
            purchaserequest.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PurchaseRequest purchaserequest)
        {
            purchaserequest.printStackTrace();
        }
    }

    protected void setTypeFaces(TextView textview, TextView textview1)
    {
        textview.setTypeface(Data.getRobotoCondensed());
        textview1.setTypeface(Data.getRobotoCondensed());
    }
}
