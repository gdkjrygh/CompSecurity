// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import a.a;
import android.content.res.Resources;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.api.model.StationRecord;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.presentation.CellRenderer;
import java.util.List;

// Referenced classes of package com.soundcloud.android.stations:
//            StationViewModel, StartStationPresenter

class StationRenderer
    implements CellRenderer
{

    private final ImageOperations imageOperations;
    private final Resources resources;
    private final StartStationPresenter startStationPresenter;

    public StationRenderer(ImageOperations imageoperations, Resources resources1, StartStationPresenter startstationpresenter)
    {
        imageOperations = imageoperations;
        resources = resources1;
        startStationPresenter = startstationpresenter;
    }

    private String getHumanReadableType(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 40
    //                   98240899: 106
    //                   110621003: 92
    //                   1126448022: 120;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_120;
_L5:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown stationWithSeed type: ")).append(s).toString());

        case 0: // '\0'
            return resources.getString(0x7f070312);

        case 1: // '\001'
            return resources.getString(0x7f070311);

        case 2: // '\002'
            return resources.getString(0x7f070310);
        }
_L3:
        if (s.equals("track"))
        {
            byte0 = 0;
        }
          goto _L5
_L2:
        if (s.equals("genre"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s.equals("curator"))
        {
            byte0 = 2;
        }
          goto _L5
    }

    private android.view.View.OnClickListener startStation(final StationRecord station)
    {
        return new _cls1();
    }

    public void bindItemView(int i, View view, List list)
    {
        list = (StationViewModel)list.get(i);
        StationRecord stationrecord = list.getStation();
        ImageView imageview = (ImageView)a.a(view, 0x7f0f00ce);
        TextView textview = (TextView)a.a(view, 0x7f0f0073);
        TextView textview1 = (TextView)a.a(view, 0x7f0f0250);
        TextView textview2 = (TextView)a.a(view, 0x7f0f0251);
        view.setOnClickListener(startStation(stationrecord));
        ((CardView)view).setPreventCornerOverlap(false);
        textview.setText(stationrecord.getTitle());
        if (list.isPlaying())
        {
            textview1.setVisibility(8);
            textview2.setVisibility(0);
        } else
        {
            textview2.setVisibility(8);
            textview1.setText(getHumanReadableType(stationrecord.getType()));
            textview1.setVisibility(0);
        }
        imageOperations.displayInAdapterView(stationrecord.getUrn(), ApiImageSize.getFullImageSize(resources), imageview);
    }

    public View createItemView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300b5, viewgroup, false);
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final StationRenderer this$0;
        final StationRecord val$station;

        public void onClick(View view)
        {
            startStationPresenter.startStation(view.getContext(), station.getUrn());
        }

        _cls1()
        {
            this$0 = StationRenderer.this;
            station = stationrecord;
            super();
        }
    }

}
