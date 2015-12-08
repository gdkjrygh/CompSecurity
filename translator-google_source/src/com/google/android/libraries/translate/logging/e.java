// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.logging;

import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.x;

// Referenced classes of package com.google.android.libraries.translate.logging:
//            LogParams, f, Event

public abstract class e
{

    public e()
    {
    }

    public abstract f a(x x, String s, String s1);

    public void a()
    {
    }

    public final void a(int i, LogParams logparams)
    {
        a(i, logparams, null, ((String) (null)));
    }

    public abstract void a(int i, LogParams logparams, String s, String s1);

    public final void a(int i, String s)
    {
        a(i, s, null, ((String) (null)));
    }

    public final void a(int i, String s, String s1, String s2)
    {
        a(i, LogParams.create(s), s1, s2);
    }

    public abstract void a(int i, String s, String s1, String s2, int j, int k);

    public final void a(Event event, long l, String s, String s1)
    {
        a(event, l, s, s1, ((LogParams) (null)), -1);
    }

    public final void a(Event event, long l, String s, String s1, int i)
    {
        a(event, l, s, s1, ((LogParams) (null)), i);
    }

    public abstract void a(Event event, long l, String s, String s1, LogParams logparams, int i);

    public abstract void a(Event event, String s, String s1);

    public final void a(Event event, String s, String s1, int i)
    {
        a(event, s, s1, i, ((LogParams) (null)));
    }

    public abstract void a(Event event, String s, String s1, int i, LogParams logparams);

    public abstract void a(Event event, String s, String s1, LogParams logparams);

    public abstract void a(Event event, String s, String s1, String s2);

    public void a(String s)
    {
    }

    public abstract void a(String s, OfflinePackage offlinepackage, String s1);

    public abstract f b(String s, String s1);

    public abstract void b();

    public void b(String s)
    {
    }

    public abstract void c(String s);
}
