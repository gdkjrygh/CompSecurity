// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.util.DebugUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;

// Referenced classes of package android.support.v4.app:
//            LoaderManagerImpl, FragmentActivity, FragmentManager, LoaderManager

public class Fragment
    implements ComponentCallbacks, android.view.View.OnCreateContextMenuListener
{
    public static class InstantiationException extends RuntimeException
    {

        public InstantiationException(String s, Exception exception)
        {
            super(s, exception);
        }
    }

    public static class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, null);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        final Bundle mState;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeBundle(mState);
        }


        SavedState(Bundle bundle)
        {
            mState = bundle;
        }

        SavedState(Parcel parcel, ClassLoader classloader)
        {
            mState = parcel.readBundle();
            if (classloader != null && mState != null)
            {
                mState.setClassLoader(classloader);
            }
        }
    }


    static final int ACTIVITY_CREATED = 2;
    static final int CREATED = 1;
    static final int INITIALIZING = 0;
    static final int RESUMED = 5;
    static final int STARTED = 4;
    static final int STOPPED = 3;
    private static final HashMap sClassMap = new HashMap();
    FragmentActivity mActivity;
    boolean mAdded;
    View mAnimatingAway;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mCalled;
    boolean mCheckedForLoaderManager;
    ViewGroup mContainer;
    int mContainerId;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mInLayout;
    int mIndex;
    View mInnerView;
    LoaderManagerImpl mLoaderManager;
    boolean mLoadersStarted;
    boolean mMenuVisible;
    int mNextAnim;
    boolean mRemoving;
    boolean mRestored;
    boolean mResumed;
    boolean mRetainInstance;
    boolean mRetaining;
    Bundle mSavedFragmentState;
    SparseArray mSavedViewState;
    int mState;
    int mStateAfterAnimating;
    String mTag;
    Fragment mTarget;
    int mTargetIndex;
    int mTargetRequestCode;
    View mView;
    String mWho;

    public Fragment()
    {
        mState = 0;
        mIndex = -1;
        mTargetIndex = -1;
        mMenuVisible = true;
    }

    public static Fragment instantiate(Context context, String s)
    {
        return instantiate(context, s, null);
    }

    public static Fragment instantiate(Context context, String s, Bundle bundle)
    {
        Class class1;
        Class class2;
        try
        {
            class2 = (Class)sClassMap.get(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new InstantiationException((new StringBuilder()).append("Unable to instantiate fragment ").append(s).append(": make sure class name exists, is public, and has an").append(" empty constructor that is public").toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new InstantiationException((new StringBuilder()).append("Unable to instantiate fragment ").append(s).append(": make sure class name exists, is public, and has an").append(" empty constructor that is public").toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new InstantiationException((new StringBuilder()).append("Unable to instantiate fragment ").append(s).append(": make sure class name exists, is public, and has an").append(" empty constructor that is public").toString(), context);
        }
        class1 = class2;
        if (class2 != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        class1 = context.getClassLoader().loadClass(s);
        sClassMap.put(s, class1);
        context = (Fragment)class1.newInstance();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        bundle.setClassLoader(context.getClass().getClassLoader());
        context.mArguments = bundle;
        return context;
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.print(s);
        printwriter.print("mFragmentId=#");
        printwriter.print(Integer.toHexString(mFragmentId));
        printwriter.print(" mContainerId#=");
        printwriter.print(Integer.toHexString(mContainerId));
        printwriter.print(" mTag=");
        printwriter.println(mTag);
        printwriter.print(s);
        printwriter.print("mState=");
        printwriter.print(mState);
        printwriter.print(" mIndex=");
        printwriter.print(mIndex);
        printwriter.print(" mWho=");
        printwriter.print(mWho);
        printwriter.print(" mBackStackNesting=");
        printwriter.println(mBackStackNesting);
        printwriter.print(s);
        printwriter.print("mAdded=");
        printwriter.print(mAdded);
        printwriter.print(" mRemoving=");
        printwriter.print(mRemoving);
        printwriter.print(" mResumed=");
        printwriter.print(mResumed);
        printwriter.print(" mFromLayout=");
        printwriter.print(mFromLayout);
        printwriter.print(" mInLayout=");
        printwriter.println(mInLayout);
        printwriter.print(s);
        printwriter.print("mHidden=");
        printwriter.print(mHidden);
        printwriter.print(" mDetached=");
        printwriter.print(mDetached);
        printwriter.print(" mMenuVisible=");
        printwriter.print(mMenuVisible);
        printwriter.print(" mHasMenu=");
        printwriter.println(mHasMenu);
        printwriter.print(s);
        printwriter.print("mRetainInstance=");
        printwriter.print(mRetainInstance);
        printwriter.print(" mRetaining=");
        printwriter.println(mRetaining);
        if (mFragmentManager != null)
        {
            printwriter.print(s);
            printwriter.print("mFragmentManager=");
            printwriter.println(mFragmentManager);
        }
        if (mActivity != null)
        {
            printwriter.print(s);
            printwriter.print("mActivity=");
            printwriter.println(mActivity);
        }
        if (mArguments != null)
        {
            printwriter.print(s);
            printwriter.print("mArguments=");
            printwriter.println(mArguments);
        }
        if (mSavedFragmentState != null)
        {
            printwriter.print(s);
            printwriter.print("mSavedFragmentState=");
            printwriter.println(mSavedFragmentState);
        }
        if (mSavedViewState != null)
        {
            printwriter.print(s);
            printwriter.print("mSavedViewState=");
            printwriter.println(mSavedViewState);
        }
        if (mTarget != null)
        {
            printwriter.print(s);
            printwriter.print("mTarget=");
            printwriter.print(mTarget);
            printwriter.print(" mTargetRequestCode=");
            printwriter.println(mTargetRequestCode);
        }
        if (mNextAnim != 0)
        {
            printwriter.print(s);
            printwriter.print("mNextAnim=");
            printwriter.println(mNextAnim);
        }
        if (mContainer != null)
        {
            printwriter.print(s);
            printwriter.print("mContainer=");
            printwriter.println(mContainer);
        }
        if (mView != null)
        {
            printwriter.print(s);
            printwriter.print("mView=");
            printwriter.println(mView);
        }
        if (mInnerView != null)
        {
            printwriter.print(s);
            printwriter.print("mInnerView=");
            printwriter.println(mView);
        }
        if (mAnimatingAway != null)
        {
            printwriter.print(s);
            printwriter.print("mAnimatingAway=");
            printwriter.println(mAnimatingAway);
            printwriter.print(s);
            printwriter.print("mStateAfterAnimating=");
            printwriter.println(mStateAfterAnimating);
        }
        if (mLoaderManager != null)
        {
            printwriter.print(s);
            printwriter.println("Loader Manager:");
            mLoaderManager.dump((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
        }
    }

    public final boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public final FragmentActivity getActivity()
    {
        return mActivity;
    }

    public final Bundle getArguments()
    {
        return mArguments;
    }

    public final FragmentManager getFragmentManager()
    {
        return mFragmentManager;
    }

    public final int getId()
    {
        return mFragmentId;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle)
    {
        return mActivity.getLayoutInflater();
    }

    public LoaderManager getLoaderManager()
    {
        if (mLoaderManager != null)
        {
            return mLoaderManager;
        }
        if (mActivity == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(this).append(" not attached to Activity").toString());
        } else
        {
            mCheckedForLoaderManager = true;
            mLoaderManager = mActivity.getLoaderManager(mIndex, mLoadersStarted, true);
            return mLoaderManager;
        }
    }

    public final Resources getResources()
    {
        if (mActivity == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(this).append(" not attached to Activity").toString());
        } else
        {
            return mActivity.getResources();
        }
    }

    public final boolean getRetainInstance()
    {
        return mRetainInstance;
    }

    public final String getString(int i)
    {
        return getResources().getString(i);
    }

    public final transient String getString(int i, Object aobj[])
    {
        return getResources().getString(i, aobj);
    }

    public final String getTag()
    {
        return mTag;
    }

    public final Fragment getTargetFragment()
    {
        return mTarget;
    }

    public final int getTargetRequestCode()
    {
        return mTargetRequestCode;
    }

    public final CharSequence getText(int i)
    {
        return getResources().getText(i);
    }

    public View getView()
    {
        return mView;
    }

    public final int hashCode()
    {
        return super.hashCode();
    }

    void initState()
    {
        mIndex = -1;
        mWho = null;
        mAdded = false;
        mRemoving = false;
        mResumed = false;
        mFromLayout = false;
        mInLayout = false;
        mRestored = false;
        mBackStackNesting = 0;
        mFragmentManager = null;
        mActivity = null;
        mFragmentId = 0;
        mContainerId = 0;
        mTag = null;
        mHidden = false;
        mDetached = false;
        mRetaining = false;
        mLoaderManager = null;
        mLoadersStarted = false;
        mCheckedForLoaderManager = false;
    }

    public final boolean isAdded()
    {
        return mActivity != null && mAdded;
    }

    public final boolean isDetached()
    {
        return mDetached;
    }

    public final boolean isHidden()
    {
        return mHidden;
    }

    final boolean isInBackStack()
    {
        return mBackStackNesting > 0;
    }

    public final boolean isInLayout()
    {
        return mInLayout;
    }

    public final boolean isRemoving()
    {
        return mRemoving;
    }

    public final boolean isResumed()
    {
        return mResumed;
    }

    public final boolean isVisible()
    {
        return isAdded() && !isHidden() && mView != null && mView.getWindowToken() != null && mView.getVisibility() == 0;
    }

    public void onActivityCreated(Bundle bundle)
    {
        mCalled = true;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
    }

    public void onAttach(Activity activity)
    {
        mCalled = true;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        mCalled = true;
    }

    public Animation onCreateAnimation(int i, boolean flag, int j)
    {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        getActivity().onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return null;
    }

    public void onDestroy()
    {
        mCalled = true;
        if (!mCheckedForLoaderManager)
        {
            mCheckedForLoaderManager = true;
            mLoaderManager = mActivity.getLoaderManager(mIndex, mLoadersStarted, false);
        }
        if (mLoaderManager != null)
        {
            mLoaderManager.doDestroy();
        }
    }

    public void onDestroyOptionsMenu()
    {
    }

    public void onDestroyView()
    {
        mCalled = true;
    }

    public void onDetach()
    {
        mCalled = true;
    }

    public void onHiddenChanged(boolean flag)
    {
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        mCalled = true;
    }

    public void onLowMemory()
    {
        mCalled = true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu)
    {
    }

    public void onPause()
    {
        mCalled = true;
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
    }

    public void onResume()
    {
        mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
    }

    public void onStart()
    {
        mCalled = true;
        if (!mLoadersStarted)
        {
            mLoadersStarted = true;
            if (!mCheckedForLoaderManager)
            {
                mCheckedForLoaderManager = true;
                mLoaderManager = mActivity.getLoaderManager(mIndex, mLoadersStarted, false);
            }
            if (mLoaderManager != null)
            {
                mLoaderManager.doStart();
            }
        }
    }

    public void onStop()
    {
        mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
    }

    void performDestroyView()
    {
        onDestroyView();
        if (mLoaderManager != null)
        {
            mLoaderManager.doReportNextStart();
        }
    }

    void performReallyStop()
    {
label0:
        {
            if (mLoadersStarted)
            {
                mLoadersStarted = false;
                if (!mCheckedForLoaderManager)
                {
                    mCheckedForLoaderManager = true;
                    mLoaderManager = mActivity.getLoaderManager(mIndex, mLoadersStarted, false);
                }
                if (mLoaderManager != null)
                {
                    if (mActivity.mRetaining)
                    {
                        break label0;
                    }
                    mLoaderManager.doStop();
                }
            }
            return;
        }
        mLoaderManager.doRetain();
    }

    void performStart()
    {
        onStart();
        if (mLoaderManager != null)
        {
            mLoaderManager.doReportStart();
        }
    }

    void performStop()
    {
        onStop();
    }

    public void registerForContextMenu(View view)
    {
        view.setOnCreateContextMenuListener(this);
    }

    final void restoreViewState()
    {
        if (mSavedViewState != null)
        {
            mInnerView.restoreHierarchyState(mSavedViewState);
            mSavedViewState = null;
        }
    }

    public void setArguments(Bundle bundle)
    {
        if (mIndex >= 0)
        {
            throw new IllegalStateException("Fragment already active");
        } else
        {
            mArguments = bundle;
            return;
        }
    }

    public void setHasOptionsMenu(boolean flag)
    {
        if (mHasMenu != flag)
        {
            mHasMenu = flag;
            if (isAdded() && !isHidden())
            {
                mActivity.supportInvalidateOptionsMenu();
            }
        }
    }

    final void setIndex(int i)
    {
        mIndex = i;
        mWho = (new StringBuilder()).append("android:fragment:").append(mIndex).toString();
    }

    public void setInitialSavedState(SavedState savedstate)
    {
        if (mIndex >= 0)
        {
            throw new IllegalStateException("Fragment already active");
        }
        if (savedstate != null && savedstate.mState != null)
        {
            savedstate = savedstate.mState;
        } else
        {
            savedstate = null;
        }
        mSavedFragmentState = savedstate;
    }

    public void setMenuVisibility(boolean flag)
    {
        if (mMenuVisible != flag)
        {
            mMenuVisible = flag;
            if (mHasMenu && isAdded() && !isHidden())
            {
                mActivity.supportInvalidateOptionsMenu();
            }
        }
    }

    public void setRetainInstance(boolean flag)
    {
        mRetainInstance = flag;
    }

    public void setTargetFragment(Fragment fragment, int i)
    {
        mTarget = fragment;
        mTargetRequestCode = i;
    }

    public void startActivity(Intent intent)
    {
        if (mActivity == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(this).append(" not attached to Activity").toString());
        } else
        {
            mActivity.startActivityFromFragment(this, intent, -1);
            return;
        }
    }

    public void startActivityForResult(Intent intent, int i)
    {
        if (mActivity == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(this).append(" not attached to Activity").toString());
        } else
        {
            mActivity.startActivityFromFragment(this, intent, i);
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        DebugUtils.buildShortClassTag(this, stringbuilder);
        if (mIndex >= 0)
        {
            stringbuilder.append(" #");
            stringbuilder.append(mIndex);
        }
        if (mFragmentId != 0)
        {
            stringbuilder.append(" id=0x");
            stringbuilder.append(Integer.toHexString(mFragmentId));
        }
        if (mTag != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append(mTag);
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    public void unregisterForContextMenu(View view)
    {
        view.setOnCreateContextMenuListener(null);
    }

}
