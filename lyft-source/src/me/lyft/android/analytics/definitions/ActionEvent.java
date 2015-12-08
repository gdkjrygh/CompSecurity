// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;

import java.util.HashSet;
import java.util.Set;

// Referenced classes of package me.lyft.android.analytics.definitions:
//            SpanningEvent, Parameter, MapParameterStore, EventName, 
//            Subevent

public class ActionEvent extends SpanningEvent
{

    private static final int EVENT_VERSION = 3;
    private static final Set SUBEVENTS = new HashSet(5) {

            
            {
                add(Subevent.BASE);
                add(Subevent.CLIENT);
                add(Subevent.USER);
                add(Subevent.RIDE);
                add(Subevent.LOCATION);
            }
    };

    public ActionEvent(SpanningEvent.Type type, Action action, String s)
    {
        super(type);
        parameterStore.put(Parameter.ACTION, action.toString());
        parameterStore.put(Parameter.ACTION_ID, s);
    }

    public boolean contains(Subevent subevent)
    {
        return SUBEVENTS.contains(subevent);
    }

    public int getEventVersion()
    {
        return 3;
    }

    public String getName()
    {
        return EventName.ACTION.toString();
    }

    public void setIntentId(String s)
    {
        parameterStore.put(Parameter.INTENT_ID, s);
    }

    public ActionEvent setReason(String s)
    {
        parameterStore.put(Parameter.REASON, s);
        return this;
    }


    private class Action extends Enum
    {

        private static final Action $VALUES[];
        public static final Action ADD_DEBIT_CARD;
        public static final Action ADD_FACEBOOK;
        public static final Action ADD_PHONE;
        public static final Action ADD_PROFILE_INFO;
        public static final Action APP_LAUNCH;
        public static final Action CANCEL_RIDE;
        public static final Action CLEAR_REQUEST;
        public static final Action DIRECTIONS_ROUTE_LINES;
        public static final Action EDIT_DEBIT_CARD;
        public static final Action EDIT_FACEBOOK_CARD;
        public static final Action INITIATE_LOGIN;
        public static final Action INITIATE_SIGNUP;
        public static final Action LOGOUT_USER;
        public static final Action OPEN_FACEBOOK_MESSENGER;
        public static final Action REQUEST_PRICE_ESTIMATE;
        public static final Action REQUEST_RIDE;
        public static final Action RESEND_PHONE_CODE;
        public static final Action SEND_INVITES;
        public static final Action SET_DEFAULT_PAYMENT;
        public static final Action SET_DESTINATION;
        public static final Action SET_PICKUP;
        public static final Action SET_RIDE_TYPE;
        public static final Action SHARE_INVITES;
        public static final Action SHOW_INVITE_BUTTON;
        public static final Action SHOW_INVITE_FRIENDS;
        public static final Action VERIFY_PHONE;

        public static Action fromString(String s)
        {
            return valueOf(s.toUpperCase());
        }

        public static Action valueOf(String s)
        {
            return (Action)Enum.valueOf(me/lyft/android/analytics/definitions/ActionEvent$Action, s);
        }

        public static Action[] values()
        {
            return (Action[])$VALUES.clone();
        }

        public String toString()
        {
            return name().toLowerCase();
        }

        static 
        {
            APP_LAUNCH = new Action("APP_LAUNCH", 0);
            INITIATE_LOGIN = new Action("INITIATE_LOGIN", 1);
            INITIATE_SIGNUP = new Action("INITIATE_SIGNUP", 2);
            ADD_PROFILE_INFO = new Action("ADD_PROFILE_INFO", 3);
            ADD_PHONE = new Action("ADD_PHONE", 4);
            ADD_FACEBOOK = new Action("ADD_FACEBOOK", 5);
            VERIFY_PHONE = new Action("VERIFY_PHONE", 6);
            RESEND_PHONE_CODE = new Action("RESEND_PHONE_CODE", 7);
            LOGOUT_USER = new Action("LOGOUT_USER", 8);
            SHOW_INVITE_FRIENDS = new Action("SHOW_INVITE_FRIENDS", 9);
            SHOW_INVITE_BUTTON = new Action("SHOW_INVITE_BUTTON", 10);
            SEND_INVITES = new Action("SEND_INVITES", 11);
            SHARE_INVITES = new Action("SHARE_INVITES", 12);
            DIRECTIONS_ROUTE_LINES = new Action("DIRECTIONS_ROUTE_LINES", 13);
            SET_RIDE_TYPE = new Action("SET_RIDE_TYPE", 14);
            SET_PICKUP = new Action("SET_PICKUP", 15);
            SET_DESTINATION = new Action("SET_DESTINATION", 16);
            REQUEST_PRICE_ESTIMATE = new Action("REQUEST_PRICE_ESTIMATE", 17);
            CLEAR_REQUEST = new Action("CLEAR_REQUEST", 18);
            REQUEST_RIDE = new Action("REQUEST_RIDE", 19);
            CANCEL_RIDE = new Action("CANCEL_RIDE", 20);
            ADD_DEBIT_CARD = new Action("ADD_DEBIT_CARD", 21);
            EDIT_DEBIT_CARD = new Action("EDIT_DEBIT_CARD", 22);
            EDIT_FACEBOOK_CARD = new Action("EDIT_FACEBOOK_CARD", 23);
            OPEN_FACEBOOK_MESSENGER = new Action("OPEN_FACEBOOK_MESSENGER", 24);
            SET_DEFAULT_PAYMENT = new Action("SET_DEFAULT_PAYMENT", 25);
            $VALUES = (new Action[] {
                APP_LAUNCH, INITIATE_LOGIN, INITIATE_SIGNUP, ADD_PROFILE_INFO, ADD_PHONE, ADD_FACEBOOK, VERIFY_PHONE, RESEND_PHONE_CODE, LOGOUT_USER, SHOW_INVITE_FRIENDS, 
                SHOW_INVITE_BUTTON, SEND_INVITES, SHARE_INVITES, DIRECTIONS_ROUTE_LINES, SET_RIDE_TYPE, SET_PICKUP, SET_DESTINATION, REQUEST_PRICE_ESTIMATE, CLEAR_REQUEST, REQUEST_RIDE, 
                CANCEL_RIDE, ADD_DEBIT_CARD, EDIT_DEBIT_CARD, EDIT_FACEBOOK_CARD, OPEN_FACEBOOK_MESSENGER, SET_DEFAULT_PAYMENT
            });
        }

        private Action(String s, int i)
        {
            super(s, i);
        }
    }

}
