// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.util.ArrayList;

public final class i
{

    public ArrayList a;
    private Handler b;

    public i()
    {
        a = new ArrayList(3);
        b = new Handler(Looper.getMainLooper());
    }

    public final void a()
    {
        toString();
        for (int j = 0; j < a.size(); j++)
        {
            Pair pair = (Pair)a.get(j);
            b.post(new Runnable(pair) {

                final Pair a;
                final i b;

                public final void run()
                {
                    ((Runnable)a.first).run();
                    if (((Boolean)a.second).booleanValue())
                    {
                        b.a.remove(a);
                    }
                }

            
            {
                b = i.this;
                a = pair;
                super();
            }
            });
        }

    }

    public final void a(Runnable runnable, boolean flag)
    {
        a.add(new Pair(runnable, Boolean.valueOf(flag)));
    }
}
