// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import com.netflix.mediaclient.service.logging.client.model.DataContext;

public interface UIViewLogging
{
    public static final class UIViewCommandName extends Enum
    {

        private static final UIViewCommandName $VALUES[];
        public static final UIViewCommandName actionBarBackButton;
        public static final UIViewCommandName actionBarKidsEntry;
        public static final UIViewCommandName actionBarKidsExit;
        public static final UIViewCommandName backButton;
        public static final UIViewCommandName genreKidsEntry;
        public static final UIViewCommandName moreButton;
        public static final UIViewCommandName slidingMenuClosed;
        public static final UIViewCommandName slidingMenuKidsEntry;
        public static final UIViewCommandName slidingMenuKidsExit;
        public static final UIViewCommandName slidingMenuOpened;
        public static final UIViewCommandName upButton;

        public static UIViewCommandName valueOf(String s)
        {
            return (UIViewCommandName)Enum.valueOf(com/netflix/mediaclient/servicemgr/UIViewLogging$UIViewCommandName, s);
        }

        public static UIViewCommandName[] values()
        {
            return (UIViewCommandName[])$VALUES.clone();
        }

        static 
        {
            moreButton = new UIViewCommandName("moreButton", 0);
            upButton = new UIViewCommandName("upButton", 1);
            backButton = new UIViewCommandName("backButton", 2);
            actionBarBackButton = new UIViewCommandName("actionBarBackButton", 3);
            actionBarKidsEntry = new UIViewCommandName("actionBarKidsEntry", 4);
            actionBarKidsExit = new UIViewCommandName("actionBarKidsExit", 5);
            slidingMenuKidsEntry = new UIViewCommandName("slidingMenuKidsEntry", 6);
            slidingMenuKidsExit = new UIViewCommandName("slidingMenuKidsExit", 7);
            slidingMenuOpened = new UIViewCommandName("slidingMenuOpened", 8);
            slidingMenuClosed = new UIViewCommandName("slidingMenuClosed", 9);
            genreKidsEntry = new UIViewCommandName("genreKidsEntry", 10);
            $VALUES = (new UIViewCommandName[] {
                moreButton, upButton, backButton, actionBarBackButton, actionBarKidsEntry, actionBarKidsExit, slidingMenuKidsEntry, slidingMenuKidsExit, slidingMenuOpened, slidingMenuClosed, 
                genreKidsEntry
            });
        }

        private UIViewCommandName(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void endCommandSession();

    public abstract void startCommandSession(UIViewCommandName uiviewcommandname, IClientLogging.ModalView modalview, DataContext datacontext);
}
