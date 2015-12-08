// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.journey.selection;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import java.util.ArrayList;
import ly.kite.analytics.Analytics;
import ly.kite.catalogue.Catalogue;
import ly.kite.catalogue.ProductGroup;
import ly.kite.journey.AKiteActivity;
import ly.kite.widget.HeaderFooterGridView;

// Referenced classes of package ly.kite.journey.selection:
//            AGroupOrProductFragment

public class ChooseProductGroupFragment extends AGroupOrProductFragment
{
    public static interface ICallback
    {

        public abstract void pgOnPrePopulateProductGroupGrid(Catalogue catalogue, HeaderFooterGridView headerfootergridview);

        public abstract void pgOnProductGroupChosen(ProductGroup productgroup);
    }


    public static final String TAG = "ChooseProductGroupFragment";
    private ArrayList mProductGroupList;

    public ChooseProductGroupFragment()
    {
    }

    public static transient ChooseProductGroupFragment newInstance(String as[])
    {
        ChooseProductGroupFragment chooseproductgroupfragment = new ChooseProductGroupFragment();
        addCommonArguments(chooseproductgroupfragment, as);
        return chooseproductgroupfragment;
    }

    public void onCatalogueSuccess(Catalogue catalogue)
    {
        mProductGroupList = catalogue.getProductGroupList();
        if (mKiteActivity instanceof ICallback)
        {
            ((ICallback)mKiteActivity).pgOnPrePopulateProductGroupGrid(catalogue, mGridView);
        }
        mGridAdaptor = new AGroupOrProductFragment.GroupOrProductAdaptor(this, mKiteActivity, mProductGroupList, mGridView, ly.kite.R.layout.grid_item_product_group);
        mGridView.setAdapter(mGridAdaptor);
        onRestoreManagedAdaptorViewPosition();
        mGridView.setOnItemClickListener(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (bundle == null)
        {
            Analytics.getInstance(mKiteActivity).trackSDKLoaded("Home Screen");
        }
        return layoutinflater;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        onSaveManagedAdaptorViewPosition(i);
        i = mGridView.adaptorIndexFromPosition(i);
        if (i >= 0 && i < mProductGroupList.size())
        {
            adapterview = (ProductGroup)mProductGroupList.get(i);
            if (mKiteActivity instanceof ICallback)
            {
                ((ICallback)mKiteActivity).pgOnProductGroupChosen(adapterview);
                return;
            }
        }
    }

    public void onTop()
    {
        super.onTop();
        mKiteActivity.setTitle(ly.kite.R.string.title_choose_product_group);
    }
}
