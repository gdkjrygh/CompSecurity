// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class com.qihoo.security.ui.a.a
{
    private static class a
        implements Comparator
    {

        private final PackageManager a;
        private final Collator b = Collator.getInstance();

        public final int a(PermissionInfo permissioninfo, PermissionInfo permissioninfo1)
        {
            permissioninfo = permissioninfo.loadLabel(a);
            permissioninfo1 = permissioninfo1.loadLabel(a);
            return b.compare(permissioninfo, permissioninfo1);
        }

        public int compare(Object obj, Object obj1)
        {
            return a((PermissionInfo)obj, (PermissionInfo)obj1);
        }

        a(PackageManager packagemanager)
        {
            a = packagemanager;
        }
    }

    private static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        private static final b e[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/qihoo/security/ui/a/a$b, s);
        }

        public static b[] values()
        {
            return (b[])e.clone();
        }

        static 
        {
            a = new b("NO_PERMS", 0);
            b = new b("DANGEROUS_ONLY", 1);
            c = new b("NORMAL_ONLY", 2);
            d = new b("BOTH", 3);
            e = (new b[] {
                a, b, c, d
            });
        }

        private b(String s, int i1)
        {
            super(s, i1);
        }
    }


    private final boolean a;
    private Context b;
    private LayoutInflater c;
    private PackageManager d;
    private LinearLayout e;
    private Map f;
    private Map g;
    private List h;
    private String i;
    private final String j;
    private String k;
    private b l;
    private LinearLayout m;
    private LinearLayout n;
    private HashMap o;
    private View p;
    private final d q;

    public com.qihoo.security.ui.a.a(Context context, android.content.pm.PackageParser.Package package1)
    {
        a = false;
        j = "DefaultGrp";
        q = com.qihoo.security.locale.d.a();
        b = context;
        d = b.getPackageManager();
        h = new ArrayList();
        context = new HashSet();
        if (package1 != null)
        {
            if (package1.requestedPermissions != null)
            {
                ArrayList arraylist = package1.requestedPermissions;
                int i1 = arraylist.size();
                if (i1 > 0)
                {
                    a((String[])arraylist.toArray(new String[i1]), context);
                }
            }
            if (package1.mSharedUserId != null)
            {
                try
                {
                    a(d.getUidForSharedUser(package1.mSharedUserId), context);
                }
                catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
                {
                    Log.w("AppSecurityPermissions", (new StringBuilder()).append("Could'nt retrieve shared user id for:").append(package1.packageName).toString());
                }
            }
            context = context.iterator();
            while (context.hasNext()) 
            {
                package1 = (PermissionInfo)context.next();
                h.add(package1);
            }
        }
    }

    public com.qihoo.security.ui.a.a(Context context, String s)
    {
        a = false;
        j = "DefaultGrp";
        q = com.qihoo.security.locale.d.a();
        b = context;
        d = b.getPackageManager();
        h = new ArrayList();
        context = new HashSet();
        PackageInfo packageinfo = d.getPackageInfo(s, 4096);
        if (packageinfo.applicationInfo != null && packageinfo.applicationInfo.uid != -1)
        {
            a(packageinfo.applicationInfo.uid, context);
        }
        for (context = context.iterator(); context.hasNext(); h.add(s))
        {
            s = (PermissionInfo)context.next();
        }

        break MISSING_BLOCK_LABEL_165;
        context;
        Log.w("AppSecurityPermissions", (new StringBuilder()).append("Could'nt retrieve permissions for package:").append(s).toString());
    }

    private static View a(Context context, LayoutInflater layoutinflater, CharSequence charsequence, CharSequence charsequence1, boolean flag)
    {
        context = layoutinflater.inflate(0x7f03002c, null);
        layoutinflater = (LocaleTextView)context.findViewById(0x7f0b0095);
        LocaleTextView localetextview = (LocaleTextView)context.findViewById(0x7f0b0096);
        if (charsequence != null)
        {
            layoutinflater.setLocalText(charsequence);
            localetextview.setLocalText(charsequence1);
            return context;
        } else
        {
            layoutinflater.setLocalText(charsequence1);
            localetextview.setVisibility(8);
            return context;
        }
    }

    private View a(CharSequence charsequence, CharSequence charsequence1, boolean flag)
    {
        return a(b, c, charsequence, charsequence1, flag);
    }

    private String a(String s)
    {
        String s1;
        if (s == null || s.length() == 0)
        {
            s1 = null;
        } else
        {
            int i1 = s.length();
            s1 = s;
            if (s.charAt(i1 - 1) == '.')
            {
                return s.substring(0, i1 - 1);
            }
        }
        return s1;
    }

    private String a(String s, CharSequence charsequence)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        if (charsequence != null) goto _L4; else goto _L3
_L3:
        s = null;
_L6:
        return s;
_L4:
        return charsequence.toString();
