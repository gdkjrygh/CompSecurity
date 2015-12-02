// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import com.qihoo.security.engine.cloudscan.a.f;
import com.qihoo.security.engine.cloudscan.a.i;
import com.qihoo.security.engine.cloudscan.a.j;
import com.qihoo360.common.utils.HashUtil;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import net.jarlehansen.protobuf.javame.b;

// Referenced classes of package com.qihoo.security.engine:
//            AdPluginInfo, ApkInfo, HipsActionRevise

public class FileInfo
    implements Parcelable, Cloneable
{

    public static final int CAN_DELETE = 0;
    public static final String CAT_ADWARE = "Adware";
    public static final String CAT_EXPLOIT = "Exploit";
    public static final String CAT_INFOSTEALER = "Infostealer";
    public static final String CAT_PUA = "PUA";
    public static final String CAT_TROJAN = "Trojan";
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public FileInfo a(Parcel parcel)
        {
            return new FileInfo(parcel);
        }

        public FileInfo[] a(int k)
        {
            return new FileInfo[k];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int k)
        {
            return a(k);
        }

    };
    public static final int FROM_3TUPLE = 2;
    public static final int FROM_CLOUD = 100;
    public static final int FROM_MFSHA1 = 0;
    public static final int FROM_NOT_INIT = -1;
    public static final int FROM_SHA1 = 1;
    public static final long QF_CACHE_ALL_LEVEL = 1L;
    public static final long QF_MFSHA1 = 2L;
    public static final int REASON_CLOUD = 4;
    public static final int REASON_IME = 3;
    public static final int REASON_LAUNCHER = 2;
    public static final int REASON_SYSTEM_PACKAGE = 1;
    public static final int REPLACE_3DR_APK = 2;
    public static final int REPLACE_DISABLE = 0;
    public static final int REPLACE_SYSTEM_APK = 1;
    public static final int REPLACE_SYSTEM_FILE = 3;
    public static final int TYPE_APK = 1;
    public static final int TYPE_DIR = 0;
    public static final int TYPE_ELF = 2;
    public static final int TYPE_HTML = 3;
    public static final int TYPE_JAR = 4;
    public static final int TYPE_LOG = 5;
    public static final int TYPE_XML = 6;
    private int a;
    public AdPluginInfo adPluginInfo;
    public final ApkInfo apkInfo;
    private long b;
    public long behavior;
    private byte c[];
    public int canReplace;
    public String category;
    public int copyright;
    public int exLevel;
    public String extInfo;
    public f extIniInfo;
    public String fileDescription;
    public final String filePath;
    public final int fileType;
    public final int fromPid;
    public String hipsActionDescription;
    public HipsActionRevise hipsActionRevise[];
    public String hipsPrivilegeDescription;
    public HipsActionRevise hipsPrivilegeRevise[];
    public int level;
    public int netErrCode;
    public long queryFlags;
    public int queryFrom;
    public int resultFrom;
    public int scanType;
    public boolean shouldUpload;
    public String softClass;
    public String softDescription;
    public String trojanName;
    public int whiteFlags;

    public FileInfo(PackageManager packagemanager, PackageInfo packageinfo)
    {
        level = -1;
        canReplace = 0;
        resultFrom = 0;
        hipsActionRevise = null;
        hipsPrivilegeRevise = null;
        adPluginInfo = new AdPluginInfo();
        behavior = 0L;
        queryFrom = -1;
        copyright = 0;
        whiteFlags = 0;
        netErrCode = 0;
        a = 0;
        b = 0L;
        c = null;
        fileType = 1;
        filePath = packageinfo.applicationInfo.publicSourceDir;
        apkInfo = new ApkInfo(packagemanager, packageinfo);
        fromPid = 0;
    }

    FileInfo(Parcel parcel)
    {
        level = -1;
        canReplace = 0;
        resultFrom = 0;
        hipsActionRevise = null;
        hipsPrivilegeRevise = null;
        adPluginInfo = new AdPluginInfo();
        behavior = 0L;
        queryFrom = -1;
        copyright = 0;
        whiteFlags = 0;
        netErrCode = 0;
        a = 0;
        b = 0L;
        c = null;
        fileType = parcel.readInt();
        filePath = parcel.readString();
        apkInfo = (ApkInfo)parcel.readParcelable(getClass().getClassLoader());
        fromPid = parcel.readInt();
        level = parcel.readInt();
        behavior = parcel.readLong();
        b = parcel.readLong();
        if (parcel.readInt() > 0)
        {
            c = parcel.createByteArray();
        }
        trojanName = parcel.readString();
        category = parcel.readString();
        fileDescription = parcel.readString();
        softDescription = parcel.readString();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        shouldUpload = flag;
        if (parcel.readInt() > 0)
        {
            a(parcel.createByteArray());
        }
        queryFlags = parcel.readLong();
        adPluginInfo = (AdPluginInfo)parcel.readParcelable(getClass().getClassLoader());
        if (parcel.readInt() > 0)
        {
            hipsActionRevise = (HipsActionRevise[])parcel.createTypedArray(HipsActionRevise.CREATOR);
        }
        whiteFlags = parcel.readInt();
        queryFrom = parcel.readInt();
    }

    public FileInfo(ApkInfo apkinfo)
    {
        level = -1;
        canReplace = 0;
        resultFrom = 0;
        hipsActionRevise = null;
        hipsPrivilegeRevise = null;
        adPluginInfo = new AdPluginInfo();
        behavior = 0L;
        queryFrom = -1;
        copyright = 0;
        whiteFlags = 0;
        netErrCode = 0;
        a = 0;
        b = 0L;
        c = null;
        fileType = 1;
        filePath = apkinfo.filePath;
        apkInfo = apkinfo;
        fromPid = 0;
    }

    public FileInfo(String s, int k, int l)
        throws IOException
    {
        level = -1;
        canReplace = 0;
        resultFrom = 0;
        hipsActionRevise = null;
        hipsPrivilegeRevise = null;
        adPluginInfo = new AdPluginInfo();
        behavior = 0L;
        queryFrom = -1;
        copyright = 0;
        whiteFlags = 0;
        netErrCode = 0;
        a = 0;
        b = 0L;
        c = null;
        filePath = s;
        fileType = k;
        if (fileType == 1)
        {
            apkInfo = new ApkInfo(s);
        } else
        {
            apkInfo = null;
        }
        fromPid = l;
    }

    private boolean a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return false;
        }
        try
        {
            extIniInfo = f.a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return false;
        }
        return true;
    }

    public void SetDeleteType(int k)
    {
        a = k;
    }

    public int checkDeletable(Context context)
    {
        if (a != 0)
        {
            return a;
        }
        if (apkInfo == null || !apkInfo.isInstalled)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        if (!apkInfo.isBuiltin())
        {
            break MISSING_BLOCK_LABEL_94;
        }
        boolean flag;
        PackageInfo packageinfo = context.getPackageManager().getPackageInfo("com.android.settings", 64);
        PackageInfo packageinfo1 = context.getPackageManager().getPackageInfo(apkInfo.packageName, 64);
        flag = packageinfo.signatures[0].equals(packageinfo1.signatures[0]);
        if (flag)
        {
            return 1;
        }
        break MISSING_BLOCK_LABEL_94;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        Object obj = new Intent("android.intent.action.MAIN", null);
        ((Intent) (obj)).addCategory("android.intent.category.HOME");
        if (apkInfo.queryActivityForIntent(((Intent) (obj))) != null)
        {
            obj = context.getPackageManager().queryIntentActivities(((Intent) (obj)), 0x10000);
            if (obj != null && ((List) (obj)).size() == 1)
            {
                return 2;
            }
        }
        context = ((InputMethodManager)context.getSystemService("input_method")).getEnabledInputMethodList();
        if (context != null && context.size() == 1)
        {
            context = (InputMethodInfo)context.get(0);
            if (apkInfo.packageName.equals(context.getPackageName()))
            {
                return 3;
            }
        }
        return 0;
    }

    public FileInfo clone()
    {
        FileInfo fileinfo;
        try
        {
            fileinfo = (FileInfo)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return null;
        }
        return fileinfo;
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof FileInfo))
        {
            obj = (FileInfo)obj;
            if (((FileInfo) (obj)).level == level)
            {
                return ((FileInfo) (obj)).filePath.equals(filePath);
            }
        }
        return false;
    }

    public byte[] extIniToBytes()
    {
        if (extIniInfo == null)
        {
            return null;
        }
        byte abyte0[];
        try
        {
            abyte0 = extIniInfo.N();
        }
        catch (Exception exception)
        {
            return null;
        }
        return abyte0;
    }

    public String getCloudConfig(String s, String s1, String s2)
    {
        s = getExIniValue(s, s1);
        if (s == b.a)
        {
            return s2;
        } else
        {
            return s.c();
        }
    }

    public b getExIniValue(String s, String s1)
    {
        if (extIniInfo == null || s1 == null)
        {
            return b.a;
        }
        if (s != null) goto _L2; else goto _L1
_L1:
        s = extIniInfo.d().iterator();
_L6:
        if (s.hasNext()) goto _L4; else goto _L3
_L3:
        return b.a;
_L4:
        Object obj = (j)s.next();
        if (!s1.equals(((j) (obj)).c())) goto _L6; else goto _L5
_L5:
        return ((j) (obj)).d();
_L2:
        obj = extIniInfo.c().iterator();
_L9:
        if (!((Iterator) (obj)).hasNext()) goto _L3; else goto _L7
_L7:
        j j1;
        Object obj1 = (i)((Iterator) (obj)).next();
        if (!s.equals(((i) (obj1)).c()))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = ((i) (obj1)).d().iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            j1 = (j)((Iterator) (obj1)).next();
        } while (!s1.equals(j1.c()));
        break; /* Loop/switch isn't completed */
        if (true) goto _L9; else goto _L8
