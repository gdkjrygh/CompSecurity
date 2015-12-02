// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//            ax

final class at
    implements Comparator
{

    at()
    {
    }

    public int a(ax ax1, ax ax2)
    {
        return ax1.b - ax2.b;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((ax)obj, (ax)obj1);
    }
}
