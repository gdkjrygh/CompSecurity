// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.qihoo.security.engine.cloudscan.NetQuery;
import com.qihoo.security.engine.cloudscan.SampleDetector;
import com.qihoo.security.env.QVSEnv;
import com.qihoo360.common.unzip.a;
import com.qihoo360.common.utils.HashUtil;
import com.qihoo360.common.utils.HexUtil;
import com.qihoo360.common.utils.PortPackageParser;
import com.qihoo360.common.utils.SysInfo;
import com.qihoo360.common.utils.ZipUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.qihoo.security.engine:
//            ClassesDexInfo

public class ApkInfo
    implements Parcelable, Cloneable
{

    public static final int ADWARE = 5;
    public static final int CLEAR = 0;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ApkInfo a(Parcel parcel)
        {
            return new ApkInfo(parcel);
        }

        public ApkInfo[] a(int j)
        {
            return new ApkInfo[j];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int j)
        {
            return a(j);
        }

    };
    public static final int DANGER = 1;
    public static final int FLAG_SKIP_ODEX = 1;
    public static final int PUA = 4;
    public static final int TROJAN = 3;
    public static final int UNKNOWN = -1;
    public static final int WARNING = 2;
    private static final AtomicInteger b = new AtomicInteger(0);
    private static final boolean h = SysInfo.isRunningART();
    protected byte a[];
    public AdPluginInfo.AdPlugin adPlugins[];
    public int behavior;
    private byte c[];
    private long d;
    private final ClassesDexInfo e;
    public String extraInfo;
    private android.content.pm.PackageParser.Package f;
    public final String filePath;
    public int flags;
    private String g;
    public long hipsAction;
    private int i;
    public int iconRes;
    public final boolean isInstalled;
    public byte mDexHash[];
    public byte mFileHash[];
    public int maliceRank;
    public final String packageName;
    public int timestamp;
    public String upExts;
    public final int versionCode;
    public String versionName;

    public ApkInfo(PackageManager packagemanager, PackageInfo packageinfo)
    {
        iconRes = -1;
        maliceRank = -1;
        behavior = 0;
        extraInfo = null;
        timestamp = 0;
        c = null;
        a = null;
        mFileHash = null;
        mDexHash = null;
        d = 0L;
        e = new ClassesDexInfo();
        f = null;
        packageName = packageinfo.packageName;
        versionCode = packageinfo.versionCode;
        if (packageinfo.signatures != null)
        {
            a = HashUtil.getHash("MD5", packageinfo.signatures[0].toByteArray());
        } else
        {
            a = null;
        }
        filePath = packageinfo.applicationInfo.publicSourceDir;
        iconRes = packageinfo.applicationInfo.icon;
        flags = packageinfo.applicationInfo.flags;
        isInstalled = true;
    }

    public ApkInfo(Parcel parcel)
    {
        iconRes = -1;
        maliceRank = -1;
        behavior = 0;
        extraInfo = null;
        timestamp = 0;
        c = null;
        a = null;
        mFileHash = null;
        mDexHash = null;
        d = 0L;
        e = new ClassesDexInfo();
        f = null;
        i = parcel.readInt();
        packageName = parcel.readString();
        versionCode = parcel.readInt();
        if (parcel.readInt() > 0)
        {
            a = parcel.createByteArray();
        }
        maliceRank = parcel.readInt();
        behavior = parcel.readInt();
        versionName = parcel.readString();
        g = parcel.readString();
        flags = parcel.readInt();
        iconRes = parcel.readInt();
        timestamp = parcel.readInt();
        isInstalled = parcel.createBooleanArray()[0];
        filePath = parcel.readString();
        e.filePath = parcel.readString();
        e.memoryPtr = parcel.readLong();
        e.memorySize = parcel.readLong();
        if (parcel.readInt() > 0)
        {
            mDexHash = parcel.createByteArray();
        }
        if (parcel.readInt() > 0)
        {
            mFileHash = parcel.createByteArray();
        }
        upExts = parcel.readString();
    }

    public ApkInfo(String s)
        throws IOException
    {
        iconRes = -1;
        maliceRank = -1;
        behavior = 0;
        extraInfo = null;
        timestamp = 0;
        c = null;
        a = null;
        mFileHash = null;
        mDexHash = null;
        d = 0L;
        e = new ClassesDexInfo();
        f = null;
        filePath = s;
        isInstalled = false;
        android.content.pm.PackageParser.Package package1 = getParserInfo();
        if (package1 != null)
        {
            packageName = package1.packageName;
            versionCode = package1.mVersionCode;
            iconRes = package1.applicationInfo.icon;
            return;
        } else
        {
            throw new IOException((new StringBuilder("Can not parse ")).append(s).toString());
        }
    }

    public ApkInfo(String s, int j, byte abyte0[], String s1, boolean flag)
    {
        iconRes = -1;
        maliceRank = -1;
        behavior = 0;
        extraInfo = null;
        timestamp = 0;
        c = null;
        a = null;
        mFileHash = null;
        mDexHash = null;
        d = 0L;
        e = new ClassesDexInfo();
        f = null;
        packageName = s;
        versionCode = j;
        a = abyte0;
        filePath = s1;
        isInstalled = flag;
    }

    private int a(android.graphics.BitmapFactory.Options options, int j, int k)
    {
        int l;
        int i1;
        int j1;
        int k1;
        j1 = options.outHeight;
        k1 = options.outWidth;
        i1 = 1;
        l = 1;
        if (j1 <= k && k1 <= j) goto _L2; else goto _L1
_L1:
        j1 /= 2;
        k1 /= 2;
_L7:
        i1 = l;
        if (j1 / l <= k) goto _L2; else goto _L3
_L3:
        if (k1 / l > j) goto _L5; else goto _L4
_L4:
        i1 = l;
_L2:
        return i1;
_L5:
        l *= 2;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private ClassesDexInfo a(String s)
    {
        if (b.get() > 30 || !a())
        {
            e.memorySize = 0L;
            e.memoryPtr = 0L;
            if (ZipUtil.extract(filePath, "classes.dex", new File(s)))
            {
                e.filePath = s;
            } else
            if (ZipUtil.extract(filePath, "classes.dex", new File(s)))
            {
                e.filePath = s;
            } else
            {
                e.filePath = "";
            }
        }
        return e;
    }

    private String a(String s, String s1)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (!(s = new JSONObject(s)).has(s1)) goto _L1; else goto _L3
_L3:
        s = s.getString(s1);
        return s;
        s;
        Log.e("ApkInfo", "", s);
        return null;
    }

    private String a(String s, String s1, Object obj)
    {
        JSONObject jsonobject;
        if (TextUtils.isEmpty(s))
        {
            jsonobject = new JSONObject();
        } else
        {
            try
            {
                jsonobject = new JSONObject(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return s;
            }
        }
        try
        {
            jsonobject.put(s1, obj);
            s1 = jsonobject.toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return s;
        }
        return s1;
    }

    private String a(String s, String s1, String s2)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (!(s = new JSONObject(s)).has(s1) || TextUtils.isEmpty(s.getString(s1)) || !(s = s.getJSONObject(s1)).has(s2)) goto _L1; else goto _L3
_L3:
        s = s.getString(s2);
        return s;
        s;
        return null;
    }

    private LinkedList a(ArrayList arraylist, Intent intent, boolean flag)
    {
        LinkedList linkedlist = new LinkedList();
        String s = intent.getAction();
        intent = intent.getCategories();
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                return linkedlist;
            }
            android.content.pm.PackageParser.Activity activity = (android.content.pm.PackageParser.Activity)arraylist.next();
            Iterator iterator = activity.intents.iterator();
