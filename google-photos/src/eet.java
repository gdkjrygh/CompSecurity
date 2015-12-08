// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Parcel;

final class eet
    implements jby
{

    public static final android.os.Parcelable.Creator CREATOR = new eeu();
    private final eer a;
    private long b;

    eet(Parcel parcel)
    {
        a = (eer)parcel.readParcelable(eer.getClassLoader());
        b = parcel.readLong();
    }

    eet(eer eer1)
    {
        a = eer1;
    }

    public final elb a(Context context)
    {
        b = ((fps)olm.a(context, fps)).a(a.b.a(), new dxa(a.b), 5000L);
        return b.b(a);
    }

    public final String a()
    {
        return "assistant.ui.dismiss.UndoableDismissAction";
    }

    public final elb b(Context context)
    {
        ((fps)olm.a(context, fps)).a(a.b.a(), new Long[] {
            Long.valueOf(b)
        });
        return b.b(a);
    }

    public final Object b()
    {
        return a;
    }

    public final String c(Context context)
    {
        return context.getString(b.kY);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeLong(b);
    }

}
