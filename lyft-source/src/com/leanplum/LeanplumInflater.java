// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

// Referenced classes of package com.leanplum:
//            LeanplumResources, Var

public class LeanplumInflater
{

    private Context a;
    private LeanplumResources b;

    private LeanplumInflater(Context context)
    {
        a = context;
    }

    public static LeanplumInflater from(Context context)
    {
        return new LeanplumInflater(context);
    }

    public LeanplumResources getLeanplumResources()
    {
        return getLeanplumResources(null);
    }

    public LeanplumResources getLeanplumResources(Resources resources)
    {
        if (b != null)
        {
            return b;
        }
        if (resources == null)
        {
            resources = a.getResources();
        }
        if (resources instanceof LeanplumResources)
        {
            return (LeanplumResources)resources;
        } else
        {
            b = new LeanplumResources(resources);
            return b;
        }
    }

    public View inflate(int i)
    {
        return inflate(i, null, false);
    }

    public View inflate(int i, ViewGroup viewgroup)
    {
        boolean flag;
        if (viewgroup != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return inflate(i, viewgroup, flag);
    }

    public View inflate(int i, ViewGroup viewgroup, boolean flag)
    {
        Var var;
        var = getLeanplumResources(a.getResources()).a(i);
        if (var == null || var.a.equals(var.defaultValue()))
        {
            return LayoutInflater.from(a).inflate(i, viewgroup, flag);
        }
        int j = var.overrideResId();
        if (j != 0)
        {
            return LayoutInflater.from(a).inflate(j, viewgroup, flag);
        }
        Object obj;
        Object obj1;
        byte abyte0[];
        obj = new ByteArrayOutputStream();
        obj1 = var.stream();
        abyte0 = new byte[8192];
_L5:
        int k = ((InputStream) (obj1)).read(abyte0);
        if (k >= 0) goto _L2; else goto _L1
_L1:
        try
        {
            ((InputStream) (obj1)).close();
            obj1 = Class.forName("android.content.res.XmlBlock").getConstructor(new Class[] {
                [B
            }).newInstance(new Object[] {
                ((ByteArrayOutputStream) (obj)).toByteArray()
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("Leanplum", (new StringBuilder("Could not inflate resource ")).append(i).append(":").append(var.stringValue()).toString(), ((Throwable) (obj)));
            return LayoutInflater.from(a).inflate(i, viewgroup, flag);
        }
        obj = null;
        abyte0 = null;
        obj1 = (XmlResourceParser)obj1.getClass().getMethod("newParser", new Class[0]).invoke(obj1, new Object[0]);
        obj = LayoutInflater.from(a).inflate(((org.xmlpull.v1.XmlPullParser) (obj1)), viewgroup, flag);
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        ((XmlResourceParser) (obj1)).close();
          goto _L4
_L2:
        ((ByteArrayOutputStream) (obj)).write(abyte0, 0, k);
          goto _L5
        obj1;
        obj = abyte0;
_L8:
        throw new RuntimeException(((Throwable) (obj1)));
        Object obj2;
        obj2;
        obj1 = obj;
        obj = obj2;
_L7:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_324;
        }
        ((XmlResourceParser) (obj1)).close();
        throw obj;
        obj;
        if (true) goto _L7; else goto _L6
_L6:
        obj2;
        obj = obj1;
        obj1 = obj2;
        if (true) goto _L8; else goto _L4
_L4:
        return ((View) (obj));
    }
}
