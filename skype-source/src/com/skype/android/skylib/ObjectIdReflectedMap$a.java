// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.skylib;

import java.lang.reflect.Method;

// Referenced classes of package com.skype.android.skylib:
//            ObjectIdReflectedMap

private static final class b
{

    com.skype.nterfaceIListener a;
    Method b;

    public er(Class class1)
        throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException
    {
        Object obj = class1.getName().substring(0, class1.getName().indexOf("Impl"));
        String s = class1.getSimpleName().substring(0, class1.getSimpleName().indexOf("Impl"));
        obj = Class.forName((new StringBuilder()).append(((String) (obj))).append("$").append(s).append("IListener").toString());
        a = (com.skype.nterfaceIListener)Class.forName((new StringBuilder("com.skype.android.gen.")).append(class1.getSimpleName().substring(0, class1.getSimpleName().indexOf("Impl"))).append("Listener").toString()).newInstance();
        b = class1.getMethod("addListener", new Class[] {
            obj
        });
    }
}
