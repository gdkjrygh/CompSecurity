// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.ias;

import android.content.Intent;
import android.os.Bundle;
import com.accuweather.android.WeatherActivity;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.DayNight;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.amazon.device.associates.AssociatesAPI;
import com.amazon.device.associates.Image;
import com.amazon.device.associates.NoListenerException;
import com.amazon.device.associates.NotInitializedException;
import com.amazon.device.associates.Price;
import com.amazon.device.associates.Product;
import com.amazon.device.associates.PurchaseResponse;
import com.amazon.device.associates.ReceiptsResponse;
import com.amazon.device.associates.SearchByIdResponse;
import com.amazon.device.associates.SearchRequest;
import com.amazon.device.associates.SearchResponse;
import com.amazon.device.associates.ServiceStatusResponse;
import com.amazon.device.associates.ShoppingListener;
import com.amazon.device.associates.ShoppingService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.accuweather.android.ias:
//            AmazonModel, AmazonUtilities, GlobalShoppingListener, Constantsias, 
//            AmazonConditions, AmazonSearchParameters

public abstract class PurchaseActivity extends WeatherActivity
    implements ShoppingListener
{

    private GlobalShoppingListener mGlobalListener;

    public PurchaseActivity()
    {
    }

    private AmazonModel buildAmazonModel(Product product)
    {
        AmazonModel amazonmodel = new AmazonModel();
        amazonmodel.setAsin(product.getProductId());
        amazonmodel.setUrl(product.getImage().getUrl());
        amazonmodel.setTitle(product.getTitle());
        amazonmodel.setPrice(product.getPrice().toString());
        return amazonmodel;
    }

    private List buildAmazonModels(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            arraylist.add(buildAmazonModel((Product)list.get(i)));
        }

        return arraylist;
    }

    private void initializeAmazonShopping()
    {
        com.amazon.device.associates.AssociatesAPI.Config config;
        if (!AmazonUtilities.shouldShowAmazonProducts(this))
        {
            break MISSING_BLOCK_LABEL_47;
        }
        mGlobalListener = GlobalShoppingListener.getInstance();
        config = new com.amazon.device.associates.AssociatesAPI.Config("485532564f4938393243325032424635", getApplicationContext());
        Logger.i(this, "try AssociatesAPI.initialize(config)");
        AssociatesAPI.initialize(config);
        AssociatesAPI.getShoppingService().setListener(this);
        return;
        Object obj;
        obj;
        Logger.e(getClass().getName(), "Error initializing Amazon Shopping: ", ((Throwable) (obj)));
        return;
        obj;
        Logger.e(getClass().getName(), "Error initializing Amazon Shopping: ", ((Throwable) (obj)));
        return;
    }

    private void onSuccessfulSearchResponse(SearchResponse searchresponse)
    {
        List list = searchresponse.getProducts();
        Logger.i(getClass().getName(), (new StringBuilder()).append("In onSuccessfulSearchResponse(), status = ").append(searchresponse.getStatus()).append(", products size = ").append(list.size()).toString());
        if (!list.isEmpty())
        {
            searchresponse = buildAmazonModels(list);
            AmazonUtilities.storeAmazonInPreferences(searchresponse, this);
            AmazonUtilities.setAmazonModelList(searchresponse);
            sendBroadcast(new Intent("accuwx.intent.action.UPDATE_AMAZON_PRODUCTS"));
        }
    }

    private void searchForProducts(SearchRequest searchrequest)
    {
        try
        {
            AssociatesAPI.getShoppingService().search(searchrequest);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SearchRequest searchrequest)
        {
            searchrequest.printStackTrace();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        initializeAmazonShopping();
    }

    public void onPurchaseResponse(PurchaseResponse purchaseresponse)
    {
    }

    public void onReceiptsResponse(ReceiptsResponse receiptsresponse)
    {
    }

    public void onResume()
    {
        super.onResume();
        if (!AmazonUtilities.shouldShowAmazonProducts(this))
        {
            break MISSING_BLOCK_LABEL_28;
        }
        mGlobalListener.setLocalListener(this);
        AssociatesAPI.getShoppingService().getServiceStatus();
        return;
        Object obj;
        obj;
        ((NotInitializedException) (obj)).printStackTrace();
        return;
        obj;
    }

    public void onSearchByIdResponse(SearchByIdResponse searchbyidresponse)
    {
    }

    public void onSearchResponse(SearchResponse searchresponse)
    {
        com.amazon.device.associates.SearchResponse.Status status = searchresponse.getStatus();
        AmazonUtilities.clearAmazonPreferences(this);
        Logger.i(getClass().getName(), (new StringBuilder()).append("In onSearchResponse(), status = ").append(status).toString());
        if (status == com.amazon.device.associates.SearchResponse.Status.FAILED)
        {
            AmazonUtilities.clearAmazonPreferences(this);
        } else
        if (status != com.amazon.device.associates.SearchResponse.Status.NOT_SUPPORTED && status == com.amazon.device.associates.SearchResponse.Status.SUCCESSFUL)
        {
            onSuccessfulSearchResponse(searchresponse);
            return;
        }
    }

    public void onServiceStatusResponse(ServiceStatusResponse servicestatusresponse)
    {
    }

    public void onWeatherCallCompleted(List list, List list1)
    {
        super.onWeatherCallCompleted(list, list1);
        if (AmazonUtilities.shouldShowAmazonProducts(this))
        {
            list = (AmazonConditions)Constantsias.AMAZON_ICONS.get(((DailyForecast)getData().getCurrentlyViewedWeatherDataModel().getForecast().getDailyForecasts().get(3)).getDay().getIcon());
            AmazonUtilities.clearAmazonPreferences(this);
            Logger.i("PurchaseActivity", (new StringBuilder()).append("In onWeatherCallCompleted(), AmazonCondition is ").append(list).toString());
            if (list != null)
            {
                performAmazonSearch(list);
            }
        }
    }

    protected void performAmazonSearch(AmazonConditions amazonconditions)
    {
        amazonconditions = (new AmazonUtilities()).getRandomParameters(amazonconditions);
        Logger.i(getClass().getName(), (new StringBuilder()).append("In performAmazonSearch(), search category = ").append(amazonconditions.getCategory()).append(", keyword = ").append(amazonconditions.getKeyword()).toString());
        if (mGlobalListener != null)
        {
            Logger.i(getClass().getName(), "mGlobalListener is not null so go searching for products");
            searchForProducts(new SearchRequest(amazonconditions.getCategory(), amazonconditions.getKeyword(), 1));
        }
    }
}
