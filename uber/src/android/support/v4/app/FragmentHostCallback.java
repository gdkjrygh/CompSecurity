// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.util.SimpleArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            FragmentContainer, FragmentManagerImpl, FragmentActivity, LoaderManagerImpl, 
//            Fragment

public abstract class FragmentHostCallback extends FragmentContainer
{

    private final Activity mActivity;
    private SimpleArrayMap mAllLoaderManagers;
    private boolean mCheckedForLoaderManager;
    final Context mContext;
    final FragmentManagerImpl mFragmentManager;
    private final Handler mHandler;
    private LoaderManagerImpl mLoaderManager;
    private boolean mLoadersStarted;
    final int mWindowAnimations;

    FragmentHostCallback(Activity activity, Context context, Handler handler, int i)
    {
        mFragmentManager = new FragmentManagerImpl();
        mActivity = activity;
        mContext = context;
        mHandler = handler;
        mWindowAnimations = i;
    }

    public FragmentHostCallback(Context context, Handler handler, int i)
    {
        this(null, context, handler, i);
    }

    FragmentHostCallback(FragmentActivity fragmentactivity)
    {
        this(((Activity) (fragmentactivity)), ((Context) (fragmentactivity)), fragmentactivity.mHandler, 0);
    }

    void doLoaderDestroy()
    {
        if (mLoaderManager == null)
        {
            return;
        } else
        {
            mLoaderManager.doDestroy();
            return;
        }
    }

    void doLoaderRetain()
    {
        if (mLoaderManager == null)
        {
            return;
        } else
        {
            mLoaderManager.doRetain();
            return;
        }
    }

    void doLoaderStart()
    {
        if (mLoadersStarted)
        {
            return;
        }
        mLoadersStarted = true;
        if (mLoaderManager == null) goto _L2; else goto _L1
_L1:
        mLoaderManager.doStart();
_L4:
        mCheckedForLoaderManager = true;
        return;
_L2:
        if (!mCheckedForLoaderManager)
        {
            mLoaderManager = getLoaderManager("(root)", mLoadersStarted, false);
            if (mLoaderManager != null && !mLoaderManager.mStarted)
            {
                mLoaderManager.doStart();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void doLoaderStop(boolean flag)
    {
        while (mLoaderManager == null || !mLoadersStarted) 
        {
            return;
        }
        mLoadersStarted = false;
        if (flag)
        {
            mLoaderManager.doRetain();
            return;
        } else
        {
            mLoaderManager.doStop();
            return;
        }
    }

    void dumpLoaders(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.print(s);
        printwriter.print("mLoadersStarted=");
        printwriter.println(mLoadersStarted);
        if (mLoaderManager != null)
        {
            printwriter.print(s);
            printwriter.print("Loader Manager ");
            printwriter.print(Integer.toHexString(System.identityHashCode(mLoaderManager)));
            printwriter.println(":");
            mLoaderManager.dump((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
        }
    }

    Activity getActivity()
    {
        return mActivity;
    }

    Context getContext()
    {
        return mContext;
    }

    FragmentManagerImpl getFragmentManagerImpl()
    {
        return mFragmentManager;
    }

    Handler getHandler()
    {
        return mHandler;
    }

    LoaderManagerImpl getLoaderManager(String s, boolean flag, boolean flag1)
    {
        if (mAllLoaderManagers == null)
        {
            mAllLoaderManagers = new SimpleArrayMap();
        }
        LoaderManagerImpl loadermanagerimpl = (LoaderManagerImpl)mAllLoaderManagers.get(s);
        if (loadermanagerimpl == null)
        {
            if (flag1)
            {
                loadermanagerimpl = new LoaderManagerImpl(s, this, flag);
                mAllLoaderManagers.put(s, loadermanagerimpl);
            }
            return loadermanagerimpl;
        } else
        {
            loadermanagerimpl.updateHostController(this);
            return loadermanagerimpl;
        }
    }

    LoaderManagerImpl getLoaderManagerImpl()
    {
        if (mLoaderManager != null)
        {
            return mLoaderManager;
        } else
        {
            mCheckedForLoaderManager = true;
            mLoaderManager = getLoaderManager("(root)", mLoadersStarted, true);
            return mLoaderManager;
        }
    }

    void inactivateFragment(String s)
    {
        if (mAllLoaderManagers != null)
        {
            LoaderManagerImpl loadermanagerimpl = (LoaderManagerImpl)mAllLoaderManagers.get(s);
            if (loadermanagerimpl != null && !loadermanagerimpl.mRetaining)
            {
                loadermanagerimpl.doDestroy();
                mAllLoaderManagers.remove(s);
            }
        }
    }

    void onAttachFragment(Fragment fragment)
    {
    }

    public void onDump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
    }

    public View onFindViewById(int i)
    {
        return null;
    }

    public abstract Object onGetHost();

    public LayoutInflater onGetLayoutInflater()
    {
        return (LayoutInflater)mContext.getSystemService("layout_inflater");
    }

    public int onGetWindowAnimations()
    {
        return mWindowAnimations;
    }

    public boolean onHasView()
    {
        return true;
    }

    public boolean onHasWindowAnimations()
    {
        return true;
    }

    public void onRequestPermissionsFromFragment(Fragment fragment, String as[], int i)
    {
    }

    public boolean onShouldSaveFragmentState(Fragment fragment)
    {
        return true;
    }

    public boolean onShouldShowRequestPermissionRationale(String s)
    {
        return false;
    }

    public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i)
    {
        if (i != -1)
        {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        } else
        {
            mContext.startActivity(intent);
            return;
        }
    }

    public void onSupportInvalidateOptionsMenu()
    {
    }

    void reportLoaderStart()
    {
        if (mAllLoaderManagers != null)
        {
            int k = mAllLoaderManagers.size();
            LoaderManagerImpl aloadermanagerimpl[] = new LoaderManagerImpl[k];
            for (int i = k - 1; i >= 0; i--)
            {
                aloadermanagerimpl[i] = (LoaderManagerImpl)mAllLoaderManagers.valueAt(i);
            }

            for (int j = 0; j < k; j++)
            {
                LoaderManagerImpl loadermanagerimpl = aloadermanagerimpl[j];
                loadermanagerimpl.finishRetain();
                loadermanagerimpl.doReportStart();
            }

        }
    }

    void restoreLoaderNonConfig(SimpleArrayMap simplearraymap)
    {
        mAllLoaderManagers = simplearraymap;
    }

    SimpleArrayMap retainLoaderNonConfig()
    {
        int j = 0;
        boolean flag1;
        if (mAllLoaderManagers != null)
        {
            int k = mAllLoaderManagers.size();
            LoaderManagerImpl aloadermanagerimpl[] = new LoaderManagerImpl[k];
            for (int i = k - 1; i >= 0; i--)
            {
                aloadermanagerimpl[i] = (LoaderManagerImpl)mAllLoaderManagers.valueAt(i);
            }

            boolean flag = false;
            do
            {
                flag1 = flag;
                if (j >= k)
                {
                    break;
                }
                LoaderManagerImpl loadermanagerimpl = aloadermanagerimpl[j];
                if (loadermanagerimpl.mRetaining)
                {
                    flag = true;
                } else
                {
                    loadermanagerimpl.doDestroy();
                    mAllLoaderManagers.remove(loadermanagerimpl.mWho);
                }
                j++;
            } while (true);
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            return mAllLoaderManagers;
        } else
        {
            return null;
        }
    }
}
