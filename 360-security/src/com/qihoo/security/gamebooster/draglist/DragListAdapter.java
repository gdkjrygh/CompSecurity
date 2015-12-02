// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster.draglist;

import android.view.View;

public interface DragListAdapter
    extends DragLayerListView.a
{
    public static final class DragState extends Enum
    {

        public static final DragState Delete;
        public static final DragState In;
        public static final DragState Out;
        public static final DragState Release;
        public static final DragState StartDrag;
        public static final DragState UnInstall;
        private static final DragState a[];

        public static DragState valueOf(String s)
        {
            return (DragState)Enum.valueOf(com/qihoo/security/gamebooster/draglist/DragListAdapter$DragState, s);
        }

        public static DragState[] values()
        {
            return (DragState[])a.clone();
        }

        static 
        {
            StartDrag = new DragState("StartDrag", 0);
            In = new DragState("In", 1);
            Out = new DragState("Out", 2);
            Release = new DragState("Release", 3);
            Delete = new DragState("Delete", 4);
            UnInstall = new DragState("UnInstall", 5);
            a = (new DragState[] {
                StartDrag, In, Out, Release, Delete, UnInstall
            });
        }

        private DragState(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void a(DragState dragstate, View view);
}
