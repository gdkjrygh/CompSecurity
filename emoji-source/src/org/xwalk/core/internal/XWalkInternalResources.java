// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class XWalkInternalResources
{

    private static final String GENERATED_RESOURCE_CLASS = "org.xwalk.core.R";
    private static final String INTERNAL_RESOURCE_CLASSES[] = {
        "org.chromium.content.R", "org.chromium.ui.R", "org.xwalk.core.internal.R"
    };
    private static final String TAG = "XWalkInternalResources";
    private static boolean loaded = false;

    XWalkInternalResources()
    {
    }

    private static void doResetIds(Context context)
    {
        String as[];
        int i;
        int l;
        context = context.getClassLoader();
        as = INTERNAL_RESOURCE_CLASSES;
        l = as.length;
        i = 0;
_L4:
        String s;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_357;
        }
        s = as[i];
        Class aclass[];
        int i1;
        aclass = context.loadClass(s).getClasses();
        i1 = aclass.length;
        int j = 0;
_L2:
        Class class1;
        if (j >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        class1 = aclass[j];
        Object obj1 = class1.getName().replace(s, "org.xwalk.core.R");
        Object obj = context.loadClass(((String) (obj1)));
        int j1;
        obj1 = class1.getFields();
        j1 = obj1.length;
        ClassNotFoundException classnotfoundexception;
        Field field;
        Object obj2;
        for (int k = 0; k >= j1; k++)
        {
            break MISSING_BLOCK_LABEL_149;
        }

        field = obj1[k];
        if (Modifier.isFinal(field.getModifiers()))
        {
            break MISSING_BLOCK_LABEL_358;
        }
        break MISSING_BLOCK_LABEL_158;
        obj;
        Log.w("XWalkInternalResources", (new StringBuilder()).append(((String) (obj1))).append("is not found.").toString());
        j++;
        if (true) goto _L2; else goto _L1
        field.setInt(null, ((Class) (obj)).getField(field.getName()).getInt(null));
        break MISSING_BLOCK_LABEL_358;
        obj2;
        try
        {
            Log.w("XWalkInternalResources", (new StringBuilder()).append(((Class) (obj)).getName()).append(".").append(field.getName()).append(" is not accessable.").toString());
            break MISSING_BLOCK_LABEL_358;
        }
        // Misplaced declaration of an exception variable
        catch (ClassNotFoundException classnotfoundexception)
        {
            Log.w("XWalkInternalResources", (new StringBuilder()).append(s).append("is not found.").toString());
        }
_L1:
        i++;
        break MISSING_BLOCK_LABEL_358;
        obj2;
        Log.w("XWalkInternalResources", (new StringBuilder()).append(((Class) (obj)).getName()).append(".").append(field.getName()).append(" is not int.").toString());
        break MISSING_BLOCK_LABEL_358;
        obj2;
        Log.w("XWalkInternalResources", (new StringBuilder()).append(((Class) (obj)).getName()).append(".").append(field.getName()).append(" is not found.").toString());
        break MISSING_BLOCK_LABEL_358;
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void resetIds(Context context)
    {
        if (!loaded)
        {
            doResetIds(context);
            loaded = true;
        }
    }

}
