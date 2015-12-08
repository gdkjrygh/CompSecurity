// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.content.Intent;
import android.util.SparseArray;
import com.skype.ObjectInterface;
import java.util.HashMap;

// Referenced classes of package com.skype.android.util:
//            AccountLifetimeObject

public class ViewStateManager extends AccountLifetimeObject
{

    private final int a = 0;
    private SparseArray b;
    private HashMap c;

    public ViewStateManager()
    {
        b = new SparseArray();
        c = new HashMap();
    }

    public final Intent a()
    {
        Intent intent = (Intent)b.get(0);
        b.delete(0);
        return intent;
    }

    public final Object a(ObjectInterface objectinterface, Class class1)
    {
        Object obj1 = b.get(objectinterface.getObjectID());
        Object obj = obj1;
        if (obj1 == null)
        {
            try
            {
                obj = class1.newInstance();
            }
            // Misplaced declaration of an exception variable
            catch (ObjectInterface objectinterface)
            {
                throw new RuntimeException(objectinterface);
            }
            b.put(objectinterface.getObjectID(), obj);
        }
        return obj;
    }

    public final Object a(String s)
    {
        if (s != null)
        {
            return c.get(s);
        } else
        {
            return null;
        }
    }

    public final void a(Intent intent)
    {
        if (intent != null)
        {
            b.put(0, intent);
        }
    }

    public final void a(String s, Object obj)
    {
        if (s != null)
        {
            c.put(s, obj);
        }
    }

    public final boolean a(ObjectInterface objectinterface)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (objectinterface != null)
        {
            flag = flag1;
            if (b.get(objectinterface.getObjectID()) != null)
            {
                flag = true;
            }
        }
        return flag;
    }

    public void onLogin()
    {
        c.clear();
    }

    public void onLogout()
    {
        b.clear();
        c.clear();
    }
}
