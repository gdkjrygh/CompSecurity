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
    public static final class ActionType extends Enum
    {

        public static final ActionType a;
        public static final ActionType b;
        public static final ActionType c;
        private static final ActionType d[];

        public static ActionType valueOf(String s)
        {
            return (ActionType)Enum.valueOf(com/facebook/share/model/GameRequestContent$ActionType, s);
        }

        public static ActionType[] values()
        {
            return (ActionType[])d.clone();
        }

        static 
        {
            a = new ActionType("SEND", 0);
            b = new ActionType("ASKFOR", 1);
            c = new ActionType("TURN", 2);
            d = (new ActionType[] {
                a, b, c
            });
        }

        private ActionType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class Filters extends Enum
    {

        public static final Filters a;
        public static final Filters b;
        private static final Filters c[];

        public static Filters valueOf(String s)
        {
            return (Filters)Enum.valueOf(com/facebook/share/model/GameRequestContent$Filters, s);
        }

        public static Filters[] values()
        {
            return (Filters[])c.clone();
        }

        static 
        {
            a = new Filters("APP_USERS", 0);
            b = new Filters("APP_NON_USERS", 1);
            c = (new Filters[] {
                a, b
            });
        }

        private Filters(String s, int i)
        {
            super(s, i);
        }
    }


    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final ActionType e;
    private final String f;
    private final Filters g;
    private final ArrayList h;

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e.toString());
        parcel.writeString(f);
        parcel.writeString(g.toString());
        parcel.writeStringList(h);
    }
}
