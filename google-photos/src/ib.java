// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ib
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ic();
    public final int a;
    final long b;
    final long c;
    final float d;
    public final long e;
    final CharSequence f;
    final long g;
    List h;
    final long i;
    final Bundle j;
    Object k;

    ib(int l, long l1, long l2, float f1, long l3, CharSequence charsequence, long l4, List list, long l5, 
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

    ib(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readLong();
        d = parcel.readFloat();
        g = parcel.readLong();
        c = parcel.readLong();
        e = parcel.readLong();
        f = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        h = parcel.createTypedArrayList(ie.CREATOR);
        i = parcel.readLong();
        j = parcel.readBundle();
    }

    static int a(ib ib1)
    {
        return ib1.a;
    }

    public static ib a(Object obj)
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
                arraylist.add(ie.a(((Iterator) (obj2)).next()));
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
        obj1 = new ib(((PlaybackState)obj).getState(), ((PlaybackState)obj).getPosition(), ((PlaybackState)obj).getBufferedPosition(), ((PlaybackState)obj).getPlaybackSpeed(), ((PlaybackState)obj).getActions(), ((PlaybackState)obj).getErrorMessage(), ((PlaybackState)obj).getLastPositionUpdateTime(), ((List) (obj1)), ((PlaybackState)obj).getActiveQueueItemId(), bundle);
        obj1.k = obj;
        return ((ib) (obj1));
    }

    static long b(ib ib1)
    {
        return ib1.b;
    }

    static float c(ib ib1)
    {
        return ib1.d;
    }

    static long d(ib ib1)
    {
        return ib1.g;
    }

    static long e(ib ib1)
    {
        return ib1.c;
    }

    static long f(ib ib1)
    {
        return ib1.e;
    }

    static CharSequence g(ib ib1)
    {
        return ib1.f;
    }

    static List h(ib ib1)
    {
        return ib1.h;
    }

    static long i(ib ib1)
    {
        return ib1.i;
    }

    static Bundle j(ib ib1)
    {
        return ib1.j;
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

}
