// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class cxv
    implements cxu
{

    private final Map a = new HashMap();
    private final SparseArray b = new SparseArray();

    protected cxv()
    {
    }

    private static void a(Class class1, String s, Map map)
    {
        Field afield[] = class1.getFields();
        int i = 0;
_L1:
        if (i >= afield.length)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        Object obj = afield[i];
        String s1;
        int j;
        if (!Modifier.isStatic(((Field) (obj)).getModifiers()) || ((Field) (obj)).getType() != Integer.TYPE)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        s1 = ((Field) (obj)).getName();
        j = ((Field) (obj)).getInt(null);
        obj = s1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        obj = (new StringBuilder()).append(s).append(":").append(s1).toString();
        map.put(obj, Integer.valueOf(j));
        i++;
          goto _L1
        s;
        Log.e("MixpanelAPI.RsrcReader", (new StringBuilder("Can't read built-in id names from ")).append(class1.getName()).toString(), s);
    }

    protected abstract Class a();

    public final String a(int i)
    {
        return (String)b.get(i);
    }

    public final boolean a(String s)
    {
        return a.containsKey(s);
    }

    public final int b(String s)
    {
        return ((Integer)a.get(s)).intValue();
    }

    protected abstract String b();

    protected final void c()
    {
        a.clear();
        b.clear();
        a(a(), "android", a);
        Object obj = b();
        java.util.Map.Entry entry;
        try
        {
            a(Class.forName(((String) (obj))), null, a);
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            Log.w("MixpanelAPI.RsrcReader", (new StringBuilder("Can't load names for Android view ids from '")).append(((String) (obj))).append("', ids by name will not be available in the events editor.").toString());
            Log.i("MixpanelAPI.RsrcReader", "You may be missing a Resources class for your package due to your proguard configuration, or you may be using an applicationId in your build that isn't the same as the package declared in your AndroidManifest.xml file.\nIf you're using proguard, you can fix this issue by adding the following to your proguard configuration:\n\n-keep class **.R$* {\n    <fields>;\n}\n\nIf you're not using proguard, or if your proguard configuration already contains the directive above, you can add the following to your AndroidManifest.xml file to explicitly point the Mixpanel library to the appropriate library for your resources class:\n\n<meta-data android:name=\"com.mixpanel.android.MPConfig.ResourcePackageName\" android:value=\"YOUR_PACKAGE_NAME\" />\n\nwhere YOUR_PACKAGE_NAME is the same string you use for the \"package\" attribute in your <manifest> tag.");
        }
        for (obj = a.entrySet().iterator(); ((Iterator) (obj)).hasNext(); b.put(((Integer)entry.getValue()).intValue(), entry.getKey()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        }

    }
}
