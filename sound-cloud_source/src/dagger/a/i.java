// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;

import javax.inject.b;

// Referenced classes of package dagger.a:
//            q

final class i extends q
{

    i()
    {
    }

    protected final Object a(Object obj)
    {
        return Boolean.valueOf(((Class)obj).isAnnotationPresent(javax/inject/b));
    }
}
