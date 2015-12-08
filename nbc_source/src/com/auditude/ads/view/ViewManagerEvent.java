// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view;

import com.auditude.ads.model.IAsset;
import com.auditude.ads.util.event.Event;
import com.auditude.ads.util.event.IEventDispatcher;

public class ViewManagerEvent extends Event
{
    public static final class ViewManagerEventType extends Enum
    {

        private static final ViewManagerEventType ENUM$VALUES[];
        public static final ViewManagerEventType LINEAR_AD_ABOUT_TO_BEGIN;
        public static final ViewManagerEventType LINEAR_AD_BEGIN;
        public static final ViewManagerEventType LINEAR_AD_END;
        public static final ViewManagerEventType NON_LINEAR_AD_ABOUT_TO_BEGIN;
        public static final ViewManagerEventType NON_LINEAR_AD_BEGIN;
        public static final ViewManagerEventType NON_LINEAR_AD_END;

        public static ViewManagerEventType valueOf(String s)
        {
            return (ViewManagerEventType)Enum.valueOf(com/auditude/ads/view/ViewManagerEvent$ViewManagerEventType, s);
        }

        public static ViewManagerEventType[] values()
        {
            ViewManagerEventType aviewmanagereventtype[] = ENUM$VALUES;
            int i = aviewmanagereventtype.length;
            ViewManagerEventType aviewmanagereventtype1[] = new ViewManagerEventType[i];
            System.arraycopy(aviewmanagereventtype, 0, aviewmanagereventtype1, 0, i);
            return aviewmanagereventtype1;
        }

        static 
        {
            LINEAR_AD_ABOUT_TO_BEGIN = new ViewManagerEventType("LINEAR_AD_ABOUT_TO_BEGIN", 0);
            LINEAR_AD_BEGIN = new ViewManagerEventType("LINEAR_AD_BEGIN", 1);
            LINEAR_AD_END = new ViewManagerEventType("LINEAR_AD_END", 2);
            NON_LINEAR_AD_ABOUT_TO_BEGIN = new ViewManagerEventType("NON_LINEAR_AD_ABOUT_TO_BEGIN", 3);
            NON_LINEAR_AD_BEGIN = new ViewManagerEventType("NON_LINEAR_AD_BEGIN", 4);
            NON_LINEAR_AD_END = new ViewManagerEventType("NON_LINEAR_AD_END", 5);
            ENUM$VALUES = (new ViewManagerEventType[] {
                LINEAR_AD_ABOUT_TO_BEGIN, LINEAR_AD_BEGIN, LINEAR_AD_END, NON_LINEAR_AD_ABOUT_TO_BEGIN, NON_LINEAR_AD_BEGIN, NON_LINEAR_AD_END
            });
        }

        private ViewManagerEventType(String s, int i)
        {
            super(s, i);
        }
    }


    private IAsset asset;
    private ViewManagerEventType type;

    public ViewManagerEvent(IEventDispatcher ieventdispatcher, ViewManagerEventType viewmanagereventtype, IAsset iasset)
    {
        super(ieventdispatcher);
        type = ViewManagerEventType.values()[0];
        type = viewmanagereventtype;
        asset = iasset;
    }

    public final IAsset getAsset()
    {
        return asset;
    }

    public final ViewManagerEventType getType()
    {
        return type;
    }
}
