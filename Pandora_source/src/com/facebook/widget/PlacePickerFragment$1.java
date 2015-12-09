// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphPlace;

// Referenced classes of package com.facebook.widget:
//            PlacePickerFragment

class ragmentAdapter extends ragmentAdapter
{

    final PlacePickerFragment this$0;

    protected int getDefaultPicture()
    {
        return com.facebook.android.k_place_default_icon;
    }

    protected volatile int getGraphObjectRowLayoutId(GraphObject graphobject)
    {
        return getGraphObjectRowLayoutId((GraphPlace)graphobject);
    }

    protected int getGraphObjectRowLayoutId(GraphPlace graphplace)
    {
        return com.facebook.android.placepickerfragment_list_row;
    }

    protected volatile CharSequence getSubTitleOfGraphObject(GraphObject graphobject)
    {
        return getSubTitleOfGraphObject((GraphPlace)graphobject);
    }

    protected CharSequence getSubTitleOfGraphObject(GraphPlace graphplace)
    {
        String s = graphplace.getCategory();
        graphplace = (Integer)graphplace.getProperty("were_here_count");
        if (s != null && graphplace != null)
        {
            return getString(com.facebook.android.placepicker_subtitle_format, new Object[] {
                s, graphplace
            });
        }
        if (s == null && graphplace != null)
        {
            return getString(com.facebook.android.placepicker_subtitle_were_here_only_format, new Object[] {
                graphplace
            });
        }
        if (s != null && graphplace == null)
        {
            return getString(com.facebook.android.placepicker_subtitle_catetory_only_format, new Object[] {
                s
            });
        } else
        {
            return null;
        }
    }

    ragmentAdapter(Context context)
    {
        this$0 = PlacePickerFragment.this;
        super(PlacePickerFragment.this, context);
    }
}
