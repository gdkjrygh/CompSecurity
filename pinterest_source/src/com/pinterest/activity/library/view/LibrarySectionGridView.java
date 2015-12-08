// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.LibrarySection;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.kit.view.PinCollectionBaseView;

public class LibrarySectionGridView extends PinCollectionBaseView
{

    private static final int COLUMNS_NUM = 3;
    private static final int COLUMNS_NUM_TABLET = 4;
    private static final int WEIGHT_ALL_PINS[] = {
        2, 2, 3, 2, 3, 3, 2, 1
    };
    private static final int WEIGHT_ALL_PINS_TABLET[] = {
        2, 3, 2, 2, 2, 3, 3, 2, 2, 1, 
        2
    };
    private String _sectionType;

    public LibrarySectionGridView(Context context)
    {
        this(context, null);
    }

    public LibrarySectionGridView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void adjustPinGridHeight()
    {
        _gridContainer.getLayoutParams().height = getResources().getDimensionPixelSize(0x7f0a0190);
    }

    public void configureUI(LibrarySection librarysection)
    {
        java.util.List list;
        String s;
        byte byte0;
        byte byte1;
        boolean flag;
        byte1 = 4;
        list = librarysection.getPinList();
        flag = Device.isTablet();
        s = librarysection.getType();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 4: default 68
    //                   3441022: 106
    //                   93908710: 121
    //                   102974396: 136
    //                   1525792543: 151;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        byte0;
        JVM INSTR tableswitch 0 3: default 100
    //                   0 166
    //                   1 200
    //                   2 259
    //                   3 280;
           goto _L6 _L7 _L8 _L9 _L10
_L6:
        setContent(list);
        return;
_L2:
        if (s.equals("pins"))
        {
            byte0 = 0;
        }
          goto _L1
_L3:
        if (s.equals("board"))
        {
            byte0 = 1;
        }
          goto _L1
_L4:
        if (s.equals("likes"))
        {
            byte0 = 2;
        }
          goto _L1
_L5:
        if (s.equals("empty_state"))
        {
            byte0 = 3;
        }
          goto _L1
_L7:
        adjustPinGridHeight();
        if (flag)
        {
            librarysection = WEIGHT_ALL_PINS_TABLET;
        } else
        {
            librarysection = WEIGHT_ALL_PINS;
        }
        setWeights(librarysection);
        _sectionType = "pins";
          goto _L6
_L8:
        librarysection = librarysection.getBoard();
        if (librarysection != null)
        {
            int i;
            if (!flag)
            {
                byte1 = 3;
            }
            if (librarysection.getLargestPinIndex() == null)
            {
                i = 0;
            } else
            {
                i = librarysection.getLargestPinIndex().intValue();
            }
            setWeights(byte1, i);
        }
        setContentUrls(librarysection.getPinImagesList());
        return;
_L9:
        if (!flag)
        {
            byte1 = 3;
        }
        calculateAndSetWeights(list, byte1);
          goto _L6
_L10:
        if (flag)
        {
            setWeights(4, 2);
        } else
        {
            setWeights(3, 1);
        }
          goto _L6
    }

    protected void onPinsSet()
    {
        super.onPinsSet();
        if (_sectionType != null && _sectionType.equals("pins"))
        {
            Events.post(new WeightsSetEvent());
        }
    }


    private class WeightsSetEvent
    {

        final LibrarySectionGridView this$0;

        public WeightsSetEvent()
        {
            this$0 = LibrarySectionGridView.this;
            super();
        }
    }

}
