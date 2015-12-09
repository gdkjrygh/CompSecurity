// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.tablet;

import com.pandora.radio.data.aa;
import p.ca.bb;

// Referenced classes of package com.pandora.android.tablet:
//            TabletHome, a

class c
    implements Runnable
{

    final TabletHome a;
    private final aa b;
    private final int c;

    public void run()
    {
        if (!TabletHome.a(a))
        {
            TabletHome.a(a, "updateTrackInfo (skipping - we're not added)");
            return;
        }
        TabletHome tablethome = a;
        StringBuilder stringbuilder = (new StringBuilder()).append("updateTrackInfo (actual) - selected track ");
        String s;
        if (b != null)
        {
            if (b.M())
            {
                s = "AudioAd";
            } else
            {
                s = (new StringBuilder()).append("Track [").append(b.s()).append("]").toString();
            }
        } else
        {
            s = "NULL";
        }
        TabletHome.b(tablethome, stringbuilder.append(s).toString());
        if (b != null)
        {
            ((bb)TabletHome.c(a).e()).a(b, c, TabletHome.b(a));
        }
        TabletHome.a(a, null);
    }

    public (TabletHome tablethome, aa aa1, int i)
    {
        a = tablethome;
        super();
        b = aa1;
        c = i;
    }
}
