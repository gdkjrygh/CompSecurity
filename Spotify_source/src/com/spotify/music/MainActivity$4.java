// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music;

import gco;
import gms;

// Referenced classes of package com.spotify.music:
//            MainActivity

final class a
    implements gco
{

    private MainActivity a;

    public final void a()
    {
        MainActivity.o(a);
    }

    public final void a(String s)
    {
        a.startActivity(gms.a(a, s).a);
    }

    (MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }
}
