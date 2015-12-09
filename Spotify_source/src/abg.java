// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import android.util.SparseIntArray;

public final class abg
{

    public SparseArray a;
    SparseIntArray b;
    public int c;

    public abg()
    {
        a = new SparseArray();
        b = new SparseIntArray();
        c = 0;
    }

    public final void a()
    {
        c = c + 1;
    }

    public final void b()
    {
        c = c - 1;
    }
}
