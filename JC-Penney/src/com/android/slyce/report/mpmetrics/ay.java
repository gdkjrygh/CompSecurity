// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            ax

public abstract class ay
    implements ax
{

    private final Context a;
    private final Map b = new HashMap();
    private final SparseArray c = new SparseArray();

    protected ay(Context context)
    {
        a = context;
    }

    private static void a(Class class1, String s, Map map)
    {
        Field afield[] = class1.getFields();
        int i = 0;
_L3:
        if (i >= afield.length)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        Field field = afield[i];
        String s1;
        int j;
        if (!Modifier.isStatic(field.getModifiers()) || field.getType() != Integer.TYPE)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        s1 = field.getName();
        j = field.getInt(null);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
_L1:
        try
        {
            map.put(s1, Integer.valueOf(j));
            break MISSING_BLOCK_LABEL_138;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("MixpanelAPI.ResourceReader", (new StringBuilder()).append("Can't read built-in id names from ").append(class1.getName()).toString(), s);
        }
        break MISSING_BLOCK_LABEL_137;
        s1 = (new StringBuilder()).append(s).append(":").append(s1).toString();
          goto _L1
        return;
        i++;
        if (true) goto _L3; else goto _L2
_L2:
    }

    protected abstract Class a();

    public String a(int i)
    {
        return (String)c.get(i);
    }

    protected abstract String a(Context context);

    public boolean a(String s)
    {
        return b.containsKey(s);
    }

    public int b(String s)
    {
        return ((Integer)b.get(s)).intValue();
    }

    protected void b()
    {
        b.clear();
        c.clear();
        a(a(), "android", b);
        Object obj = a(a);
        java.util.Map.Entry entry;
        try
        {
            a(Class.forName(((String) (obj))), null, b);
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            Log.w("MixpanelAPI.ResourceReader", (new StringBuilder()).append("Can't load names for Android view ids from '").append(((String) (obj))).append("', ids by name will not be available in the events editor.").toString());
            Log.i("MixpanelAPI.ResourceReader", "You may be missing a Resources class for your package due to your proguard configuration, or you may be using an applicationId in your build that isn't the same as the package declared in your AndroidManifest.xml file.\nIf you're using proguard, you can fix this issue by adding the following to your proguard configuration:\n\n-keep class **.R$* {\n    <fields>;\n}\n\nIf you're not using proguard, or if your proguard configuration already contains the directive above, you can add the following to your AndroidManifest.xml file to explicitly point the Mixpanel library to the appropriate library for your resources class:\n\n<meta-data android:name=\"com.mixpanel.android.MPConfig.ResourcePackageName\" android:value=\"YOUR_PACKAGE_NAME\" />\n\nwhere YOUR_PACKAGE_NAME is the same string you use for the \"package\" attribute in your <manifest> tag.");
        }
        for (obj = b.entrySet().iterator(); ((Iterator) (obj)).hasNext(); c.put(((Integer)entry.getValue()).intValue(), entry.getKey()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        }

    }
}
