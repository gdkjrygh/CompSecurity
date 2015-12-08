// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.display;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.HashMap;

public class BrailleInputEvent
    implements Parcelable
{

    public static final int ARGUMENT_DOTS = 1;
    public static final int ARGUMENT_NONE = 0;
    public static final int ARGUMENT_POSITION = 2;
    public static final int CMD_ACTIVATE_CURRENT = 20;
    public static final int CMD_BRAILLE_KEY = 60;
    public static final int CMD_GLOBAL_BACK = 90;
    public static final int CMD_GLOBAL_HOME = 91;
    public static final int CMD_GLOBAL_NOTIFICATIONS = 93;
    public static final int CMD_GLOBAL_RECENTS = 92;
    public static final int CMD_HELP = 100;
    public static final int CMD_KEY_DEL = 71;
    public static final int CMD_KEY_ENTER = 70;
    public static final int CMD_KEY_FORWARD_DEL = 72;
    private static final SparseArray CMD_NAMES;
    public static final int CMD_NAV_BOTTOM = 8;
    public static final int CMD_NAV_ITEM_NEXT = 4;
    public static final int CMD_NAV_ITEM_PREVIOUS = 3;
    public static final int CMD_NAV_LINE_NEXT = 2;
    public static final int CMD_NAV_LINE_PREVIOUS = 1;
    public static final int CMD_NAV_PAN_LEFT = 5;
    public static final int CMD_NAV_PAN_RIGHT = 6;
    public static final int CMD_NAV_TOP = 7;
    public static final int CMD_NONE = -1;
    public static final int CMD_ROUTE = 50;
    public static final int CMD_SCROLL_BACKWARD = 30;
    public static final int CMD_SCROLL_FORWARD = 31;
    public static final int CMD_SELECTION_COPY = 44;
    public static final int CMD_SELECTION_CUT = 43;
    public static final int CMD_SELECTION_END = 41;
    public static final int CMD_SELECTION_PASTE = 45;
    public static final int CMD_SELECTION_SELECT_ALL = 42;
    public static final int CMD_SELECTION_START = 40;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public BrailleInputEvent createFromParcel(Parcel parcel)
        {
            return new BrailleInputEvent(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public BrailleInputEvent[] newArray(int j)
        {
            return new BrailleInputEvent[j];
        }

        public volatile Object[] newArray(int j)
        {
            return newArray(j);
        }

    };
    private static final HashMap NAMES_TO_CMDS;
    private final int mArgument;
    private final int mCommand;
    private final long mEventTime;

    public BrailleInputEvent(int i, int j, long l)
    {
        mCommand = i;
        mArgument = j;
        mEventTime = l;
    }

    private BrailleInputEvent(Parcel parcel)
    {
        mCommand = parcel.readInt();
        mArgument = parcel.readInt();
        mEventTime = parcel.readLong();
    }


    public static int argumentType(int i)
    {
        switch (i)
        {
        default:
            return 0;

        case 40: // '('
        case 41: // ')'
        case 50: // '2'
            return 2;

        case 60: // '<'
            return 1;
        }
    }

    public static String commandToString(int i)
    {
        String s = (String)CMD_NAMES.get(i);
        if (s != null)
        {
            return s;
        } else
        {
            return "(unknown)";
        }
    }

    public static int stringToCommand(String s)
    {
        s = (Integer)NAMES_TO_CMDS.get(s);
        if (s == null)
        {
            return -1;
        } else
        {
            return s.intValue();
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public int getArgument()
    {
        return mArgument;
    }

    public int getCommand()
    {
        return mCommand;
    }

    public long getEventTime()
    {
        return mEventTime;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("BrailleInputEvent {");
        stringbuilder.append("amd=");
        stringbuilder.append(commandToString(mCommand));
        stringbuilder.append(", arg=");
        stringbuilder.append(mArgument);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mCommand);
        parcel.writeInt(mArgument);
        parcel.writeLong(mEventTime);
    }

    static 
    {
        CMD_NAMES = new SparseArray();
        NAMES_TO_CMDS = new HashMap();
        CMD_NAMES.append(1, "CMD_NAV_LINE_PREVIOUS");
        CMD_NAMES.append(2, "CMD_NAV_LINE_NEXT");
        CMD_NAMES.append(3, "CMD_NAV_ITEM_PREVIOUS");
        CMD_NAMES.append(4, "CMD_NAV_ITEM_NEXT");
        CMD_NAMES.append(5, "CMD_NAV_PAN_LEFT");
        CMD_NAMES.append(6, "CMD_NAV_PAN_RIGHT");
        CMD_NAMES.append(7, "CMD_NAV_TOP");
        CMD_NAMES.append(8, "CMD_NAV_BOTTOM");
        CMD_NAMES.append(20, "CMD_ACTIVATE_CURRENT");
        CMD_NAMES.append(30, "CMD_SCROLL_BACKWARD");
        CMD_NAMES.append(31, "CMD_SCROLL_FORWARD");
        CMD_NAMES.append(40, "CMD_SELECTION_START");
        CMD_NAMES.append(41, "CMD_SELECTION_END");
        CMD_NAMES.append(42, "CMD_SELECTION_SELECT_ALL");
        CMD_NAMES.append(43, "CMD_SELECTION_CUT");
        CMD_NAMES.append(44, "CMD_SELECTION_COPY");
        CMD_NAMES.append(45, "CMD_SELECTION_PASTE");
        CMD_NAMES.append(50, "CMD_ROUTE");
        CMD_NAMES.append(60, "CMD_BRAILLE_KEY");
        CMD_NAMES.append(70, "CMD_KEY_ENTER");
        CMD_NAMES.append(71, "CMD_KEY_DEL");
        CMD_NAMES.append(72, "CMD_KEY_FORWARD_DEL");
        CMD_NAMES.append(90, "CMD_GLOBAL_BACK");
        CMD_NAMES.append(91, "CMD_GLOBAL_HOME");
        CMD_NAMES.append(92, "CMD_GLOBAL_RECENTS");
        CMD_NAMES.append(93, "CMD_GLOBAL_NOTIFICATIONS");
        CMD_NAMES.append(100, "CMD_HELP");
        for (int i = 0; i < CMD_NAMES.size(); i++)
        {
            NAMES_TO_CMDS.put(CMD_NAMES.valueAt(i), Integer.valueOf(CMD_NAMES.keyAt(i)));
        }

    }
}
