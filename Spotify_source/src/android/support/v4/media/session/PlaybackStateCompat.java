// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class PlaybackStateCompat
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new PlaybackStateCompat(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int l)
        {
            return new PlaybackStateCompat[l];
        }

    };
    public final int a;
    public final long b;
    public final long c;
    public final float d;
    public final long e;
    public final CharSequence f;
    public final long g;
    public List h;
    public final long i;
    public final Bundle j;
    public Object k;

    private PlaybackStateCompat(int l, long l1, long l2, float f1, long l3, CharSequence charsequence, long l4, List list, long l5, 
            Bundle bundle)
    {
        a = l;
        b = l1;
        c = l2;
        d = f1;
        e = l3;
        f = charsequence;
        g = l4;
        h = new ArrayList(list);
        i = l5;
        j = bundle;
    }

    public PlaybackStateCompat(int l, long l1, long l2, float f1, long l3, CharSequence charsequence, long l4, List list, long l5, 
            Bundle bundle, byte byte0)
    {
        this(l, l1, l2, f1, l3, charsequence, l4, list, l5, bundle);
    }

    private PlaybackStateCompat(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readLong();
        d = parcel.readFloat();
        g = parcel.readLong();
        c = parcel.readLong();
        e = parcel.readLong();
        f = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        h = parcel.createTypedArrayList(CustomAction.CREATOR);
        i = parcel.readLong();
        j = parcel.readBundle();
    }

    PlaybackStateCompat(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public static int a(PlaybackStateCompat playbackstatecompat)
    {
        return playbackstatecompat.a;
    }

    public static PlaybackStateCompat a(Object obj)
    {
        if (obj == null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return null;
        }
        Object obj2 = ((PlaybackState)obj).getCustomActions();
        Object obj1 = null;
        if (obj2 != null)
        {
            ArrayList arraylist = new ArrayList(((List) (obj2)).size());
            obj2 = ((List) (obj2)).iterator();
            do
            {
                obj1 = arraylist;
                if (!((Iterator) (obj2)).hasNext())
                {
                    break;
                }
                arraylist.add(CustomAction.a(((Iterator) (obj2)).next()));
            } while (true);
        }
        Bundle bundle;
        if (android.os.Build.VERSION.SDK_INT >= 22)
        {
            bundle = ((PlaybackState)obj).getExtras();
        } else
        {
            bundle = null;
        }
        obj1 = new PlaybackStateCompat(((PlaybackState)obj).getState(), ((PlaybackState)obj).getPosition(), ((PlaybackState)obj).getBufferedPosition(), ((PlaybackState)obj).getPlaybackSpeed(), ((PlaybackState)obj).getActions(), ((PlaybackState)obj).getErrorMessage(), ((PlaybackState)obj).getLastPositionUpdateTime(), ((List) (obj1)), ((PlaybackState)obj).getActiveQueueItemId(), bundle);
        obj1.k = obj;
        return ((PlaybackStateCompat) (obj1));
    }

    public static long b(PlaybackStateCompat playbackstatecompat)
    {
        return playbackstatecompat.b;
    }

    public static float c(PlaybackStateCompat playbackstatecompat)
    {
        return playbackstatecompat.d;
    }

    public static long d(PlaybackStateCompat playbackstatecompat)
    {
        return playbackstatecompat.g;
    }

    public static long e(PlaybackStateCompat playbackstatecompat)
    {
        return playbackstatecompat.c;
    }

    public static long f(PlaybackStateCompat playbackstatecompat)
    {
        return playbackstatecompat.e;
    }

    public static CharSequence g(PlaybackStateCompat playbackstatecompat)
    {
        return playbackstatecompat.f;
    }

    public static List h(PlaybackStateCompat playbackstatecompat)
    {
        return playbackstatecompat.h;
    }

    public static long i(PlaybackStateCompat playbackstatecompat)
    {
        return playbackstatecompat.i;
    }

    public static Bundle j(PlaybackStateCompat playbackstatecompat)
    {
        return playbackstatecompat.j;
    }

    public final int a()
    {
        return a;
    }

    public final long b()
    {
        return b;
    }

    public final float c()
    {
        return d;
    }

    public final long d()
    {
        return e;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("PlaybackState {");
        stringbuilder.append("state=").append(a);
        stringbuilder.append(", position=").append(b);
        stringbuilder.append(", buffered position=").append(c);
        stringbuilder.append(", speed=").append(d);
        stringbuilder.append(", updated=").append(g);
        stringbuilder.append(", actions=").append(e);
        stringbuilder.append(", error=").append(f);
        stringbuilder.append(", custom actions=").append(h);
        stringbuilder.append(", active item id=").append(i);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int l)
    {
        parcel.writeInt(a);
        parcel.writeLong(b);
        parcel.writeFloat(d);
        parcel.writeLong(g);
        parcel.writeLong(c);
        parcel.writeLong(e);
        TextUtils.writeToParcel(f, parcel, l);
        parcel.writeTypedList(h);
        parcel.writeLong(i);
        parcel.writeBundle(j);
    }


    private class CustomAction
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new CustomAction(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int l)
            {
                return new CustomAction[l];
            }

        };
        public final String a;
        public final CharSequence b;
        public final int c;
        public final Bundle d;
        public Object e;

        public static CustomAction a(Object obj)
        {
            if (obj == null || android.os.Build.VERSION.SDK_INT < 21)
            {
                return null;
            } else
            {
                CustomAction customaction = new CustomAction(((android.media.session.PlaybackState.CustomAction)obj).getAction(), ((android.media.session.PlaybackState.CustomAction)obj).getName(), ((android.media.session.PlaybackState.CustomAction)obj).getIcon(), ((android.media.session.PlaybackState.CustomAction)obj).getExtras());
                customaction.e = obj;
                return customaction;
            }
        }

        public final int describeContents()
        {
            return 0;
        }

        public final String toString()
        {
            return (new StringBuilder("Action:mName='")).append(b).append(", mIcon=").append(c).append(", mExtras=").append(d).toString();
        }

        public final void writeToParcel(Parcel parcel, int l)
        {
            parcel.writeString(a);
            TextUtils.writeToParcel(b, parcel, l);
            parcel.writeInt(c);
            parcel.writeBundle(d);
        }


        private CustomAction(Parcel parcel)
        {
            a = parcel.readString();
            b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            c = parcel.readInt();
            d = parcel.readBundle();
        }

        CustomAction(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        private CustomAction(String s, CharSequence charsequence, int l, Bundle bundle)
        {
            a = s;
            b = charsequence;
            c = l;
            d = bundle;
        }
    }

}
