// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AddToListData
{
    public static final class AddToListState extends Enum
    {

        private static final AddToListState $VALUES[];
        public static final AddToListState IN_LIST;
        public static final AddToListState LOADING;
        public static final AddToListState NOT_IN_LIST;

        public static AddToListState valueOf(String s)
        {
            return (AddToListState)Enum.valueOf(com/netflix/mediaclient/servicemgr/AddToListData$AddToListState, s);
        }

        public static AddToListState[] values()
        {
            return (AddToListState[])$VALUES.clone();
        }

        static 
        {
            IN_LIST = new AddToListState("IN_LIST", 0);
            NOT_IN_LIST = new AddToListState("NOT_IN_LIST", 1);
            LOADING = new AddToListState("LOADING", 2);
            $VALUES = (new AddToListState[] {
                IN_LIST, NOT_IN_LIST, LOADING
            });
        }

        private AddToListState(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface StateListener
    {

        public abstract void update(AddToListState addtoliststate);
    }


    private final Set listeners = new HashSet(2);
    private AddToListState previousState;
    private AddToListState state;

    public AddToListData(StateListener statelistener)
    {
        state = AddToListState.NOT_IN_LIST;
        previousState = AddToListState.NOT_IN_LIST;
        listeners.add(statelistener);
    }

    public void addListener(StateListener statelistener)
    {
        listeners.add(statelistener);
    }

    public AddToListState getState()
    {
        return state;
    }

    public void removeListener(StateListener statelistener)
    {
        listeners.remove(statelistener);
    }

    public void revertState()
    {
        setStateAndNotify(previousState);
    }

    public void setStateAndNotify(AddToListState addtoliststate)
    {
        if (state != AddToListState.LOADING)
        {
            previousState = state;
        }
        state = addtoliststate;
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((StateListener)iterator.next()).update(addtoliststate)) { }
    }
}
