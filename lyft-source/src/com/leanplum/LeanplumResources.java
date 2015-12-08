// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.leanplum:
//            FileManager, Var, aU, an, 
//            am, aI

public class LeanplumResources extends Resources
{

    public LeanplumResources(Resources resources)
    {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
    }

    final Var a(int i)
    {
        Object obj5;
        Object obj6;
        obj5 = getResourceEntryName(i);
        obj6 = getResourceTypeName(i);
        if (FileManager.a == null)
        {
            return null;
        }
        HashMap hashmap;
        Object obj7;
        obj7 = (HashMap)FileManager.a.objectForKeyPath(new Object[0]);
        hashmap = new HashMap();
        Object obj4 = aU.a;
        obj4;
        JVM INSTR monitorenter ;
        Object obj8 = ((HashMap) (obj7)).keySet().iterator();
_L12:
        if (((Iterator) (obj8)).hasNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        obj1 = new HashMap();
        obj = hashmap.keySet().iterator();
_L17:
        if (((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        Object obj2;
        Object obj3;
        obj3 = getConfiguration();
        obj2 = getDisplayMetrics();
        obj = new HashSet();
        obj4 = hashmap.keySet().iterator();
_L18:
        if (((Iterator) (obj4)).hasNext()) goto _L6; else goto _L5
_L5:
        int j;
        obj3 = an.values();
        j = obj3.length;
        i = 0;
_L21:
        if (i < j) goto _L8; else goto _L7
_L7:
        obj = hashmap.keySet().iterator();
        if (!((Iterator) (obj)).hasNext()) goto _L10; else goto _L9
_L9:
        obj = (String)((Iterator) (obj)).next();
        obj = aU.b((new StringBuilder("__Android Resources.")).append(((String) (obj))).append(".").append((String)hashmap.get(obj)).toString());
        return ((Var) (obj));
_L2:
        String s = (String)((Iterator) (obj8)).next();
        if (!s.toLowerCase().startsWith(((String) (obj6)))) goto _L12; else goto _L11
_L11:
        Iterator iterator = ((HashMap)((HashMap) (obj7)).get(s)).keySet().iterator();
        obj = null;
_L16:
        if (iterator.hasNext()) goto _L14; else goto _L13
_L13:
        if (obj == null) goto _L12; else goto _L15
_L15:
        hashmap.put(s, obj);
          goto _L12
        obj;
        obj4;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        Log.e("Leanplum", "Error getting resource", ((Throwable) (obj)));
_L10:
        return null;
_L14:
        obj2 = (String)iterator.next();
        obj3 = ((String) (obj2)).replace("\\.", ".");
        i = ((String) (obj3)).lastIndexOf('.');
        obj1 = obj3;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_383;
        }
        obj1 = ((String) (obj3)).substring(0, i);
        boolean flag = ((String) (obj1)).equals(obj5);
        if (flag)
        {
            obj = obj2;
        }
          goto _L16
_L4:
        obj2 = (String)((Iterator) (obj)).next();
        ((Map) (obj1)).put(obj2, am.a(((String) (obj2))));
          goto _L17
_L6:
        obj5 = (String)((Iterator) (obj4)).next();
        obj6 = (am)((Map) (obj1)).get(obj5);
        obj7 = ((am) (obj6)).a.keySet().iterator();
        while (((Iterator) (obj7)).hasNext()) 
        {
            obj8 = (an)((Iterator) (obj7)).next();
            if (((an) (obj8)).a().a(((am) (obj6)).a.get(obj8), ((android.content.res.Configuration) (obj3))))
            {
                ((Set) (obj)).add(obj5);
            }
        }
          goto _L18
_L8:
        obj4 = obj3[i];
        obj5 = new HashMap();
        obj6 = ((Set) (obj)).iterator();
_L20:
        if (!((Iterator) (obj6)).hasNext())
        {
            obj4 = ((an) (obj4)).a().a(((Map) (obj5)), ((android.util.DisplayMetrics) (obj2)));
            if (!((Map) (obj4)).isEmpty())
            {
                obj = ((Map) (obj4)).keySet();
            }
            break MISSING_BLOCK_LABEL_657;
        }
        obj7 = (String)((Iterator) (obj6)).next();
        obj8 = ((am)((Map) (obj1)).get(obj7)).a.get(obj4);
        if (obj8 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((Map) (obj5)).put(obj7, obj8);
        if (true) goto _L20; else goto _L19
_L19:
        i++;
          goto _L21
    }

    public Drawable getDrawable(int i)
    {
        Object obj = a(i);
        if (obj == null) goto _L2; else goto _L1
_L1:
        int j = ((Var) (obj)).overrideResId();
        if (j == 0) goto _L4; else goto _L3
_L3:
        obj = super.getDrawable(j);
_L5:
        return ((Drawable) (obj));
_L4:
        Drawable drawable;
        if (((Var) (obj)).a.equals(((Var) (obj)).defaultValue()))
        {
            break; /* Loop/switch isn't completed */
        }
        drawable = Drawable.createFromStream(((Var) (obj)).stream(), ((Var) (obj)).fileValue());
        obj = drawable;
        if (drawable != null) goto _L5; else goto _L2
_L2:
        return super.getDrawable(i);
    }
}
