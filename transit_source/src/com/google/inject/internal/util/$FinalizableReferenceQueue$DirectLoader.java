// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;


// Referenced classes of package com.google.inject.internal.util:
//            $FinalizableReferenceQueue

static class er
    implements er
{

    public Class loadFinalizer()
    {
        Class class1;
        try
        {
            class1 = Class.forName("com.google.inject.internal.util.$Finalizer");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new AssertionError(classnotfoundexception);
        }
        return class1;
    }

    er()
    {
    }
}
