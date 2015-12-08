// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import android.view.View;
import android.widget.AdapterView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.details.SeasonsSpinner;

// Referenced classes of package com.netflix.mediaclient.ui.kids.details:
//            KidsSeasonSpinner, KidsShowDetailsAdapter

class this._cls0
    implements android.widget.lectedListener
{

    final KidsSeasonSpinner this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        i = KidsSeasonSpinner.access$000(KidsSeasonSpinner.this).getSeasonNumberForPosition(i);
        Log.v("KidsSeasonSpinner", (new StringBuilder()).append("Spinner item selected, season: ").append(i).toString());
        KidsSeasonSpinner.access$100(KidsSeasonSpinner.this).selectSeasonByNumber(i);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
        Log.v("KidsSeasonSpinner", "Nothing selected");
    }

    er()
    {
        this$0 = KidsSeasonSpinner.this;
        super();
    }
}
