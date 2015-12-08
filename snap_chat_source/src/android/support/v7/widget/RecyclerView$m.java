// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static final class c
{

    SparseArray a;
    SparseIntArray b;
    int c;

    final void a()
    {
        c = c + 1;
    }

    final void b()
    {
        c = c - 1;
    }

    public ()
    {
        a = new SparseArray();
        b = new SparseIntArray();
        c = 0;
    }
}
