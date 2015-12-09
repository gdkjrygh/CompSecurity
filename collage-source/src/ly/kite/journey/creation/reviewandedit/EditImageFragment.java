// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.journey.creation.reviewandedit;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import ly.kite.catalogue.Asset;
import ly.kite.catalogue.AssetHelper;
import ly.kite.catalogue.Product;
import ly.kite.journey.AKiteActivity;
import ly.kite.journey.UserJourneyType;
import ly.kite.journey.creation.AEditImageFragment;
import ly.kite.util.ImageAgent;
import ly.kite.widget.EditableImageContainerFrame;

public class EditImageFragment extends AEditImageFragment
{
    public static interface ICallback
    {

        public abstract void eiOnCancel();

        public abstract void eiOnConfirm(Asset asset);
    }


    public static final String BUNDLE_KEY_MASK_RESOURCE_ID = "maskResourceId";
    public static final String BUNDLE_KEY_PRODUCT = "product";
    public static final String BUNDLE_KEY_UNEDITED_ASSET = "uneditedAsset";
    private static final String LOG_TAG = "EditImageFragment";
    private Asset mAsset;

    public EditImageFragment()
    {
    }

    public static EditImageFragment newInstance(Asset asset, Product product)
    {
        EditImageFragment editimagefragment = new EditImageFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("uneditedAsset", asset);
        bundle.putParcelable("product", product);
        editimagefragment.setArguments(bundle);
        return editimagefragment;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        ImageAgent.getInstance(mKiteActivity);
        mEditableImageContainerFrame.setImageKey(mAsset);
        mEditableImageContainerFrame.setMask(mProduct.getUserJourneyType().maskResourceId(), mProduct.getImageAspectRatio());
        AssetHelper.requestImage(mKiteActivity, mAsset, mEditableImageContainerFrame);
    }

    protected void onCancel()
    {
        if (mKiteActivity instanceof ICallback)
        {
            ((ICallback)mKiteActivity).eiOnCancel();
        }
    }

    protected void onConfirm()
    {
        Asset asset;
        for (asset = getEditedImageAsset(); asset == null || !(mKiteActivity instanceof ICallback);)
        {
            return;
        }

        ((ICallback)mKiteActivity).eiOnConfirm(asset);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            mAsset = (Asset)bundle.getParcelable("uneditedAsset");
            if (mAsset == null)
            {
                Log.e("EditImageFragment", "No asset found");
                bundle = mKiteActivity;
                int i = ly.kite.R.string.alert_dialog_title_no_asset;
                int j = ly.kite.R.string.alert_dialog_message_no_asset;
                int k = ly.kite.R.string.Cancel;
                AKiteActivity akiteactivity = mKiteActivity;
                akiteactivity.getClass();
                bundle.displayModalDialog(i, j, 0, null, k, new ly.kite.journey.AKiteActivity.FinishRunnable(akiteactivity));
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        mCancelButton.setVisibility(0);
        mCancelButton.setText(ly.kite.R.string.Cancel);
        mConfirmButton.setVisibility(0);
        mConfirmButton.setText(ly.kite.R.string.OK);
        return layoutinflater;
    }

    public void onTop()
    {
        mKiteActivity.setTitle(ly.kite.R.string.edit_image_title);
    }
}
