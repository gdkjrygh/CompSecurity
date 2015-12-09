// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music;

import android.net.Uri;
import dod;
import fog;
import ghd;

// Referenced classes of package com.spotify.music:
//            MainActivity

final class a
    implements ghd
{

    private MainActivity a;

    public final Uri a()
    {
        android.support.v4.app.Fragment fragment = a.e.b();
        if (!(fragment instanceof dod))
        {
            return null;
        } else
        {
            return ((dod)fragment).a();
        }
    }

    (MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }
}
