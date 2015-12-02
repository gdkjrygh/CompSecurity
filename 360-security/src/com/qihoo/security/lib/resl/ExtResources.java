// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.lib.resl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import com.qihoo.security.lib.iresl.IInfo;
import com.qihoo.security.lib.iresl.IResourcesd;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Field;

public class ExtResources
{
    public static class ExtResourcesException extends Exception
    {

        public ExtResourcesException()
        {
        }

        public ExtResourcesException(String s)
        {
            super(s);
        }
    }

    private static class InnerInfo
        implements IInfo
    {

        private String pi;
        private String pn;
        private int vc;
        private String vn;

        public String getPkgInfo()
        {
            return pi;
        }

        public String getPkgName()
        {
            return pn;
        }

        public int getVersionCode()
        {
            return vc;
        }

        public String getVersionName()
        {
            return vn;
        }

        public InnerInfo(int i, String s, String s1, String s2)
        {
            vc = i;
            vn = s;
            pi = s1;
            pn = s2;
        }
    }


    private static final String CFG_KEY = "cfg";
    private static final boolean DEBUG = true;
    private static final int NEW_ARCH_VERSION_CODE_START = 30;
    private static final String PACKAGE_PREFIX = "com.qihoo.security.lang";
    private static String TAG = "ExtResources";
    public static final int TYPE_ARRAY = 1;
    public static final int TYPE_PLURALS = 2;
    public static final int TYPE_STRING = 0;
    private boolean isNewArch;
    private String mCfgValue;
    private Context mContext;
    private DexClassLoader mDexClassLoader;
    private String mExtPackageName;
    private IInfo mInfo;
    private PackageManager mPackageManager;
    private String mPackageName;
    private Class mRStringArrayCls;
    private Object mRStringArrayObj;
    private Class mRStringCls;
    private Object mRStringObj;
    private String mResPath;
    private Resources mResources;
    private IResourcesd mResourcesed;
    private int mVersionCode;
    private String mVersionName;

    public ExtResources(Context context)
    {
        mInfo = null;
        mResourcesed = null;
        mDexClassLoader = null;
        mRStringObj = null;
        mRStringArrayObj = null;
        mRStringCls = null;
        mRStringArrayCls = null;
        mPackageName = null;
        mVersionCode = 0;
        isNewArch = false;
        mContext = context.getApplicationContext();
        mPackageName = "com.qihoo.security";
        mPackageManager = mContext.getPackageManager();
    }

    private boolean isIllegal()
    {
        return mVersionCode >= 30 && mVersionName != null && mExtPackageName != null && mCfgValue != null;
    }

    private void loadR()
        throws ExtResourcesException
    {
label0:
        {
label1:
            {
label2:
                {
label3:
                    {
                        if (mRStringObj == null || mRStringCls == null)
                        {
                            if (mDexClassLoader == null)
                            {
                                throw new ExtResourcesException(" resources not init ");
                            }
                            Object obj;
                            try
                            {
                                obj = mDexClassLoader.loadClass((new StringBuilder()).append(mPackageName).append(".lang.R$string").toString());
                                mRStringCls = ((Class) (obj));
                            }
                            catch (Exception exception)
                            {
                                throw new ExtResourcesException(" load R$string err ");
                            }
                            try
                            {
                                obj = ((Class) (obj)).newInstance();
                            }
                            catch (Exception exception1)
                            {
                                throw new ExtResourcesException(" init R$string err ");
                            }
                            if (obj == null)
                            {
                                break label3;
                            }
                            mRStringObj = obj;
                        }
                        if (mRStringArrayObj != null && mRStringArrayCls != null)
                        {
                            break label1;
                        }
                        if (mDexClassLoader == null)
                        {
                            throw new ExtResourcesException(" resources not init ");
                        }
                        break label2;
                    }
                    throw new ExtResourcesException(" init R$string err ");
                }
                Object obj1;
                try
                {
                    obj1 = mDexClassLoader.loadClass((new StringBuilder()).append(mPackageName).append(".lang.R$array").toString());
                    mRStringArrayCls = ((Class) (obj1));
                }
                catch (Exception exception2)
                {
                    throw new ExtResourcesException(" load R$array err ");
                }
                try
                {
                    obj1 = ((Class) (obj1)).newInstance();
                }
                catch (Exception exception3)
                {
                    throw new ExtResourcesException(" init R$array err ");
                }
                if (obj1 == null)
                {
                    break label0;
                }
                mRStringArrayObj = obj1;
            }
            return;
        }
        throw new ExtResourcesException(" init R$array err ");
    }

