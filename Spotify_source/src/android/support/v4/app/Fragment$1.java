// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;
import x;

// Referenced classes of package android.support.v4.app:
//            Fragment

final class a extends x
{

    private Fragment a;

    public final View a(int i)
    {
        if (a.M == null)
        {
            throw new IllegalStateException("Fragment does not have a view");
        } else
        {
            return a.M.findViewById(i);
        }
    }

    public final boolean a()
    {
        return a.M != null;
    }

    (Fragment fragment)
    {
        a = fragment;
        super();
    }
}
