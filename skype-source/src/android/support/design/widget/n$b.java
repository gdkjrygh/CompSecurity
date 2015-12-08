// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import java.lang.ref.WeakReference;

// Referenced classes of package android.support.design.widget:
//            n

private static final class 
{

    private final WeakReference a;
    private int b;

    static WeakReference a( )
    {
        return .a;
    }

    static int b(a a1)
    {
        return a1.b;
    }

    final boolean a(b b1)
    {
        return b1 != null && a.get() == b1;
    }
}
