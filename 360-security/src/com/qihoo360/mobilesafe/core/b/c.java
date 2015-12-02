// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core.b;

import android.accounts.AccountManager;
import android.accounts.AuthenticatorDescription;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.text.TextUtils;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.a.a;
import com.qihoo360.mobilesafe.core.d.b;
import com.qihoo360.mobilesafe.service.ProcessInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c
{

    public static final String a = com/qihoo360/mobilesafe/core/b/c.getSimpleName();
    private String b;
    private String c;
    private String d;
    private HashSet e;
    private HashSet f;
    private String g;
    private String h;
    private HashSet i;
    private String j;
    private String k;
    private List l;
    private Context m;
    private PackageManager n;
    private AudioManager o;
    private AccountManager p;
    private BluetoothAdapter q;
    private long r;
    private long s;
    private boolean t;
    private b u;

    public c(Context context)
    {
        b = "";
        c = "";
        d = "";
        t = false;
        m = context;
        n = m.getPackageManager();
        o = (AudioManager)m.getSystemService("audio");
        p = AccountManager.get(m);
        try
        {
            q = BluetoothAdapter.getDefaultAdapter();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    private Boolean a(String s1, String s2)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!TextUtils.isEmpty(s1))
        {
            flag = flag1;
            if (!TextUtils.isEmpty(s2))
            {
                flag = flag1;
                if (s2.startsWith(s1))
                {
                    flag = true;
                }
            }
        }
        return Boolean.valueOf(flag);
    }

    private void a()
    {
        if (!t)
        {
            l = i();
            t = true;
        }
    }

    private boolean a(ProcessInfo processinfo)
    {
        if (processinfo != null)
        {
            String s1 = processinfo.packageName;
            int i1 = processinfo.importance;
            boolean flag = processinfo.isSystem;
            if (!TextUtils.isEmpty(s1))
            {
                if (b(s1, d))
                {
                    return true;
                }
                if (b(s1))
                {
                    return true;
                }
                if (c(s1))
                {
                    return true;
                }
                if (b(s1, i1))
                {
                    return true;
                }
                if (a(s1))
                {
                    return true;
                }
                if (a(s1, g).booleanValue())
                {
                    return true;
                }
                if (a(s1, l))
                {
                    return true;
                }
                if (e(s1))
                {
                    return true;
                }
                if (f(s1))
                {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(String s1)
    {
        if (!TextUtils.isEmpty(s1) && f != null && !f.isEmpty()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (TextUtils.isEmpty(b))
        {
            if (f.contains(s1))
            {
                return true;
            }
        } else
        if (b.equals(s1))
        {
            return true;
        }
        PackageInfo packageinfo;
        boolean flag;
        try
        {
            packageinfo = n.getPackageInfo(s1, 0);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return false;
        }
        if (packageinfo == null) goto _L1; else goto _L3
_L3:
        flag = c(s1, packageinfo.sharedUserId);
        return flag;
    }

    private boolean a(String s1, int i1)
    {
        boolean flag = false;
        if (i1 < 300)
        {
            flag = true;
        }
        return flag;
    }

    private boolean a(String s1, HashSet hashset)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (hashset != null)
        {
            flag = flag1;
            if (!hashset.isEmpty())
            {
                flag = flag1;
                if (!TextUtils.isEmpty(s1))
                {
                    flag = hashset.contains(s1);
                }
            }
        }
        return flag;
    }

    private boolean a(String s1, List list)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!TextUtils.isEmpty(s1))
        {
            flag = flag1;
            if (list != null)
            {
                flag = flag1;
                if (!list.isEmpty())
                {
                    flag = flag1;
                    if (list.contains(s1))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    private void b()
    {
        a();
        long l1 = System.currentTimeMillis();
        if (Math.abs(l1 - r) > 60000L)
        {
            r = l1;
            h();
            f();
            e = k();
            f = e();
            d = j();
            g = g();
            i = c();
        }
        l1 = System.currentTimeMillis();
        if (Math.abs(l1 - s) > 5000L)
        {
            s = l1;
            d();
        }
    }

    private boolean b(ProcessInfo processinfo)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (processinfo != null)
        {
            flag = flag1;
            if (processinfo.isSystem)
            {
                flag = true;
            }
        }
        return flag;
    }

    private boolean b(String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            if (Pattern.compile(".*((alarm)|(clock)).*").matcher(s1 = s1.toLowerCase(Locale.US)).matches())
            {
                return true;
            }
        }
        return false;
    }

    private boolean b(String s1, int i1)
    {
        boolean flag = true;
        if (!TextUtils.isEmpty(s1) && o != null) goto _L2; else goto _L1
_L1:
        flag = false;
_L6:
        return flag;
_L2:
        HashSet hashset = e;
        if (!o.isMusicActive() || hashset == null || hashset.isEmpty() || !hashset.contains(s1))
        {
            break; /* Loop/switch isn't completed */
        }
        if (android.os.Build.VERSION.SDK_INT < 21) goto _L4; else goto _L3
_L3:
        if (i1 <= 200) goto _L6; else goto _L5
_L5:
        return false;
_L4:
        if (i1 <= 130)
        {
            return true;
        }
        if (true) goto _L5; else goto _L7
_L7:
    }

    private boolean b(String s1, String s2)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!TextUtils.isEmpty(s1))
        {
            flag = flag1;
            if (!TextUtils.isEmpty(s2))
            {
                flag = s1.equals(s2);
            }
        }
        return flag;
    }

    private HashSet c()
    {
        HashSet hashset = null;
        if (p != null) goto _L2; else goto _L1
_L1:
        Object obj = hashset;
_L4:
        return ((HashSet) (obj));
_L2:
        obj = hashset;
        if (p == null) goto _L4; else goto _L3
_L3:
        AuthenticatorDescription aauthenticatordescription[];
        aauthenticatordescription = p.getAuthenticatorTypes();
        obj = hashset;
        if (aauthenticatordescription == null) goto _L4; else goto _L5
_L5:
        obj = hashset;
        if (aauthenticatordescription.length <= 0) goto _L4; else goto _L6
_L6:
        int i1;
        int j1;
        hashset = new HashSet();
        j1 = aauthenticatordescription.length;
        i1 = 0;
_L8:
        obj = hashset;
        if (i1 >= j1) goto _L4; else goto _L7
_L7:
        obj = aauthenticatordescription[i1];
        if (obj == null || TextUtils.isEmpty(((AuthenticatorDescription) (obj)).packageName) || TextUtils.isEmpty(((AuthenticatorDescription) (obj)).type))
        {
            break MISSING_BLOCK_LABEL_129;
        }
        android.accounts.Account aaccount[] = p.getAccountsByType(((AuthenticatorDescription) (obj)).type);
        if (aaccount != null)
        {
            try
            {
                if (aaccount.length > 0)
                {
                    hashset.add(((AuthenticatorDescription) (obj)).packageName);
                }
            }
            catch (Exception exception) { }
        }
        i1++;
          goto _L8
    }

    private boolean c(ProcessInfo processinfo)
    {
        if (processinfo != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        String s1;
        int i1;
        s1 = processinfo.packageName;
        i1 = processinfo.importance;
        processinfo.category;
        JVM INSTR lookupswitch 6: default 80
    //                   0: 4
    //                   100: 82
    //                   101: 105
    //                   102: 116
    //                   103: 84
    //                   104: 95;
           goto _L3 _L1 _L4 _L5 _L6 _L7 _L8
_L6:
        continue; /* Loop/switch isn't completed */
_L3:
        return false;
_L4:
        return true;
_L7:
        if (!a(s1, i1)) goto _L1; else goto _L9
_L9:
        return true;
_L8:
        if (!d(s1)) goto _L1; else goto _L10
_L10:
        return true;
_L5:
        if (!c(s1, i1)) goto _L1; else goto _L11
_L11:
        return true;
        if (!a(s1, i)) goto _L1; else goto _L12
_L12:
        return true;
    }

    private boolean c(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return false;
        }
        boolean flag;
        if (!d(s1))
        {
            break MISSING_BLOCK_LABEL_46;
        }
        s1 = s1.toLowerCase(Locale.US);
        flag = Pattern.compile(".*(bluetooth).*").matcher(s1).matches();
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_46;
        s1;
        return false;
    }

    private boolean c(String s1, int i1)
    {
        boolean flag = true;
        if (!TextUtils.isEmpty(s1) && o != null) goto _L2; else goto _L1
_L1:
        flag = false;
_L6:
        return flag;
_L2:
        if (!o.isMusicActive())
        {
            break; /* Loop/switch isn't completed */
        }
        if (android.os.Build.VERSION.SDK_INT < 21) goto _L4; else goto _L3
_L3:
        if (i1 <= 200) goto _L6; else goto _L5
_L5:
        return false;
_L4:
        if (i1 <= 130)
        {
            return true;
        }
        if (true) goto _L5; else goto _L7
_L7:
    }

    private boolean c(String s1, String s2)
    {
        while (TextUtils.isEmpty(c) || TextUtils.isEmpty(s2) || !c.equals(s2)) 
        {
            return false;
        }
        return true;
    }

    private void d()
    {
        if (u == null)
        {
            u = new b(m);
        }
        h = u.a();
    }

    private boolean d(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return false;
        }
        boolean flag;
        if (q == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        flag = q.isEnabled();
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_31;
        s1;
        return false;
    }

    private final HashSet e()
    {
        Object obj;
        HashSet hashset;
        Utils.getHomeLauncherPackages(m);
        obj = new Intent("android.intent.action.MAIN");
        ((Intent) (obj)).addCategory("android.intent.category.HOME");
        try
        {
            obj = n.queryIntentActivities(((Intent) (obj)), 0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = new ArrayList(1);
        }
        hashset = new HashSet();
        if (obj == null || ((List) (obj)).size() <= 0) goto _L2; else goto _L1
_L1:
        obj = ((List) (obj)).iterator();
_L5:
        if (((Iterator) (obj)).hasNext()) goto _L3; else goto _L2
_L2:
        return hashset;
_L3:
        Object obj1 = (ResolveInfo)((Iterator) (obj)).next();
        try
        {
            obj1 = ((ResolveInfo) (obj1)).activityInfo.applicationInfo.packageName;
            if (!"com.lbe.security".equals(b))
            {
                hashset.add(obj1);
            }
        }
        catch (Exception exception) { }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private boolean e(String s1)
    {
        while (!TextUtils.isEmpty(s1) && (b(s1, j) || b(s1, k))) 
        {
            return true;
        }
        return false;
    }

    private void f()
    {
        Object obj3 = null;
        Object obj1;
        ArrayList arraylist = new ArrayList();
        obj1 = new ArrayList();
        n.getPreferredActivities(arraylist, ((List) (obj1)), null);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_491;
        }
        Object obj;
        if (((List) (obj1)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_491;
        }
        obj = new HashSet();
        obj1 = ((List) (obj1)).iterator();
_L19:
        boolean flag = ((Iterator) (obj1)).hasNext();
        if (flag) goto _L2; else goto _L1
_L1:
        Object obj2;
        obj1 = new Intent("android.intent.action.VIEW");
        ((Intent) (obj1)).setData(Uri.parse("sms:"));
        obj2 = n.queryIntentActivities(((Intent) (obj1)), 0x10000);
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        if (((List) (obj2)).isEmpty()) goto _L4; else goto _L5
_L5:
        obj1 = new HashSet();
        obj2 = ((List) (obj2)).iterator();
_L20:
        flag = ((Iterator) (obj2)).hasNext();
        if (flag) goto _L7; else goto _L6
_L6:
        List list;
        obj2 = new Intent("android.intent.action.VIEW");
        ((Intent) (obj2)).setData(Uri.parse("tel:"));
        list = n.queryIntentActivities(((Intent) (obj2)), 0x10000);
        obj2 = obj3;
        if (list == null) goto _L9; else goto _L8
_L8:
        obj2 = obj3;
        if (list.isEmpty()) goto _L9; else goto _L10
_L10:
        obj2 = new HashSet();
        obj3 = list.iterator();
_L21:
        flag = ((Iterator) (obj3)).hasNext();
        if (flag) goto _L11; else goto _L9
_L9:
        if (obj == null || ((HashSet) (obj)).isEmpty()) goto _L13; else goto _L12
_L12:
        if (obj1 == null || ((HashSet) (obj1)).isEmpty()) goto _L15; else goto _L14
_L14:
        obj1 = ((HashSet) (obj1)).iterator();
_L23:
        if (((Iterator) (obj1)).hasNext()) goto _L16; else goto _L15
_L15:
        if (obj2 == null || ((HashSet) (obj2)).isEmpty()) goto _L13; else goto _L17
_L17:
        obj1 = ((HashSet) (obj2)).iterator();
_L25:
        if (((Iterator) (obj1)).hasNext()) goto _L18; else goto _L13
_L13:
        return;
_L2:
        obj2 = ((ComponentName)((Iterator) (obj1)).next()).getPackageName();
        if (!TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            ((HashSet) (obj)).add(obj2);
        }
          goto _L19
        obj1;
          goto _L1
_L7:
        String s1 = ((ResolveInfo)((Iterator) (obj2)).next()).activityInfo.applicationInfo.packageName;
        if (!TextUtils.isEmpty(s1))
        {
            ((HashSet) (obj1)).add(s1);
        }
          goto _L20
        obj2;
          goto _L6
_L11:
        String s2 = ((ResolveInfo)((Iterator) (obj3)).next()).activityInfo.applicationInfo.packageName;
        if (!TextUtils.isEmpty(s2))
        {
            ((HashSet) (obj2)).add(s2);
        }
          goto _L21
        obj3;
          goto _L9
_L16:
        obj3 = (String)((Iterator) (obj1)).next();
        if (!((HashSet) (obj)).contains(obj3)) goto _L23; else goto _L22
_L22:
        j = ((String) (obj3));
          goto _L15
_L18:
        obj2 = (String)((Iterator) (obj1)).next();
        if (!((HashSet) (obj)).contains(obj2)) goto _L25; else goto _L24
_L24:
        k = ((String) (obj2));
        return;
        Exception exception;
        exception;
        exception = ((Exception) (obj3));
          goto _L9
        obj1;
        obj1 = null;
          goto _L6
        obj;
        obj = null;
          goto _L1
_L4:
        obj1 = null;
          goto _L6
        obj = null;
          goto _L1
    }

    private boolean f(String s1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!TextUtils.isEmpty(s1))
        {
            flag = flag1;
            if (b(s1, h))
            {
                flag = true;
            }
        }
        return flag;
    }

    private String g()
    {
        if (m == null)
        {
            return null;
        } else
        {
            return android.provider.Settings.Secure.getString(m.getContentResolver(), "default_input_method");
        }
    }

    private void h()
    {
        Object obj;
        obj = new Intent("android.intent.action.MAIN");
        ((Intent) (obj)).addCategory("android.intent.category.HOME");
        obj = n.resolveActivity(((Intent) (obj)), 0x10000);
        if (((ResolveInfo) (obj)).activityInfo == null || TextUtils.isEmpty(((ResolveInfo) (obj)).activityInfo.packageName) || "android".equals(((ResolveInfo) (obj)).activityInfo.packageName) || "com.lbe.security".equals(((ResolveInfo) (obj)).activityInfo.packageName))
        {
            b = "";
            c = "";
            return;
        }
        try
        {
            b = ((ResolveInfo) (obj)).activityInfo.packageName;
            c = com.qihoo360.mobilesafe.a.a.b(b, n);
            return;
        }
        catch (Exception exception)
        {
            b = "";
        }
        c = "";
        return;
    }

    private List i()
    {
        return Utils.openConfigFileDescrypt(m, "lock_screen.dat", "com.qihoo.security.lite");
    }

    private String j()
    {
        String s2 = "";
        String s1;
        Object obj;
        try
        {
            obj = WallpaperManager.getInstance(m);
        }
        catch (Exception exception)
        {
            return "";
        }
        s1 = s2;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        obj = ((WallpaperManager) (obj)).getWallpaperInfo();
        s1 = s2;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        s1 = ((WallpaperInfo) (obj)).getPackageName();
        return s1;
    }

    private HashSet k()
    {
        HashSet hashset;
        Object obj;
        if (n == null)
        {
            return null;
        }
        hashset = new HashSet();
        obj = new Intent("android.intent.action.MEDIA_BUTTON");
        obj = n.queryBroadcastReceivers(((Intent) (obj)), 0);
        if (obj == null || ((List) (obj)).size() <= 0) goto _L2; else goto _L1
_L1:
        obj = ((List) (obj)).iterator();
_L5:
        if (((Iterator) (obj)).hasNext()) goto _L3; else goto _L2
_L2:
        return hashset;
_L3:
        ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj)).next();
        if (resolveinfo != null && !TextUtils.isEmpty(resolveinfo.activityInfo.packageName))
        {
            hashset.add(resolveinfo.activityInfo.packageName);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public List a(List list)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        b();
        arraylist1 = null;
        arraylist = arraylist1;
        if (list == null) goto _L2; else goto _L1
_L1:
        arraylist = arraylist1;
        if (list.isEmpty()) goto _L2; else goto _L3
_L3:
        ArrayList arraylist2;
        ArrayList arraylist3;
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        arraylist2 = new ArrayList();
        arraylist3 = new ArrayList();
        list = list.iterator();
_L7:
        if (list.hasNext()) goto _L5; else goto _L4
_L4:
        arraylist.add(arraylist1);
        arraylist.add(arraylist2);
        arraylist.add(arraylist3);
_L2:
        return arraylist;
_L5:
        ProcessInfo processinfo = (ProcessInfo)list.next();
        if (a(processinfo))
        {
            if (b(processinfo))
            {
                arraylist3.add(processinfo);
            } else
            {
                arraylist2.add(processinfo);
            }
        } else
        {
            arraylist1.add(processinfo);
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public List b(List list)
    {
        b();
        if (list == null || list.isEmpty())
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        ArrayList arraylist3 = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                arraylist.add(arraylist2);
                arraylist.add(arraylist1);
                arraylist.add(arraylist3);
                return arraylist;
            }
            ProcessInfo processinfo = (ProcessInfo)list.next();
            if (c(processinfo))
            {
                if (b(processinfo))
                {
                    arraylist3.add(processinfo);
                } else
                {
                    arraylist1.add(processinfo);
                }
            } else
            {
                arraylist2.add(processinfo);
            }
        } while (true);
    }

}