_L2:
        String s1 = a(s);
        s = s1;
        if (charsequence != null)
        {
            return String.format(k, new Object[] {
                s1, charsequence.toString()
            });
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(int i1, Set set)
    {
        String as[] = d.getPackagesForUid(i1);
        if (as != null && as.length != 0)
        {
            int j1 = as.length;
            i1 = 0;
            while (i1 < j1) 
            {
                a(as[i1], set);
                i1++;
            }
        }
    }

    private void a(String s, Set set)
    {
        PackageInfo packageinfo;
        try
        {
            packageinfo = d.getPackageInfo(s, 4096);
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            Log.w("AppSecurityPermissions", (new StringBuilder()).append("Could'nt retrieve permissions for package:").append(s).toString());
            return;
        }
        if (packageinfo != null && packageinfo.requestedPermissions != null)
        {
            a(packageinfo.requestedPermissions, set);
        }
    }

    private void a(List list)
    {
        o = new HashMap();
        o.put("DefaultGrp", i);
        f = new HashMap();
        g = new HashMap();
        HashMap hashmap = new HashMap();
        HashMap hashmap1 = new HashMap();
        a a1 = new a(d);
        if (list != null)
        {
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                PermissionInfo permissioninfo = (PermissionInfo)iterator.next();
                if (a(permissioninfo))
                {
                    String s;
                    Object obj;
                    if (permissioninfo.protectionLevel == 1)
                    {
                        list = hashmap;
                    } else
                    {
                        list = hashmap1;
                    }
                    if (permissioninfo.group == null)
                    {
                        s = "DefaultGrp";
                    } else
                    {
                        s = permissioninfo.group;
                    }
                    obj = (List)list.get(s);
                    if (obj == null)
                    {
                        obj = new ArrayList();
                        list.put(s, obj);
                        ((List) (obj)).add(permissioninfo);
                    } else
                    {
                        int i1 = Collections.binarySearch(((List) (obj)), permissioninfo, a1);
                        if (i1 < 0)
                        {
                            ((List) (obj)).add(-i1 - 1, permissioninfo);
                        }
                    }
                }
            } while (true);
            a(((Map) (hashmap)), f);
            a(((Map) (hashmap1)), g);
        }
        l = b.a;
        if (f.size() <= 0) goto _L2; else goto _L1
_L1:
        if (g.size() > 0)
        {
            list = com.qihoo.security.ui.a.b.d;
        } else
        {
            list = b.b;
        }
        l = list;
_L4:
        d();
        return;
_L2:
        if (g.size() > 0)
        {
            l = b.c;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(Map map, Map map1)
    {
        if (map != null && map1 != null)
        {
            Iterator iterator = map.keySet().iterator();
            while (iterator.hasNext()) 
            {
                String s = null;
                String s1 = (String)iterator.next();
                Object obj = (List)map.get(s1);
                if (obj != null)
                {
                    for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
                    {
                        s = a(s, ((PermissionInfo)((Iterator) (obj)).next()).loadLabel(d));
                    }

                    if (s != null)
                    {
                        map1.put(s1, s.toString());
                    }
                }
            }
        }
    }

    private void a(boolean flag)
    {
        Map map;
        LinearLayout linearlayout;
        if (flag)
        {
            map = f;
        } else
        {
            map = g;
        }
        if (flag)
        {
            linearlayout = n;
        } else
        {
            linearlayout = m;
        }
        linearlayout.removeAllViews();
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); linearlayout.addView(a(b(s), (CharSequence)map.get(s), flag)))
        {
            s = (String)iterator.next();
        }

    }

    private void a(String as[], Set set)
    {
        int i1 = 0;
        if (as != null && as.length != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j1 = as.length;
_L4:
        String s;
        if (i1 >= j1)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = as[i1];
        PermissionInfo permissioninfo = d.getPermissionInfo(s, 0);
        if (permissioninfo != null)
        {
            try
            {
                set.add(permissioninfo);
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                Log.i("AppSecurityPermissions", (new StringBuilder()).append("Ignoring unknown permission:").append(s).toString());
            }
        }
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
    }

    private boolean a(PermissionInfo permissioninfo)
    {
        return permissioninfo.protectionLevel == 1 || permissioninfo.protectionLevel == 0;
    }

    private CharSequence b(String s)
    {
        Object obj;
        if (s == null)
        {
            obj = i;
        } else
        {
            CharSequence charsequence = (CharSequence)o.get(s);
            obj = charsequence;
            if (charsequence == null)
            {
                Object obj1;
                try
                {
                    obj1 = d.getPermissionGroupInfo(s, 0);
                }
                catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
                {
                    Log.i("AppSecurityPermissions", (new StringBuilder()).append("Invalid group name:").append(s).toString());
                    return null;
                }
                obj1 = ((PermissionGroupInfo) (obj1)).loadLabel(d).toString();
                o.put(s, obj1);
                return ((CharSequence) (obj1));
            }
        }
        return ((CharSequence) (obj));
    }

    private void c()
    {
        p.setVisibility(0);
    }

    private void d()
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[b.values().length];
                try
                {
                    a[b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[b.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.qihoo.security.ui.a.b.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[l.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            c();
            return;

        case 2: // '\002'
            a(true);
            return;

        case 3: // '\003'
            a(false);
            return;

        case 4: // '\004'
            a(true);
            break;
        }
        a(false);
        m.setVisibility(0);
    }

    public int a()
    {
        return h.size();
    }

    public View b()
    {
        c = LayoutInflater.from(b);
        e = (LinearLayout)c.inflate(0x7f03002d, null);
        n = (LinearLayout)e.findViewById(0x7f0b0098);
        m = (LinearLayout)e.findViewById(0x7f0b0099);
        p = e.findViewById(0x7f0b0097);
        i = q.a(0x7f0c00f7);
        k = q.a(0x7f0c00f6);
        a(h);
        return e;
    }
}
