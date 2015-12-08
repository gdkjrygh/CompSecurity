// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.journey.creation.imagesource;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ly.kite.KiteSDK;
import ly.kite.catalogue.Asset;
import ly.kite.catalogue.Product;
import ly.kite.journey.AKiteActivity;
import ly.kite.journey.AssetsAndQuantity;
import ly.kite.journey.ImageSource;
import ly.kite.journey.ImageSourceAdaptor;
import ly.kite.journey.UserJourneyType;
import ly.kite.journey.creation.AProductCreationFragment;

public class ImageSourceFragment extends AProductCreationFragment
    implements android.widget.AdapterView.OnItemClickListener
{
    public static interface ICallback
    {

        public abstract void isOnAssetsAdded();
    }


    private static final String LOG_TAG = "ImageSourceFragment";
    private GridView mImageSourceGridView;

    public ImageSourceFragment()
    {
    }

    public static ImageSourceFragment newInstance(Product product)
    {
        ImageSourceFragment imagesourcefragment = new ImageSourceFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("product", product);
        imagesourcefragment.setArguments(bundle);
        return imagesourcefragment;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        intent = ImageSource.getAssetsFromResult(i, j, intent);
        if (intent != null && intent.size() > 0)
        {
            Asset asset;
            for (intent = intent.iterator(); intent.hasNext(); mAssetsAndQuantityArrayList.add(new AssetsAndQuantity(asset)))
            {
                asset = (Asset)intent.next();
            }

            if (mKiteActivity instanceof ICallback)
            {
                ((ICallback)mKiteActivity).isOnAssetsAdded();
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(ly.kite.R.layout.screen_image_source, viewgroup, false);
        mImageSourceGridView = (GridView)layoutinflater.findViewById(ly.kite.R.id.image_source_grid_view);
        viewgroup = KiteSDK.getInstance(mKiteActivity).getAvailableImageSources();
        viewgroup = new ImageSourceAdaptor(mKiteActivity, ly.kite.R.layout.grid_item_image_source_vertical, viewgroup);
        mImageSourceGridView.setAdapter(viewgroup);
        mImageSourceGridView.setOnItemClickListener(this);
        return layoutinflater;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (adapterview == mImageSourceGridView)
        {
            ((ImageSource)mImageSourceGridView.getItemAtPosition(i)).onPick(this, mProduct.getUserJourneyType().usesSingleImage());
        }
    }

    public void onTop()
    {
        super.onTop();
        mKiteActivity.setTitle(ly.kite.R.string.title_image_source);
    }
}
