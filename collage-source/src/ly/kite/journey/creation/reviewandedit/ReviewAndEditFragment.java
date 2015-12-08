// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.journey.creation.reviewandedit;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.Iterator;
import ly.kite.analytics.Analytics;
import ly.kite.catalogue.Product;
import ly.kite.journey.AKiteActivity;
import ly.kite.journey.AssetsAndQuantity;
import ly.kite.journey.creation.AProductCreationFragment;

// Referenced classes of package ly.kite.journey.creation.reviewandedit:
//            AssetAndQuantityAdaptor

public class ReviewAndEditFragment extends AProductCreationFragment
    implements android.view.View.OnClickListener, AssetAndQuantityAdaptor.IListener
{
    public static interface ICallback
    {

        public abstract void reOnConfirm();

        public abstract void reOnEdit(int i);
    }


    public static final String TAG = "ReviewAndEditFragment";
    private AssetAndQuantityAdaptor mAssetAndQuantityAdaptor;
    private GridView mGridView;
    private Parcelable mGridViewState;
    private Button mProceedOverlayButton;

    public ReviewAndEditFragment()
    {
    }

    public static ReviewAndEditFragment newInstance(Product product)
    {
        ReviewAndEditFragment reviewandeditfragment = new ReviewAndEditFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("product", product);
        reviewandeditfragment.setArguments(bundle);
        return reviewandeditfragment;
    }

    private void setTitle()
    {
        Iterator iterator = mAssetsAndQuantityArrayList.iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = ((AssetsAndQuantity)iterator.next()).getQuantity() + i) { }
        int j = mProduct.getQuantityPerSheet();
        int k = ((j - 1) + i) / j;
        mKiteActivity.setTitle(getString(ly.kite.R.string.review_and_edit_title_format_string, new Object[] {
            Integer.valueOf(i), Integer.valueOf(j * k)
        }));
    }

    public void onAssetUpdated(int i, AssetsAndQuantity assetsandquantity)
    {
        if (mAssetAndQuantityAdaptor != null)
        {
            mAssetAndQuantityAdaptor.notifyDataSetInvalidated();
        }
    }

    public void onClick(View view)
    {
label0:
        {
            if (view == mProceedOverlayButton && (mKiteActivity instanceof ICallback))
            {
                view = mAssetsAndQuantityArrayList.iterator();
                int i;
                for (i = 0; view.hasNext(); i = ((AssetsAndQuantity)view.next()).getQuantity() + i) { }
                int j = mProduct.getQuantityPerSheet();
                j = (((j - 1) + i) / j) * j;
                if (i >= j)
                {
                    break label0;
                }
                mKiteActivity.displayModalDialog(getString(ly.kite.R.string.alert_dialog_title_pack_not_full_format_string, new Object[] {
                    Integer.valueOf(i)
                }), getString(ly.kite.R.string.alert_dialog_message_pack_not_full_format_string, new Object[] {
                    Integer.valueOf(j - i)
                }), ly.kite.R.string.print_these, new _cls1(), ly.kite.R.string.add_more, null);
            }
            return;
        }
        ((ICallback)mKiteActivity).reOnConfirm();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            Analytics.getInstance(getActivity()).trackProductOrderReviewScreenViewed(mProduct);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(ly.kite.R.layout.screen_review_and_edit, viewgroup, false);
        mGridView = (GridView)layoutinflater.findViewById(ly.kite.R.id.grid_view);
        mProceedOverlayButton = (Button)layoutinflater.findViewById(ly.kite.R.id.proceed_overlay_button);
        mProceedOverlayButton.setText(ly.kite.R.string.review_and_edit_proceed_button_text);
        mProceedOverlayButton.setOnClickListener(this);
        return layoutinflater;
    }

    public void onEdit(int i)
    {
        if (mKiteActivity instanceof ICallback)
        {
            ((ICallback)mKiteActivity).reOnEdit(i);
        }
    }

    public void onNotTop()
    {
        super.onNotTop();
        if (mGridView != null)
        {
            mGridViewState = mGridView.onSaveInstanceState();
            mGridView.setAdapter(null);
        }
        mAssetAndQuantityAdaptor = null;
    }

    public void onQuantityChanged(int i)
    {
        setTitle();
    }

    public void onTop()
    {
        super.onTop();
        mAssetAndQuantityAdaptor = new AssetAndQuantityAdaptor(mKiteActivity, mAssetsAndQuantityArrayList, mProduct, this);
        mGridView.setAdapter(mAssetAndQuantityAdaptor);
        if (mGridViewState != null)
        {
            mGridView.onRestoreInstanceState(mGridViewState);
            mGridViewState = null;
        }
        setTitle();
    }

    public void onWantsToBeZero(int i)
    {
    /* block-local class not found */
    class DeleteAssetRunnable {}

        mKiteActivity.displayModalDialog(ly.kite.R.string.alert_dialog_title_delete_photo, ly.kite.R.string.alert_dialog_message_delete_photo, ly.kite.R.string.alert_dialog_delete_photo_confirm_text, new DeleteAssetRunnable(i), ly.kite.R.string.alert_dialog_delete_photo_cancel_text, null);
    }





    /* member class not found */
    class _cls1 {}

}
