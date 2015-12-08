// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;

// Referenced classes of package android.support.v4.app:
//            t, Fragment

final class n
    implements t
{

    final Fragment a;

    n(Fragment fragment)
    {
        a = fragment;
        super();
    }

    public final View a(int i)
    {
        if (a.mView == null)
        {
            throw new IllegalStateException("Fragment does not have a view");
        } else
        {
            return a.mView.findViewById(i);
        }
    }

    public final boolean a()
    {
        return a.mView != null;
    }
}
