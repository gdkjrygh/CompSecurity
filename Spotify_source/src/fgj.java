// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Observable;
import java.util.ArrayList;
import java.util.Iterator;

final class fgj extends Observable
{

    private fgj()
    {
    }

    fgj(byte byte0)
    {
        this();
    }

    final void a()
    {
        for (Iterator iterator = mObservers.iterator(); iterator.hasNext(); iterator.next()) { }
    }
}
