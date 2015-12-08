// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.view.View;
import android.widget.AdapterView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.SeasonDetails;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            EpisodeListFrag, SeasonsSpinner, EpisodeListAdapter

class this._cls0
    implements android.widget.SelectedListener
{

    final EpisodeListFrag this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        Log.v("EpisodeListFrag", (new StringBuilder()).append("Season spinner selected position: ").append(i).toString());
        adapterview = (SeasonDetails)EpisodeListFrag.access$000(EpisodeListFrag.this).getItemAtPosition(i);
        if (adapterview == null)
        {
            Log.w("EpisodeListFrag", (new StringBuilder()).append("null season details retrieved for position: ").append(i).toString());
        }
        EpisodeListFrag.access$100(EpisodeListFrag.this).updateSeasonDetails(adapterview);
        EpisodeListFrag.access$202(EpisodeListFrag.this, -1);
        EpisodeListFrag.access$300(EpisodeListFrag.this);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
        Log.v("EpisodeListFrag", "Season spinner - Nothing selected");
    }

    ()
    {
        this$0 = EpisodeListFrag.this;
        super();
    }
}
