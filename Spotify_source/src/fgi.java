// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Observable;
import java.util.ArrayList;
import java.util.Iterator;

final class fgi extends Observable
{

    private fgi()
    {
    }

    fgi(byte byte0)
    {
        this();
    }

    final void a(int i, int j)
    {
        for (Iterator iterator = mObservers.iterator(); iterator.hasNext(); ((fgl)iterator.next()).b(i, j)) { }
    }

    final void b(int i, int j)
    {
        for (Iterator iterator = mObservers.iterator(); iterator.hasNext(); ((fgl)iterator.next()).a(i, j)) { }
    }
}
