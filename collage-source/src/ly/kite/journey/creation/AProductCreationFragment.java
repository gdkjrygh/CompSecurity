// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.journey.creation;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import ly.kite.catalogue.Product;
import ly.kite.journey.AKiteFragment;
import ly.kite.journey.IAssetsAndQuantityHolder;

public abstract class AProductCreationFragment extends AKiteFragment
{

    private static final String LOG_TAG = "AProductCreationFrag.";
    protected ArrayList mAssetsAndQuantityArrayList;
    protected Product mProduct;

    public AProductCreationFragment()
    {
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (mKiteActivity != null && (mKiteActivity instanceof IAssetsAndQuantityHolder))
        {
            mAssetsAndQuantityArrayList = ((IAssetsAndQuantityHolder)mKiteActivity).getAssetsAndQuantityArrayList();
        }
        if (mAssetsAndQuantityArrayList == null)
        {
            throw new IllegalStateException("The assets and quantity list could not be obtained");
        } else
        {
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle == null)
        {
            Log.e("AProductCreationFrag.", "No arguments found");
        } else
        {
            mProduct = (Product)bundle.getParcelable("product");
            if (mProduct == null)
            {
                throw new IllegalStateException("No product supplied");
            }
        }
    }
}