_L8:
        return j1.d();
    }

    public byte[] getFileSha1()
    {
        if (c == null)
        {
            c = HashUtil.getFileHash("SHA1", new File(filePath));
        }
        return c;
    }

    public long getFileSize()
    {
        if (b == 0L && filePath != null)
        {
            b = (new File(filePath)).length();
        }
        return b;
    }

    public int hashCode()
    {
        int k = 13;
        if (filePath != null)
        {
            k = filePath.hashCode() + 221;
        }
        int l = k;
        if (apkInfo != null)
        {
            l = k * 31 + apkInfo.hashCode();
        }
        return l;
    }

    public String toString()
    {
        if (apkInfo != null)
        {
            return (new StringBuilder(String.valueOf(apkInfo.toString()))).append("|").append(level).append("|").append(whiteFlags).toString();
        } else
        {
            return (new StringBuilder(String.valueOf(filePath))).append("|").append(level).append("|").append(whiteFlags).toString();
        }
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        parcel.writeInt(fileType);
        parcel.writeString(filePath);
        parcel.writeParcelable(apkInfo, 1);
        parcel.writeInt(fromPid);
        parcel.writeInt(level);
        parcel.writeLong(behavior);
        parcel.writeLong(b);
        if (c == null)
        {
            parcel.writeInt(0);
        } else
        {
            parcel.writeInt(c.length);
            parcel.writeByteArray(c);
        }
        parcel.writeString(trojanName);
        parcel.writeString(category);
        parcel.writeString(fileDescription);
        parcel.writeString(softDescription);
        if (shouldUpload)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        parcel.writeByte((byte)k);
        if (extIniInfo == null)
        {
            parcel.writeInt(0);
        } else
        {
            byte abyte0[] = extIniToBytes();
            parcel.writeInt(abyte0.length);
            parcel.writeByteArray(abyte0);
        }
        parcel.writeLong(queryFlags);
        parcel.writeParcelable(adPluginInfo, 1);
        if (hipsActionRevise == null || hipsActionRevise.length == 0)
        {
            parcel.writeInt(0);
        } else
        {
            parcel.writeInt(hipsActionRevise.length);
            parcel.writeTypedArray(hipsActionRevise, 1);
        }
        parcel.writeInt(whiteFlags);
        parcel.writeInt(queryFrom);
    }

}
