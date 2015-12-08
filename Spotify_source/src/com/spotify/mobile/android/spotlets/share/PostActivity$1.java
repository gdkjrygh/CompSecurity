// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share;

import aa;
import ah;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import dgd;
import dge;
import dwx;
import fhn;
import java.util.Locale;

// Referenced classes of package com.spotify.mobile.android.spotlets.share:
//            PostActivity

final class a
    implements dwx
{

    private PostActivity a;

    public final void a(Flags flags)
    {
        PostActivity.a(a, flags);
        flags = a;
        if (((PostActivity) (flags)).d != null && ((PostActivity) (flags)).f == null && ((PostActivity) (flags)).g == null)
        {
            flags.g = fhn.a(((PostActivity) (flags)).e, ((PostActivity) (flags)).d);
            flags.a_().a().a(0x7f1100ff, ((PostActivity) (flags)).g, "post_to_fragment").c();
            flags.setTitle(dge.a(((PostActivity) (flags)).g.a(flags, ((PostActivity) (flags)).d).toUpperCase(Locale.getDefault()), dgd.b(flags, 0x7f0101e4)));
        }
    }

    (PostActivity postactivity)
    {
        a = postactivity;
        super();
    }
}
