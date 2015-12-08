// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gtalkservice;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gtalkservice:
//            d

public final class Presence
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    public static final Presence a = new Presence();
    private boolean b;
    private Show c;
    private String d;
    private boolean e;
    private List f;
    private List g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private int l;

    public Presence()
    {
        this(Show.NONE);
    }

    public Presence(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        h = parcel.readInt();
        i = parcel.readInt();
        j = parcel.readInt();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        c = (Show)Enum.valueOf(com/google/android/gtalkservice/Presence$Show, parcel.readString());
        d = parcel.readString();
        if (parcel.readInt() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        e = flag;
        f = new ArrayList();
        parcel.readStringList(f);
        g = new ArrayList();
        parcel.readStringList(g);
        l = parcel.readInt();
    }

    private Presence(Show show)
    {
        b = false;
        c = show;
        d = null;
        e = false;
        f = new ArrayList();
        g = new ArrayList();
        l = 8;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        if (!b)
        {
            return "UNAVAILABLE";
        }
        if (e)
        {
            return "INVISIBLE";
        }
        StringBuilder stringbuilder = new StringBuilder(40);
        if (c == Show.NONE)
        {
            stringbuilder.append("AVAILABLE(x)");
        } else
        {
            stringbuilder.append(c.toString());
        }
        if ((l & 8) != 0)
        {
            stringbuilder.append(" pmuc-v1");
        }
        if ((l & 1) != 0)
        {
            stringbuilder.append(" voice-v1");
        }
        if ((l & 2) != 0)
        {
            stringbuilder.append(" video-v1");
        }
        if ((l & 4) != 0)
        {
            stringbuilder.append(" camera-v1");
        }
        return stringbuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        boolean flag = true;
        parcel.writeInt(h);
        parcel.writeInt(i);
        parcel.writeInt(j);
        if (k)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (b)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        parcel.writeString(c.toString());
        parcel.writeString(d);
        if (e)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        parcel.writeStringList(f);
        parcel.writeStringList(g);
        parcel.writeInt(l);
    }


    private class Show extends Enum
    {

        public static final Show AVAILABLE;
        public static final Show AWAY;
        public static final Show DND;
        public static final Show EXTENDED_AWAY;
        public static final Show NONE;
        private static final Show a[];

        public static Show valueOf(String s)
        {
            return (Show)Enum.valueOf(com/google/android/gtalkservice/Presence$Show, s);
        }

        public static Show[] values()
        {
            return (Show[])a.clone();
        }

        static 
        {
            NONE = new Show("NONE", 0);
            AWAY = new Show("AWAY", 1);
            EXTENDED_AWAY = new Show("EXTENDED_AWAY", 2);
            DND = new Show("DND", 3);
            AVAILABLE = new Show("AVAILABLE", 4);
            a = (new Show[] {
                NONE, AWAY, EXTENDED_AWAY, DND, AVAILABLE
            });
        }

        private Show(String s, int i1)
        {
            super(s, i1);
        }
    }

}
