// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.journey.selection;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import java.util.ArrayList;
import ly.kite.analytics.Analytics;
import ly.kite.catalogue.Catalogue;
import ly.kite.catalogue.Product;
import ly.kite.catalogue.ProductGroup;
import ly.kite.journey.AKiteActivity;
import ly.kite.widget.HeaderFooterGridView;

// Referenced classes of package ly.kite.journey.selection:
//            AGroupOrProductFragment

public class ChooseProductFragment extends AGroupOrProductFragment
{
    public static interface ICallback
    {

        public abstract void pOnProductChosen(Product product);
    }


    private static final String BUNDLE_KEY_PRODUCT_GROUP = "productGroup";
    public static final String TAG = "ChooseProductFragment";
    private ProductGroup mProductGroup;
    private ArrayList mProductList;

    public ChooseProductFragment()
    {
    }

    public static transient ChooseProductFragment newInstance(ProductGroup productgroup, String as[])
    {
        ChooseProductFragment chooseproductfragment = new ChooseProductFragment();
        addCommonArguments(chooseproductfragment, as).putParcelable("productGroup", productgroup);
        return chooseproductfragment;
    }

    public void onCatalogueSuccess(Catalogue catalogue)
    {
        mProductList = catalogue.getProductsForGroup(mProductGroup.getDisplayLabel());
        if (mProductList != null)
        {
            mGridAdaptor = new AGroupOrProductFragment.GroupOrProductAdaptor(this, mKiteActivity, mProductList, mGridView, ly.kite.R.layout.grid_item_product);
            mGridView.setAdapter(mGridAdaptor);
            onRestoreManagedAdaptorViewPosition();
            mGridView.setOnItemClickListener(this);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            mProductGroup = (ProductGroup)bundle.getParcelable("productGroup");
            if (mProductGroup == null)
            {
                Log.e("ChooseProductFragment", "No product group found in arguments");
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (bundle == null)
        {
            Analytics.getInstance(mKiteActivity).trackProductSelectionScreenViewed();
        }
        if (mProductGroup != null)
        {
            mKiteActivity.setTitle(mProductGroup.getDisplayLabel());
        }
        return layoutinflater;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        onSaveManagedAdaptorViewPosition(i);
        i = mGridView.adaptorIndexFromPosition(i);
        if (i >= 0 && i < mProductList.size())
        {
            adapterview = (Product)mProductList.get(i);
            if (mKiteActivity instanceof ICallback)
            {
                ((ICallback)mKiteActivity).pOnProductChosen(adapterview);
                return;
            }
        }
    }

    public void onTop()
    {
        super.onTop();
        if (mProductGroup != null)
        {
            mKiteActivity.setTitle(mProductGroup.getDisplayLabel());
        }
    }
}
