// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;
import android.view.View;
import com.snapchat.android.ui.smartfilters.TurnOnFiltersView;
import com.snapchat.android.ui.swipefilters.FilterPageType;

public final class HI extends Ho
{

    private final TurnOnFiltersView b;

    public HI(TurnOnFiltersView turnonfiltersview)
    {
        b = turnonfiltersview;
    }

    public final String a()
    {
        return "TurnOnSmartFilters";
    }

    public final boolean a(MotionEvent motionevent)
    {
        return true;
    }

    public final FilterPageType b()
    {
        return FilterPageType.TURN_ON_FILTERS_PAGE;
    }

    public final View d()
    {
        return b;
    }
}
