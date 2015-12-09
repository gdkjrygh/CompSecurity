// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.journey.selection;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ly.kite.catalogue.Asset;
import ly.kite.catalogue.Catalogue;
import ly.kite.catalogue.CatalogueLoader;
import ly.kite.catalogue.ICatalogueConsumer;
import ly.kite.catalogue.Product;
import ly.kite.catalogue.ProductGroup;
import ly.kite.journey.AKiteActivity;
import ly.kite.journey.AssetsAndQuantity;
import ly.kite.journey.creation.ProductCreationActivity;
import ly.kite.journey.creation.reviewandedit.ReviewAndEditFragment;
import ly.kite.widget.HeaderFooterGridView;

// Referenced classes of package ly.kite.journey.selection:
//            ICatalogueHolder, ProductOverviewFragment, ChooseProductGroupFragment, ChooseProductFragment

public class ProductSelectionActivity extends AKiteActivity
    implements ICatalogueConsumer, ChooseProductFragment.ICallback, ChooseProductGroupFragment.ICallback, ICatalogueHolder, ProductOverviewFragment.ICallback
{
    private class RequestCatalogueRunnable
        implements Runnable
    {

        final ProductSelectionActivity this$0;

        public void run()
        {
            if (mCatalogueLoader != null)
            {
                if (mProgressSpinner != null)
                {
                    mProgressSpinner.setVisibility(0);
                }
                mCatalogueLoader.requestCatalogue(0x36ee80L, mProductIds, ProductSelectionActivity.this);
            }
        }

        private RequestCatalogueRunnable()
        {
            this$0 = ProductSelectionActivity.this;
            super();
        }

    }


    private static final String INTENT_EXTRA_NAME_ASSET_LIST = "ly.kite.assetList";
    private static final String INTENT_EXTRA_NAME_PRODUCT_IDS = "ly.kite.productIds";
    private static final String LOG_TAG = "ProductSelectionAct.";
    private boolean mAddFragmentOnCatalogue;
    private ArrayList mAssetsAndQuantityArrayList;
    private Catalogue mCatalogue;
    private ICatalogueConsumer mCatalogueConsumer;
    private CatalogueLoader mCatalogueLoader;
    private ChooseProductFragment mProductFragment;
    private ChooseProductGroupFragment mProductGroupFragment;
    private String mProductIds[];
    private ProductOverviewFragment mProductOverviewFragment;
    private ProgressBar mProgressSpinner;
    private ReviewAndEditFragment mReviewAndCropFragment;

    public ProductSelectionActivity()
    {
    }

    private static ArrayList assetsAndQuantityArrayListFrom(ArrayList arraylist)
    {
        ArrayList arraylist1 = new ArrayList(arraylist.size());
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); arraylist1.add(new AssetsAndQuantity((Asset)arraylist.next()))) { }
        return arraylist1;
    }

    private void onDisplayProductOverview(Product product)
    {
        mProductOverviewFragment = ProductOverviewFragment.newInstance(product);
        addFragment(mProductOverviewFragment, "ProductOverviewFragment");
    }

    public static transient void start(Context context, ArrayList arraylist, String as[])
    {
        Intent intent = new Intent(context, ly/kite/journey/selection/ProductSelectionActivity);
        intent.putParcelableArrayListExtra("ly.kite.assetList", arraylist);
        if (as != null && as.length > 0)
        {
            intent.putExtra("ly.kite.productIds", as);
        }
        context.startActivity(intent);
    }

    protected Catalogue getAdjustedCatalogue(Catalogue catalogue)
    {
        return catalogue;
    }

    public void getCatalogue(ICatalogueConsumer icatalogueconsumer)
    {
        if (mCatalogue != null)
        {
            icatalogueconsumer.onCatalogueSuccess(mCatalogue);
            return;
        } else
        {
            mCatalogueConsumer = icatalogueconsumer;
            return;
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (intent != null)
        {
            intent = intent.getParcelableArrayListExtra("ly.kite.assetsAndQuantityList");
            if (intent != null)
            {
                mAssetsAndQuantityArrayList = intent;
            }
        }
    }

    public void onCatalogueError(Exception exception)
    {
        mCatalogue = null;
        if (isVisible())
        {
            if (mProgressSpinner != null)
            {
                mProgressSpinner.setVisibility(8);
            }
            displayModalDialog(ly.kite.R.string.alert_dialog_title_error_retrieving_products, ly.kite.R.string.alert_dialog_message_error_retrieving_products, ly.kite.R.string.Retry, new RequestCatalogueRunnable(), ly.kite.R.string.Cancel, new ly.kite.journey.AKiteActivity.FinishRunnable(this));
        }
    }

    public void onCatalogueSuccess(Catalogue catalogue)
    {
        mCatalogue = getAdjustedCatalogue(catalogue);
        if (mProgressSpinner != null)
        {
            mProgressSpinner.setVisibility(8);
        }
        if (!mAddFragmentOnCatalogue) goto _L2; else goto _L1
_L1:
        catalogue = mCatalogue.getProductGroupList();
        if (catalogue == null || catalogue.size() <= 0) goto _L2; else goto _L3
_L3:
        if (catalogue.size() <= 1) goto _L5; else goto _L4
_L4:
        catalogue = ChooseProductGroupFragment.newInstance(new String[0]);
        mProductGroupFragment = catalogue;
        addFragment(catalogue, "ChooseProductGroupFragment");
_L2:
        if (mCatalogueConsumer != null)
        {
            mCatalogueConsumer.onCatalogueSuccess(mCatalogue);
            mCatalogueConsumer = null;
        }
        return;
_L5:
        catalogue = (ProductGroup)catalogue.get(0);
        ArrayList arraylist = catalogue.getProductList();
        if (arraylist != null && arraylist.size() > 0)
        {
            if (arraylist.size() > 1)
            {
                catalogue = ChooseProductFragment.newInstance(catalogue, new String[0]);
                mProductFragment = catalogue;
                addFragment(catalogue, "ChooseProductFragment");
            } else
            {
                onDisplayProductOverview((Product)arraylist.get(0));
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            getWindow().setStatusBarColor(getResources().getColor(ly.kite.R.color.translucent_status_bar));
        }
        ArrayList arraylist = null;
        Object obj = getIntent();
        if (obj != null)
        {
            arraylist = ((Intent) (obj)).getParcelableArrayListExtra("ly.kite.assetList");
            mProductIds = ((Intent) (obj)).getStringArrayExtra("ly.kite.productIds");
        }
        obj = arraylist;
        if (arraylist == null)
        {
            obj = new ArrayList();
        }
        mAssetsAndQuantityArrayList = assetsAndQuantityArrayListFrom(((ArrayList) (obj)));
        setContentView(ly.kite.R.layout.screen_product_selection);
        mProgressSpinner = (ProgressBar)findViewById(ly.kite.R.id.progress_spinner);
        if (bundle == null)
        {
            mAddFragmentOnCatalogue = true;
        }
        mCatalogueLoader = CatalogueLoader.getInstance(this);
        if (mProgressSpinner != null)
        {
            mProgressSpinner.setVisibility(0);
        }
        mCatalogueLoader.requestCatalogue(0x36ee80L, mProductIds, this);
    }

    protected void onStop()
    {
        super.onStop();
        if (mCatalogueLoader != null)
        {
            mCatalogueLoader.cancelRequests();
        }
    }

    public void pOnProductChosen(Product product)
    {
        onDisplayProductOverview(product);
    }

    public void pgOnPrePopulateProductGroupGrid(Catalogue catalogue, HeaderFooterGridView headerfootergridview)
    {
    }

    public void pgOnProductGroupChosen(ProductGroup productgroup)
    {
        ArrayList arraylist = productgroup.getProductList();
        if (arraylist == null || arraylist.size() > 1)
        {
            mProductFragment = ChooseProductFragment.newInstance(productgroup, new String[0]);
            addFragment(mProductFragment, "ChooseProductFragment");
            return;
        } else
        {
            onDisplayProductOverview((Product)arraylist.get(0));
            return;
        }
    }

    public void poOnCreateProduct(Product product)
    {
        ProductCreationActivity.startForResult(this, mAssetsAndQuantityArrayList, product, 10);
    }



}
