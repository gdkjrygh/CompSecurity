// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class czh
{

    Set a;

    public czh()
    {
        a = new HashSet();
    }

    public void a(Object obj)
    {
        if (Thread.currentThread() != Looper.getMainLooper().getThread())
        {
            throw new RuntimeException("Can't remove an activity when not on the UI thread");
        } else
        {
            a.remove(obj);
            return;
        }
    }

    public final Set b()
    {
        if (Thread.currentThread() != Looper.getMainLooper().getThread())
        {
            throw new RuntimeException("Can't remove an activity when not on the UI thread");
        } else
        {
            return Collections.unmodifiableSet(a);
        }
    }

    public void b(Object obj)
    {
        if (Thread.currentThread() != Looper.getMainLooper().getThread())
        {
            throw new RuntimeException("Can't add an activity when not on the UI thread");
        } else
        {
            a.add(obj);
            return;
        }
    }
}
