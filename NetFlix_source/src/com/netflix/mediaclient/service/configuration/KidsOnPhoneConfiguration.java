// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;


public interface KidsOnPhoneConfiguration
{
    public static final class ActionBarNavType extends Enum
    {

        private static final ActionBarNavType $VALUES[];
        public static final ActionBarNavType BACK;
        public static final ActionBarNavType UP;

        public static ActionBarNavType valueOf(String s)
        {
            return (ActionBarNavType)Enum.valueOf(com/netflix/mediaclient/service/configuration/KidsOnPhoneConfiguration$ActionBarNavType, s);
        }

        public static ActionBarNavType[] values()
        {
            return (ActionBarNavType[])$VALUES.clone();
        }

        static 
        {
            UP = new ActionBarNavType("UP", 0);
            BACK = new ActionBarNavType("BACK", 1);
            $VALUES = (new ActionBarNavType[] {
                UP, BACK
            });
        }

        private ActionBarNavType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class LolomoImageType extends Enum
    {

        private static final LolomoImageType $VALUES[];
        public static final LolomoImageType HORIZONTAL;
        public static final LolomoImageType ONE_TO_ONE;
        private String value;

        public static LolomoImageType valueOf(String s)
        {
            return (LolomoImageType)Enum.valueOf(com/netflix/mediaclient/service/configuration/KidsOnPhoneConfiguration$LolomoImageType, s);
        }

        public static LolomoImageType[] values()
        {
            return (LolomoImageType[])$VALUES.clone();
        }

        public String toString()
        {
            return value;
        }

        static 
        {
            HORIZONTAL = new LolomoImageType("HORIZONTAL", 0, "horizontal");
            ONE_TO_ONE = new LolomoImageType("ONE_TO_ONE", 1, "one2one");
            $VALUES = (new LolomoImageType[] {
                HORIZONTAL, ONE_TO_ONE
            });
        }

        private LolomoImageType(String s, int i, String s1)
        {
            super(s, i);
            value = s1;
        }
    }

    public static final class ScrollBehavior extends Enum
    {

        private static final ScrollBehavior $VALUES[];
        public static final ScrollBehavior LRUD;
        public static final ScrollBehavior UP_DOWN;

        public static ScrollBehavior valueOf(String s)
        {
            return (ScrollBehavior)Enum.valueOf(com/netflix/mediaclient/service/configuration/KidsOnPhoneConfiguration$ScrollBehavior, s);
        }

        public static ScrollBehavior[] values()
        {
            return (ScrollBehavior[])$VALUES.clone();
        }

        static 
        {
            UP_DOWN = new ScrollBehavior("UP_DOWN", 0);
            LRUD = new ScrollBehavior("LRUD", 1);
            $VALUES = (new ScrollBehavior[] {
                UP_DOWN, LRUD
            });
        }

        private ScrollBehavior(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract ActionBarNavType getActionBarNavType();

    public abstract LolomoImageType getLolomoImageType();

    public abstract ScrollBehavior getScrollBehavior();

    public abstract boolean isKidsOnPhoneEnabled();

    public abstract boolean shouldShowKidsEntryInActionBar();

    public abstract boolean shouldShowKidsEntryInGenreLomo();

    public abstract boolean shouldShowKidsEntryInMenu();
}
