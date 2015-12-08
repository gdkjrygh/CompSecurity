// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            FragmentActivity, FragmentManagerImpl, Fragment

public abstract class Watson extends FragmentActivity
    implements com.actionbarsherlock.ActionBarSherlock.OnCreatePanelMenuListener, com.actionbarsherlock.ActionBarSherlock.OnPreparePanelListener, com.actionbarsherlock.ActionBarSherlock.OnMenuItemSelectedListener
{
    public static interface OnCreateOptionsMenuListener
    {

        public abstract void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater);
    }

    public static interface OnOptionsItemSelectedListener
    {

        public abstract boolean onOptionsItemSelected(MenuItem menuitem);
    }

    public static interface OnPrepareOptionsMenuListener
    {

        public abstract void onPrepareOptionsMenu(Menu menu);
    }


    private static final boolean DEBUG = false;
    private static final String TAG = "Watson";
    private ArrayList mCreatedMenus;

    public Watson()
    {
    }

    public abstract MenuInflater getSupportMenuInflater();

    public abstract boolean onCreateOptionsMenu(Menu menu);

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        if (i == 0)
        {
            boolean flag = onCreateOptionsMenu(menu);
            MenuInflater menuinflater = getSupportMenuInflater();
            int j = 0;
            i = 0;
            ArrayList arraylist1 = null;
            ArrayList arraylist = null;
            if (mFragments.mAdded != null)
            {
                int k = 0;
                do
                {
                    arraylist1 = arraylist;
                    j = i;
                    if (k >= mFragments.mAdded.size())
                    {
                        break;
                    }
                    Fragment fragment = (Fragment)mFragments.mAdded.get(k);
                    arraylist1 = arraylist;
                    j = i;
                    if (fragment != null)
                    {
                        arraylist1 = arraylist;
                        j = i;
                        if (!fragment.mHidden)
                        {
                            arraylist1 = arraylist;
                            j = i;
                            if (fragment.mHasMenu)
                            {
                                arraylist1 = arraylist;
                                j = i;
                                if (fragment.mMenuVisible)
                                {
                                    arraylist1 = arraylist;
                                    j = i;
                                    if (fragment instanceof OnCreateOptionsMenuListener)
                                    {
                                        j = 1;
                                        ((OnCreateOptionsMenuListener)fragment).onCreateOptionsMenu(menu, menuinflater);
                                        arraylist1 = arraylist;
                                        if (arraylist == null)
                                        {
                                            arraylist1 = new ArrayList();
                                        }
                                        arraylist1.add(fragment);
                                    }
                                }
                            }
                        }
                    }
                    k++;
                    arraylist = arraylist1;
                    i = j;
                } while (true);
            }
            if (mCreatedMenus != null)
            {
                for (i = 0; i < mCreatedMenus.size(); i++)
                {
                    menu = (Fragment)mCreatedMenus.get(i);
                    if (arraylist1 == null || !arraylist1.contains(menu))
                    {
                        menu.onDestroyOptionsMenu();
                    }
                }

            }
            mCreatedMenus = arraylist1;
            return flag | j;
        } else
        {
            return false;
        }
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        if (!onOptionsItemSelected(menuitem)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (mFragments.mAdded == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        i = 0;
        do
        {
            if (i >= mFragments.mAdded.size())
            {
                break MISSING_BLOCK_LABEL_107;
            }
            Fragment fragment = (Fragment)mFragments.mAdded.get(i);
            if (fragment != null && !fragment.mHidden && fragment.mHasMenu && fragment.mMenuVisible && (fragment instanceof OnOptionsItemSelectedListener) && ((OnOptionsItemSelectedListener)fragment).onOptionsItemSelected(menuitem))
            {
                break;
            }
            i++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    public abstract boolean onOptionsItemSelected(MenuItem menuitem);

    public abstract boolean onPrepareOptionsMenu(Menu menu);

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        if (i == 0)
        {
            boolean flag = onPrepareOptionsMenu(menu);
            int k = 0;
            i = 0;
            if (mFragments.mAdded != null)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= mFragments.mAdded.size())
                    {
                        break;
                    }
                    view = (Fragment)mFragments.mAdded.get(j);
                    k = i;
                    if (view != null)
                    {
                        k = i;
                        if (!((Fragment) (view)).mHidden)
                        {
                            k = i;
                            if (((Fragment) (view)).mHasMenu)
                            {
                                k = i;
                                if (((Fragment) (view)).mMenuVisible)
                                {
                                    k = i;
                                    if (view instanceof OnPrepareOptionsMenuListener)
                                    {
                                        k = 1;
                                        ((OnPrepareOptionsMenuListener)view).onPrepareOptionsMenu(menu);
                                    }
                                }
                            }
                        }
                    }
                    j++;
                    i = k;
                } while (true);
            }
            return (flag | k) & menu.hasVisibleItems();
        } else
        {
            return false;
        }
    }
}
