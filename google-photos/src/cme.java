// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.List;

public final class cme
{

    public final SparseArray a;

    public cme()
    {
        a = new SparseArray();
    }

    public cme(cmd cmd1)
    {
        a = cmd1.a.clone();
    }

    public final cme a(int i, List list)
    {
        a.put(i, list);
        return this;
    }
}
