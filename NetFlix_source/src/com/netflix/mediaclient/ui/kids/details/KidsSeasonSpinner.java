// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.details.SeasonsSpinner;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.kids.details:
//            KidsShowDetailsFrag, KidsShowDetailsAdapter

public class KidsSeasonSpinner extends RelativeLayout
{

    private static final String TAG = "KidsSeasonSpinner";
    private final Activity activity;
    private final KidsShowDetailsAdapter showAdapter;
    private final SeasonsSpinner spinner = (SeasonsSpinner)findViewById(0x7f0700dd);

    public KidsSeasonSpinner(KidsShowDetailsFrag kidsshowdetailsfrag, KidsShowDetailsAdapter kidsshowdetailsadapter)
    {
        super(kidsshowdetailsfrag.getActivity());
        activity = kidsshowdetailsfrag.getActivity();
        showAdapter = kidsshowdetailsadapter;
        activity.getLayoutInflater().inflate(0x7f03003c, this);
        setBackgroundColor(activity.getResources().getColor(0x7f09006e));
        setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        kidsshowdetailsfrag = showAdapter.getSeasons();
        Log.v("KidsSeasonSpinner", (new StringBuilder()).append("Creating season spinner, num seasons: ").append(kidsshowdetailsfrag.size()).toString());
        spinner.updateSeasonData(kidsshowdetailsfrag);
        spinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final KidsSeasonSpinner this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                i = spinner.getSeasonNumberForPosition(i);
                Log.v("KidsSeasonSpinner", (new StringBuilder()).append("Spinner item selected, season: ").append(i).toString());
                showAdapter.selectSeasonByNumber(i);
            }

            public void onNothingSelected(AdapterView adapterview)
            {
                Log.v("KidsSeasonSpinner", "Nothing selected");
            }

            
            {
                this$0 = KidsSeasonSpinner.this;
                super();
            }
        });
    }

    public void setSeasonNumber(int i)
    {
        Log.v("KidsSeasonSpinner", (new StringBuilder()).append("Setting curr season number: ").append(i).toString());
        spinner.setSelectionWithoutCallback(spinner.getSeasonIndexBySeasonNumber(i));
    }


}
