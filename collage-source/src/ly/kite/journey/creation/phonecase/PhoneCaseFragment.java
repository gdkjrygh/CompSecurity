// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.journey.creation.phonecase;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ly.kite.KiteSDK;
import ly.kite.catalogue.Asset;
import ly.kite.catalogue.AssetHelper;
import ly.kite.catalogue.Product;
import ly.kite.journey.AKiteActivity;
import ly.kite.journey.AssetsAndQuantity;
import ly.kite.journey.ImageSource;
import ly.kite.journey.creation.AEditImageFragment;
import ly.kite.util.ImageAgent;
import ly.kite.widget.EditableImageContainerFrame;

public class PhoneCaseFragment extends AEditImageFragment
{
    public static interface ICallback
    {

        public abstract void pcOnCreated(Asset asset);
    }


    private static final String BUNDLE_KEY_IMAGE_ASSET = "imageAsset";
    private static final String LOG_TAG = "PhoneCaseFragment";
    private Asset mImageAsset;

    public PhoneCaseFragment()
    {
    }

    public static PhoneCaseFragment newInstance(Product product)
    {
        PhoneCaseFragment phonecasefragment = new PhoneCaseFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("product", product);
        phonecasefragment.setArguments(bundle);
        return phonecasefragment;
    }

    private void useAssetForImage(Asset asset, boolean flag)
    {
        if (flag)
        {
            mEditableImageContainerFrame.clearState();
        }
        mEditableImageContainerFrame.setImageKey(asset);
        AssetHelper.requestImage(mKiteActivity, asset, mEditableImageContainerFrame);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (bundle != null)
        {
            mEditableImageContainerFrame.restoreState(bundle);
        }
        bundle = ImageAgent.getInstance(mKiteActivity);
        java.net.URL url = mProduct.getMaskURL();
        ly.kite.catalogue.Bleed bleed = mProduct.getMaskBleed();
        if (url != null)
        {
            mEditableImageContainerFrame.setMaskExtras(url, bleed);
            bundle.requestImage("product_item", url, mEditableImageContainerFrame);
        }
        if (mImageAsset == null && mAssetsAndQuantityArrayList != null && mAssetsAndQuantityArrayList.size() > 0)
        {
            mImageAsset = ((AssetsAndQuantity)mAssetsAndQuantityArrayList.get(0)).getUneditedAsset();
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        intent = ImageSource.getAssetsFromResult(i, j, intent);
        if (intent != null && intent.size() > 0)
        {
            Asset asset;
            for (intent = intent.iterator(); intent.hasNext(); mAssetsAndQuantityArrayList.add(0, new AssetsAndQuantity(asset)))
            {
                asset = (Asset)intent.next();
            }

            mImageAsset = ((AssetsAndQuantity)mAssetsAndQuantityArrayList.get(0)).getUneditedAsset();
            useAssetForImage(mImageAsset, true);
        }
    }

    protected void onConfirm()
    {
        Asset asset;
        for (asset = getEditedImageAsset(); asset == null || !(mKiteActivity instanceof ICallback);)
        {
            return;
        }

        ((ICallback)mKiteActivity).pcOnCreated(asset);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            mImageAsset = (Asset)bundle.getParcelable("imageAsset");
        }
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(ly.kite.R.menu.add_photo, menu);
        menu = menu.findItem(ly.kite.R.id.add_photo_menu_item);
        if (menu != null)
        {
            menu = menu.getSubMenu();
            if (menu != null)
            {
                for (menuinflater = KiteSDK.getInstance(mKiteActivity).getAvailableImageSources().iterator(); menuinflater.hasNext(); ((ImageSource)menuinflater.next()).addMenuItem(menu)) { }
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        mCancelButton.setVisibility(8);
        mConfirmButton.setVisibility(0);
        mConfirmButton.setText(ly.kite.R.string.phone_case_proceed_button_text);
        return layoutinflater;
    }

    public void onNotTop()
    {
        super.onNotTop();
        if (mEditableImageContainerFrame != null)
        {
            mEditableImageContainerFrame.clearImage();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        if (i == ImageSource.DEVICE.menuItemId())
        {
            ImageSource.DEVICE.onPick(this, true);
            return true;
        }
        if (i == ImageSource.INSTAGRAM.menuItemId())
        {
            ImageSource.INSTAGRAM.onPick(this, true);
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (mImageAsset != null)
        {
            bundle.putParcelable("imageAsset", mImageAsset);
        }
        if (mEditableImageContainerFrame != null)
        {
            mEditableImageContainerFrame.saveState(bundle);
        }
    }

    public void onTop()
    {
        super.onTop();
        if (mProduct != null)
        {
            mKiteActivity.setTitle(mProduct.getName());
        }
        if (mImageAsset != null)
        {
            useAssetForImage(mImageAsset, false);
        }
    }
}
