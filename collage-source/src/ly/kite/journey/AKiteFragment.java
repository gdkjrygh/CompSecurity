// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.journey;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.widget.AdapterView;

// Referenced classes of package ly.kite.journey:
//            AKiteActivity

public abstract class AKiteFragment extends Fragment
{

    private static final String BUNDLE_KEY_MANAGED_ADAPTOR_VIEW_POSITION = "managedAdaptorViewPosition";
    protected static final String BUNDLE_KEY_PRODUCT = "product";
    public static final String TAG = "AKiteFragment";
    protected AKiteActivity mKiteActivity;
    private AdapterView mManagedAdaptorView;
    private int mManagedAdaptorViewPosition;

    public AKiteFragment()
    {
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        mKiteActivity = (AKiteActivity)activity;
    }

    public boolean onBackPressIntercepted()
    {
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            mManagedAdaptorViewPosition = bundle.getInt("managedAdaptorViewPosition");
        }
    }

    public void onNotTop()
    {
    }

    protected void onRestoreManagedAdaptorViewPosition()
    {
        if (mManagedAdaptorView != null && mManagedAdaptorViewPosition >= 0 && mManagedAdaptorViewPosition < mManagedAdaptorView.getCount())
        {
            mManagedAdaptorView.setSelection(mManagedAdaptorViewPosition);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (mManagedAdaptorView != null)
        {
            bundle.putInt("managedAdaptorViewPosition", mManagedAdaptorView.getFirstVisiblePosition());
        }
    }

    protected void onSaveManagedAdaptorViewPosition()
    {
        if (mManagedAdaptorView != null)
        {
            onSaveManagedAdaptorViewPosition(mManagedAdaptorView.getFirstVisiblePosition());
        }
    }

    protected void onSaveManagedAdaptorViewPosition(int i)
    {
        mManagedAdaptorViewPosition = i;
    }

    public void onTop()
    {
    }

    protected void setManagedAdaptorView(AdapterView adapterview)
    {
        mManagedAdaptorView = adapterview;
    }
}
