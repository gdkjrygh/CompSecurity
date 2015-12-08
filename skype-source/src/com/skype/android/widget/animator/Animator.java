// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.animator;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.skype.android.widget.animator:
//            Track

public class Animator
{
    public static interface OnCompletionListener
    {

        public abstract void a();
    }


    private int a;
    private Map b;
    private int c;
    private long d;
    private boolean e;
    private OnCompletionListener f;

    public Animator()
    {
        a = 0;
        b = new HashMap();
        c = 20;
        d = 0L;
        e = false;
    }

    public final Float a(long l, String s)
    {
        s = (Track)b.get(s);
        if (s == null)
        {
            return null;
        }
        int j = (int)((l - d) / (long)(1000 / c));
        int i = j;
        if (j > a)
        {
            if (f != null)
            {
                f.a();
            }
            i = a;
            e = false;
        }
        return Float.valueOf(s.a(i));
    }

    public final void a()
    {
        c = 120;
    }

    public final void a(long l)
    {
        d = l;
        e = true;
    }

    public final void a(OnCompletionListener oncompletionlistener)
    {
        f = oncompletionlistener;
    }

    public final boolean a(String s, Track track)
    {
        boolean flag;
        if (s.trim().length() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return false;
        } else
        {
            b.put(s, track);
            a = Math.max(a, track.a());
            return true;
        }
    }

    public final boolean b()
    {
        return e;
    }

    public final void c()
    {
        b.clear();
    }
}
