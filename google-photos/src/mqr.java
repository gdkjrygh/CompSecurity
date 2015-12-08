// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

public final class mqr
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new mqs();
    public final String a;
    public final long b;
    public final int c;
    public final String d;
    private final long e;
    private final mqu f;
    private final String g;
    private final long h;

    mqr(Parcel parcel)
    {
        e = parcel.readLong();
        b = parcel.readLong();
        a = parcel.readString();
        f = mqu.valueOf(parcel.readString());
        c = parcel.readInt();
        d = parcel.readString();
        g = parcel.readString();
        h = parcel.readLong();
    }

    public mqr(mqt mqt1)
    {
        e = mqt1.a;
        b = mqt1.c;
        a = mqt1.b;
        f = mqt1.d;
        c = mqt1.e;
        d = mqt1.f;
        g = mqt1.g;
        h = mqt1.h;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return String.format(Locale.US, "UploadMediaStatus {uploadId: %d, mediaLocalUri: %s, batchId: %d, state: %s, attemptCount: %d, photoId: %s, mediaKey: %s, updateTime: %d", new Object[] {
            Long.valueOf(e), a, Long.valueOf(b), f, Integer.valueOf(c), d, g, Long.valueOf(h)
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(e);
        parcel.writeLong(b);
        parcel.writeString(a);
        parcel.writeString(f.toString());
        parcel.writeInt(c);
        parcel.writeString(d);
        parcel.writeString(g);
        parcel.writeLong(h);
    }

}
