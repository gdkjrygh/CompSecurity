// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.facebook.share.model:
//            ShareModel, ShareModelBuilder

public final class GameRequestContent
    implements ShareModel
{
    public static final class ActionType extends Enum
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

    public static class Builder
        implements ShareModelBuilder
    {

        private ActionType actionType;
        private String data;
        private Filters filters;
        private String message;
        private String objectId;
        private List recipients;
        private List suggestions;
        private String title;

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
                return setMessage(gamerequestcontent.getMessage()).setRecipients(gamerequestcontent.getRecipients()).setTitle(gamerequestcontent.getTitle()).setData(gamerequestcontent.getData()).setActionType(gamerequestcontent.getActionType()).setObjectId(gamerequestcontent.getObjectId()).setFilters(gamerequestcontent.getFilters()).setSuggestions(gamerequestcontent.getSuggestions());
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

        public Builder setRecipients(List list)
        {
            recipients = list;
            return this;
        }

        public Builder setSuggestions(List list)
        {
            suggestions = list;
            return this;
        }

        public Builder setTitle(String s)
        {
            title = s;
            return this;
        }

        public Builder setTo(String s)
        {
            if (s != null)
            {
                recipients = Arrays.asList(s.split(","));
            }
            return this;
        }









        public Builder()
        {
        }
    }

    public static final class Filters extends Enum
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


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public GameRequestContent createFromParcel(Parcel parcel)
        {
            return new GameRequestContent(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public GameRequestContent[] newArray(int i)
        {
            return new GameRequestContent[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final ActionType actionType;
    private final String data;
    private final Filters filters;
    private final String message;
    private final String objectId;
    private final List recipients;
    private final List suggestions;
    private final String title;

    GameRequestContent(Parcel parcel)
    {
        message = parcel.readString();
        recipients = parcel.createStringArrayList();
        title = parcel.readString();
        data = parcel.readString();
        actionType = (ActionType)parcel.readSerializable();
        objectId = parcel.readString();
        filters = (Filters)parcel.readSerializable();
        suggestions = parcel.createStringArrayList();
        parcel.readStringList(suggestions);
    }

    private GameRequestContent(Builder builder)
    {
        message = builder.message;
        recipients = builder.recipients;
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

    public List getRecipients()
    {
        return recipients;
    }

    public List getSuggestions()
    {
        return suggestions;
    }

    public String getTitle()
    {
        return title;
    }

    public String getTo()
    {
        if (getRecipients() != null)
        {
            return TextUtils.join(",", getRecipients());
        } else
        {
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(message);
        parcel.writeStringList(recipients);
        parcel.writeString(title);
        parcel.writeString(data);
        parcel.writeSerializable(actionType);
        parcel.writeString(objectId);
        parcel.writeSerializable(filters);
        parcel.writeStringList(suggestions);
    }

}
