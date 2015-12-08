// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import com.skype.android.audio.AudioRoute;
import com.skype.android.calling.CameraFacing;

public class ConversationViewState
{

    private boolean a;
    private boolean b;
    private CameraFacing c;
    private AudioRoute d;
    private AudioRoute e;
    private String f;
    private boolean g;
    private CharSequence h;
    private boolean i;
    private long j;

    public ConversationViewState()
    {
    }

    public final long a()
    {
        return j;
    }

    public final void a(long l)
    {
        j = l;
    }

    public final void a(AudioRoute audioroute)
    {
        if (audioroute != d || d == null)
        {
            e = d;
            d = audioroute;
        }
    }

    public final void a(CameraFacing camerafacing)
    {
        c = camerafacing;
    }

    public final void a(CharSequence charsequence)
    {
        h = charsequence;
    }

    public final void a(String s)
    {
        f = s;
    }

    public final void a(boolean flag)
    {
        i = flag;
    }

    public final void b(boolean flag)
    {
        a = flag;
    }

    public final boolean b()
    {
        return i;
    }

    public final CharSequence c()
    {
        return h;
    }

    public final void c(boolean flag)
    {
        g = flag;
    }

    public final boolean d()
    {
        return a;
    }

    public final CameraFacing e()
    {
        return c;
    }

    public final AudioRoute f()
    {
        return d;
    }

    public final AudioRoute g()
    {
        return e;
    }

    public final String h()
    {
        return f;
    }

    public final void i()
    {
        b = false;
    }

    public final boolean j()
    {
        return g;
    }
}
