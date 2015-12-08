// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ebb
    implements dmx
{

    private final Context a;

    public ebb(Context context)
    {
        a = context;
    }

    public final void a(long l, String s, String s1)
    {
        s = new dng(true, l, s1, s);
        dmz.a(fop);
        fop.a(a, s);
    }

    public final void b(long l, String s, String s1)
    {
        s = new dng(false, l, s1, s);
        dmz.a(fop);
        fop.a(a, s);
    }
}
