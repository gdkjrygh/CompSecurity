// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;


// Referenced classes of package com.google.inject.internal:
//            BytecodeGen

private static class  extends ClassLoader
{

    Class classicLoadClass(String s, boolean flag)
        throws ClassNotFoundException
    {
        return super.loadClass(s, flag);
    }

    protected Class loadClass(String s, boolean flag)
        throws ClassNotFoundException
    {
        if (!s.startsWith("sun.reflect")) goto _L2; else goto _L1
_L1:
        Class class1 = .SYSTEM_BRIDGE.classicLoadClass(s, flag);
_L4:
        return class1;
_L2:
        if (!s.startsWith(BytecodeGen.GUICE_INTERNAL_PACKAGE) && !s.startsWith(" "))
        {
            break MISSING_BLOCK_LABEL_80;
        }
        if (BytecodeGen.GUICE_CLASS_LOADER == null)
        {
            return .SYSTEM_BRIDGE.classicLoadClass(s, flag);
        }
        Class class2 = BytecodeGen.GUICE_CLASS_LOADER.loadClass(s);
        class1 = class2;
        if (!flag) goto _L4; else goto _L3
_L3:
        resolveClass(class2);
        return class2;
        Throwable throwable;
        throwable;
        return classicLoadClass(s, flag);
    }

    ()
    {
    }

    (ClassLoader classloader)
    {
        super(classloader);
    }
}
