// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.common.util;

import com.kohls.mcommerce.opal.common.value.ConstantValues;
import java.util.ArrayList;

public class StatesWithCode
{
    public static final class State
    {

        private String stateCode;
        private String stateName;

        public String getStateCode()
        {
            return stateCode;
        }

        public String getStateName()
        {
            return stateName;
        }

        State(String s, String s1)
        {
            stateName = s;
            stateCode = s1;
        }
    }

    public static final class StateType extends Enum
    {

        private static final StateType $VALUES[];
        public static final StateType ARMED_FORCE_STATES;
        public static final StateType STATES;

        public static StateType valueOf(String s)
        {
            return (StateType)Enum.valueOf(com/kohls/mcommerce/opal/common/util/StatesWithCode$StateType, s);
        }

        public static StateType[] values()
        {
            return (StateType[])$VALUES.clone();
        }

        static 
        {
            STATES = new StateType("STATES", 0);
            ARMED_FORCE_STATES = new StateType("ARMED_FORCE_STATES", 1);
            $VALUES = (new StateType[] {
                STATES, ARMED_FORCE_STATES
            });
        }

        private StateType(String s, int i)
        {
            super(s, i);
        }
    }


    private static ArrayList armedForcesStateList;
    private static ArrayList stateList;

    private StatesWithCode()
    {
    }

    public static ArrayList getStateList(StateType statetype)
    {
        if (statetype == StateType.STATES)
        {
            if (stateList == null)
            {
                initStateList();
            }
            return stateList;
        }
        if (statetype == StateType.ARMED_FORCE_STATES)
        {
            if (armedForcesStateList == null)
            {
                initArmedForcesStateList();
            }
            return armedForcesStateList;
        } else
        {
            return null;
        }
    }

    private static void initArmedForcesStateList()
    {
        armedForcesStateList = new ArrayList();
        for (int i = 0; i < ConstantValues.ARMED_FORCE_STATES.length; i++)
        {
            armedForcesStateList.add(new State(ConstantValues.ARMED_FORCE_STATES[i], ConstantValues.ARMED_FORCE_STATES_CODE[i]));
        }

    }

    private static void initStateList()
    {
        stateList = new ArrayList();
        for (int i = 0; i < ConstantValues.STATES.length; i++)
        {
            stateList.add(new State(ConstantValues.STATES[i], ConstantValues.STATES_CODE[i]));
        }

    }
}
