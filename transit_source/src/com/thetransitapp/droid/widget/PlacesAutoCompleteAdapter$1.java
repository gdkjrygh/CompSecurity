// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.widget.Filter;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.thetransitapp.droid.widget:
//            PlacesAutoCompleteAdapter

class this._cls0 extends Filter
{

    final PlacesAutoCompleteAdapter this$0;

    protected android.widget.mpleteAdapter._cls1 performFiltering(CharSequence charsequence)
    {
        Object obj;
        Object obj1;
        android.widget.mpleteAdapter mpleteadapter;
        mpleteadapter = new android.widget.mpleteAdapter();
        obj1 = null;
        obj = null;
        if (charsequence == null || charsequence.length() == 0) goto _L2; else goto _L1
_L1:
        charsequence = PlacesAutoCompleteAdapter.access$0(PlacesAutoCompleteAdapter.this, charsequence.toString());
_L4:
        if (charsequence != null)
        {
            mpleteadapter.mpleteAdapter = charsequence;
            mpleteadapter.mpleteAdapter = charsequence.getCount();
        }
        return mpleteadapter;
_L2:
        charsequence = obj;
        if (PlacesAutoCompleteAdapter.access$1(PlacesAutoCompleteAdapter.this) != null)
        {
            charsequence = obj;
            if (PlacesAutoCompleteAdapter.access$1(PlacesAutoCompleteAdapter.this).latitude != 0.0D)
            {
                charsequence = obj1;
                if (true)
                {
                    charsequence = new MatrixCursor(PlacesAutoCompleteAdapter.access$2());
                }
                charsequence.addRow(new String[] {
                    "-1", PlacesAutoCompleteAdapter.access$3(PlacesAutoCompleteAdapter.this), (new StringBuilder("my_loc,")).append(PlacesAutoCompleteAdapter.access$3(PlacesAutoCompleteAdapter.this)).append(",").append(PlacesAutoCompleteAdapter.access$1(PlacesAutoCompleteAdapter.this).latitude).append(",").append(PlacesAutoCompleteAdapter.access$1(PlacesAutoCompleteAdapter.this).longitude).toString()
                });
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void publishResults(CharSequence charsequence, android.widget.mpleteAdapter._cls1 _pcls1)
    {
        swapCursor((Cursor)_pcls1.swapCursor);
        if (_pcls1 != null && _pcls1.swapCursor > 0)
        {
            notifyDataSetChanged();
            return;
        } else
        {
            notifyDataSetInvalidated();
            return;
        }
    }

    ()
    {
        this$0 = PlacesAutoCompleteAdapter.this;
        super();
    }
}
