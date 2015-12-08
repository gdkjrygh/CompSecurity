// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.content.DialogInterface;
import com.nbcsports.liveextra.library.configuration.Sport;
import java.util.List;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            SportFilterListFragment

class this._cls0
    implements android.content.tener
{

    final SportFilterListFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        SportFilterListFragment.access$100(SportFilterListFragment.this).onSportSelected((Sport)SportFilterListFragment.access$000(SportFilterListFragment.this).get(i));
        dismiss();
    }

    llback()
    {
        this$0 = SportFilterListFragment.this;
        super();
    }
}
