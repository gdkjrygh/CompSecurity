// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.Context;
import android.os.AsyncTask;
import dalvik.system.DexFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Map;

// Referenced classes of package com.taplytics:
//            z, ci, gs, crocodile

final class ah extends AsyncTask
{

    final z a;

    private ah(z z1)
    {
        a = z1;
        super();
    }

    ah(z z1, byte byte0)
    {
        this(z1);
    }

    private transient Void a()
    {
        boolean flag = false;
        if (a.j != null && a.k != null && a.l != null && a.m != null && a.n != null) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object obj2;
        obj1 = new DexFile(ci.b().u.getPackageCodePath());
        obj2 = ((DexFile) (obj1)).entries();
_L4:
        boolean flag1 = ((Enumeration) (obj2)).hasMoreElements();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        Class class1 = Class.forName((String)((Enumeration) (obj2)).nextElement());
        Object obj;
        Throwable throwable;
        int i;
        int j;
        try
        {
            obj = class1.getDeclaredFields();
        }
        catch (Throwable throwable1)
        {
            throwable1 = null;
        }
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (!class1.getCanonicalName().contains("com.flurry.sdk") || obj.length <= 30) goto _L4; else goto _L5
_L5:
        if (gs.b())
        {
            gs.a((new StringBuilder("Found flurry gy: ")).append(class1.getCanonicalName()).toString());
        }
        a.m = class1;
        a.n = ((Field []) (obj));
        obj1 = ((DexFile) (obj1)).entries();
_L11:
        flag1 = ((Enumeration) (obj1)).hasMoreElements();
        if (!flag1) goto _L7; else goto _L6
_L6:
        obj2 = Class.forName((String)((Enumeration) (obj1)).nextElement());
        try
        {
            obj = ((Class) (obj2)).getDeclaredMethods();
        }
        catch (Throwable throwable2)
        {
            throwable2 = null;
        }
        if (obj == null) goto _L9; else goto _L8
_L8:
        j = obj.length;
        i = 0;
_L24:
        if (i >= j) goto _L9; else goto _L10
_L10:
        if (obj[i].getReturnType() != a.m)
        {
            break MISSING_BLOCK_LABEL_680;
        }
        if (gs.b())
        {
            gs.a((new StringBuilder("found flurry fu: ")).append(((Class) (obj2)).getCanonicalName()).toString());
        }
        a.l = ((Class) (obj2));
_L9:
        obj = a.l;
        if (obj == null) goto _L11; else goto _L7
_L7:
        if (a.l == null) goto _L2; else goto _L12
_L12:
        obj = a.l.getDeclaredMethods();
        j = obj.length;
        i = 0;
_L23:
        if (i >= j) goto _L2; else goto _L13
_L13:
        obj1 = obj[i];
        if (((Method) (obj1)).getReturnType() != a.l) goto _L15; else goto _L14
_L14:
        a.k = ((Method) (obj1));
_L18:
        if (a.j != null && a.k != null) goto _L2; else goto _L16
_L15:
        if (((Method) (obj1)).getReturnType() != a.m || ((Method) (obj1)).getParameterTypes().length != 0) goto _L18; else goto _L17
_L17:
        a.j = ((Method) (obj1));
          goto _L18
        throwable;
        Field afield[];
        Field field;
        Map map;
        crocodile crocodile1;
        int k;
        if (throwable instanceof Exception)
        {
            throwable = (Exception)throwable;
        } else
        {
            throwable = null;
        }
        gs.b("Flry problems", throwable);
_L22:
        return null;
_L2:
        if (a.k == null || a.j == null || a.n == null || a.l == null || a.m == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        a.k.setAccessible(true);
        a.j.setAccessible(true);
        throwable = ((Throwable) (a.j.invoke(a.k.invoke(a.m, new Object[0]), new Object[0])));
        if (throwable == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        afield = a.n;
        k = afield.length;
        i = ((flag) ? 1 : 0);
_L20:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        field = afield[i];
        if (field.getType() != java/util/Map || field.getType() == com/taplytics/crocodile)
        {
            break MISSING_BLOCK_LABEL_637;
        }
        field.setAccessible(true);
        map = (Map)field.get(throwable);
        crocodile1 = new crocodile();
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_630;
        }
        crocodile1.putAll(map);
        field.set(throwable, crocodile1);
        i++;
        if (true) goto _L20; else goto _L19
_L19:
        if (true) goto _L22; else goto _L21
_L21:
        throwable;
          goto _L11
        throwable;
          goto _L4
_L16:
        i++;
          goto _L23
        i++;
          goto _L24
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }
}
