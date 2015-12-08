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


    private static final String TAG = "Watson";
    private ArrayList mCreatedMenus;

    public Watson()
    {
    }

    public abstract MenuInflater getSupportMenuInflater();

    public abstract boolean onCreateOptionsMenu(Menu menu);

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        Object obj;
        MenuInflater menuinflater;
        int j;
        boolean flag1;
        flag1 = onCreateOptionsMenu(menu);
        menuinflater = getSupportMenuInflater();
        i = 0;
        j = 0;
        arraylist = null;
        obj = null;
        if (mFragments.mAdded == null) goto _L4; else goto _L3
_L3:
        boolean flag = false;
        i = j;
        arraylist = obj;
        j = ((flag) ? 1 : 0);
_L11:
        if (j < mFragments.mAdded.size()) goto _L5; else goto _L4
_L4:
        if (mCreatedMenus == null) goto _L7; else goto _L6
_L6:
        j = 0;
_L9:
        if (j < mCreatedMenus.size()) goto _L8; else goto _L7
_L7:
        mCreatedMenus = arraylist;
        return flag1 | i;
_L5:
        Fragment fragment = (Fragment)mFragments.mAdded.get(j);
        ArrayList arraylist1 = arraylist;
        int k = i;
        if (fragment != null)
        {
            arraylist1 = arraylist;
            k = i;
            if (!fragment.mHidden)
            {
                arraylist1 = arraylist;
                k = i;
                if (fragment.mHasMenu)
                {
                    arraylist1 = arraylist;
                    k = i;
                    if (fragment.mMenuVisible)
                    {
                        arraylist1 = arraylist;
                        k = i;
                        if (fragment instanceof OnCreateOptionsMenuListener)
                        {
                            k = 1;
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
        j++;
        arraylist = arraylist1;
        i = k;
        continue; /* Loop/switch isn't completed */
_L8:
        menu = (Fragment)mCreatedMenus.get(j);
        if (arraylist == null || !arraylist.contains(menu))
        {
            menu.onDestroyOptionsMenu();
        }
        j++;
        if (true) goto _L9; else goto _L2
_L2:
        return false;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        if (!onOptionsItemSelected(menuitem)) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        if (mFragments.mAdded == null) goto _L2; else goto _L5
_L5:
        i = 0;
_L8:
        if (i < mFragments.mAdded.size()) goto _L6; else goto _L2
_L2:
        return false;
_L6:
        Fragment fragment = (Fragment)mFragments.mAdded.get(i);
        if (fragment != null && !fragment.mHidden && fragment.mHasMenu && fragment.mMenuVisible && (fragment instanceof OnOptionsItemSelectedListener) && ((OnOptionsItemSelectedListener)fragment).onOptionsItemSelected(menuitem))
        {
            continue; /* Loop/switch isn't completed */
        }
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        if (true) goto _L3; else goto _L9
_L9:
    }

    public abstract boolean onOptionsItemSelected(MenuItem menuitem);

    public abstract boolean onPrepareOptionsMenu(Menu menu);

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        int j;
        boolean flag1;
        flag1 = onPrepareOptionsMenu(menu);
        i = 0;
        j = 0;
        if (mFragments.mAdded == null) goto _L4; else goto _L3
_L3:
        boolean flag = false;
        i = j;
        j = ((flag) ? 1 : 0);
_L6:
        if (j < mFragments.mAdded.size()) goto _L5; else goto _L4
_L4:
        return (flag1 | i) & menu.hasVisibleItems();
_L5:
        view = (Fragment)mFragments.mAdded.get(j);
        int k = i;
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
        if (true) goto _L6; else goto _L2
_L2:
        return false;
    }
}
