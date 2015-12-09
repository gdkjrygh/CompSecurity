// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.journey.selection;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import ly.kite.catalogue.ICatalogueConsumer;
import ly.kite.journey.AKiteFragment;
import ly.kite.widget.HeaderFooterGridView;

// Referenced classes of package ly.kite.journey.selection:
//            ICatalogueHolder

public abstract class AGroupOrProductFragment extends AKiteFragment
    implements android.widget.AdapterView.OnItemClickListener, ICatalogueConsumer
{

    private static final String BUNDLE_KEY_PRODUCT_IDS = "productIds";
    public static final String TAG = "AGroupOrProductFragment";
    protected BaseAdapter mGridAdaptor;
    protected HeaderFooterGridView mGridView;
    protected String mProductIds[];

    public AGroupOrProductFragment()
    {
    }

    protected static transient Bundle addCommonArguments(AGroupOrProductFragment agrouporproductfragment, String as[])
    {
        Bundle bundle = new Bundle();
        if (as != null && as.length > 0)
        {
            bundle.putStringArray("productIds", as);
        }
        agrouporproductfragment.setArguments(bundle);
        return bundle;
    }

    protected void getProducts()
    {
        if (mKiteActivity instanceof ICatalogueHolder)
        {
            ((ICatalogueHolder)mKiteActivity).getCatalogue(this);
        }
    }

    public void onCatalogueError(Exception exception)
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            mProductIds = bundle.getStringArray("productIds");
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(ly.kite.R.layout.screen_choose_group_or_product, viewgroup, false);
        mGridView = (HeaderFooterGridView)layoutinflater.findViewById(ly.kite.R.id.grid_view);
        setManagedAdaptorView(mGridView);
        return layoutinflater;
    }

    public void onNotTop()
    {
        if (mGridView != null)
        {
            mGridView.setAdapter(null);
        }
        mGridAdaptor = null;
    }

    public void onTop()
    {
        super.onTop();
        getProducts();
    }

    // Unreferenced inner class ly/kite/journey/selection/AGroupOrProductFragment$GroupOrProductAdaptor
    /* block-local class not found */
    class GroupOrProductAdaptor {}

}
