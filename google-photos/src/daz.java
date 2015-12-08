// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayDeque;
import java.util.Deque;

final class daz
{

    final SparseArray a = new SparseArray();

    daz()
    {
    }

    public final void a(int i, View view)
    {
        Deque deque = (Deque)a.get(i);
        Object obj = deque;
        if (deque == null)
        {
            obj = new ArrayDeque();
            a.put(i, obj);
        }
        ((Deque) (obj)).push(view);
    }
}