    private void loadResources()
        throws ExtResourcesException
    {
        if (mResourcesed == null)
        {
            if (mDexClassLoader == null)
            {
                throw new ExtResourcesException(" resources not init ");
            }
            Object obj;
            try
            {
                obj = mDexClassLoader.loadClass((new StringBuilder()).append(mPackageName).append(".lang.Resourcesd").toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new ExtResourcesException(" load resourcesd err ");
            }
            try
            {
                obj = ((Class) (obj)).newInstance();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new ExtResourcesException(" init resourcesd err ");
            }
            if (obj == null || !(obj instanceof IResourcesd))
            {
                throw new ExtResourcesException(" res protocol err ");
            }
            mResourcesed = (IResourcesd)obj;
        }
    }

    public int getIdent(String s, int i)
    {
        int j;
        j = 0;
        if (!isNewArch)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        j = mResources.getIdentifier(s, "string", mExtPackageName);
_L4:
        return j;
_L2:
        if (i == 1)
        {
            return mResources.getIdentifier(s, "array", mExtPackageName);
        }
        if (i != 2) goto _L4; else goto _L3
_L3:
        return mResources.getIdentifier(s, "plurals", mExtPackageName);
        if (s == null)
        {
            try
            {
                throw new ExtResourcesException(" illegal resources name ");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return 0;
            }
        }
        if (i != 0 && 2 != i)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        i = mRStringCls.getDeclaredField(s).getInt(mRStringObj);
        return i;
        s;
        throw new ExtResourcesException(" get stringid err ");
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        i = mRStringArrayCls.getDeclaredField(s).getInt(mRStringArrayObj);
        return i;
        s;
        throw new ExtResourcesException(" get stringarrayid err ");
        throw new ExtResourcesException(" get stringid err ");
    }

    public String getPkgInfo()
    {
        if (mInfo != null)
        {
            return mInfo.getPkgInfo();
        } else
        {
            return null;
        }
    }

    public String getPkgName()
    {
        if (mInfo != null)
        {
            return mInfo.getPkgName();
        } else
        {
            return null;
        }
    }

    public String getQuantityString(int i, int j)
    {
        if (isNewArch)
        {
            return mResources.getQuantityString(i, j);
        } else
        {
            return getString(i);
        }
    }

    public transient String getQuantityString(int i, int j, Object aobj[])
    {
        if (isNewArch)
        {
            return mResources.getQuantityString(i, j, aobj);
        } else
        {
            return getString(i);
        }
    }

    public String getString(int i)
    {
        if (isNewArch)
        {
            return mResources.getString(i);
        } else
        {
            return mResourcesed.getString(i);
        }
    }

    public transient String getString(int i, Object aobj[])
    {
        if (isNewArch)
        {
            return mResources.getString(i, aobj);
        }
        try
        {
            aobj = String.format(mResourcesed.getString(i), aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            return null;
        }
        return ((String) (aobj));
    }

    public String[] getStringArray(int i)
    {
        if (isNewArch)
        {
            return mResources.getStringArray(i);
        } else
        {
            return mResourcesed.getStringArray(i);
        }
    }

    public Integer getVersionCode()
    {
        if (mInfo != null)
        {
            return Integer.valueOf(mInfo.getVersionCode());
        } else
        {
            return null;
        }
    }

    public String getVersionName()
    {
        if (mInfo != null)
        {
            return mInfo.getVersionName();
        } else
        {
            return null;
        }
    }

    public void initResources(String s)
        throws ExtResourcesException
    {
        if (s == null)
        {
            throw new ExtResourcesException(" not supported package ");
        }
        File file = new File(s);
        if (!file.exists() || !file.isFile())
        {
            throw new ExtResourcesException(" not supported package ");
        }
        mResPath = s;
        Object obj;
        obj = mPackageManager.getPackageArchiveInfo(s, 128);
        mExtPackageName = ((PackageInfo) (obj)).packageName;
        mVersionCode = ((PackageInfo) (obj)).versionCode;
        mVersionName = ((PackageInfo) (obj)).versionName;
        obj = ((PackageInfo) (obj)).applicationInfo.metaData;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        mCfgValue = ((Bundle) (obj)).getString("cfg");
        Log.v(TAG, (new StringBuilder()).append(" PackageInfo : [ packagename ").append(mExtPackageName).append(" versioncode ").append(mVersionCode).append(" versionname ").append(mVersionName).append(" configInfo ").append(mCfgValue).append(" ] ").toString());
        if (isIllegal())
        {
            isNewArch = true;
        }
_L2:
        if (isNewArch)
        {
            return;
        }
        break; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        Log.e(TAG, " not supported package ");
        if (true) goto _L2; else goto _L1
_L1:
        if (mDexClassLoader != null)
        {
            throw new ExtResourcesException(" load resource illegal ");
        } else
        {
            mDexClassLoader = new DexClassLoader(s, mContext.getFilesDir().getAbsolutePath(), null, mContext.getClassLoader());
            return;
        }
    }

    public void loadAllRes()
        throws ExtResourcesException
    {
        if (isNewArch)
        {
            AssetManager assetmanager = new AssetManager();
            assetmanager.addAssetPath(mResPath);
            Resources resources = mContext.getResources();
            mResources = new Resources(assetmanager, resources.getDisplayMetrics(), resources.getConfiguration());
            if (mResources == null)
            {
                throw new ExtResourcesException(" load resources fail ");
            }
        } else
        {
            loadR();
            loadResources();
        }
    }

    public void loadInfo()
        throws ExtResourcesException
    {
label0:
        {
            if (mInfo == null)
            {
                if (!isNewArch)
                {
                    break label0;
                }
                mInfo = new InnerInfo(mVersionCode, mVersionName, mCfgValue, mExtPackageName);
            }
            return;
        }
        if (mDexClassLoader == null)
        {
            throw new ExtResourcesException(" resources not init ");
        }
        Object obj;
        try
        {
            obj = mDexClassLoader.loadClass((new StringBuilder()).append(mPackageName).append(".lang.Info").toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new ExtResourcesException(" iload info err ");
        }
        try
        {
            obj = ((Class) (obj)).newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new ExtResourcesException(" init info err ");
        }
        if (obj == null || !(obj instanceof IInfo))
        {
            throw new ExtResourcesException(" res protocol err ");
        } else
        {
            mInfo = (IInfo)obj;
            return;
        }
    }

    public void unloadAll()
    {
        mInfo = null;
        mResourcesed = null;
        mRStringObj = null;
        mRStringArrayObj = null;
        mDexClassLoader = null;
        mResources = null;
        isNewArch = false;
        mVersionName = null;
        mExtPackageName = null;
        mCfgValue = null;
    }

}
