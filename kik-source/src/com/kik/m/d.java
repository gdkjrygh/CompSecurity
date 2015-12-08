// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.m;

import android.content.res.Resources;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import kik.android.util.DeviceUtils;
import org.c.b;
import org.c.c;

public class d
{

    private static final b a = c.a(com/kik/m/d);
    private static Map b;

    public d()
    {
    }

    public static String a(String s, Resources resources)
    {
        Object obj = null;
        if (b == null && resources != null) goto _L2; else goto _L1
_L1:
        resources = obj;
        if (s != null)
        {
            resources = obj;
            if (s.length() != 0)
            {
                resources = obj;
                if (b.containsKey(s))
                {
                    resources = (String)b.get(s);
                }
            }
        }
        return resources;
_L2:
        Field afield[];
        int i;
        int j;
        b = new HashMap();
        afield = kik/android/ag$a.getDeclaredFields();
        j = afield.length;
        i = 0;
_L4:
        Object obj1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = afield[i];
        if (!Modifier.isStatic(((Field) (obj1)).getModifiers()) || Modifier.isPrivate(((Field) (obj1)).getModifiers()) || !((Field) (obj1)).getType().equals(Integer.TYPE))
        {
            break MISSING_BLOCK_LABEL_180;
        }
        int k;
        String s1 = ((Field) (obj1)).getName();
        k = ((Field) (obj1)).getInt(null);
        obj1 = s1.substring(s1.lastIndexOf('.') + 1);
        Object obj2;
        try
        {
            String s2 = resources.getString(k);
            b.put(s2, obj1);
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception) { }
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
        obj2;
        break MISSING_BLOCK_LABEL_180;
        obj2;
        break MISSING_BLOCK_LABEL_180;
    }

    public static void a(View view, String s)
    {
        while (view == null || !DeviceUtils.c() || !DeviceUtils.d()) 
        {
            return;
        }
        view.setContentDescription(s);
    }

}
