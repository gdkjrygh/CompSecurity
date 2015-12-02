// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.view.View;

// Referenced classes of package com.facebook.contacts.contactcard:
//            MapSectionView, x

class ar
    implements android.view.View.OnClickListener
{

    final MapSectionView a;

    ar(MapSectionView mapsectionview)
    {
        a = mapsectionview;
        super();
    }

    public void onClick(View view)
    {
        if (MapSectionView.a(a) != null)
        {
            MapSectionView.a(a).a();
        }
    }
}
