// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.artist.adapters;

import android.content.Context;
import com.spotify.android.paste.widget.SectionHeaderView;
import ftr;

// Referenced classes of package com.spotify.mobile.android.spotlets.artist.adapters:
//            ArtistSectionedListAdapter

final class ction extends ftr
{

    public final void a(int i, SectionHeaderView sectionheaderview, String s, String s1)
    {
        super.a(i, sectionheaderview, s, s1);
        sectionheaderview.b(ction.a(ction.values()[i]));
    }

    ction(Context context)
    {
        super(context);
    }
}
