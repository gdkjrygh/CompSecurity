// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Observable;
import java.util.ArrayList;
import java.util.Iterator;

public final class fgd extends Observable
{

    private fgd()
    {
    }

    public fgd(byte byte0)
    {
        this();
    }

    public final void a(String s, String s1)
    {
        for (Iterator iterator = mObservers.iterator(); iterator.hasNext(); ((fgb)iterator.next()).a(s, s1)) { }
    }
}
