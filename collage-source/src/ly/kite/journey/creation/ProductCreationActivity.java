// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.journey.creation;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;
import ly.kite.analytics.Analytics;
import ly.kite.catalogue.Asset;
import ly.kite.catalogue.PrintJob;
import ly.kite.catalogue.PrintOrder;
import ly.kite.catalogue.Product;
import ly.kite.checkout.CheckoutActivity;
import ly.kite.journey.AKiteActivity;
import ly.kite.journey.AssetsAndQuantity;
import ly.kite.journey.IAssetsAndQuantityHolder;
import ly.kite.journey.UserJourneyType;
import ly.kite.journey.creation.imageselection.ImageSelectionFragment;
import ly.kite.journey.creation.imagesource.ImageSourceFragment;
import ly.kite.journey.creation.phonecase.PhoneCaseFragment;
import ly.kite.journey.creation.reviewandedit.EditImageFragment;
import ly.kite.journey.creation.reviewandedit.ReviewAndEditFragment;

public class ProductCreationActivity extends AKiteActivity
    implements IAssetsAndQuantityHolder, ly.kite.journey.creation.imageselection.ImageSelectionFragment.ICallback, ly.kite.journey.creation.imagesource.ImageSourceFragment.ICallback, ly.kite.journey.creation.phonecase.PhoneCaseFragment.ICallback, ly.kite.journey.creation.reviewandedit.EditImageFragment.ICallback, ly.kite.journey.creation.reviewandedit.ReviewAndEditFragment.ICallback
{

    private static final String BUNDLE_KEY_ASSETS_AND_QUANTITY_LIST = "assetsAndQuantityList";
    private static final String BUNDLE_KEY_LAST_EDITED_ASSET_INDEX = "lastEditedAssetIndex";
    public static final String INTENT_EXTRA_NAME_ASSETS_AND_QUANTITY_LIST = "ly.kite.assetsAndQuantityList";
    public static final String INTENT_EXTRA_NAME_PRODUCT = "ly.kite.product";
    private static final String LOG_TAG = "ProductCreationActivity";
    private static ProductCreationActivity sUserJourneyCoordinator;
    private ArrayList mAssetsAndQuantityArrayList;
    private int mLastEditedAssetIndex;
    private Product mProduct;

    public ProductCreationActivity()
    {
    }

    private void addFirstFragment()
    {
        if (mAssetsAndQuantityArrayList.size() < 1)
        {
            addFragment(ImageSourceFragment.newInstance(mProduct), "AKiteFragment");
            return;
        }
        static class _cls1
        {

            static final int $SwitchMap$ly$kite$journey$UserJourneyType[];

            static 
            {
                $SwitchMap$ly$kite$journey$UserJourneyType = new int[UserJourneyType.values().length];
                try
                {
                    $SwitchMap$ly$kite$journey$UserJourneyType[UserJourneyType.CIRCLE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$ly$kite$journey$UserJourneyType[UserJourneyType.FRAME.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$ly$kite$journey$UserJourneyType[UserJourneyType.GREETING_CARD.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$ly$kite$journey$UserJourneyType[UserJourneyType.PHONE_CASE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$ly$kite$journey$UserJourneyType[UserJourneyType.PHOTOBOOK.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$ly$kite$journey$UserJourneyType[UserJourneyType.POSTCARD.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$ly$kite$journey$UserJourneyType[UserJourneyType.POSTER.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$ly$kite$journey$UserJourneyType[UserJourneyType.RECTANGLE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.ly.kite.journey.UserJourneyType[mProduct.getUserJourneyType().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            addFragment(ImageSelectionFragment.newInstance(mProduct), "ImageSelectionFragment");
            return;

        case 4: // '\004'
            addFragment(PhoneCaseFragment.newInstance(mProduct), "AKiteFragment");
            return;

        case 8: // '\b'
            addFragment(ImageSelectionFragment.newInstance(mProduct), "ImageSelectionFragment");
            break;
        }
    }

    public static boolean isSupported(UserJourneyType userjourneytype)
    {
        boolean flag = true;
        switch (_cls1..SwitchMap.ly.kite.journey.UserJourneyType[userjourneytype.ordinal()])
        {
        case 2: // '\002'
        case 3: // '\003'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        default:
            flag = false;
            // fall through

        case 1: // '\001'
        case 4: // '\004'
        case 8: // '\b'
            return flag;
        }
    }

    public static void startForResult(Activity activity, ArrayList arraylist, Product product, int i)
    {
        Intent intent = new Intent(activity, ly/kite/journey/creation/ProductCreationActivity);
        intent.putParcelableArrayListExtra("ly.kite.assetsAndQuantityList", arraylist);
        intent.putExtra("ly.kite.product", product);
        activity.startActivityForResult(intent, i);
    }

    public void eiOnCancel()
    {
        popFragment();
    }

    public void eiOnConfirm(Asset asset)
    {
        AssetsAndQuantity assetsandquantity = (AssetsAndQuantity)mAssetsAndQuantityArrayList.get(mLastEditedAssetIndex);
        assetsandquantity.setEditedAsset(asset, mProduct.getId());
        popFragment();
        asset = (ReviewAndEditFragment)mFragmentManager.findFragmentByTag("ReviewAndEditFragment");
        if (asset != null)
        {
            asset.onAssetUpdated(mLastEditedAssetIndex, assetsandquantity);
        }
        ((ImageSelectionFragment)mFragmentManager.findFragmentByTag("ImageSelectionFragment")).onAssetUpdated(mLastEditedAssetIndex, assetsandquantity);
    }

    public ArrayList getAssetsAndQuantityArrayList()
    {
        return mAssetsAndQuantityArrayList;
    }

    public void isOnAssetsAdded()
    {
        popFragmentSecretly();
        addFirstFragment();
    }

    public void isOnNext()
    {
        addFragment(ReviewAndEditFragment.newInstance(mProduct), "ReviewAndEditFragment");
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            getWindow().setStatusBarColor(getResources().getColor(ly.kite.R.color.translucent_status_bar));
        }
        if (bundle != null)
        {
            mAssetsAndQuantityArrayList = bundle.getParcelableArrayList("assetsAndQuantityList");
            mLastEditedAssetIndex = bundle.getInt("lastEditedAssetIndex");
        }
        Intent intent = getIntent();
        if (intent == null)
        {
            Log.e("ProductCreationActivity", "No intent found");
            displayModalDialog(ly.kite.R.string.alert_dialog_title_no_intent, ly.kite.R.string.alert_dialog_message_no_intent, 0, null, ly.kite.R.string.Cancel, new ly.kite.journey.AKiteActivity.FinishRunnable(this));
        } else
        {
            if (mAssetsAndQuantityArrayList == null)
            {
                mAssetsAndQuantityArrayList = intent.getParcelableArrayListExtra("ly.kite.assetsAndQuantityList");
            }
            if (mAssetsAndQuantityArrayList == null)
            {
                mAssetsAndQuantityArrayList = new ArrayList();
            }
            mProduct = (Product)intent.getParcelableExtra("ly.kite.product");
            if (mProduct == null)
            {
                Log.e("ProductCreationActivity", "No product found");
                displayModalDialog(ly.kite.R.string.alert_dialog_title_no_product, ly.kite.R.string.alert_dialog_message_no_product, 0, null, ly.kite.R.string.Cancel, new ly.kite.journey.AKiteActivity.FinishRunnable(this));
                return;
            }
            setContentView(ly.kite.R.layout.screen_product_selection);
            if (bundle == null)
            {
                addFirstFragment();
                Analytics.getInstance(this).trackCreateProductScreenViewed(mProduct);
                return;
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (mAssetsAndQuantityArrayList != null)
        {
            bundle.putParcelableArrayList("assetsAndQuantityList", mAssetsAndQuantityArrayList);
        }
        bundle.putInt("lastEditedAssetIndex", mLastEditedAssetIndex);
    }

    public void pcOnCreated(Asset asset)
    {
        PrintOrder printorder = new PrintOrder();
        printorder.addPrintJob(PrintJob.createPrintJob(mProduct, asset));
        CheckoutActivity.start(this, printorder, 10);
    }

    public void reOnConfirm()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = mAssetsAndQuantityArrayList.iterator(); iterator.hasNext();)
        {
            AssetsAndQuantity assetsandquantity = (AssetsAndQuantity)iterator.next();
            int i = 0;
            while (i < assetsandquantity.getQuantity()) 
            {
                arraylist.add(assetsandquantity.getEditedAsset());
                i++;
            }
        }

        PrintOrder printorder = new PrintOrder();
        printorder.addPrintJob(PrintJob.createPrintJob(mProduct, arraylist));
        CheckoutActivity.start(this, printorder, 10);
    }

    public void reOnEdit(int i)
    {
        addFragment(EditImageFragment.newInstance(((AssetsAndQuantity)mAssetsAndQuantityArrayList.get(i)).getUneditedAsset(), mProduct), "AKiteFragment");
        mLastEditedAssetIndex = i;
    }
}