label0:
            do
            {
                android.content.pm.PackageParser.ActivityIntentInfo activityintentinfo;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    activityintentinfo = (android.content.pm.PackageParser.ActivityIntentInfo)iterator.next();
                } while (s != null && !activityintentinfo.hasAction(s) || intent != null && !a(((Set) (intent)), activityintentinfo));
                linkedlist.add(activity.info);
            } while (!flag);
        } while (true);
    }

    private boolean a()
    {
        long al[] = SampleDetector.CreateCodeMapping(filePath, null, 0x100000L);
        if (al == null || al.length == 0)
        {
            return false;
        }
        if (al[0] > 0L)
        {
            b.incrementAndGet();
            e.filePath = "";
            e.memorySize = al[0];
            e.memoryPtr = al[1];
            return true;
        } else
        {
            return false;
        }
    }

    private static boolean a(Set set, android.content.pm.PackageParser.ActivityIntentInfo activityintentinfo)
    {
        set = set.iterator();
        do
        {
            if (!set.hasNext())
            {
                return true;
            }
        } while (activityintentinfo.hasCategory((String)set.next()));
        return false;
    }

    public void addUpExts(String s, Object obj)
    {
        upExts = a(upExts, s, obj);
    }

    public ApkInfo clone()
    {
        ApkInfo apkinfo;
        try
        {
            apkinfo = (ApkInfo)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return null;
        }
        return apkinfo;
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public void closeClassesDex()
    {
        if (e.memoryPtr != 0L)
        {
            SampleDetector.CloseMappingHandle(e.memoryPtr);
            b.decrementAndGet();
            e.memoryPtr = 0L;
        }
        String s = e.filePath;
        if (!TextUtils.isEmpty(s))
        {
            if (!s.startsWith("/sys") && !s.startsWith("/data"))
            {
                (new File(s)).delete();
            }
            e.filePath = null;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public byte[] getAppKey()
    {
        if (c == null)
        {
            byte abyte0[] = getSigHash();
            if (abyte0 != null)
            {
                c = HashUtil.getHash("MD5", (new StringBuilder(String.valueOf(packageName))).append("_").append(versionCode).append("_").append(HexUtil.bytes2HexStr(abyte0)).toString().getBytes());
            }
        }
        return c;
    }

    public byte[] getDexHash()
    {
        if (mDexHash != null || isBuiltin()) goto _L2; else goto _L1
_L1:
        Object obj1 = null;
        Object obj = new a(filePath);
        obj1 = ((a) (obj)).a();
_L6:
        boolean flag = ((Enumeration) (obj1)).hasMoreElements();
        if (flag) goto _L4; else goto _L3
_L3:
        com.qihoo360.common.unzip.a.a a1;
        if (obj != null)
        {
            try
            {
                ((a) (obj)).b();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
_L2:
        return mDexHash;
_L4:
        a1 = (com.qihoo360.common.unzip.a.a)((Enumeration) (obj1)).nextElement();
        if (!"classes.dex".equals(a1.a())) goto _L6; else goto _L5
_L5:
        obj1 = a1.b();
        mDexHash = HashUtil.getInputStreamHash("MD5", ((InputStream) (obj1)));
        ((InputStream) (obj1)).close();
          goto _L3
        obj1;
_L9:
        if (obj != null)
        {
            try
            {
                ((a) (obj)).b();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
          goto _L2
        obj1;
        obj = null;
_L8:
        if (obj != null)
        {
            try
            {
                ((a) (obj)).b();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw obj1;
        obj1;
        if (true) goto _L8; else goto _L7
_L7:
        Exception exception;
        exception;
        exception = ((Exception) (obj1));
          goto _L9
    }

    public String getExtra(String s)
    {
        return a(extraInfo, s);
    }

    public String getExtra(String s, String s1)
    {
        return a(extraInfo, s, s1);
    }

    public byte[] getFileHash()
    {
        if (mFileHash == null)
        {
            mFileHash = HashUtil.getFileHash("MD5", new File(filePath));
            if (mFileHash == null)
            {
                mFileHash = new byte[1];
                mFileHash[0] = 0;
            }
        }
        return mFileHash;
    }

    public long getFileSize()
    {
        if (d == 0L && filePath != null)
        {
            d = (new File(filePath)).length();
        }
        return d;
    }

    public android.content.pm.PackageParser.Package getParserInfo()
    {
        if (f == null)
        {
            DisplayMetrics displaymetrics = new DisplayMetrics();
            displaymetrics.setToDefaults();
            f = PortPackageParser.parsePackage(new File(filePath), null, displaymetrics, 0);
            if (f != null);
        }
        return f;
    }

    public byte[] getSigHash()
    {
        if (a == null && !isInstalled) goto _L2; else goto _L1
_L1:
        return a;
_L2:
        byte abyte0[] = new byte[80];
        if (NetQuery.GetFgprint(filePath, abyte0) > 0)
        {
            a = new byte[16];
            System.arraycopy(abyte0, 0, a, 0, 16);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public boolean isAdWare()
    {
        maliceRank;
        JVM INSTR tableswitch 5 5: default 24
    //                   5 26;
           goto _L1 _L2
_L1:
        return false;
_L2:
        if (QVSEnv.bEvalMode)
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public boolean isBuiltin()
    {
        return (flags & 1) == 1 && (flags & 0x80) == 0;
    }

    public boolean isDanger()
    {
        maliceRank;
        JVM INSTR tableswitch 1 1: default 24
    //                   1 26;
           goto _L1 _L2
_L1:
        return false;
_L2:
        if ((behavior & 0x40000) == 0)
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public boolean isMalware()
    {
        switch (maliceRank)
        {
        case 2: // '\002'
        default:
            return false;

        case 1: // '\001'
        case 3: // '\003'
            return true;
        }
    }

    public boolean isSystem()
    {
        return (flags & 1) == 1;
    }

    public boolean isTrojan()
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = flag1;
        maliceRank;
        JVM INSTR tableswitch 1 3: default 36
    //                   1 40
    //                   2 36
    //                   3 38;
           goto _L1 _L2 _L1 _L3
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        flag = false;
_L5:
        return flag;
_L2:
        flag = flag1;
        if ((behavior & 0x40000) == 0)
        {
            return false;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean isUpdatedSystem()
    {
        return (flags & 0x80) == 128;
    }

    public boolean isWarning()
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = flag1;
        maliceRank;
        JVM INSTR tableswitch 2 4: default 36
    //                   2 38
    //                   3 36
    //                   4 40;
           goto _L1 _L2 _L1 _L3
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        flag = false;
_L5:
        return flag;
_L3:
        flag = flag1;
        if (!QVSEnv.bEvalMode)
        {
            return false;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public Drawable loadIcon(Context context)
    {
        if (QVSEnv.bEvalMode)
        {
            return context.getPackageManager().getDefaultActivityIcon();
        } else
        {
            return loadIconImpl(context);
        }
    }

    public Drawable loadIconImpl(Context context)
    {
        if (iconRes <= 0) goto _L2; else goto _L1
_L1:
        if (!isInstalled) goto _L4; else goto _L3
_L3:
        Object obj;
        Drawable drawable;
        try
        {
            obj = context.getPackageManager().getDrawable(packageName, iconRes, null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = context.getPackageManager().getDefaultActivityIcon();
        }
_L6:
        drawable = ((Drawable) (obj));
        if (obj == null)
        {
            drawable = context.getPackageManager().getDefaultActivityIcon();
        }
        return drawable;
_L4:
        context = new AssetManager();
        context.addAssetPath(filePath);
        obj = new DisplayMetrics();
        obj.density = 0.75F;
        obj.heightPixels = 480;
        obj.widthPixels = 320;
        obj.xdpi = 360F;
        obj.ydpi = 240F;
        obj.densityDpi = 120;
        Configuration configuration = new Configuration();
        configuration.screenLayout = 1;
        obj = new Resources(context, ((DisplayMetrics) (obj)), configuration);
        try
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(((Resources) (obj)), iconRes, options);
            options.inSampleSize = a(options, 32, 32);
            options.inJustDecodeBounds = false;
            obj = new BitmapDrawable(((Resources) (obj)), BitmapFactory.decodeResource(((Resources) (obj)), iconRes, options));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            context.close();
            return null;
        }
        finally
        {
            context.close();
        }
        context.close();
        return ((Drawable) (obj));
        throw obj;
_L2:
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public String loadLabel(Context context)
    {
        if (g == null)
        {
            android.content.pm.PackageParser.Package package1 = getParserInfo();
            if (package1 != null)
            {
                context = context.getResources();
                AssetManager assetmanager = new AssetManager();
                assetmanager.addAssetPath(filePath);
                Resources resources = new Resources(assetmanager, context.getDisplayMetrics(), context.getConfiguration());
                Object obj = null;
                context = obj;
                if (package1.applicationInfo.labelRes != 0)
                {
                    try
                    {
                        context = resources.getText(package1.applicationInfo.labelRes);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context)
                    {
                        context = obj;
                    }
                }
                assetmanager.close();
                if (TextUtils.isEmpty(context))
                {
                    if (package1.applicationInfo.nonLocalizedLabel != null)
                    {
                        g = package1.applicationInfo.nonLocalizedLabel.toString();
                    } else
                    {
                        g = package1.applicationInfo.packageName;
                    }
                } else
                {
                    g = context.toString();
                }
            }
        }
        return g;
    }

    public ClassesDexInfo openClassesDex()
    {
        return openClassesDex(false);
    }

    public ClassesDexInfo openClassesDex(boolean flag)
    {
label0:
        {
label1:
            {
                if (TextUtils.isEmpty(e.filePath))
                {
                    if (!isInstalled)
                    {
                        break label0;
                    }
                    if (isBuiltin())
                    {
                        int j = filePath.lastIndexOf('.');
                        if (j > 0)
                        {
                            String s = filePath.substring(0, j).concat(".odex");
                            if ((new File(s)).exists())
                            {
                                e.filePath = s;
                            }
                        }
                    }
                    if (TextUtils.isEmpty(e.filePath))
                    {
                        if (!flag)
                        {
                            break label1;
                        }
                        if (h)
                        {
                            return a((new File(Environment.getExternalStorageDirectory(), filePath.substring(1).replace('/', '@').concat("@classes.dex"))).getAbsolutePath());
                        }
                        String s1 = (new StringBuilder("/data/dalvik-cache/")).append(filePath.substring(1).replace('/', '@').concat("@classes.dex")).toString();
                        if ((new File(s1)).canRead())
                        {
                            e.memorySize = 0L;
                            e.memoryPtr = 0L;
                            e.filePath = s1;
                        }
                    }
                }
                return e;
            }
            return a((new File(Environment.getExternalStorageDirectory(), filePath.substring(1).replace('/', '@').concat("@classes.dex"))).getAbsolutePath());
        }
        return a((new StringBuilder(String.valueOf(filePath.substring(0, filePath.lastIndexOf('.'))))).append("_classes.dex").toString());
    }

    public ActivityInfo queryActivityForIntent(Intent intent)
    {
        android.content.pm.PackageParser.Package package1 = getParserInfo();
        if (package1 != null)
        {
            intent = a(package1.activities, intent, true);
            if (!intent.isEmpty())
            {
                return (ActivityInfo)intent.get(0);
            }
        }
        return null;
    }

    public void setExtra(String s, Object obj)
    {
        extraInfo = a(extraInfo, s, obj);
    }

    public String toShortString()
    {
        return (new StringBuilder(String.valueOf(filePath))).append("|").append(packageName).append("|").append(versionCode).toString();
    }

    public String toString()
    {
        String s;
        String s1;
        String s2;
        if (a != null)
        {
            s = HexUtil.bytes2HexStr(a);
        } else
        {
            s = "<cert>";
        }
        if (mFileHash != null)
        {
            s1 = HexUtil.bytes2HexStr(mFileHash);
        } else
        {
            s1 = "<file>";
        }
        if (mDexHash != null)
        {
            s2 = HexUtil.bytes2HexStr(mDexHash);
        } else
        {
            s2 = "<dex>";
        }
        return (new StringBuilder(String.valueOf(filePath))).append("|").append(packageName).append("|").append(versionCode).append("|").append(s).append("|").append(g).append("|").append(s1).append("|").append(s2).append("|").append(maliceRank).append("|").append(timestamp).toString();
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeInt(i);
        parcel.writeString(packageName);
        parcel.writeInt(versionCode);
        if (a == null)
        {
            parcel.writeInt(0);
        } else
        {
            parcel.writeInt(a.length);
            parcel.writeByteArray(a);
        }
        parcel.writeInt(maliceRank);
        parcel.writeInt(behavior);
        parcel.writeString(versionName);
        parcel.writeString(g);
        parcel.writeInt(flags);
        parcel.writeInt(iconRes);
        parcel.writeInt(timestamp);
        parcel.writeBooleanArray(new boolean[] {
            isInstalled
        });
        parcel.writeString(filePath);
        parcel.writeString(e.filePath);
        parcel.writeLong(e.memoryPtr);
        parcel.writeLong(e.memorySize);
        if (mDexHash == null)
        {
            parcel.writeInt(0);
        } else
        {
            parcel.writeInt(mDexHash.length);
            parcel.writeByteArray(mDexHash);
        }
        if (mFileHash == null)
        {
            parcel.writeInt(0);
        } else
        {
            parcel.writeInt(mFileHash.length);
            parcel.writeByteArray(mFileHash);
        }
        parcel.writeString(upExts);
    }

}
