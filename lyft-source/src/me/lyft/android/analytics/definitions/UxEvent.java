// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;

import java.util.HashSet;
import java.util.Set;

// Referenced classes of package me.lyft.android.analytics.definitions:
//            Event2, Parameter, MapParameterStore, UiElement, 
//            EventName, Subevent

public class UxEvent extends Event2
{

    private static final int EVENT_VERSION = 3;
    private static final Set SUBEVENTS = new HashSet(6) {

            
            {
                add(Subevent.BASE);
                add(Subevent.CLIENT);
                add(Subevent.DEVICE);
                add(Subevent.USER);
                add(Subevent.RIDE);
                add(Subevent.LOCATION);
            }
    };

    public UxEvent(Type type, UiElement uielement)
    {
        parameterStore.put(Parameter.TYPE, type.toString());
        parameterStore.put(Parameter.ELEMENT, uielement.toString());
    }

    public boolean contains(Subevent subevent)
    {
        return SUBEVENTS.contains(subevent);
    }

    public UiElement getElement()
    {
        return UiElement.valueOf(parameterStore.getString(Parameter.ELEMENT).toUpperCase());
    }

    public int getEventVersion()
    {
        return 3;
    }

    public String getName()
    {
        return EventName.LIFECYCLE.toString();
    }

    public Type getType()
    {
        return Type.valueOf(parameterStore.getString(Parameter.TYPE).toUpperCase());
    }

    public UxEvent setParent(String s)
    {
        parameterStore.put(Parameter.PARENT, s);
        return this;
    }

    public UxEvent setScreenX(int i)
    {
        parameterStore.put(Parameter.SCREEN_X, Integer.valueOf(i));
        return this;
    }

    public UxEvent setScreenY(int i)
    {
        parameterStore.put(Parameter.SCREEN_Y, Integer.valueOf(i));
        return this;
    }


    private class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type DISMISS;
        public static final Type DISPLAY;
        public static final Type TAP;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(me/lyft/android/analytics/definitions/UxEvent$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        public String toString()
        {
            return name().toLowerCase();
        }

        static 
        {
            TAP = new Type("TAP", 0);
            DISPLAY = new Type("DISPLAY", 1);
            DISMISS = new Type("DISMISS", 2);
            $VALUES = (new Type[] {
                TAP, DISPLAY, DISMISS
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }

}
