// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;

// Referenced classes of package android.support.v4.app:
//            o, Fragment

final class j extends o
{

    final Fragment a;

    j(Fragment fragment)
    {
        a = fragment;
        super();
    }

    public final View a(int i)
    {
        if (a.J == null)
        {
            throw new IllegalStateException("Fragment does not have a view");
        } else
        {
            return a.J.findViewById(i);
        }
    }

    public final boolean a()
    {
        return a.J != null;
    }
}
