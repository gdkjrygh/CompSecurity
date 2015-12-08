// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import cty;
import ctz;
import gdf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.momentsstart.model:
//            MomentContext, MomentCurrentlyPlayingContext

public class Moment
    implements Parcelable, JacksonModel
{

    private static final gdf BACKGROUND_PARSER = gdf.a(com/spotify/mobile/android/spotlets/momentsstart/model/Moment$Background);
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Moment(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Moment[i];
        }

    };
    private static final gdf ICON_PARSER = gdf.a(com/spotify/mobile/android/spotlets/momentsstart/model/Moment$Icon);
    public final Background background;
    public final List contexts;
    public final Icon icon;
    public final String id;
    public final String name;
    public final String requestId;
    public final String tagline;

    private Moment(Parcel parcel)
    {
        contexts = new ArrayList();
        parcel.readTypedList(contexts, MomentContext.CREATOR);
        id = parcel.readString();
        name = parcel.readString();
        tagline = parcel.readString();
        icon = Icon.values()[parcel.readInt()];
        background = Background.values()[parcel.readInt()];
        requestId = parcel.readString();
    }


    public Moment(List list, String s, String s1, String s2, String s3, String s4, String s5)
    {
        if (list == null)
        {
            list = new ArrayList(0);
        }
        contexts = list;
        id = (String)ctz.a(s);
        name = (String)ctz.a(s1);
        tagline = s2;
        icon = (Icon)ICON_PARSER.a(fixResString(s3)).a(Icon.a);
        background = (Background)BACKGROUND_PARSER.a(fixResString(s4)).a(Background.a);
        requestId = (String)ctz.a(s5);
    }

    private String fixResString(String s)
    {
        if (s != null)
        {
            return s.replace('-', '_');
        } else
        {
            return null;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof Moment)
            {
                if (!cty.a(contexts, ((Moment) (obj = (Moment)obj)).contexts) || !cty.a(id, ((Moment) (obj)).id) || !cty.a(name, ((Moment) (obj)).name) || !cty.a(tagline, ((Moment) (obj)).tagline) || !cty.a(icon, ((Moment) (obj)).icon) || !cty.a(background, ((Moment) (obj)).background))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public boolean hasCurrentlyPlayingContext()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (contexts.size() > 0)
        {
            flag = flag1;
            if (contexts.get(0) instanceof MomentCurrentlyPlayingContext)
            {
                flag = true;
            }
        }
        return flag;
    }

    public boolean hasIntroContext()
    {
        return contexts.size() > 0 && ((MomentContext)contexts.get(0)).type == MomentContext.Type.e;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            contexts, id, name, tagline, icon, background
        });
    }

    public int indexOfMomentContextByUri(String s)
    {
        for (int i = 0; i < contexts.size(); i++)
        {
            if (TextUtils.equals(((MomentContext)contexts.get(i)).uri, s))
            {
                return i;
            }
        }

        return -1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeTypedList(contexts);
        parcel.writeString(id);
        parcel.writeString(name);
        parcel.writeString(tagline);
        parcel.writeInt(icon.ordinal());
        parcel.writeInt(background.ordinal());
        parcel.writeString(requestId);
    }


    private class Icon extends Enum
    {

        public static final Icon a;
        private static Icon b;
        private static Icon c;
        private static Icon d;
        private static Icon e;
        private static Icon f;
        private static Icon g;
        private static final Icon h[];
        public int mResId;

        public static Icon valueOf(String s)
        {
            return (Icon)Enum.valueOf(com/spotify/mobile/android/spotlets/momentsstart/model/Moment$Icon, s);
        }

        public static Icon[] values()
        {
            return (Icon[])h.clone();
        }

        static 
        {
            a = new Icon("MOMENT_ICON_0", 0, 0x7f0201fe);
            b = new Icon("MOMENT_ICON_1", 1, 0x7f0201ff);
            c = new Icon("MOMENT_ICON_2", 2, 0x7f020200);
            d = new Icon("MOMENT_ICON_3", 3, 0x7f0201ff);
            e = new Icon("MOMENT_ICON_4", 4, 0x7f0201fe);
            f = new Icon("MOMENT_ICON_5", 5, 0x7f020201);
            g = new Icon("MOMENT_ICON_6", 6, 0x7f020202);
            h = (new Icon[] {
                a, b, c, d, e, f, g
            });
        }

        private Icon(String s, int i, int j)
        {
            super(s, i);
            mResId = j;
        }
    }


    private class Background extends Enum
    {

        public static final Background a;
        private static Background b;
        private static Background c;
        private static Background d;
        private static Background e;
        private static Background f;
        private static Background g;
        private static final Background h[];
        public int mResId;

        public static Background valueOf(String s)
        {
            return (Background)Enum.valueOf(com/spotify/mobile/android/spotlets/momentsstart/model/Moment$Background, s);
        }

        public static Background[] values()
        {
            return (Background[])h.clone();
        }

        static 
        {
            a = new Background("AMBIENCE_0", 0, 0x7f02005f);
            b = new Background("AMBIENCE_1", 1, 0x7f020060);
            c = new Background("AMBIENCE_2", 2, 0x7f020061);
            d = new Background("AMBIENCE_3", 3, 0x7f020062);
            e = new Background("AMBIENCE_4", 4, 0x7f020063);
            f = new Background("AMBIENCE_5", 5, 0x7f020064);
            g = new Background("AMBIENCE_6", 6, 0x7f020065);
            h = (new Background[] {
                a, b, c, d, e, f, g
            });
        }

        private Background(String s, int i, int j)
        {
            super(s, i);
            mResId = j;
        }
    }

}
