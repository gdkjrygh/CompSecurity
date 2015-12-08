// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.journey;

import android.app.Activity;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import ly.kite.catalogue.CatalogueLoader;
import ly.kite.gcm.GCMRegistrationService;

// Referenced classes of package ly.kite.journey:
//            AKiteFragment

public abstract class AKiteActivity extends Activity
    implements android.app.FragmentManager.OnBackStackChangedListener
{
    private class DialogCallbackHandler
        implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnClickListener
    {

        private Runnable mNegativeRunnable;
        private Runnable mPositiveRunnable;
        final AKiteActivity this$0;

        private void performNegativeAction()
        {
            if (mNegativeRunnable != null)
            {
                mNegativeRunnable.run();
            }
        }

        public void onCancel(DialogInterface dialoginterface)
        {
            performNegativeAction();
            ensureDialogGone();
        }

        public void onClick(DialogInterface dialoginterface, int i)
        {
            i;
            JVM INSTR tableswitch -2 -1: default 24
        //                       -2 51
        //                       -1 32;
               goto _L1 _L2 _L3
_L1:
            ensureDialogGone();
            return;
_L3:
            if (mPositiveRunnable != null)
            {
                mPositiveRunnable.run();
            }
            continue; /* Loop/switch isn't completed */
_L2:
            performNegativeAction();
            if (true) goto _L1; else goto _L4
_L4:
        }

        DialogCallbackHandler(Runnable runnable, Runnable runnable1)
        {
            this$0 = AKiteActivity.this;
            super();
            mPositiveRunnable = runnable;
            mNegativeRunnable = runnable1;
        }
    }

    public class FinishRunnable
        implements Runnable
    {

        final AKiteActivity this$0;

        public void run()
        {
            finish();
        }

        public FinishRunnable()
        {
            this$0 = AKiteActivity.this;
            super();
        }
    }


    public static final int ACTIVITY_REQUEST_CODE_CHECKOUT = 10;
    public static final int ACTIVITY_REQUEST_CODE_CREATE = 11;
    public static final int ACTIVITY_REQUEST_CODE_SELECT_DEVICE_IMAGE = 12;
    public static final int ACTIVITY_REQUEST_CODE_SELECT_INSTAGRAM_IMAGE = 13;
    public static final String IMAGE_CLASS_STRING_PRODUCT_ITEM = "product_item";
    public static final String INTENT_EXTRA_NAME_ASSETS_AND_QUANTITY__LIST = "ly.kite.assetsAndQuantityList";
    private static final String LOG_TAG = "AKiteActivity";
    public static final int NO_BUTTON = 0;
    private boolean mActivityIsVisible;
    private boolean mCanAddFragment;
    private Dialog mDialog;
    protected FragmentManager mFragmentManager;
    private AKiteFragment mPendingFragment;
    private String mPendingFragmentTag;
    protected AKiteFragment mTopFragment;

    public AKiteActivity()
    {
    }

    private void determineTopFragment()
    {
        determineTopFragment(mFragmentManager.getBackStackEntryCount());
    }

    private void determineTopFragment(int i)
    {
        int j;
        AKiteFragment akitefragment = mTopFragment;
        j = i - 1;
        if (i <= 0) goto _L2; else goto _L1
_L1:
        Object obj = mFragmentManager.getBackStackEntryAt(j);
        if (obj == null) goto _L2; else goto _L3
_L3:
        mTopFragment = (AKiteFragment)mFragmentManager.findFragmentByTag(((android.app.FragmentManager.BackStackEntry) (obj)).getName());
        if (mTopFragment != null)
        {
            onNotifyTop(mTopFragment);
        }
          goto _L4
_L11:
        if (i < 0) goto _L6; else goto _L5
_L5:
        obj = mFragmentManager.getBackStackEntryAt(i);
        if (obj == null) goto _L8; else goto _L7
_L7:
        obj = (AKiteFragment)mFragmentManager.findFragmentByTag(((android.app.FragmentManager.BackStackEntry) (obj)).getName());
        if (obj == null) goto _L8; else goto _L9
_L9:
        onNotifyNotTop(((AKiteFragment) (obj)));
          goto _L8
_L2:
        mTopFragment = null;
          goto _L4
        Exception exception;
        exception;
        Log.e("AKiteActivity", "Could not determine current fragment", exception);
        mTopFragment = null;
_L6:
        return;
_L4:
        i = j - 1;
        continue; /* Loop/switch isn't completed */
_L8:
        i--;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private void ensureDialogGone()
    {
        if (mDialog != null)
        {
            mDialog.dismiss();
            mDialog = null;
        }
    }

    protected void addFragment(AKiteFragment akitefragment, String s)
    {
        if (mCanAddFragment)
        {
            mFragmentManager.beginTransaction().replace(ly.kite.R.id.fragment_container, akitefragment, s).addToBackStack(s).commit();
            return;
        } else
        {
            mPendingFragment = akitefragment;
            mPendingFragmentTag = s;
            return;
        }
    }

    public void displayModalDialog(int i, int j, int k, Runnable runnable, int l, Runnable runnable1)
    {
        displayModalDialog(i, getString(j), k, runnable, l, runnable1);
    }

    protected void displayModalDialog(int i, String s, int j, Runnable runnable, int k, Runnable runnable1)
    {
        displayModalDialog(getString(i), s, j, runnable, k, runnable1);
    }

    public void displayModalDialog(String s, String s1, int i, Runnable runnable, int j, Runnable runnable1)
    {
        if (!mActivityIsVisible)
        {
            return;
        }
        ensureDialogGone();
        runnable = new DialogCallbackHandler(runnable, runnable1);
        s = (new android.app.AlertDialog.Builder(this)).setTitle(s).setMessage(s1).setCancelable(true).setOnCancelListener(runnable);
        if (i != 0)
        {
            s.setPositiveButton(i, runnable);
        }
        if (j != 0)
        {
            s.setNegativeButton(j, runnable);
        }
        mDialog = s.create();
        mDialog.show();
    }

    public boolean isVisible()
    {
        return mActivityIsVisible;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 10 && j == -1)
        {
            setResult(-1);
            finish();
        }
    }

    public void onBackPressed()
    {
        if (mTopFragment != null && mTopFragment.onBackPressIntercepted())
        {
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void onBackStackChanged()
    {
        if (mFragmentManager.getBackStackEntryCount() < 1)
        {
            finish();
        }
        determineTopFragment();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        GCMRegistrationService.start(this);
        CatalogueLoader.getInstance(this);
        mFragmentManager = getFragmentManager();
        mFragmentManager.addOnBackStackChangedListener(this);
    }

    protected void onDestroy()
    {
        mActivityIsVisible = false;
        ensureDialogGone();
        super.onDestroy();
    }

    protected void onNotifyNotTop(AKiteFragment akitefragment)
    {
        akitefragment.onNotTop();
    }

    protected void onNotifyTop(AKiteFragment akitefragment)
    {
        akitefragment.onTop();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            super.onBackPressed();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        if (bundle != null)
        {
            determineTopFragment();
        }
    }

    protected void onPostResume()
    {
        super.onPostResume();
        mCanAddFragment = true;
        if (mPendingFragment != null)
        {
            addFragment(mPendingFragment, mPendingFragmentTag);
            mPendingFragment = null;
            mPendingFragmentTag = null;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        mCanAddFragment = false;
    }

    protected void onStart()
    {
        super.onStart();
        mActivityIsVisible = true;
    }

    protected void onStop()
    {
        mActivityIsVisible = false;
        super.onStop();
    }

    protected void popFragment()
    {
        mFragmentManager.popBackStack();
    }

    protected void popFragmentSecretly()
    {
        mFragmentManager.removeOnBackStackChangedListener(this);
        mFragmentManager.popBackStackImmediate("AKiteFragment", 1);
        mFragmentManager.addOnBackStackChangedListener(this);
    }

    protected void replaceFragment(AKiteFragment akitefragment, String s)
    {
        mFragmentManager.beginTransaction().replace(ly.kite.R.id.fragment_container, akitefragment, s).commit();
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        Resources resources = getResources();
        i = resources.getIdentifier("action_bar_title", "id", "android");
        if (i != 0)
        {
            View view = findViewById(i);
            if (view != null)
            {
                Object obj = view.getLayoutParams();
                if (obj instanceof android.view.ViewGroup.MarginLayoutParams)
                {
                    obj = (android.view.ViewGroup.MarginLayoutParams)obj;
                    obj.leftMargin = (int)resources.getDimension(ly.kite.R.dimen.action_bar_title_text_left_spacing);
                    view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                }
            }
        }
    }

    protected void showErrorDialog(String s)
    {
        displayModalDialog(ly.kite.R.string.alert_dialog_title_oops, s, ly.kite.R.string.OK, null, 0, null);
    }

}
