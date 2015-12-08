// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.view.View;
import android.widget.AdapterView;
import com.nbcsports.liveextra.library.configuration.Sport;
import java.util.List;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            SportGridTabletFragment

class this._cls0
    implements android.widget.tener
{

    final SportGridTabletFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        SportGridTabletFragment.access$100(SportGridTabletFragment.this).onSportSelected((Sport)SportGridTabletFragment.access$000(SportGridTabletFragment.this).get(i));
        dismiss();
    }

    llback()
    {
        this$0 = SportGridTabletFragment.this;
        super();
    }
}
