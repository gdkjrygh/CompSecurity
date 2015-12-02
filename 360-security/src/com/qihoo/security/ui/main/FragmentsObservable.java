// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import java.util.Observable;
import java.util.Observer;

public class FragmentsObservable extends Observable
{
    public static final class Action extends Enum
    {

        public static final Action ActionBar;
        public static final Action Antivirus_Scan;
        public static final Action Boost;
        public static final Action Clean_Scan;
        public static final Action DrawerClose;
        public static final Action DrawerOpen;
        public static final Action HideRecmdAin;
        public static final Action HideRecmdBoost;
        public static final Action HideRecmdClean;
        public static final Action HideRecmdOther;
        public static final Action MoreMenuClose;
        public static final Action MoreMenuShow;
        private static final Action a[];

        public static Action valueOf(String s)
        {
            return (Action)Enum.valueOf(com/qihoo/security/ui/main/FragmentsObservable$Action, s);
        }

        public static Action[] values()
        {
            return (Action[])a.clone();
        }

        static 
        {
            Clean_Scan = new Action("Clean_Scan", 0);
            Antivirus_Scan = new Action("Antivirus_Scan", 1);
            Boost = new Action("Boost", 2);
            ActionBar = new Action("ActionBar", 3);
            DrawerOpen = new Action("DrawerOpen", 4);
            DrawerClose = new Action("DrawerClose", 5);
            MoreMenuShow = new Action("MoreMenuShow", 6);
            MoreMenuClose = new Action("MoreMenuClose", 7);
            HideRecmdClean = new Action("HideRecmdClean", 8);
            HideRecmdOther = new Action("HideRecmdOther", 9);
            HideRecmdBoost = new Action("HideRecmdBoost", 10);
            HideRecmdAin = new Action("HideRecmdAin", 11);
            a = (new Action[] {
                Clean_Scan, Antivirus_Scan, Boost, ActionBar, DrawerOpen, DrawerClose, MoreMenuShow, MoreMenuClose, HideRecmdClean, HideRecmdOther, 
                HideRecmdBoost, HideRecmdAin
            });
        }

        private Action(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface a
        extends Observer
    {
    }


    public FragmentsObservable()
    {
    }

    public static void a(FragmentsObservable fragmentsobservable)
    {
        a(fragmentsobservable, Action.ActionBar);
    }

    public static void a(FragmentsObservable fragmentsobservable, Action action)
    {
        if (fragmentsobservable != null)
        {
            fragmentsobservable.a(action);
        }
    }

    public void a(Action action)
    {
        setChanged();
        super.notifyObservers(action);
    }
}
