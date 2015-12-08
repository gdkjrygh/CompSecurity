// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tinder.d.f;
import com.tinder.model.Badge;
import com.tinder.utils.v;

public class BadgeView extends ImageView
{

    private static final String BADGE_PEOPLE_MAG = "people_magazine";
    private static final String BADGE_VERIFIED = "verified";
    private boolean mBordered;
    private boolean mFiltered;

    public BadgeView(Context context)
    {
        super(context);
        mFiltered = false;
        mBordered = false;
        init();
    }

    public BadgeView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mFiltered = false;
        mBordered = false;
        init();
    }

    public BadgeView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mFiltered = false;
        mBordered = false;
        init();
    }

    public BadgeView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        mFiltered = false;
        mBordered = false;
        init();
    }

    private void init()
    {
        setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
    }

    public void displayBadge(f f1)
    {
        int j;
        j = 0x7f020237;
        if (f1 == null)
        {
            v.b("Null user, cannot show verified badge because we can't tell if they're verified.");
            return;
        }
        if (!f1.hasBadge()) goto _L2; else goto _L1
_L1:
        f1 = f1.getFirstBadge();
        if (f1 == null || ((Badge) (f1)).type == null) goto _L4; else goto _L3
_L3:
        f1 = ((Badge) (f1)).type;
        f1.hashCode();
        JVM INSTR lookupswitch 2: default 76
    //                   -1994383672: 125
    //                   1733368644: 139;
           goto _L5 _L6 _L7
_L5:
        byte byte0 = -1;
_L12:
        byte0;
        JVM INSTR tableswitch 0 1: default 100
    //                   0 153
    //                   1 179;
           goto _L8 _L9 _L10
_L8:
        setImageResource(0x106000d);
        setVisibility(8);
_L4:
        if (mFiltered)
        {
            setColorFilter(-1);
            return;
        } else
        {
            clearColorFilter();
            return;
        }
_L6:
        if (!f1.equals("verified")) goto _L5; else goto _L11
_L11:
        byte0 = 0;
          goto _L12
_L7:
        if (!f1.equals("people_magazine")) goto _L5; else goto _L13
_L13:
        byte0 = 1;
          goto _L12
_L9:
        if (!mBordered)
        {
            j = 0x7f020236;
        }
        setImageResource(j);
        setVisibility(0);
          goto _L4
_L10:
        setImageResource(0x7f02019a);
        setVisibility(0);
          goto _L4
_L2:
        int i;
        if (f1.isVerified())
        {
            if (mBordered)
            {
                i = j;
            } else
            {
                i = 0x7f020236;
            }
        } else
        {
            i = 0x106000d;
        }
        setImageResource(i);
        return;
          goto _L12
    }

    public void setBordered(boolean flag)
    {
        mBordered = flag;
    }

    public void setFiltered(boolean flag)
    {
        mFiltered = flag;
        invalidate();
    }
}
