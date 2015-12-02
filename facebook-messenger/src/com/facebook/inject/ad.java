// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import android.os.Looper;
import android.os.MessageQueue;
import com.google.inject.a;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.inject:
//            ae, t

public class ad
{

    private final t a;

    public ad(t t1)
    {
        a = t1;
    }

    static t a(ad ad1)
    {
        return ad1.a;
    }

    public void a(Set set)
    {
        MessageQueue messagequeue = Looper.myQueue();
        if (messagequeue != null)
        {
            messagequeue.addIdleHandler(new ae(this, set));
            return;
        }
        a a1;
        for (Iterator iterator = set.iterator(); iterator.hasNext(); a.a(a1))
        {
            a1 = (a)iterator.next();
        }

        set.clear();
    }
}
