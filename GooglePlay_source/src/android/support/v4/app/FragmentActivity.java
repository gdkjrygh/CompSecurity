// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.util.SimpleArrayMap;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            FragmentManagerImpl, LoaderManagerImpl, Fragment, FragmentContainer

public class FragmentActivity extends Activity
{
    static final class NonConfigurationInstances
    {

        Object activity;
        SimpleArrayMap children;
        Object custom;
        ArrayList fragments;
        SimpleArrayMap loaders;

        NonConfigurationInstances()
        {
        }
    }


    SimpleArrayMap mAllLoaderManagers;
    boolean mCheckedForLoaderManager;
    final FragmentContainer mContainer = new FragmentContainer() {

        final FragmentActivity this$0;

        public final View findViewById(int i)
        {
            return FragmentActivity.this.findViewById(i);
        }

        public final boolean hasView()
        {
            Window window = getWindow();
            return window != null && window.peekDecorView() != null;
        }

            
            {
                this$0 = FragmentActivity.this;
                super();
            }
    };
    boolean mCreated;
    public final FragmentManagerImpl mFragments = new FragmentManagerImpl();
    final Handler mHandler = new Handler() {

        final FragmentActivity this$0;

        public final void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 1 2: default 28
        //                       1 34
        //                       2 53;
               goto _L1 _L2 _L3
_L1:
            super.handleMessage(message);
_L5:
            return;
_L2:
            if (!mStopped) goto _L5; else goto _L4
_L4:
            doReallyStop(false);
            return;
_L3:
            mFragments.dispatchResume();
            mFragments.execPendingActions();
            return;
        }

            
            {
                this$0 = FragmentActivity.this;
                super();
            }
    };
    LoaderManagerImpl mLoaderManager;
    boolean mLoadersStarted;
    boolean mOptionsMenuInvalidated;
    boolean mReallyStopped;
    boolean mResumed;
    boolean mRetaining;
    boolean mStopped;

    public FragmentActivity()
    {
    }

    private void dumpViewHierarchy(String s, PrintWriter printwriter, View view)
    {
        printwriter.print(s);
        if (view != null) goto _L2; else goto _L1
_L1:
        printwriter.println("null");
_L4:
        return;
_L2:
        printwriter.println(viewToString(view));
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int j = view.getChildCount();
            if (j > 0)
            {
                s = (new StringBuilder()).append(s).append("  ").toString();
                int i = 0;
                while (i < j) 
                {
                    dumpViewHierarchy(s, printwriter, view.getChildAt(i));
                    i++;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String viewToString(View view)
    {
        byte byte0;
        byte byte1;
        StringBuilder stringbuilder;
        byte1 = 70;
        byte0 = 46;
        stringbuilder = new StringBuilder(128);
        stringbuilder.append(view.getClass().getName());
        stringbuilder.append('{');
        stringbuilder.append(Integer.toHexString(System.identityHashCode(view)));
        stringbuilder.append(' ');
        view.getVisibility();
        JVM INSTR lookupswitch 3: default 100
    //                   0: 523
    //                   4: 534
    //                   8: 545;
           goto _L1 _L2 _L3 _L4
_L1:
        stringbuilder.append('.');
_L11:
        char c;
        Object obj;
        String s;
        int i;
        if (view.isFocusable())
        {
            c = 'F';
        } else
        {
            c = '.';
        }
        stringbuilder.append(c);
        if (view.isEnabled())
        {
            c = 'E';
        } else
        {
            c = '.';
        }
        stringbuilder.append(c);
        if (view.willNotDraw())
        {
            c = '.';
        } else
        {
            c = 'D';
        }
        stringbuilder.append(c);
        if (view.isHorizontalScrollBarEnabled())
        {
            c = 'H';
        } else
        {
            c = '.';
        }
        stringbuilder.append(c);
        if (view.isVerticalScrollBarEnabled())
        {
            c = 'V';
        } else
        {
            c = '.';
        }
        stringbuilder.append(c);
        if (view.isClickable())
        {
            c = 'C';
        } else
        {
            c = '.';
        }
        stringbuilder.append(c);
        if (view.isLongClickable())
        {
            c = 'L';
        } else
        {
            c = '.';
        }
        stringbuilder.append(c);
        stringbuilder.append(' ');
        if (view.isFocused())
        {
            c = byte1;
        } else
        {
            c = '.';
        }
        stringbuilder.append(c);
        if (view.isSelected())
        {
            c = 'S';
        } else
        {
            c = '.';
        }
        stringbuilder.append(c);
        c = byte0;
        if (view.isPressed())
        {
            c = 'P';
        }
        stringbuilder.append(c);
        stringbuilder.append(' ');
        stringbuilder.append(view.getLeft());
        stringbuilder.append(',');
        stringbuilder.append(view.getTop());
        stringbuilder.append('-');
        stringbuilder.append(view.getRight());
        stringbuilder.append(',');
        stringbuilder.append(view.getBottom());
        i = view.getId();
        if (i == -1) goto _L6; else goto _L5
_L5:
        stringbuilder.append(" #");
        stringbuilder.append(Integer.toHexString(i));
        obj = view.getResources();
        if (i == 0 || obj == null) goto _L6; else goto _L7
_L7:
        0xff000000 & i;
        JVM INSTR lookupswitch 2: default 436
    //                   16777216: 616
    //                   2130706432: 610;
           goto _L8 _L9 _L10
_L8:
        view = ((Resources) (obj)).getResourcePackageName(i);
_L12:
        s = ((Resources) (obj)).getResourceTypeName(i);
        obj = ((Resources) (obj)).getResourceEntryName(i);
        stringbuilder.append(" ");
        stringbuilder.append(view);
        stringbuilder.append(":");
        stringbuilder.append(s);
        stringbuilder.append("/");
        stringbuilder.append(((String) (obj)));
_L6:
        stringbuilder.append("}");
        return stringbuilder.toString();
_L2:
        stringbuilder.append('V');
          goto _L11
_L3:
        stringbuilder.append('I');
          goto _L11
_L4:
        stringbuilder.append('G');
          goto _L11
_L10:
        view = "app";
          goto _L12
_L9:
        view = "android";
          goto _L12
        view;
          goto _L6
    }

    final void doReallyStop(boolean flag)
    {
        if (!mReallyStopped)
        {
            mReallyStopped = true;
            mRetaining = flag;
            mHandler.removeMessages(1);
            if (mLoadersStarted)
            {
                mLoadersStarted = false;
                if (mLoaderManager != null)
                {
                    if (!mRetaining)
                    {
                        mLoaderManager.doStop();
                    } else
                    {
                        mLoaderManager.doRetain();
                    }
                }
            }
            mFragments.moveToState$2563266(2);
        }
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        int i = android.os.Build.VERSION.SDK_INT;
        printwriter.print(s);
        printwriter.print("Local FragmentActivity ");
        printwriter.print(Integer.toHexString(System.identityHashCode(this)));
        printwriter.println(" State:");
        String s1 = (new StringBuilder()).append(s).append("  ").toString();
        printwriter.print(s1);
        printwriter.print("mCreated=");
        printwriter.print(mCreated);
        printwriter.print("mResumed=");
        printwriter.print(mResumed);
        printwriter.print(" mStopped=");
        printwriter.print(mStopped);
        printwriter.print(" mReallyStopped=");
        printwriter.println(mReallyStopped);
        printwriter.print(s1);
        printwriter.print("mLoadersStarted=");
        printwriter.println(mLoadersStarted);
        if (mLoaderManager != null)
        {
            printwriter.print(s);
            printwriter.print("Loader Manager ");
            printwriter.print(Integer.toHexString(System.identityHashCode(mLoaderManager)));
            printwriter.println(":");
            LoaderManagerImpl loadermanagerimpl = mLoaderManager;
            (new StringBuilder()).append(s).append("  ").toString();
        }
        mFragments.dump(s, filedescriptor, printwriter, as);
        printwriter.print(s);
        printwriter.println("View Hierarchy:");
        dumpViewHierarchy((new StringBuilder()).append(s).append("  ").toString(), printwriter, getWindow().getDecorView());
    }

    final LoaderManagerImpl getLoaderManager$2cd5ab55(String s)
    {
        if (mAllLoaderManagers == null)
        {
            mAllLoaderManagers = new SimpleArrayMap();
        }
        s = (LoaderManagerImpl)mAllLoaderManagers.get(s);
        if (s != null)
        {
            s.mActivity = this;
        }
        return s;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        mFragments.mStateSaved = false;
        int k = i >> 16;
        if (k != 0)
        {
            k--;
            if (mFragments.mActive == null || k < 0 || k >= mFragments.mActive.size())
            {
                Log.w("FragmentActivity", (new StringBuilder("Activity result fragment index out of range: 0x")).append(Integer.toHexString(i)).toString());
                return;
            }
            Fragment fragment = (Fragment)mFragments.mActive.get(k);
            if (fragment == null)
            {
                Log.w("FragmentActivity", (new StringBuilder("Activity result no fragment exists for index: 0x")).append(Integer.toHexString(i)).toString());
                return;
            } else
            {
                fragment.onActivityResult(0xffff & i, j, intent);
                return;
            }
        } else
        {
            super.onActivityResult(i, j, intent);
            return;
        }
    }

    public void onAttachFragment(Fragment fragment)
    {
    }

    public void onBackPressed()
    {
label0:
        {
            FragmentManagerImpl fragmentmanagerimpl = mFragments;
            fragmentmanagerimpl.checkStateLoss();
            fragmentmanagerimpl.execPendingActions();
            if (!fragmentmanagerimpl.popBackStackState$68507953$44bd8ea3(-1, 0))
            {
                if (android.os.Build.VERSION.SDK_INT < 21)
                {
                    break label0;
                }
                finishAfterTransition();
            }
            return;
        }
        finish();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        mFragments.dispatchConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        Object obj = null;
        mFragments.attachActivity(this, mContainer, null);
        if (getLayoutInflater().getFactory() == null)
        {
            getLayoutInflater().setFactory(this);
        }
        super.onCreate(bundle);
        NonConfigurationInstances nonconfigurationinstances = (NonConfigurationInstances)getLastNonConfigurationInstance();
        if (nonconfigurationinstances != null)
        {
            mAllLoaderManagers = nonconfigurationinstances.loaders;
        }
        if (bundle != null)
        {
            android.os.Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            FragmentManagerImpl fragmentmanagerimpl = mFragments;
            bundle = obj;
            if (nonconfigurationinstances != null)
            {
                bundle = nonconfigurationinstances.fragments;
            }
            fragmentmanagerimpl.restoreAllState(parcelable, bundle);
        }
        mFragments.dispatchCreate();
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        if (i == 0)
        {
            boolean flag = super.onCreatePanelMenu(i, menu);
            boolean flag1 = mFragments.dispatchCreateOptionsMenu(menu, getMenuInflater());
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                return flag | flag1;
            } else
            {
                return true;
            }
        } else
        {
            return super.onCreatePanelMenu(i, menu);
        }
    }

    public View onCreateView(String s, Context context, AttributeSet attributeset)
    {
        View view;
        if (!"fragment".equals(s))
        {
            view = super.onCreateView(s, context, attributeset);
        } else
        {
            View view1 = mFragments.onCreateView(null, s, context, attributeset);
            view = view1;
            if (view1 == null)
            {
                return super.onCreateView(s, context, attributeset);
            }
        }
        return view;
    }

    public void onDestroy()
    {
        super.onDestroy();
        doReallyStop(false);
        mFragments.dispatchDestroy();
        if (mLoaderManager != null)
        {
            mLoaderManager.doDestroy();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (android.os.Build.VERSION.SDK_INT < 5 && i == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        mFragments.dispatchLowMemory();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (super.onMenuItemSelected(i, menuitem))
        {
            return true;
        }
        switch (i)
        {
        default:
            return false;

        case 0: // '\0'
            return mFragments.dispatchOptionsItemSelected(menuitem);

        case 6: // '\006'
            return mFragments.dispatchContextItemSelected(menuitem);
        }
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        mFragments.mStateSaved = false;
    }

    public void onPanelClosed(int i, Menu menu)
    {
        i;
        JVM INSTR tableswitch 0 0: default 20
    //                   0 27;
           goto _L1 _L2
_L1:
        super.onPanelClosed(i, menu);
        return;
_L2:
        mFragments.dispatchOptionsMenuClosed(menu);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onPause()
    {
        super.onPause();
        mResumed = false;
        if (mHandler.hasMessages(2))
        {
            mHandler.removeMessages(2);
            mFragments.dispatchResume();
        }
        mFragments.moveToState$2563266(4);
    }

    public void onPostResume()
    {
        super.onPostResume();
        mHandler.removeMessages(2);
        mFragments.dispatchResume();
        mFragments.execPendingActions();
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        if (i == 0 && menu != null)
        {
            if (mOptionsMenuInvalidated)
            {
                mOptionsMenuInvalidated = false;
                menu.clear();
                onCreatePanelMenu(i, menu);
            }
            return super.onPreparePanel(0, view, menu) | mFragments.dispatchPrepareOptionsMenu(menu);
        } else
        {
            return super.onPreparePanel(i, view, menu);
        }
    }

    public void onResume()
    {
        super.onResume();
        mHandler.sendEmptyMessage(2);
        mResumed = true;
        mFragments.execPendingActions();
    }

    public final Object onRetainNonConfigurationInstance()
    {
        if (mStopped)
        {
            doReallyStop(true);
        }
        FragmentManagerImpl fragmentmanagerimpl = mFragments;
        ArrayList arraylist;
        int l;
        boolean flag1;
        if (fragmentmanagerimpl.mActive != null)
        {
            int i = 0;
            arraylist = null;
            while (i < fragmentmanagerimpl.mActive.size()) 
            {
                Fragment fragment = (Fragment)fragmentmanagerimpl.mActive.get(i);
                ArrayList arraylist1 = arraylist;
                if (fragment != null)
                {
                    arraylist1 = arraylist;
                    if (fragment.mRetainInstance)
                    {
                        arraylist1 = arraylist;
                        if (arraylist == null)
                        {
                            arraylist1 = new ArrayList();
                        }
                        arraylist1.add(fragment);
                        fragment.mRetaining = true;
                        int k;
                        if (fragment.mTarget != null)
                        {
                            k = fragment.mTarget.mIndex;
                        } else
                        {
                            k = -1;
                        }
                        fragment.mTargetIndex = k;
                    }
                }
                i++;
                arraylist = arraylist1;
            }
        } else
        {
            arraylist = null;
        }
        flag1 = false;
        l = 0;
        if (mAllLoaderManagers != null)
        {
            int i1 = mAllLoaderManagers.size();
            LoaderManagerImpl aloadermanagerimpl[] = new LoaderManagerImpl[i1];
            for (int j = i1 - 1; j >= 0; j--)
            {
                aloadermanagerimpl[j] = (LoaderManagerImpl)mAllLoaderManagers.valueAt(j);
            }

            flag1 = false;
            boolean flag = l;
            l = ((flag1) ? 1 : 0);
            do
            {
                flag1 = flag;
                if (l >= i1)
                {
                    break;
                }
                LoaderManagerImpl loadermanagerimpl = aloadermanagerimpl[l];
                if (loadermanagerimpl.mRetaining)
                {
                    flag = true;
                } else
                {
                    loadermanagerimpl.doDestroy();
                    mAllLoaderManagers.remove(loadermanagerimpl.mWho);
                }
                l++;
            } while (true);
        }
        if (arraylist == null && !flag1)
        {
            return null;
        } else
        {
            NonConfigurationInstances nonconfigurationinstances = new NonConfigurationInstances();
            nonconfigurationinstances.activity = null;
            nonconfigurationinstances.custom = null;
            nonconfigurationinstances.children = null;
            nonconfigurationinstances.fragments = arraylist;
            nonconfigurationinstances.loaders = mAllLoaderManagers;
            return nonconfigurationinstances;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        android.os.Parcelable parcelable = mFragments.saveAllState();
        if (parcelable != null)
        {
            bundle.putParcelable("android:support:fragments", parcelable);
        }
    }

    public void onStart()
    {
        super.onStart();
        mStopped = false;
        mReallyStopped = false;
        mHandler.removeMessages(1);
        if (!mCreated)
        {
            mCreated = true;
            mFragments.dispatchActivityCreated();
        }
        mFragments.mStateSaved = false;
        mFragments.execPendingActions();
        if (!mLoadersStarted)
        {
            mLoadersStarted = true;
            int i;
            if (mLoaderManager != null)
            {
                mLoaderManager.doStart();
            } else
            if (!mCheckedForLoaderManager)
            {
                mLoaderManager = getLoaderManager$2cd5ab55("(root)");
                if (mLoaderManager != null && !mLoaderManager.mStarted)
                {
                    mLoaderManager.doStart();
                }
            }
            mCheckedForLoaderManager = true;
        }
        mFragments.dispatchStart();
        if (mAllLoaderManagers != null)
        {
            int k = mAllLoaderManagers.size();
            LoaderManagerImpl aloadermanagerimpl[] = new LoaderManagerImpl[k];
            for (i = k - 1; i >= 0; i--)
            {
                aloadermanagerimpl[i] = (LoaderManagerImpl)mAllLoaderManagers.valueAt(i);
            }

            for (int j = 0; j < k; j++)
            {
                LoaderManagerImpl loadermanagerimpl = aloadermanagerimpl[j];
                if (loadermanagerimpl.mRetaining)
                {
                    loadermanagerimpl.mRetaining = false;
                }
            }

        }
    }

    public void onStop()
    {
        super.onStop();
        mStopped = true;
        mHandler.sendEmptyMessage(1);
        mFragments.dispatchStop();
    }

    public void startActivityForResult(Intent intent, int i)
    {
        if (i != -1 && (0xffff0000 & i) != 0)
        {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        } else
        {
            super.startActivityForResult(intent, i);
            return;
        }
    }

    public final void startActivityFromFragment(Fragment fragment, Intent intent, int i)
    {
        if (i == -1)
        {
            super.startActivityForResult(intent, -1);
            return;
        }
        if ((0xffff0000 & i) != 0)
        {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        } else
        {
            super.startActivityForResult(intent, (fragment.mIndex + 1 << 16) + (0xffff & i));
            return;
        }
    }

    public void supportInvalidateOptionsMenu()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            invalidateOptionsMenu();
            return;
        } else
        {
            mOptionsMenuInvalidated = true;
            return;
        }
    }
}
