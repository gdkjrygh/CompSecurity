// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget.route;

import android.view.View;

// Referenced classes of package com.thetransitapp.droid.widget.route:
//            RouteItem

public interface RouteUiHandlers
{
    public static final class ClickType extends Enum
    {

        public static final ClickType DEFAULT;
        private static final ClickType ENUM$VALUES[];
        public static final ClickType FAVORITE;
        public static final ClickType MAP;
        public static final ClickType MENU_OPEN;
        public static final ClickType NONE;
        public static final ClickType SWITCH_DIRECTION;
        public static final ClickType TIMETABLE;

        public static ClickType valueOf(String s)
        {
            return (ClickType)Enum.valueOf(com/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType, s);
        }

        public static ClickType[] values()
        {
            ClickType aclicktype[] = ENUM$VALUES;
            int i = aclicktype.length;
            ClickType aclicktype1[] = new ClickType[i];
            System.arraycopy(aclicktype, 0, aclicktype1, 0, i);
            return aclicktype1;
        }

        static 
        {
            MAP = new ClickType("MAP", 0);
            SWITCH_DIRECTION = new ClickType("SWITCH_DIRECTION", 1);
            FAVORITE = new ClickType("FAVORITE", 2);
            TIMETABLE = new ClickType("TIMETABLE", 3);
            DEFAULT = new ClickType("DEFAULT", 4);
            NONE = new ClickType("NONE", 5);
            MENU_OPEN = new ClickType("MENU_OPEN", 6);
            ENUM$VALUES = (new ClickType[] {
                MAP, SWITCH_DIRECTION, FAVORITE, TIMETABLE, DEFAULT, NONE, MENU_OPEN
            });
        }

        private ClickType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class LongClickType extends Enum
    {

        public static final LongClickType DIRECTION;
        private static final LongClickType ENUM$VALUES[];
        public static final LongClickType TIME;

        public static LongClickType valueOf(String s)
        {
            return (LongClickType)Enum.valueOf(com/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType, s);
        }

        public static LongClickType[] values()
        {
            LongClickType alongclicktype[] = ENUM$VALUES;
            int i = alongclicktype.length;
            LongClickType alongclicktype1[] = new LongClickType[i];
            System.arraycopy(alongclicktype, 0, alongclicktype1, 0, i);
            return alongclicktype1;
        }

        static 
        {
            TIME = new LongClickType("TIME", 0);
            DIRECTION = new LongClickType("DIRECTION", 1);
            ENUM$VALUES = (new LongClickType[] {
                TIME, DIRECTION
            });
        }

        private LongClickType(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void onClick(ClickType clicktype, RouteItem routeitem);

    public abstract void onLongClick(LongClickType longclicktype, RouteItem routeitem, View view);

    public abstract void viewMovedSieway();
}
