// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.journey.creation;

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
import ly.kite.widget.EditableImageContainerFrame;
import ly.kite.widget.EditableMaskedImageView;
import ly.kite.widget.PromptTextFrame;

// Referenced classes of package ly.kite.journey.creation:
//            AProductCreationFragment

public abstract class AEditImageFragment extends AProductCreationFragment
    implements android.view.View.OnClickListener
{

    public static final String BUNDLE_KEY_PRODUCT = "product";
    private static final String LOG_TAG = "AEditImageFragment";
    protected Button mCancelButton;
    protected Button mConfirmButton;
    protected EditableImageContainerFrame mEditableImageContainerFrame;
    protected Product mProduct;
    private PromptTextFrame mPromptTextFrame;

    public AEditImageFragment()
    {
    }

    protected Asset getEditedImageAsset()
    {
        if (mEditableImageContainerFrame == null)
        {
            return null;
        }
        Object obj = mEditableImageContainerFrame.getEditableImageView().getImageCroppedToMask();
        if (obj == null)
        {
            Log.w("AEditImageFragment", "Cropped image not yet available");
            return null;
        }
        obj = AssetHelper.createAsCachedFile(mKiteActivity, ((android.graphics.Bitmap) (obj)));
        if (obj == null)
        {
            Log.e("AEditImageFragment", "Could not create edited image asset");
            mKiteActivity.displayModalDialog(ly.kite.R.string.alert_dialog_title_create_order, ly.kite.R.string.alert_dialog_message_no_cropped_image_asset, 0, null, ly.kite.R.string.Cancel, null);
            return null;
        } else
        {
            return ((Asset) (obj));
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (bundle == null && mPromptTextFrame != null)
        {
            mPromptTextFrame.startDisplayCycle();
        }
    }

    protected void onCancel()
    {
    }

    public void onClick(View view)
    {
        if (view == mCancelButton)
        {
            onCancel();
        } else
        if (view == mConfirmButton)
        {
            onConfirm();
            return;
        }
    }

    protected abstract void onConfirm();

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle == null)
        {
            Log.e("AEditImageFragment", "No arguments found");
            bundle = mKiteActivity;
            int i = ly.kite.R.string.alert_dialog_title_no_arguments;
            int k = ly.kite.R.string.alert_dialog_message_no_arguments;
            int i1 = ly.kite.R.string.Cancel;
            AKiteActivity akiteactivity = mKiteActivity;
            akiteactivity.getClass();
            bundle.displayModalDialog(i, k, 0, null, i1, new ly.kite.journey.AKiteActivity.FinishRunnable(akiteactivity));
        } else
        {
            mProduct = (Product)bundle.getParcelable("product");
            if (mProduct == null)
            {
                Log.e("AEditImageFragment", "No product found");
                bundle = mKiteActivity;
                int j = ly.kite.R.string.alert_dialog_title_product_not_found;
                int l = ly.kite.R.string.alert_dialog_message_product_not_found;
                int j1 = ly.kite.R.string.Cancel;
                AKiteActivity akiteactivity1 = mKiteActivity;
                akiteactivity1.getClass();
                bundle.displayModalDialog(j, l, 0, null, j1, new ly.kite.journey.AKiteActivity.FinishRunnable(akiteactivity1));
                return;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(ly.kite.R.layout.screen_edit_image, viewgroup, false);
        mEditableImageContainerFrame = (EditableImageContainerFrame)layoutinflater.findViewById(ly.kite.R.id.editable_consumer_image_view);
        mCancelButton = (Button)layoutinflater.findViewById(ly.kite.R.id.cancel_button);
        mConfirmButton = (Button)layoutinflater.findViewById(ly.kite.R.id.confirm_button);
        mPromptTextFrame = (PromptTextFrame)layoutinflater.findViewById(ly.kite.R.id.prompt_text_frame);
        mCancelButton.setOnClickListener(this);
        mConfirmButton.setOnClickListener(this);
        return layoutinflater;
    }
}
