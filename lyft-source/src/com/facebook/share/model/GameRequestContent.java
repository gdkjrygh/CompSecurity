// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;
import java.util.ArrayList;

// Referenced classes of package com.facebook.share.model:
//            ShareModel

public final class GameRequestContent
    implements ShareModel
{

    private final ActionType actionType;
    private final String data;
    private final Filters filters;
    private final String message;
    private final String objectId;
    private final ArrayList suggestions;
    private final String title;
    private final String to;

    GameRequestContent(Parcel parcel)
    {
        message = parcel.readString();
        to = parcel.readString();
        title = parcel.readString();
        data = parcel.readString();
        actionType = ActionType.valueOf(parcel.readString());
        objectId = parcel.readString();
        filters = Filters.valueOf(parcel.readString());
        suggestions = new ArrayList();
        parcel.readStringList(suggestions);
    }

    private GameRequestContent(Builder builder)
    {
        message = builder.message;
        to = builder.to;
        title = builder.title;
        data = builder.data;
        actionType = builder.actionType;
        objectId = builder.objectId;
        filters = builder.filters;
        suggestions = builder.suggestions;
    }


    public int describeContents()
    {
        return 0;
    }

    public ActionType getActionType()
    {
        return actionType;
    }

    public String getData()
    {
        return data;
    }

    public Filters getFilters()
    {
        return filters;
    }

    public String getMessage()
    {
        return message;
    }

    public String getObjectId()
    {
        return objectId;
    }

    public ArrayList getSuggestions()
    {
        return suggestions;
    }

    public String getTitle()
    {
        return title;
    }

    public String getTo()
    {
        return to;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(message);
        parcel.writeString(to);
        parcel.writeString(title);
        parcel.writeString(data);
        parcel.writeString(getActionType().toString());
        parcel.writeString(getObjectId());
        parcel.writeString(getFilters().toString());
        parcel.writeStringList(getSuggestions());
    }

    private class ActionType extends Enum
    {

        private static final ActionType $VALUES[];
        public static final ActionType ASKFOR;
        public static final ActionType SEND;
        public static final ActionType TURN;

        public static ActionType valueOf(String s)
        {
            return (ActionType)Enum.valueOf(com/facebook/share/model/GameRequestContent$ActionType, s);
        }

        public static ActionType[] values()
        {
            return (ActionType[])$VALUES.clone();
        }

        static 
        {
            SEND = new ActionType("SEND", 0);
            ASKFOR = new ActionType("ASKFOR", 1);
            TURN = new ActionType("TURN", 2);
            $VALUES = (new ActionType[] {
                SEND, ASKFOR, TURN
            });
        }

        private ActionType(String s, int i)
        {
            super(s, i);
        }
    }


    private class Filters extends Enum
    {

        private static final Filters $VALUES[];
        public static final Filters APP_NON_USERS;
        public static final Filters APP_USERS;

        public static Filters valueOf(String s)
        {
            return (Filters)Enum.valueOf(com/facebook/share/model/GameRequestContent$Filters, s);
        }

        public static Filters[] values()
        {
            return (Filters[])$VALUES.clone();
        }

        static 
        {
            APP_USERS = new Filters("APP_USERS", 0);
            APP_NON_USERS = new Filters("APP_NON_USERS", 1);
            $VALUES = (new Filters[] {
                APP_USERS, APP_NON_USERS
            });
        }

        private Filters(String s, int i)
        {
            super(s, i);
        }
    }


    private class Builder
        implements ShareModelBuilder
    {

        private ActionType actionType;
        private String data;
        private Filters filters;
        private String message;
        private String objectId;
        private ArrayList suggestions;
        private String title;
        private String to;

        public GameRequestContent build()
        {
            return new GameRequestContent(this);
        }

        public volatile Object build()
        {
            return build();
        }

        public Builder readFrom(Parcel parcel)
        {
            return readFrom((GameRequestContent)parcel.readParcelable(com/facebook/share/model/GameRequestContent.getClassLoader()));
        }

        public Builder readFrom(GameRequestContent gamerequestcontent)
        {
            if (gamerequestcontent == null)
            {
                return this;
            } else
            {
                return setMessage(gamerequestcontent.getMessage()).setTo(gamerequestcontent.getTo()).setTitle(gamerequestcontent.getTitle()).setData(gamerequestcontent.getData()).setActionType(gamerequestcontent.getActionType()).setObjectId(gamerequestcontent.getObjectId()).setFilters(gamerequestcontent.getFilters()).setSuggestions(gamerequestcontent.getSuggestions());
            }
        }

        public volatile ShareModelBuilder readFrom(Parcel parcel)
        {
            return readFrom(parcel);
        }

        public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
        {
            return readFrom((GameRequestContent)sharemodel);
        }

        public Builder setActionType(ActionType actiontype)
        {
            actionType = actiontype;
            return this;
        }

        public Builder setData(String s)
        {
            data = s;
            return this;
        }

        public Builder setFilters(Filters filters1)
        {
            filters = filters1;
            return this;
        }

        public Builder setMessage(String s)
        {
            message = s;
            return this;
        }

        public Builder setObjectId(String s)
        {
            objectId = s;
            return this;
        }

        public Builder setSuggestions(ArrayList arraylist)
        {
            suggestions = arraylist;
            return this;
        }

        public Builder setTitle(String s)
        {
            title = s;
            return this;
        }

        public Builder setTo(String s)
        {
            to = s;
            return this;
        }









        public Builder()
        {
        }
    }

}
