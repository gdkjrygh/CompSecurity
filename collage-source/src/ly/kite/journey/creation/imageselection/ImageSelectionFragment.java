// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.journey.creation.imageselection;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ProgressBar;
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
import ly.kite.journey.ImageSourceAdaptor;
import ly.kite.journey.creation.AProductCreationFragment;
import ly.kite.util.BooleanHelper;
import ly.kite.widget.VisibilitySettingAnimationListener;

// Referenced classes of package ly.kite.journey.creation.imageselection:
//            ImageSelectionAdaptor

public class ImageSelectionFragment extends AProductCreationFragment
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, ImageSelectionAdaptor.IOnImageCheckChangeListener
{
    public static interface ICallback
    {

        public abstract void isOnNext();
    }


    public static final String BUNDLE_KEY_ASSET_IS_CHECKED_ARRAY = "assetIsCheckedArray";
    private static final long CLEAR_PHOTOS_BUTTON_ANIMATION_DURATION_MILLIS = 300L;
    private static final long PROCEED_BUTTON_BUTTON_ANIMATION_DURATION_MILLIS = 300L;
    private static final int PROGRESS_COMPLETE = 100;
    public static final String TAG = "ImageSelectionFragment";
    private ArrayList mAssetIsCheckedArrayList;
    private Button mClearPhotosButton;
    private GridLayoutManager mImageLayoutManager;
    private ImageSelectionAdaptor mImagePackAdaptor;
    private RecyclerView mImageRecyclerView;
    private BaseAdapter mImageSourceAdaptor;
    private GridView mImageSourceGridView;
    private int mInitialUneditedAssetsCount;
    private int mNumberOfColumns;
    private Button mProceedOverlayButton;
    private ProgressBar mProgressBar;
    private int mUncheckedImagesCount;
    private int mUneditedAssetsRemaining;

    public ImageSelectionFragment()
    {
    }

    private void addAssets(List list)
    {
        list = list.iterator();
        boolean flag;
        boolean flag1;
        for (flag = false; list.hasNext(); flag = flag1)
        {
            Object obj = (Asset)list.next();
            flag1 = flag;
            if (AssetsAndQuantity.uneditedAssetIsInList(mAssetsAndQuantityArrayList, ((Asset) (obj))))
            {
                continue;
            }
            obj = new AssetsAndQuantity(((Asset) (obj)));
            mUneditedAssetsRemaining = mUneditedAssetsRemaining + 1;
            flag1 = flag;
            if (!flag)
            {
                mProceedOverlayButton.setEnabled(false);
                flag1 = true;
            }
            mAssetsAndQuantityArrayList.add(obj);
            mAssetIsCheckedArrayList.add(Boolean.valueOf(true));
            mImagePackAdaptor.addAsset(((AssetsAndQuantity) (obj)));
    /* block-local class not found */
    class AssetImageCropper {}

            AssetImageCropper assetimagecropper = new AssetImageCropper(((AssetsAndQuantity) (obj)), mProduct.getImageAspectRatio());
            AssetHelper.requestImage(mKiteActivity, ((AssetsAndQuantity) (obj)).getUneditedAsset(), assetimagecropper, 0, assetimagecropper);
        }

        if (flag)
        {
            setTitle();
            mInitialUneditedAssetsCount = mUneditedAssetsRemaining;
            showProgress(mUneditedAssetsRemaining, mInitialUneditedAssetsCount);
        }
    }

    private void animateClearPhotosButtonIn()
    {
        mClearPhotosButton.setVisibility(0);
        TranslateAnimation translateanimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 1.0F, 1, 0.0F);
        translateanimation.setDuration(300L);
        mClearPhotosButton.startAnimation(translateanimation);
    }

    private void animateClearPhotosButtonOut()
    {
        mClearPhotosButton.setVisibility(0);
        TranslateAnimation translateanimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, 1.0F);
        translateanimation.setDuration(300L);
        translateanimation.setFillAfter(true);
        translateanimation.setAnimationListener(new VisibilitySettingAnimationListener(mClearPhotosButton, 8));
        mClearPhotosButton.startAnimation(translateanimation);
    }

    private void animateProceedOverlayButtonIn()
    {
        mProceedOverlayButton.setVisibility(0);
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setDuration(300L);
        mProceedOverlayButton.startAnimation(alphaanimation);
    }

    private void animateProceedOverlayButtonOut()
    {
        mProceedOverlayButton.setVisibility(0);
        AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
        alphaanimation.setDuration(300L);
        alphaanimation.setFillAfter(true);
        alphaanimation.setAnimationListener(new VisibilitySettingAnimationListener(mProceedOverlayButton, 8));
        mProceedOverlayButton.startAnimation(alphaanimation);
    }

    public static ImageSelectionFragment newInstance(Product product)
    {
        ImageSelectionFragment imageselectionfragment = new ImageSelectionFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("product", product);
        imageselectionfragment.setArguments(bundle);
        return imageselectionfragment;
    }

    private void setClearPhotosButtonText()
    {
        String s = getString(ly.kite.R.string.image_selection_clear_photos_format_string, new Object[] {
            Integer.valueOf(mUncheckedImagesCount), getResources().getQuantityString(ly.kite.R.plurals.Photos_plurals, mUncheckedImagesCount)
        });
        mClearPhotosButton.setText(s);
    }

    private void setTitle()
    {
        Iterator iterator = mAssetsAndQuantityArrayList.iterator();
        int j = 0;
        int i = 0;
        while (iterator.hasNext()) 
        {
            AssetsAndQuantity assetsandquantity = (AssetsAndQuantity)iterator.next();
            if (((Boolean)mAssetIsCheckedArrayList.get(j)).booleanValue())
            {
                i += assetsandquantity.getQuantity();
            }
            j++;
        }
        j = mProduct.getQuantityPerSheet();
        int k = ((j - 1) + i) / j;
        mKiteActivity.setTitle(getString(ly.kite.R.string.image_selection_title_format_string, new Object[] {
            mProduct.getName(), Integer.valueOf(i), Integer.valueOf(j * k)
        }));
    }

    private void setUpRecyclerView()
    {
        if (mNumberOfColumns == 0)
        {
            mNumberOfColumns = getResources().getInteger(ly.kite.R.integer.image_selection_grid_num_columns);
        }
        mImagePackAdaptor = new ImageSelectionAdaptor(mKiteActivity, mProduct, mAssetsAndQuantityArrayList, mAssetIsCheckedArrayList, mNumberOfColumns, this);
        mImageLayoutManager = new GridLayoutManager(mKiteActivity, mNumberOfColumns);
        GridLayoutManager gridlayoutmanager = mImageLayoutManager;
        ImageSelectionAdaptor imageselectionadaptor = mImagePackAdaptor;
        imageselectionadaptor.getClass();
        gridlayoutmanager.setSpanSizeLookup(new ImageSelectionAdaptor.SpanSizeLookup(imageselectionadaptor, mNumberOfColumns));
        mImageRecyclerView.setLayoutManager(mImageLayoutManager);
        mImageRecyclerView.setAdapter(mImagePackAdaptor);
    }

    private void showProgress(int i, int j)
    {
        if (mProgressBar == null)
        {
            return;
        }
        if (j < 1 || i < 1)
        {
            mProgressBar.setVisibility(4);
            return;
        } else
        {
            mProgressBar.setVisibility(0);
            mProgressBar.setProgress(((j - i) * 100) / j);
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        mUncheckedImagesCount = 0;
        if (mAssetIsCheckedArrayList == null || mAssetIsCheckedArrayList.size() != mAssetsAndQuantityArrayList.size())
        {
            mAssetIsCheckedArrayList = new ArrayList(mAssetsAndQuantityArrayList.size());
            for (bundle = mAssetsAndQuantityArrayList.iterator(); bundle.hasNext(); mAssetIsCheckedArrayList.add(Boolean.valueOf(true)))
            {
                AssetsAndQuantity assetsandquantity = (AssetsAndQuantity)bundle.next();
            }

        } else
        {
            bundle = mAssetIsCheckedArrayList.iterator();
            do
            {
                if (!bundle.hasNext())
                {
                    break;
                }
                if (!((Boolean)bundle.next()).booleanValue())
                {
                    mUncheckedImagesCount = mUncheckedImagesCount + 1;
                }
            } while (true);
        }
        mUneditedAssetsRemaining = 0;
        bundle = mAssetsAndQuantityArrayList.iterator();
        do
        {
            if (!bundle.hasNext())
            {
                break;
            }
            AssetsAndQuantity assetsandquantity1 = (AssetsAndQuantity)bundle.next();
            String s = mProduct.getId();
            if (s == null || !s.equals(assetsandquantity1.getEditedForProductId()))
            {
                mUneditedAssetsRemaining = mUneditedAssetsRemaining + 1;
                AssetImageCropper assetimagecropper = new AssetImageCropper(assetsandquantity1, mProduct.getImageAspectRatio());
                AssetHelper.requestImage(mKiteActivity, assetsandquantity1.getUneditedAsset(), assetimagecropper, 0, assetimagecropper);
            }
        } while (true);
        mInitialUneditedAssetsCount = mUneditedAssetsRemaining;
        if (mUncheckedImagesCount > 0)
        {
            mClearPhotosButton.setVisibility(0);
            setClearPhotosButtonText();
            mProceedOverlayButton.setVisibility(8);
        } else
        {
            mClearPhotosButton.setVisibility(8);
            mProceedOverlayButton.setVisibility(0);
        }
        mProceedOverlayButton.setText(ly.kite.R.string.image_selection_proceed_button_text);
        showProgress(mUneditedAssetsRemaining, mInitialUneditedAssetsCount);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        intent = ImageSource.getAssetsFromResult(i, j, intent);
        if (intent != null)
        {
            addAssets(intent);
        }
    }

    public void onAssetUpdated(int i, AssetsAndQuantity assetsandquantity)
    {
        if (mImagePackAdaptor != null)
        {
            mImagePackAdaptor.notifyDataSetChanged();
        }
    }

    public boolean onBackPressIntercepted()
    {
        if (mUncheckedImagesCount < 1)
        {
            return false;
        }
        Iterator iterator = mAssetIsCheckedArrayList.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            if (!((Boolean)iterator.next()).booleanValue())
            {
                mAssetIsCheckedArrayList.set(i, Boolean.valueOf(true));
            }
        }

        mUncheckedImagesCount = 0;
        setTitle();
        animateClearPhotosButtonOut();
        animateProceedOverlayButtonIn();
        mImagePackAdaptor.onUpdateCheckedImages();
        return true;
    }

    public void onClick(View view)
    {
        if (view == mClearPhotosButton)
        {
            int j;
            for (int i = 0; i < mAssetsAndQuantityArrayList.size(); i = j + 1)
            {
                j = i;
                if (!((Boolean)mAssetIsCheckedArrayList.get(i)).booleanValue())
                {
                    mAssetsAndQuantityArrayList.remove(i);
                    mAssetIsCheckedArrayList.remove(i);
                    j = i - 1;
                }
            }

            mUncheckedImagesCount = 0;
            setTitle();
            animateClearPhotosButtonOut();
            animateProceedOverlayButtonIn();
            setUpRecyclerView();
        } else
        if (view == mProceedOverlayButton)
        {
            if (mAssetsAndQuantityArrayList.isEmpty())
            {
                mKiteActivity.displayModalDialog(ly.kite.R.string.alert_dialog_title_oops, ly.kite.R.string.alert_dialog_message_no_images_selected, ly.kite.R.string.OK, null, 0, null);
                return;
            }
            if (mKiteActivity instanceof ICallback)
            {
                ((ICallback)mKiteActivity).isOnNext();
                return;
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            mAssetIsCheckedArrayList = BooleanHelper.arrayListFrom(bundle.getBooleanArray("assetIsCheckedArray"));
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(ly.kite.R.layout.screen_image_selection, viewgroup, false);
        mImageSourceGridView = (GridView)layoutinflater.findViewById(ly.kite.R.id.image_source_grid_view);
        mProgressBar = (ProgressBar)layoutinflater.findViewById(ly.kite.R.id.progress_bar);
        mImageRecyclerView = (RecyclerView)layoutinflater.findViewById(ly.kite.R.id.image_recycler_view);
        mClearPhotosButton = (Button)layoutinflater.findViewById(ly.kite.R.id.clear_photos_button);
        mProceedOverlayButton = (Button)layoutinflater.findViewById(ly.kite.R.id.proceed_overlay_button);
        viewgroup = KiteSDK.getInstance(mKiteActivity).getAvailableImageSources();
        mImageSourceAdaptor = new ImageSourceAdaptor(mKiteActivity, ly.kite.R.layout.grid_item_image_source_horizontal, viewgroup);
        mImageSourceGridView.setNumColumns(mImageSourceAdaptor.getCount());
        mImageSourceGridView.setAdapter(mImageSourceAdaptor);
        mImageSourceGridView.setOnItemClickListener(this);
        mClearPhotosButton.setOnClickListener(this);
        mProceedOverlayButton.setOnClickListener(this);
        return layoutinflater;
    }

    public void onImageCheckChange(int i, boolean flag)
    {
        i = mUncheckedImagesCount;
        if (flag)
        {
            mUncheckedImagesCount = mUncheckedImagesCount - 1;
        } else
        {
            mUncheckedImagesCount = mUncheckedImagesCount + 1;
        }
        setTitle();
        if (i <= 0 || mUncheckedImagesCount != 0) goto _L2; else goto _L1
_L1:
        animateClearPhotosButtonOut();
        animateProceedOverlayButtonIn();
_L4:
        if (mUncheckedImagesCount > 0)
        {
            setClearPhotosButtonText();
        }
        return;
_L2:
        if (i == 0 && mUncheckedImagesCount > 0)
        {
            animateProceedOverlayButtonOut();
            animateClearPhotosButtonIn();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (adapterview == mImageSourceGridView)
        {
            ((ImageSource)mImageSourceGridView.getItemAtPosition(i)).onPick(this, false);
        }
    }

    public void onNotTop()
    {
        super.onNotTop();
        if (mImageRecyclerView != null)
        {
            mImageRecyclerView.setAdapter(null);
        }
        mImagePackAdaptor = null;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBooleanArray("assetIsCheckedArray", BooleanHelper.arrayFrom(mAssetIsCheckedArrayList));
    }

    public void onTop()
    {
        super.onTop();
        if (mProduct != null)
        {
            setTitle();
        }
        setUpRecyclerView();
        if (mUneditedAssetsRemaining < 1)
        {
            mProceedOverlayButton.setEnabled(true);
            return;
        } else
        {
            mProceedOverlayButton.setEnabled(false);
            return;
        }
    }






/*
    static int access$310(ImageSelectionFragment imageselectionfragment)
    {
        int i = imageselectionfragment.mUneditedAssetsRemaining;
        imageselectionfragment.mUneditedAssetsRemaining = i - 1;
        return i;
    }

*/



}
