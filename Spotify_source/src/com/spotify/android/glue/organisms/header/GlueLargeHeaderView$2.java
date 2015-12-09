// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.glue.organisms.header;

import android.view.View;
import android.widget.ImageView;
import dgm;
import jz;

// Referenced classes of package com.spotify.android.glue.organisms.header:
//            GlueLargeHeaderView

final class a
    implements dgm
{

    private GlueLargeHeaderView a;

    public final View a()
    {
        return a;
    }

    public final void a(View view)
    {
        throw new UnsupportedOperationException("setContentView is not supported in GlueHeaderView.");
    }

    public final void a(CharSequence charsequence)
    {
        a.a(charsequence);
    }

    public final void a(jz jz)
    {
        throw new UnsupportedOperationException("setAdapter is not supported in GlueHeaderView.");
    }

    public final ImageView b()
    {
        throw new IllegalStateException("Only a header with media type IMAGE can have ImageView.");
    }

    public final void b(View view)
    {
        throw new UnsupportedOperationException("setContentView is not supported in GlueHeaderView.");
    }

    (GlueLargeHeaderView gluelargeheaderview)
    {
        a = gluelargeheaderview;
        super();
    }
}
